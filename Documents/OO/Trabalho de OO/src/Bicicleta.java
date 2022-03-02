
public class Bicicleta {
	private String tipoBicicleta[];
	private Boolean Disponibilidade = false;
	public Bicicleta(String tb[], Boolean disponivel) {
		tipoBicicleta= tb;
		Disponibilidade= disponivel;
	}
	public String[] getTipoBicicleta() {
		return tipoBicicleta;
	}
	public void setTipoBicicleta(String[] tipoBicicleta) {
		this.tipoBicicleta = tipoBicicleta;
	}
	public Boolean getDisponibilidade() {
		return Disponibilidade;
	}
	public void setDisponibilidade(Boolean disponibilidade) {
		Disponibilidade = disponibilidade;
	}

}
