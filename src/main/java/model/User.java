package model;

public class User {
	private String cpf ;
	private String nome;
	private String telefone;
	private String email;
	private String rg;
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	
	@Override
	public String toString() {
		return "User [cpf=" + cpf + ", nome=" + nome + ", telefone=" + telefone + ", email=" + email + ", rg=" + rg
				+ "]";
	}
	
	
	

}
