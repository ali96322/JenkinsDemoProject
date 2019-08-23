package com.webdriver6.windowHandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle1
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.popuptest.com/");
		driver.findElement(By.xpath("//a[text() ='Multi-PopUp Test #2']")).click();
		
		Thread.sleep(3000);
		
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> itr = handler.iterator();
		
		String parentWindowId = itr.next();
		System.out.println("Parent Window Id " +parentWindowId);
		
		String childWindowId = itr.next();
		System.out.println("Child Window Id " +childWindowId);
		
		driver.switchTo().window(childWindowId);
		Thread.sleep(3000);
		
		System.out.println("child window title " +driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		Thread.sleep(3000);
		
		System.out.println("parent window title " +driver.getTitle());
		
		driver.quit();
	}

}
