package PractiseScripts.WebAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;
	
	@BeforeTest
	void startup() {
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
	}
	@Test
	void login() {
		driver.findElement(By.id("inputUsername")).sendKeys("aaleeya");
		driver.findElement(By.name("inputPassword")).sendKeys("test");
		driver.findElement(By.className("signInBtn")).click();
		//Assert a = new Assert();
		
	}

	/*@Test
	void loginAllElements() {
		login();
		
	}*/
}
