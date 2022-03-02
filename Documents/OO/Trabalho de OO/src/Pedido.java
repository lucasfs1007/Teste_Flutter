
public class Pedido {
	private double precoHora;
	private double precoFinal;
	//Devo herdar tudo de tempo 
	public Pedido(double ph, double pf) {
		precoHora=ph;
		precoFinal=pf;
	}
	public double getPrecoHora() {
		return precoHora;
	}
	public void setPrecoHora(double precoHora) {
		this.precoHora = precoHora;
	}
	public double getPrecoFinal() {
		return precoFinal;
	}
	public void setPrecoFinal(double precoFinal) {
		this.precoFinal = precoFinal;
	}

}
