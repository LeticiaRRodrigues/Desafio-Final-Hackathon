package stepsDefinitions;

import static utils.Utils.*;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.FiltrosPage;

public class FiltrosSteps {
	
	@Quando("eu acionar o menu filtro")
	public void euAcionarOMenuFiltro() {
	    Na(FiltrosPage.class).acionaMenuFiltro();
	}

	@Quando("clicar no submenu Price \\(low to high)")
	public void clicarNoSubmenuPriceLowToHigh() {
	    Na(FiltrosPage.class).acionaSubMenuPrice();
	}

	@Entao("o sistema apresenta os itens do menor para o maior preco")
	public void oSistemaApresentaOsItensDoMenorParaOMaiorPreco() {
	    assert(Na(FiltrosPage.class).verificarFiltro());
	}
}
