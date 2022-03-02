import java.util.Date;
public class Usuario {
	private String nome;
	private double telefone;
	private double identidade;
	private String cpf;
	private Date dataNascimento;
	private int idade;
	private String email;
	private String senha;
	
	public Usuario(String n,double t, double rg, String c, Date nascimento, int anos, String e, String s) {
		nome=n;
		telefone=t;
		identidade=rg;
		cpf=c;
		dataNascimento=nascimento;
		idade=anos;
		email=e;
		senha=s;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getTelefone() {
		return telefone;
	}
	public void setTelefone(double telefone) {
		this.telefone = telefone;
	}
	public double getIdentidade() {
		return identidade;
	}
	public void setIdentidade(double identidade) {
		this.identidade = identidade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	

}
