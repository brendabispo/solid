package solid_srp_v2;

public class TestaLivro {

	public static void main(String[] args) {
		
		Livro livro1 = new Livro("livro1", "autor1", 1996, 105.5, "1456987");
		Livro livro2 = new Livro("livro2", "autor2", 2004, 85.5, "1254797");
		
		
		Fatura fatura = new Fatura(livro2, 2, 5, 1);
		fatura.imprimir();
		
		System.out.println(fatura.calcularTotal());
		
	}

}
