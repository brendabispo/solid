package solid_ocp_v2;

public class TestaLivro {

	public static void main(String[] args) {
		
		Livro livro1 = new Livro("livro1", "autor1", 2002, 110.99, "129874");

       Fatura fatura = new Fatura(livro1, 2, 0.10, 0.08);

        PersistenciaEmArquivoPdf persistenciaPdf = new PersistenciaEmArquivoPdf(fatura);

        persistenciaPdf.salvar(fatura);
        
        PersistenciaEmBD persistenciaBD = new PersistenciaEmBD(fatura);

        persistenciaBD.salvar(fatura);

	}

}
