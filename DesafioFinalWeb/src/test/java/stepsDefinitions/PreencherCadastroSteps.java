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

public class PreencherCadastroSteps {

	@Dado("que eu estou na aba Checkout")
	public void queEuEstouNaAbaCheckout() {
		Na(AdicionarItensPage.class).clicarBotaoAddToCartBackpack();
		Na(AdicionarItensPage.class).clicarBotaoAddToCartFleece();
		Na(AdicionarItensPage.class).clicarBotaoAddToCartOnesie();
		Na(AdicionarItensPage.class).clicarBotaoAddToCartBikeLight();
		Na(FinalizarComprasPage.class).acessaCarrinho();
		Na(FinalizarComprasPage.class).clicarNoBotaoCheckout();
		assertEquals("CHECKOUT: YOUR INFORMATION",driver.findElement(By.xpath("//span[text()='Checkout: Your Information']")).getText());
	}

	@Quando("eu informar o first Name {string}")
	public void euInformarOFirstName(String firstName) {
		Na(PreencherCadastroPage.class).informarFirstName(firstName);
	}

	@Quando("eu informar o last Name {string}")
	public void euInformarOLastName(String lastName) {
		Na(PreencherCadastroPage.class).informarLastName(lastName);
	}

	@Quando("informar o Zip\\/Postal Code {string}")
	public void informarOZipPostalCode(String postalCode) {
		Na(PreencherCadastroPage.class).informarPostalCode(postalCode);
	}

	@Quando("clicar no botao continue")
	public void clicarNoBotaoContinue() {
		Na(PreencherCadastroPage.class).acionarBotaoContinue();
	}

	@Entao("o sistema apresenta a aba Checkout: Overview")
	public void oSistemaApresentaAAbaCheckoutOverview() {
		assertEquals("CHECKOUT: OVERVIEW", driver.findElement(By.xpath("//span[@class='title']")).getText());
	}
}
