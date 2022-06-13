package model;

public class LoginBuilder {

	private Login login;

	public LoginBuilder() {
		this.login = new Login();
	}

	public static LoginBuilder builder() {
		return new LoginBuilder();
	}

	public LoginBuilder addNome(String nome) {
		login.setNome(nome);

		return this;
	}

	public LoginBuilder addSenha(String senha) {
		login.setSenha(senha);

		return this;
	}

	public LoginBuilder addToken(long token) {
		login.setToken(token);

		return this;
	}
	
	public LoginBuilder addCodigo(int codigo) {
		login.setCodigo(codigo);

		return this;
	}

	public Login get() {

		return login;
	}

}
