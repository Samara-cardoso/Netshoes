package teste;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.TelaInicial;
import pages.TelaLogin;

public class LoginNetshoes {
	
	private static WebDriver driver;
	static DadosNetshoes dadosNetshoes;
	static TelaInicial telaInicial;
	static TelaLogin telaLogin;
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samara.cardoso\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.netshoes.com.br/?campaign=gglepqbdg&gclid=EAIaIQobChMIgqiO7NO24AIVFQiRCh05QwNkEAAYASAAEgLDO_D_BwE");
		dadosNetshoes = new DadosNetshoes(driver);
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//dadosNetshoes.fazerOLogin();
		//dadosNetshoes.inserirDados();
		//dadosNetshoes.fazerLogoff();
		//assertTrue(dadosNetshoes.validarLogoff());
		
		telaInicial.fazerOLogin();
		telaLogin.inserirDados();
		telaInicial.fazerLogoff();
		assertTrue(telaInicial.validarLogoff());
	}

}
