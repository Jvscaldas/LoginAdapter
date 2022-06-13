package view;

import controller.IServicoLogin;
import controller.LoginDuasEtapas;
import controller.LoginDuasEtapasAdapter;
import controller.LoginToken;
import controller.LoginTokenAdapter;
import model.Login;
import model.LoginBuilder;

public class Principal {

	public static void main(String[] args) {
		IServicoLogin servicoLogin;

		Login login = LoginBuilder.builder()
				.addNome("João")
				.addSenha("P4ssw0rd")
				.addCodigo((int) (Math.random()*100))
				//.addToken(123)
				.get();

		LoginDuasEtapas l2e = new LoginDuasEtapas();
		servicoLogin = new LoginDuasEtapasAdapter(l2e);

//		LoginToken lt = new LoginToken();
//		servicoLogin = new LoginTokenAdapter(lt);

		servicoLogin.logar(login);

	}

}
