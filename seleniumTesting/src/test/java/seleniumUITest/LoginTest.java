package seleniumUITest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		String username = driver.findElement(By.cssSelector("#user-name")).getAttribute("value");
		
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		String password = driver.findElement(By.cssSelector("#password")).getAttribute("value");
		
		if(username.equals("standard_user") && password.equals("secret_sauce"))
        {
			driver.findElement(By.id("login-button")).click();
			System.out.print("Erfolgreicher Login");
			driver.quit();
        }
        else{
        	driver.findElement(By.id("login-button")).click();
        	System.out.print("Erfolgreicher fehlgeschlagen");
        }
	}
}
