package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.AdicionarItensPage;
import pageObjects.FinalizarComprasPage;

public class FinalizarComprasSteps {
	

	
	@Quando("eu acessar o carrinho")
	public void euAcessarOCarrinho() {
	    Na(FinalizarComprasPage.class).acessaCarrinho();
	}

	@Quando("remover o item Onesie")
	public void removerOItemOnesie() {
	    Na(FinalizarComprasPage.class).removerItemOnesie();
	}

	@Quando("clicar no botao Checkout")
	public void clicarNoBotaoCheckout() {
	    Na(FinalizarComprasPage.class).clicarNoBotaoCheckout();
	}

	@Entao("o sistema apresenta a aba Checkout")
	public void oSistemaApresentaAAbaCheckout() {
	    assertEquals("CHECKOUT: YOUR INFORMATION", driver.findElement(By.xpath("//span[@class='title']")).getText());
	}


}
