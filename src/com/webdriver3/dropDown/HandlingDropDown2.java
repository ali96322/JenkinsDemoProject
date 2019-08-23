package com.webdriver3.dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.webdriver1.Util;

public class HandlingDropDown2
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		WebElement dropDown = driver.findElement(By.id("continents"));
		Util.sleep(3000);
		Select opt = new Select(dropDown);
		opt.selectByIndex(3);
		Util.sleep(4000);
		opt.selectByVisibleText("South America");
		Util.sleep(4000);
		driver.quit();
	}
}
