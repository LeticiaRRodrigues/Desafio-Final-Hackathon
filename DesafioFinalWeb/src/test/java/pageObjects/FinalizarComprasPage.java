package pageObjects;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FinalizarComprasPage {
	
	@FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a") 
	private WebElement acessarCarrinho;
	//verificar
	
	@FindBy(id = "remove-sauce-labs-onesie") 
	private WebElement botaoRemove;
	
	@FindBy(xpath =  "//*[@id=\"checkout\"]") 
	private WebElement botaoCheckout;
	
	public void acessaCarrinho() {
		acessarCarrinho.click();
		assertEquals("YOUR CART", driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText());
		//VERIFICAR
	}
	
	public void removerItemOnesie() {
		botaoRemove.click();
	}
	
	public void clicarNoBotaoCheckout() {
		botaoCheckout.click();
	}

}
