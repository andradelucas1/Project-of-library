package livraria;

public class Livro {
	//Faz com que o valor só seja alterado por aqui
	private String nome;
	private String descricao;
	private double valor;
	private String cod;
	private Autor autor;
	
	
	public Livro(Autor autor) {
		this();
		this.autor = autor;
	}
	public Livro() {
	//Construtor vazio
		this.cod = "0000000";
	}
	void mostrarDetalhes() {
		System.out.println(" --Mostrando detalhes do livro-- ");
		System.out.println(nome);
		System.out.println(descricao);
		System.out.println(valor);
		System.out.println(cod);
		
		System.out.println("--");
		
		if (this.temAutor()) {
			autor.MostrarDetalhesAutor();
		}
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public void setValor (double valor) {
		this.valor = valor;
	}
	public double getValor() {
		return valor;
	}	
	boolean temAutor() {
		return this.autor != null;
	}
	public boolean aplicaDesconto (double porcent) {
		if (porcent > 0.3) {
			System.out.println("Desconto do LIVRO só será permitido até 30%");
			return false;
		} else {
			this.valor -= this.valor * porcent;
			return true; 
		}
	}	
	
}
