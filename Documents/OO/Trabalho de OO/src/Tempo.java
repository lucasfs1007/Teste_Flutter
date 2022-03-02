
public class Tempo {
		private double horaCheckin;
		private double horaCheckout;
		private double tempoTotal;
		
	public Tempo(Double horain, double horaout, double tt) {
			horaCheckin= horain;
			horaCheckout=horaout;
			tempoTotal= tt;
		}
	public double getHoraCheckin() {
			return horaCheckin;
		}
		public void setHoraCheckin(double horaCheckin) {
			this.horaCheckin = horaCheckin;
		}
		public double getHoraCheckout() {
			return horaCheckout;
		}
		public void setHoraCheckout(double horaCheckout) {
			this.horaCheckout = horaCheckout;
		}
		public double getTempoTotal() {
			return tempoTotal;
		}
		public void setTempoTotal(double tempoTotal) {
			this.tempoTotal = tempoTotal;
		}
	

}
