package pageObjects;

import static utils.Utils.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdicionarItensPage {
	
	@FindBy(name = "add-to-cart-sauce-labs-backpack") 
	private WebElement botaoAddToCartBackpack;
	
	@FindBy(name = "add-to-cart-sauce-labs-fleece-jacket") 
	private WebElement botaoAddToCartFleece;
	
	@FindBy(name = "add-to-cart-sauce-labs-onesie") 
	private WebElement botaoAddToCartOnesie;
	
	@FindBy(name = "add-to-cart-sauce-labs-bike-light") 
	private WebElement botaoAddToCartBikeLight;
	
	public void clicarBotaoAddToCartBackpack() {
		botaoAddToCartBackpack.click();
	}
	
	public void clicarBotaoAddToCartFleece() {
		botaoAddToCartFleece.click();
	}
	
	public void clicarBotaoAddToCartOnesie() {
		botaoAddToCartOnesie.click();
	}
	
	public void clicarBotaoAddToCartBikeLight() {
		botaoAddToCartBikeLight.click();
	}

}
