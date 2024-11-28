package livraria;

public class Autor {
	private String nome;
	private String email;
	private String cpf;
	
	
	void MostrarDetalhesAutor() {

		System.out.println("Detalhes do autor:");
		System.out.println(nome);
		System.out.println(email);
		System.out.println(cpf);
		System.out.println("--");
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Autor() {
		System.out.println("--");
		System.out.println("Novo autor cadastrado");
		System.out.println("--");
	}

}