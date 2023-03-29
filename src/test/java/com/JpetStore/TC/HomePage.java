package com.JpetStore.TC;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePage {
	
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
	public void registerTest()
	{
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.linkText("Register Now!")).click();
		driver.findElement(By.id("stripes-1968257508")).sendKeys("Suraj K");
		driver.findElement(By.name("password")).sendKeys("Suraj@8142");
		driver.findElement(By.name("repeatedPassword")).sendKeys("Suraj@8142");
		driver.findElement(By.name("account.firstName")).sendKeys("Suraj");
		driver.findElement(By.name("account.lastName")).sendKeys("K");
		driver.findElement(By.name("account.email")).sendKeys("suraj123@gmail.com");
		driver.findElement(By.name("account.phone")).sendKeys("9885188092");
		driver.findElement(By.name("account.address1")).sendKeys("Honnur");
		driver.findElement(By.name("account.address2")).sendKeys("Ananthapur");
		driver.findElement(By.name("account.city")).sendKeys("Uravakonda");
		driver.findElement(By.name("account.state")).sendKeys("Andhra Pradesh");
		driver.findElement(By.name("account.zip")).sendKeys("518395");
		driver.findElement(By.name("account.country")).sendKeys("India");
		
		Select Language=new Select(driver.findElement(By.name("account.languagePreference")));
		Language.selectByVisibleText("english");
		
		Select category=new Select(driver.findElement(By.name("account.favouriteCategoryId")));
		category.selectByVisibleText("FISH");
		
		driver.findElement(By.name("account.listOption ")).click();
		driver.findElement(By.name("account.bannerOption")).click();
		
		driver.findElement(By.name("newAccount")).click();
		
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
