package pageObjects;

import static utils.Utils.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class FiltrosPage {
	
	@FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/div[2]/span/select")
	private WebElement menuFiltro;
	
	@FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[3]")
	private WebElement subMenuPrice;

	public void acionaMenuFiltro() {
		Actions acao = new Actions(driver);
		acao.moveToElement(menuFiltro).click().build().perform();
		// rever esse comando moveToElement
	}
	
	public void acionaSubMenuPrice() {
		subMenuPrice.click();
	}
}

