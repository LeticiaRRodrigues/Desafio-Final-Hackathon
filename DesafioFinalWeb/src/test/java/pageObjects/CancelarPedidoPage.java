package pageObjects;

import static utils.Utils.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CancelarPedidoPage {
	
	@FindBy(xpath = "//span[@class='title']") 
	private WebElement abaCheckoutOverview;
	
	@FindBy(id = "cancel") 
	private WebElement botaoCancel;
	
	@FindBy(xpath = "//div[@class='app_logo']") 
	private WebElement paginaInicial;
	
	public void acionarBotaoCancel() {
		botaoCancel.click();
	}
}
