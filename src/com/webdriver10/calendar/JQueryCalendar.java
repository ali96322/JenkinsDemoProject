package com.webdriver10.calendar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.webdriver1.Util;

public class JQueryCalendar
{
//jquery date picker
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.seleniumeasy.com/test/jquery-date-picker-demo.html");
		
		Util.sleep(3000);
		
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
		
		Util.sleep(3000);
		
		WebElement date = driver.findElement(By.id("from"));
		
		String dateVal = "30-jul-2019";
		
		selectDateByJS(driver, date, dateVal);
			
		
	}
	
	public static void selectDateByJS(WebDriver driver, WebElement element, String dateVal)
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateVal+ "');", element);
	}

}
