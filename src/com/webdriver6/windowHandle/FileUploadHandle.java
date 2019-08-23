package com.webdriver6.windowHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.webdriver1.Util;

public class FileUploadHandle
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://html.com/input-type-file/");
		
//		Alert alert = driver.switchTo().alert();
//		alert.dismiss();
		
		Util.sleep(3000);
		
		driver.findElement(By.id("fileupload")).sendKeys("C:\\Users\\Patan Musthaq\\Pictures\\Screenshots\\Screenshot (88).png");
		Util.sleep(3000);
		WebElement sumit = driver.findElement(By.xpath("//input[@type='submit' and @value='submit']"));
		sumit.submit();
		driver.quit();
		
	}

}
