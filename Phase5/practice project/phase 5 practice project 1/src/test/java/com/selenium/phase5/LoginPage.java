package com.selenium.phase5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPage {
	  @Test
	  public void login() {
	  
		  System.setProperty("webdriver.chrome.driver", "E:\\software\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  
	  
		  driver.manage().window().maximize();
	  
		  driver.get("https://demo.wpjobmanager.com/my-account/");
		  driver.findElement(By.id("reg_email")).sendKeys("ArunPratap1@gmail.com");
		  driver.findElement(By.id("reg_password")).sendKeys("Arun12890@123");
		  driver.findElement(By.name("register")).click();
		  driver.findElement(By.xpath("//*[@id=\"post-65\"]/div/div/div/p[1]/a")).click();
		  //Login
		  driver.findElement(By.id("username")).sendKeys("ArunPratap1@gmail.com");
		  driver.findElement(By.id("password")).sendKeys("Arun12890@123");
		  driver.findElement(By.name("login")).click();
		  }
		  }