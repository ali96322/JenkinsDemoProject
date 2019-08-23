package com.webdriver3.dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.webdriver1.Util;

public class HandlingDropDown
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///G:/selenium/material/test1.html");
		WebElement dropDown = driver.findElement(By.name("breakfast"));
		Util.sleep(3000);
		Select opt = new Select(dropDown);
		opt.selectByIndex(2);
		Util.sleep(4000);
		opt.selectByVisibleText("poori");
		Util.sleep(4000);
		opt.selectByValue("5");
		Util.sleep(5000);
		driver.quit();
	}

}
