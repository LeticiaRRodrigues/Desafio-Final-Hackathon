package pageObjects;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FinalizarComprasPage {
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	Actions acao = new Actions(driver);
	
	@FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a") 
	private WebElement acessarCarrinho;
	
	
	@FindBy(id = "remove-sauce-labs-onesie") 
	private WebElement botaoRemove;
	
	@FindBy(xpath =  "//*[@id=\"checkout\"]") 
	private WebElement botaoCheckout;
	
	public void acessaCarrinho() {
		
		wait.until(ExpectedConditions.elementToBeClickable(acessarCarrinho));
		acao.moveToElement(acessarCarrinho).click().build().perform();
		assertEquals("YOUR CART", driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText());
		//VERIFICAR
	}
	
	public void removerItemOnesie() {
		wait.until(ExpectedConditions.elementToBeClickable(botaoRemove));
		acao.moveToElement(botaoRemove).click().build().perform();
	}
	
	public void clicarNoBotaoCheckout() {
		wait.until(ExpectedConditions.elementToBeClickable(botaoCheckout));
		acao.moveToElement(botaoCheckout).click().build().perform();
	}

}
