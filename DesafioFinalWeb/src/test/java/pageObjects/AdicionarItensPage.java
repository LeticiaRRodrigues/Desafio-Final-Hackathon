package pageObjects;

import static utils.Utils.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdicionarItensPage {
	
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	Actions acao = new Actions(driver);
	
	
	@FindBy(name = "add-to-cart-sauce-labs-backpack") 
	private WebElement botaoAddToCartBackpack;
	
	@FindBy(name = "add-to-cart-sauce-labs-fleece-jacket") 
	private WebElement botaoAddToCartFleece;
	
	@FindBy(name = "add-to-cart-sauce-labs-onesie") 
	private WebElement botaoAddToCartOnesie;
	
	@FindBy(name = "add-to-cart-sauce-labs-bike-light") 
	private WebElement botaoAddToCartBikeLight;
	
	
	public void clicarBotaoAddToCartBackpack() {		
		wait.until(ExpectedConditions.elementToBeClickable(botaoAddToCartBackpack));
		acao.moveToElement(botaoAddToCartBackpack).click().build().perform();
	}
	
	public void clicarBotaoAddToCartFleece() {
		wait.until(ExpectedConditions.elementToBeClickable(botaoAddToCartFleece));
		acao.moveToElement(botaoAddToCartFleece).click().build().perform();
	}
	
	public void clicarBotaoAddToCartOnesie() {
		wait.until(ExpectedConditions.elementToBeClickable(botaoAddToCartOnesie));
		acao.moveToElement(botaoAddToCartOnesie).click().build().perform();
	}
	
	public void clicarBotaoAddToCartBikeLight() {
		wait.until(ExpectedConditions.elementToBeClickable(botaoAddToCartBikeLight));
		acao.moveToElement(botaoAddToCartBikeLight).click().build().perform();
	}

}
