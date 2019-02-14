package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TelaLogin {

	private WebDriver driver;
	private WebDriverWait wait; 
	private Actions actions;
	

	public TelaLogin() {
		
	}

	public void inserirDados() {
		WebElement cpf = driver.findElement(By.id("username"));
		cpf.sendKeys("22889474895");
		WebElement senha = driver.findElement(By.id("password"));
		senha.sendKeys("rsi123456");
		WebElement entrar = driver.findElement(By.id("login-button"));
		entrar.click();

	}
	
}
