package stepsDefinitions;

import pageObjects.LoginPage;
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
	
	@After()
	public void tearDown() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.quit();
	}
	
	

}
