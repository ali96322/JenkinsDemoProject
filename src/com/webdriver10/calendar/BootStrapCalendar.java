package com.webdriver10.calendar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.webdriver1.Util;

public class BootStrapCalendar
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.seleniumeasy.com/test/bootstrap-date-picker-demo.html");
		
		
		WebElement date = driver.findElement(By.xpath("//input[@class='form-control' and @type='text' and @placeholder='dd/mm/yyyy']"));
		
		String dateVal = "30-jul-2019";
		
		selectDateByJS(driver, date, dateVal);
			
		
	}
	
	public static void selectDateByJS(WebDriver driver, WebElement element, String dateVal)
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateVal+ "');", element);
	}

}
