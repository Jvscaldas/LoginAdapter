package model;

public class Login {

	private String nome;
	private String senha;
	private long token;
	private int codigo;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public long getToken() {
		return token;
	}

	public void setToken(long token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return "Login [nome=" + nome + ", senha=" + senha + ", token=" + token + ", codigo=" + codigo + "]";
	}

}
