package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.LoginPage;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class LoginSteps {
	
	@Dado("que eu esteja acessando o sitema")
	public void queEuEstejaAcessandoOSitema() {
	    acessarSistema();
	}

	@Quando("informar o usuario {string}")
	public void informarOUsuario(String usuario) {
	    Na(LoginPage.class).informarCampoUsuario(usuario);
	}

	@Quando("informar a senha {string}")
	public void informarASenha(String senha) {
	    Na(LoginPage.class).informarCampoSenha(senha);
	}

	@Quando("clicar no botao login")
	public void clicarNoBotaoLogin() {
	    Na(LoginPage.class).acionarBotaoLogin();
	}

	@Entao("o sistema exibe o usuario logado")
	public void oSistemaExibeOUsuarioLogado() {
	    assertEquals("PRODUCTS", driver.findElement(By.xpath("//span[@class ='title']")).getText());
	}
}
