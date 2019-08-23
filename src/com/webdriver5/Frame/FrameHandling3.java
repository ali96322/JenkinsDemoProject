package com.webdriver5.Frame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.webdriver1.Util;

public class FrameHandling3
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Frames.html");
		List<WebElement> frameList = driver.findElements(By.tagName("iframe"));
		System.out.println(frameList.size());
		Util.sleep(3000);
		driver.switchTo().frame("SingleFrame");
		Util.sleep(3000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("afafafdffsf");
		driver.quit();
		System.out.println("done");

	}

}
