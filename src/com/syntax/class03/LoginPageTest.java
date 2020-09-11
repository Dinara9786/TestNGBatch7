package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageTest {
	
public static WebDriver driver;
	
	@BeforeMethod(alwaysRun = true)
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		// driver.manage().window().maximize();
	}

	@AfterMethod(alwaysRun = true)
	public void closeBrowser() {
		driver.quit();
	}
	
	@Test (dataProvider = "getData")
	public void multipleLogin(String username, String password, String name) throws InterruptedException {
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPasswords")).sendKeys(password);
		driver.findElement(By.cssSelector("input#btnLogin")).click();
		Thread.sleep(4000);
		String welcomeText = driver.findElement(By.id("welcome")).getText();
		Thread.sleep(4000);
		Assert.assertTrue(welcomeText.startsWith("Welcome"+name));
		Assert.assertTrue(welcomeText.contains(username));
	
	}
		
	@DataProvider // this return the object of 2 dimens array, that will hold the data that we want to pass to our test case
	
	//access modifier = public
	// Object = 
	// 2 dimension array = [][] [rows] [columns]
	public Object [][] getData (){
		
		Object[][] data = {
				{"Admin", "Hum@nhrm123", "Admin"},
				{"JohnTest", "Syntax123!", "John"},
				{"KokaL", "Kokaytvyn$12345", "Koka"}
	};
		return data;
	}
}
