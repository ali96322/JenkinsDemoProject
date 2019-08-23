package com.webdriver2.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class M2
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/live-cricket-scores/20280/sl-vs-ind-match-44-icc-cricket-world-cup-2019");
		String score = driver.findElement(By.xpath("//div[@class='cb-col cb-col-100 cb-comm-static ']//preceding-sibling"
				+ "::script[@id='miniscore']//parent::div/div[2]/div[2]/div//div[@class='cb-col cb-col-67 cb-scrs-wrp']//h2")).getText();
		System.out.println(score);
		if (score.equalsIgnoreCase("SL 264/7 (50.0)"))
		{
			System.out.println("score matched");
		} else
		{
			System.out.println("score not matched");
		}
		driver.quit();
	}

}
