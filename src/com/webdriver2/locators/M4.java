package com.webdriver2.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.webdriver1.Util;
//x-path using different ways
public class M4
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?ie=UTF8&tag=googinabkvernac-21&ascsubtag=_k_CjwKCAjwsIbpBRBNEiwAZF8-z9ck76RkGiDt7RgVJnDo5ZufE2KwV7wbiILemS6HLz3Esnth9RTX6RoCbrkQAvD_BwE_k_&ext_vrnc=hi&gclid=CjwKCAjwsIbpBRBNEiwAZF8-z9ck76RkGiDt7RgVJnDo5ZufE2KwV7wbiILemS6HLz3Esnth9RTX6RoCbrkQAvD_BwE");
		driver.findElement(By.xpath("//a[contains(id,nav-your-amazon) and text()=\"Your Amazon.in\"]")).click();
		//a[contains(.,nav-your-amazon) and text()="Your Amazon.in"]//using dot
		//*[contains(.,nav-your-amazon) and text()="Your Amazon.in"]//using star
		////*[contains(.,nav-your-a) and text()="Your Amazon.in"]//not complete text in contains function
		//driver.findElement(By.cssSelector("#nav-your-amazon")).click();//using # css selector
		////span[starts-with(text(),'Live') and @ class='titreck' and @data-hover='Live Projects']
		Util.sleep(2000);
		driver.quit();
	}

}
