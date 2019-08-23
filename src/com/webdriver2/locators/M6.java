package com.webdriver2.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class M6
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		List<WebElement> linkText = driver.findElements(By.tagName("a"));
		System.out.println(linkText.size());
		for (int i = 0; i < linkText.size(); i++)
		{
			String links = linkText.get(i).getText();
			System.out.println(links);
		}
		driver.quit();
	}

}
