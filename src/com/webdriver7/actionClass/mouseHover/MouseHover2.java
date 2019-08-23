package com.webdriver7.actionClass.mouseHover;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import com.webdriver1.Util;

public class MouseHover2
{
//getting error Hover over menu and select sub menu in java Selenium999
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.spicejet.com/");
		Util.sleep(3000);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[@id='highlight-addons']//following"
				+ "::span[contains(text(),'MENU')]"))).build().perform();
		Util.sleep(2000);
//		WebElement element=(new WebDriverWait(driver,10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul[@id="
//				+ "'menu-list-login']//preceding-sibling::a[contains(@href,'javascript:void();')]")));
		action.moveToElement(driver.findElement(By.xpath("//ul[@id='menu-list-login']//preceding-sibling::a[contains(@href,'"
				+ "javascript:void();')]"))).build().perform();
		
		driver.findElement(By.linkText("Flight Schedules")).click();
		
		Util.sleep(3000);
		driver.quit();

	}

}
