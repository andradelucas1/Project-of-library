
package livraria;

public class Ebook extends Livro {
	private String WaterMark;

	
	public Ebook(Autor autor) {
		super(autor);
	}
	
	public String getWaterMark() {
		return WaterMark;
	}
	public void setWaterMark(String waterMark) {
		WaterMark = waterMark;
	}
	
	@Override
	public boolean aplicaDesconto (double porcent) {
		if (porcent > 0.15) {
			System.out.println("Desconto do EBOK só será permitido até 15%");
			return false;
		} else {
			double desconto = this.getValor() * porcent;
			this.setValor(getValor() - desconto);
			return true; 
		}
	}
}
