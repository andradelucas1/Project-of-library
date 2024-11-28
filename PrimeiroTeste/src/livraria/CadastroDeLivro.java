package livraria;

public class CadastroDeLivro {
	public static void main(String[] args) {
			
		
		Livro livro01 = new Livro();
		
		livro01.setNome("Curso Java");
		livro01.setCod("00001");
		livro01.setDescricao("Ótimo para iniciantes!");
		livro01.setValor(35.50);
		//livro01.setAutor(autor01);
		
		
		livro01.mostrarDetalhes();
		
		if (!livro01.aplicaDesconto(0.5)) {
			System.out.println("Não é possível aplicar um desconto acima de 30%");
		} else{
			System.out.println("Valor com desconto: " + livro01.getValor());
		};
		
		livro01.mostrarDetalhes();
		
	}
}
