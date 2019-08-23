package com.webdriver7.actionClass.mouseHover;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.webdriver1.Util;

public class MouseHover
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.spicejet.com/");
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("ctl00_HyperLinkLogin"))).build().perform();
		driver.findElement(By.linkText("Corporate Accounts")).click();
		
		Util.sleep(5000);
		driver.quit();
	}

}
