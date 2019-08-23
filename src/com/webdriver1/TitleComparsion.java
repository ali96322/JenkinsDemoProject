package com.webdriver1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TitleComparsion {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();//launch browser
		driver.manage().window().maximize();
		driver.get("https://google.com");
		Util.sleep(1000);
		System.out.println("app opened");
		String title = driver.getTitle();
		System.out.println(title);
		
		//validation point
		//actual thing vs expected thing
		if (title.equals("Google")) 
		{
			System.out.println("correct title");
		}
		else 
		{
			System.out.println("incorrect title");
		}
		driver.close();
		//driver.quit();
		System.out.println("done");
		//System.out.println(driver.getPageSource());

	}

}
