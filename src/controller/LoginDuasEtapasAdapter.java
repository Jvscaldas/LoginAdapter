package controller;

import model.Login;

public class LoginDuasEtapasAdapter implements IServicoLogin {

	LoginDuasEtapas lgn2e;

	public LoginDuasEtapasAdapter(LoginDuasEtapas lgn2e) {
		this.lgn2e = lgn2e;
	}

	@Override
	public void logar(Login login) {
		lgn2e.fazerLogin(login.getNome(), login.getSenha(), login.getCodigo());

	}

}
