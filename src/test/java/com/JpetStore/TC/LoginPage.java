package com.JpetStore.TC;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPage {
	
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SG67126\\eclipse-workspace"
				+ "\\JpetStore\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
	}
	@Test
	public void loginTest()
	{
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.name("stripes--505884246")).sendKeys("Vihas K");
		driver.findElement(By.name("password")).sendKeys("Vihas@8142");
		driver.findElement(By.name("signon")).click();
		
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
