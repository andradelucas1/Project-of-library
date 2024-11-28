package livraria;

public class RegistroVendas {
	public static void main(String[] args) {
		Autor autor01 = new Autor();
		autor01.setNome("Lucas Andrade");
	
		LivroFisico livro01 = new LivroFisico(autor01);
		livro01.setNome("Desvendando o mundo");
		livro01.setValor(20);
		
		Ebook ebook01 = new Ebook(autor01);
		ebook01.setNome("Ebook do Lucas");
		ebook01.setValor(15.50);
		
		CarrinhoDeCompras carrinho01 = new CarrinhoDeCompras();
		carrinho01.adiciona(livro01);
		carrinho01.adiciona(ebook01);
		
		System.out.println("Total:" + carrinho01.getTotal());
	}
}
