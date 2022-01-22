package stepsDefinitions;

import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.AdicionarItensPage;
import pageObjects.FiltrosPage;

public class AdicionarItensSteps {
	
	@Quando("eu adicionar o item Backpack")
	public void euAdicionarOItemBackpack() {
	    Na(AdicionarItensPage.class).clicarBotaoAddToCartBackpack();
	}
	
	@Quando("eu adicionar o item Fleece")
	public void euAdicionarOItemFleece() {
	    Na(AdicionarItensPage.class).clicarBotaoAddToCartFleece();
	}
	
	@Quando("eu adicionar o item Onesie")
	public void euAdicionarOItemOnesie() {
	    Na(AdicionarItensPage.class).clicarBotaoAddToCartOnesie();
	}
	
	@Quando("eu adicionar o item Bike Light")
	public void euAdicionarOItemBikeLight() {
	    Na(AdicionarItensPage.class).clicarBotaoAddToCartBikeLight();
	} 

	@Entao("o sistema adiciona os itens no carrinho")
	public void oSistemaAdicionaOItemNoCarrinho() {
	    assertTrue(driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).isDisplayed());
	}
}
