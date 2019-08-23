package com.webdriver1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrlComparsion {

	public static void main(String[] args)
	{
		//automation
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");//setting the property
		WebDriver driver = new ChromeDriver();//launch the browser
		driver.manage().window().maximize();//maximize the window
		driver.get("https://www.facebook.com");//enter the url
		Util.sleep(2000);//sleeping 2 secs
		System.out.println("app opened");
		String url = driver.getCurrentUrl();//get the url
		System.out.println(url);
		
		//validation point---> actual vs expected
		if(url.equals("https://www.facebook.com/"))
		{
			System.out.println("coorect URL");
		}
		else
		{
			System.out.println("in-correct URl");
		}
		Util.sleep(2000);
		driver.quit();// closing the browser
		System.out.println("done");
	}

}
//if we include automation and validation then it is called automation testing