package pageObjects;

import static utils.Utils.*;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class FiltrosPage {

	@FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/div[2]/span/select")
	private WebElement menuFiltro;

	@FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[3]")
	private WebElement subMenuPrice;

	@FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/div")
	private WebElement item1;

	@FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[2]/div[2]/div[2]/div")
	private WebElement item2;

	@FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[3]/div[2]/div[2]/div")
	private WebElement item3;

	@FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[4]/div[2]/div[2]/div")
	private WebElement item4;

	@FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[5]/div[2]/div[2]/div")
	private WebElement item5;

	@FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[6]/div[2]/div[2]/div")
	private WebElement item6;

	public void acionaMenuFiltro() {
		Actions acao = new Actions(driver);
		acao.moveToElement(menuFiltro).click().build().perform();
	}

	public void acionaSubMenuPrice() {
		subMenuPrice.click();
	}

	public boolean verificarFiltro() {
		
		
		boolean ordemCrescente = true;
		List<Double> listaItensPreco = preencherListaPrecos();
		Double primeiroValor = listaItensPreco.get(0);


		for (int i = 1; i < 6; i++) {
			if (primeiroValor > listaItensPreco.get(i)) {
				ordemCrescente = false;
				break;
			} else {
				primeiroValor = listaItensPreco.get(i);
			}
		}

		return ordemCrescente;

	}

	public List<Double> preencherListaPrecos() {

		List<Double> listaItens = new ArrayList<Double>();

		Double valor1 = Double.parseDouble(item1.getText().replace("$", ""));
		listaItens.add(valor1);

		Double valor2 = Double.parseDouble(item2.getText().replace("$", ""));
		listaItens.add(valor2);

		Double valor3 = Double.parseDouble(item3.getText().replace("$", ""));
		listaItens.add(valor3);

		Double valor4 = Double.parseDouble(item4.getText().replace("$", ""));
		listaItens.add(valor4);

		Double valor5 = Double.parseDouble(item5.getText().replace("$", ""));
		listaItens.add(valor5);

		Double valor6 = Double.parseDouble(item6.getText().replace("$", ""));
		listaItens.add(valor6);

		return listaItens;
	}

}
