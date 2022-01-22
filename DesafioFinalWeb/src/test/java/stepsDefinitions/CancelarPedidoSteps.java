package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.AdicionarItensPage;
import pageObjects.FinalizarComprasPage;
import pageObjects.PreencherCadastroPage;
import pageObjects.CancelarPedidoPage;

public class CancelarPedidoSteps {
	
	@Dado("que eu estou na aba Checkout: Overview")
	public void queEuEstouNaAbaCheckoutOverview() {
		assertEquals("CHECKOUT: OVERVIEW", driver.findElement(By.xpath("//span[@class='title']")).getText());
	}

	@Quando("eu acionar o botao cancel")
	public void euAcionarOBotaoCancel() {
	    Na(CancelarPedidoPage.class).acionarBotaoCancel();
	}

	@Entao("o sistema volta para a pagina inicial")
	public void oSistemaVoltaParaAPaginaInicial() {
		 assertEquals("PRODUCTS", driver.findElement(By.xpath("//span[@class ='title']")).getText());
	}


}
