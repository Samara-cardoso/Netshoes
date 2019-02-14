package teste;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavCadastro {
	
	private static WebDriver driver;
	static NavCad navCad;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samara.cardoso\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.kabum.com.br/cgi-local/site/login/login.cgi");
		navCad = new NavCad(driver);
		 
		
		
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
		navCad.preencherCampos();
		
		Assert.assertEquals(navCad.encontrarTexto(), "SUA SENHA111");
	}
	

}
