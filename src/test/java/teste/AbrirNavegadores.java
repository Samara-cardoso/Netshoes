package teste;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
/*Fim da conversa no bate-papo
Digite uma mensagem...
*/

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AbrirNavegadores {

	private static WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\samara.cardoso\\Desktop\\chromedriver.exe");
	driver = new ChromeDriver();
	
//	System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe"); //do firefox
//	driver = new FireFoxDriver();
	
	
	driver.get("http://www.google.com.br");
	
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.close();
		driver.quit();
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
