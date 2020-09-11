package com.syntax.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task3 {
	
static	WebDriver driver;
	
	@BeforeMethod
	public void validLogin() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	@Test
	public void errorMessage() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword"));
		driver.findElement(By.cssSelector("input#btnLogin")).click();
		WebElement errorMessage = driver.findElement(By.xpath("//span[text() = ‘Password cannot be empty’]"));
		String errorMessageText = errorMessage.getText();
		if(errorMessage.isDisplayed() || errorMessageText.equals("Password cannot be empty")) {
			System.out.println("Error with the text Password cannot be empty is diplayed. Test passed");
		} else {
			System.out.println("Error with the text Password cannot be empty is NOT diplayed. Test failed");
		}
	}
	
}


