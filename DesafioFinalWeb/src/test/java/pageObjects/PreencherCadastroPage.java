package pageObjects;

import static utils.Utils.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PreencherCadastroPage {
	
	@FindBy(xpath = "//span[text()='Checkout: Your Information']") 
	private WebElement abaCheckout;
	
	@FindBy(id = "first-name") 
	private WebElement campoFirstName;
	
	@FindBy(id = "last-name") 
	private WebElement campoLastName;
	
	@FindBy(id = "postal-code") 
	private WebElement campoPostalCode;
	
	@FindBy(id = "continue") 
	private WebElement botaoContinue;
	
	
	public void informarFirstName(String firstName) {
		campoFirstName.sendKeys(firstName);
	}
	
	public void informarLastName(String lastName) {
		campoLastName.sendKeys(lastName);
	}
	
	public void informarPostalCode(String postalCode) {
		campoPostalCode.sendKeys(postalCode);
	}
	
	public void acionarBotaoContinue() {
		botaoContinue.click();
	}
}
