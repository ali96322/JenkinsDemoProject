package com.webdriver8.actionClass.dragAndDrop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);

		
		WebElement ele1 = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement ele2 = driver.findElement(By.id("droppable"));
				
		Actions action = new Actions(driver);
		action.clickAndHold(ele1).moveToElement(ele2).release().build().perform();
		
		driver.quit();
	}

}
