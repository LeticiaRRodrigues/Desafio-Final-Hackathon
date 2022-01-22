package stepsDefinitions;

import pageObjects.AdicionarItensPage;
import pageObjects.FinalizarComprasPage;
import pageObjects.LoginPage;
import pageObjects.PreencherCadastroPage;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import static utils.Utils.*;

import java.util.concurrent.TimeUnit;


public class Hooks {
	
	@Before ()
	public void setUp() {
		acessarSistema();
		 Na(LoginPage.class).realizarLogin("standard_user", "secret_sauce");
	}
	
//	@Before (value = "@Login")
//	public void funcionalidadeLogin() {
//		acessarSistema();
//	}
	
	
	@Before (value = "@CancelarPedido")
	public void AbaCheckoutOverview() {
	
		Na(AdicionarItensPage.class).clicarBotaoAddToCartBackpack();
		Na(AdicionarItensPage.class).clicarBotaoAddToCartFleece();
		Na(AdicionarItensPage.class).clicarBotaoAddToCartOnesie();
		Na(AdicionarItensPage.class).clicarBotaoAddToCartBikeLight();
		Na(FinalizarComprasPage.class).acessaCarrinho();
		Na(FinalizarComprasPage.class).clicarNoBotaoCheckout();
		Na(PreencherCadastroPage.class).informarFirstName("Leticia");
		Na(PreencherCadastroPage.class).informarLastName("Ribeiro");
		Na(PreencherCadastroPage.class).informarPostalCode("71680369");
		Na(PreencherCadastroPage.class).acionarBotaoContinue();
	}
	
	@Before (value = "@FinalizarCompras")
	public void incluirItensNoCarrinho() {
	
		 Na(AdicionarItensPage.class).clicarBotaoAddToCartBackpack();
		 Na(AdicionarItensPage.class).clicarBotaoAddToCartFleece();
		 Na(AdicionarItensPage.class).clicarBotaoAddToCartOnesie();
		 Na(AdicionarItensPage.class).clicarBotaoAddToCartBikeLight();
	}
	
	@Before (value = "@PreencherCadastro")
	public void AbaCheckout() {
	
		Na(AdicionarItensPage.class).clicarBotaoAddToCartBackpack();
		Na(AdicionarItensPage.class).clicarBotaoAddToCartFleece();
		Na(AdicionarItensPage.class).clicarBotaoAddToCartOnesie();
		Na(AdicionarItensPage.class).clicarBotaoAddToCartBikeLight();
		Na(FinalizarComprasPage.class).acessaCarrinho();
		Na(FinalizarComprasPage.class).clicarNoBotaoCheckout();
	}
	
	@After()
	public void tearDown(Scenario scenario) throws InterruptedException {
		capturarTela(scenario);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.quit();
	}
	
	

}
