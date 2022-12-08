package solid_lsp_v2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TestaRH {

	public static void main(String[] args) {
		
		AtendenteCaixa caixa = new AtendenteCaixa(1300, "Caixa", "c1");
        Gerente gerente = new Gerente(3200, "Gerente", "c1", 800);
        Vendedor vendedor = new Vendedor(1900, "Vendedor", "v1", 500);

        List<Gerente> gerentes = new ArrayList<>();
        gerentes.add(gerente);
        List<Vendedor> vendedores = new ArrayList<>();
        vendedores.add(vendedor);
        List<AtendenteCaixa> caixas = new ArrayList<>();
        caixas.add(caixa);
        
        LocalDate data = LocalDate.now();
        
        FolhaSalarial folhaSalarial = new FolhaSalarial(data);

        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.addAll(gerentes);
        funcionarios.addAll(vendedores);
        funcionarios.addAll(caixas);

        folhaSalarial.imprimirFolhaSalarial(funcionarios);
	}

}
