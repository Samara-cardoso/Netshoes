package teste;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavCad {
	static WebDriver driver;
	

	public NavCad(WebDriver driver) {
		NavCad.driver=driver;
		
		
	}             

	public void preencherCampos () {
		WebElement nome = driver.findElement(By.id("textfield12"));
		nome.sendKeys("samaraecs@yahoo.com.br");
		
		WebElement senha = driver.findElement(By.name("senha"));
		senha.sendKeys("Samy11");
		
		WebElement login = driver.findElement(By.xpath("//*[@id=\"Table_3\"]/tbody/tr[2]/td/p[5]/input"));
		login.click();
		
	}
	public String encontrarTexto () {
		return driver.findElement(By.xpath("//*[@id=\"Table_3\"]/tbody/tr[2]/td/p[4]/span")).getText();
	}
}
