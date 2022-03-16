package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTest2 {

	public static void main(String[] args) {
		// set the driver property
		System.setProperty("webdriver.chrome.driver", "E:\\software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement email= driver.findElement(By.id("email"));
		WebElement pass= driver.findElement(By.id("pass"));
		
		email.sendKeys("arunpratap40@yahoo.com");
		pass.sendKeys("8840337319");
		
		WebElement login= driver.findElement(By.name("login"));
		login.submit();
		//driver.close();
	}
}