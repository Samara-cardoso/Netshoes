package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TelaInicial {

	private WebDriver driver;
	private WebDriverWait wait; 
	private Actions actions;
	
	
public TelaInicial(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 10);
		actions = new Actions(driver);
		
}	
	

	public void fazerOLogin() {
		WebElement mainMenu = driver.findElement(By.linkText("Entrar"));
		mainMenu.click();
		WebElement subMenu = driver.findElement(By.linkText("Login"));
		subMenu.click();

	
	}
	
	public void fazerLogoff() {
		WebElement usuario = wait.until(ExpectedConditions.elementToBeClickable(By.id("username-logged")));
		// driver.findElement(By.id("username-logged"));
		usuario.click();
		WebElement sair = driver.findElement(By.linkText("Sair"));
		sair.click();
	}
	
	public boolean validarLogoff() {
		 WebElement validarEntrar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Entrar")));
				 //driver.findElement(By.linkText("Entrar"));
		return validarEntrar.isDisplayed();
		 }

}
