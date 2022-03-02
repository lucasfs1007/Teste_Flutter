
public class Local {
	private String localCheckin;
	private String localCheckout;
	//A classe bicicleta é para ser usada aqui tbm.
	public Local(String lcin, String lcout ) {
		localCheckin=lcin;
		localCheckout=lcout;
	}
	public String getLocalCheckin() {
		return localCheckin;
	}
	public void setLocalCheckin(String localCheckin) {
		this.localCheckin = localCheckin;
	}
	public String getLocalCheckout() {
		return localCheckout;
	}
	public void setLocalCheckout(String localCheckout) {
		this.localCheckout = localCheckout;
	}

}
