package com.syntax.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HrmsTestCases {
	public static WebDriver driver;
	
	@BeforeMethod 
	public void openBrowser () { // this is pre-condition  === to open the browser
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void closeBrowser() { // this is post-condition
		driver.quit();
	}
	
	@Test
	public void validLogin() {
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.cssSelector("input#btnLogin")).click();
		String welcomeText = driver.findElement(By.id("welcome")).getText();
		
		if (welcomeText.contains("Admin")) {
			System.out.println("Admin is logged in. Test pass");
		}else {
			System.out.println("Admin is NOT logged in. Test fail");
		}
	}
	
	@Test
	public void titleValidation() {
		
		String expectedTitle = "Human Management System";
		String actualTitle = driver.getTitle();
		
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Titles are matched. Test Pass");
		}else {
			System.out.println("Titles do not match. Test Failed");
		}
	}

}
