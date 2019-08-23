package com.webdriver10.calendar;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendarpickup1
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.seleniumeasy.com/test/jquery-date-picker-demo.html");
		
		List<WebElement> dates = driver.findElements(By.xpath("//input[@name='from']"));
		System.out.println(dates.size());
		
		for (int i = 0; i < dates.size(); i++)
		{
			String date = dates.get(i).getText();
			
			if (date.equalsIgnoreCase("1"))
			{
				dates.get(i).click();
				break;
			}
		}
		
	}
	
}
