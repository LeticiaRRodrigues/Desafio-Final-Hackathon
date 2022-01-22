package pageObjects;

import static utils.Utils.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PreencherCadastroPage {
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	Actions acao = new Actions(driver);
	
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
	
	
	
	public void informarFirstName(String firstName){
		
		wait.until(ExpectedConditions.elementToBeClickable(campoFirstName));
		campoFirstName.sendKeys(firstName);
	}
	
	public void informarLastName(String lastName) {
		
		wait.until(ExpectedConditions.elementToBeClickable(campoLastName));
		campoLastName.sendKeys(lastName);
	}
	
	public void informarPostalCode(String postalCode) {
		
		wait.until(ExpectedConditions.elementToBeClickable(campoPostalCode));
		campoPostalCode.sendKeys(postalCode);
	}
	
	public void acionarBotaoContinue() {
		wait.until(ExpectedConditions.elementToBeClickable(botaoContinue));
		acao.moveToElement(botaoContinue).click().build().perform();
	}
}
