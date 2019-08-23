package com.webdriver4.popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupHandle
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		
		Alert alert = driver.switchTo().alert();
		
		String text = alert.getText();
		System.out.println(text);
		
		if (text.equals("enter usename"))
		{
			System.out.println("correct alert msg");
		}
		else
		{
			System.out.println("incorrect alert msg");
		}
		
		alert.accept();
		//alert.dismiss();
		driver.quit();
	}

}
