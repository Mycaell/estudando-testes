package steps;

import static utils.Utils.acessarApp;
import static utils.Utils.driver;

import java.net.MalformedURLException;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.Utils;

public class Hooks {

	@Before
	public void setUp() throws MalformedURLException {
		acessarApp();
	}
	
	
	@After
	public void fecharApp(Scenario cenario) {
		Utils.gerarScreenShot(cenario);
		driver.quit();
	}
}
