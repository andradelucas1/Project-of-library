package livraria;

public class LivroFisico extends Livro {

	public LivroFisico(Autor autor) {
		super(autor);
	}
	
	public double TaxaImpressao() {
		return this.getValor() * 0.05;
	}
}
