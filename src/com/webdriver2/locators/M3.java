package com.webdriver2.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class M3
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/20281/aus-vs-rsa-match-45-icc-cricket-world-cup-2019");
		String attribute = driver.findElement(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-itms']//parent::div//parent::"
				+ "div[@id='innings_1']//parent::div[@url='/api/html/cricket-scorecard/20281']")).getAttribute("class");
		System.out.println(attribute);
		if (attribute.equalsIgnoreCase("cb-col cb-col-67 cb-scrd-lft-col html-refresh ng-isolate-scope"))
		{
			System.out.println("attribute class matched");
		}
		else
		{
			System.out.println("attribute fail");
		}
		driver.quit();

	}

}
