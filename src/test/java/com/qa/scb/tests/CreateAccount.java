package com.qa.scb.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateAccount {
	static WebDriver driver;
	
	@Test(priority=1)
	public static void launchApplication() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test(priority=2)
	public static void loginApplication() {
		try {
			driver.findElement(By.id("email")).sendKeys("test@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("test@gmail.com");
			driver.findElement(By.name("login")).click();
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority=3)
	public static void closeApplication() {
		driver.close();
	}

}
