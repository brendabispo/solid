package solid_lsp_v2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TestaRH {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente(3000, "Gerente de Segurança", "João Peba", 1500);
		Vendedor v1 = new Vendedor(1500, "Vendedor Eletrodomésticos", "Arruda", 500);
		
		
		List<Gerente> gerentes = new ArrayList<>();
		gerentes.add(g1);
		List<Vendedor> vendedores = new ArrayList<>();
		vendedores.add(v1);
		
		List<Funcionario> funcionarios = new ArrayList<>();
		funcionarios.addAll(gerentes);
		funcionarios.addAll(vendedores);
		
		LocalDate data = LocalDate.now();
		
		FolhaSalarial folha = new FolhaSalarial(data);

		folha.imprimirFolhaSalarial(funcionarios);
		
 

	        

	}

}
