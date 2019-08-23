package com.webdriver5.Frame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.webdriver1.Util;

public class FrameHandling
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/iframe-practice-page/");
		List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
		System.out.println("The total number of iframes are " + iframeElements.size());
		//driver.findElement(By)
		Util.sleep(5000);
		driver.switchTo().frame("iframe1");
		Util.sleep(5000);
		driver.findElement(By.xpath("//a[@title='API Documentation in Postman']")).click();
		//driver.findElement(By.xpath("//ul[@id='menu-top']//child::a[text()='Tooltip and Double click']"));
		Util.sleep(3000);
		driver.switchTo().defaultContent();
		driver.quit();
		System.out.println("done");
	}

}

