
public class FormaPagamento {
	private String bandeiraCartao;
	private double numeroCartao;
	private int codigo;
	private Boolean tipoPagamento = false;
	// Devo receber o pedido e o usuario
	public FormaPagamento(String bc, double nc, int c, Boolean tp) {
		bandeiraCartao=bc;
		numeroCartao=nc;
		codigo=c;
		tipoPagamento=tp;
	}
	public String getBandeiraCartao() {
		return bandeiraCartao;
	}
	public void setBandeiraCartao(String bandeiraCartao) {
		this.bandeiraCartao = bandeiraCartao;
	}
	public double getNumeroCartao() {
		return numeroCartao;
	}
	public void setNumeroCartao(double numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Boolean getTipoPagamento() {
		return tipoPagamento;
	}
	public void setTipoPagamento(Boolean tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

}
