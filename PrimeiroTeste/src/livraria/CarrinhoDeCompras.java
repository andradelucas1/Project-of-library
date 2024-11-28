package livraria;

public class CarrinhoDeCompras {
	private double total;
	
	public void adiciona(Livro livro) {
		System.out.println("Adicionado:" + livro);
		total += livro.getValor();
	}

	public double getTotal() {
		return total;
	}
	
	

}
