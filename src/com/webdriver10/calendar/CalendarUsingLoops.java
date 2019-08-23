package com.webdriver10.calendar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.webdriver1.Util;

public class CalendarUsingLoops
{
	static Alert alert;
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.abhibus.com/");
		
		Util.sleep(3000);
		
		if(alert != null)
		{
			driver.switchTo().alert();
			alert.accept();
		}
		
//		String date = "25-jul-2019";
//		String dateArr[] = date.split("-");
//		String day = dateArr[0];
//		String month = dateArr[1];
//		String year = dateArr[2];
		
//		/html[1]/body[1]/div[3]/div[1]/form[1]/div[1]/div[3]/div[1]/input[1]
//		/html[1]/body[1]/div[7]/div[1]/table[1]/tbody[1]/tr[4]/td[5]/a[1]
//		/html[1]/body[1]/div[7]/div[1]/table[1]/tbody[1]/tr[5]/td[2]/a[1]		
//		/html[1]/body[1]/div[7]/div[1]/table[1]/tbody[1]/tr[4]/td[7]/a[1]
//		/html[1]/body[1]/div[7]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]
//		/html[1]/body[1]/div[7]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/span[1]
//		/html[1]/body[1]/div[7]/div[2]/table[1]/tbody[1]/tr[1]/td[6]/a[1]

		driver.findElement(By.id("datepicker1")).click();
		String beforeXpath = ".//html[1]/body[1]/div[7]/div[2]/table[1]/tbody[1]/tr[";
		String afterXpath = "]/td[";
		
		final int totalWeekDays = 7;
		boolean flag = false;
		String dateVal = null;
		for (int rowNum = 2; rowNum <=5; rowNum++)
		{
			for (int colNum = 1; colNum < totalWeekDays; colNum++)
			{
				try
				{
					dateVal = driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]/a[1]")).getText();
				}
				catch (NoSuchElementException e)
				{
					System.out.println("please enter a correct value");
					flag = true;
					break;
				}
				
				System.out.println(dateVal);
				if (dateVal.equalsIgnoreCase("15"))
				{
					driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]/a[1]")).click();
					flag = true;
					break;
				}
			}
			if(flag)
			{
				break;
			}
		}

			
		
	}

}
