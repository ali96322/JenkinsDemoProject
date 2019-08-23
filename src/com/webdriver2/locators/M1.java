package com.webdriver2.locators;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.webdriver1.Util;

public class M1
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("G:/selenium/material/test1.html");
		Util.sleep(2000);
		System.out.println("app opened");
		WebElement element1 = driver.findElement(By.name("username"));
		element1.sendKeys("User Name");
		Util.sleep(2000);
		WebElement element2 = driver.findElement(By.cssSelector("input[type=\"password\"]"));
		element2.sendKeys("Password");
		Util.sleep(2000);
		System.out.println("password entered");
		driver.findElement(By.xpath("//input[@type='submit' and @value='login']")).click();
		Util.sleep(2000);
		System.out.println("submit button");
		driver.navigate().back();
		System.out.println("navigate back");
		driver.findElement(By.id("p")).click();
		Util.sleep(2000);
		System.out.println("login button");
		driver.findElement(By.id("report")).click();
		System.out.println("select the checkbox");
		Util.sleep(2000);
		driver.findElement(By.cssSelector("input[type=\"radio\"]")).click();
		Util.sleep(2000);
		System.out.println("select the radio button");
		driver.findElement(By.linkText("google link")).click();
		Util.sleep(2000);
		System.out.println("click on link text");
		Util.sleep(2000);
		driver.navigate().back();
		System.out.println("navigate back");
		String attr = driver.findElement(By.tagName("img")).getAttribute("src");
		System.out.println(attr);
		Util.sleep(3000);
		System.out.println("get attribute");
		driver.findElement(By.xpath("//img[@src='F:\\Images\\ANIMALS\\horsegallop.jpg']")).click();
		Util.sleep(2000);
		System.out.println("clicked on link");
		driver.navigate().refresh();
		Util.sleep(2000);
		System.out.println("refresh the page");
		driver.navigate().back();
		Util.sleep(2000);
		System.out.println("back to the previous page");
		driver.findElement(By.name("desc")).sendKeys("text area got texted");
		Util.sleep(2000);
		System.out.println("text area texted");
		driver.findElement(By.name("desc")).clear();
		Util.sleep(2000);
		System.out.println("text area clear");
		String url = driver.getCurrentUrl();
		System.out.println("url: " + url);
		Util.sleep(2000);
		String title = driver.getTitle();
		if (title.equals("body alignment"))
		{
			System.out.println("title correct");
		} else
		{
			System.out.println("incorrect title");
		}
		String text = driver.findElement(By.xpath("//h2[2]")).getText();
		System.out.println(text);
		Util.sleep(2000);
		String cssValue = driver.findElement(By.xpath("//h2[2]")).getCssValue(text);
		System.out.println(cssValue);
		Util.sleep(2000);
		System.out.println(driver.manage().window().getPosition());

		Util.sleep(2000);
		System.out.println((driver.manage().window().getSize()));
		Util.sleep(2000);
		System.out.println((driver.manage().window().getSize().getWidth()));
		Util.sleep(2000);
		System.out.println((driver.manage().window().getSize().getHeight()));
		Util.sleep(3000);
//		driver.manage().window().fullscreen();
//		System.out.println("full screen");
		driver.navigate().to("https://retail.onlinesbi.com/retail/login.htm");
		Util.sleep(2000);
		driver.navigate().forward();
		driver.navigate().back();
		Util.sleep(2000);
		System.out.println("navigate to another app");
		WebElement dropDrown = driver.findElement(By.name("breakfast"));
		Select opt = new Select(dropDrown);
		Util.sleep(3000);
		
		opt.selectByIndex(4);
		Util.sleep(2000);
		System.out.println("slect by index");
		
		opt.selectByValue("3");
		Util.sleep(2000);
		System.out.println("select by value");
		
		opt.selectByVisibleText("masala dosa");
		Util.sleep(2000);
		System.out.println("select by visble text");
		
		
		boolean b  = opt.isMultiple();
		System.out.println("isMultiple Select: "+b);
		
		List<WebElement> list = opt.getOptions();
		System.out.println(list.size());
		
		for (int i = 0; i < list.size(); i++)
		{
			String name = list.get(i).getText();
			System.out.println(name);
		}
		
		WebElement multiSelect = driver.findElement(By.name("mbreakfast"));
		Select select = new Select(multiSelect);
		Util.sleep(2000);
		
		boolean bo = select.isMultiple();
		System.out.println(bo);
		
		select.selectByIndex(2);
		Util.sleep(2000);
		System.out.println("select by index 2");
		
		select.selectByValue("1");
		Util.sleep(2000);
		System.out.println("selcect by value 1");
		
		
		select.selectByValue("4");
		Util.sleep(2000);
		System.out.println("select by value 4");
		
		select.selectByVisibleText("coffee");
		Util.sleep(2000);
		select.selectByVisibleText("masala dosa");
		Util.sleep(2000);
		
		List<WebElement> options = opt.getOptions();
		System.out.println(options.size());
		
		for (int i = 0; i < options.size(); i++)
		{
			String all = options.get(i).getText();
			System.out.print(all + ", ");
		}
		System.out.println();
		
		String first = select.getFirstSelectedOption().getText();
		System.out.println(first);
		
		List<WebElement> selectOptions = select.getAllSelectedOptions();
		for (WebElement webElement : selectOptions)
		{
			System.out.print(webElement.getText() + ", ");
		}
		System.out.println();
		
		select.deselectByIndex(3);
		Util.sleep(2000);
		System.out.println("deselct by index");
		
		select.deselectByVisibleText("coffee");
		Util.sleep(2000);
		System.out.println("deselect by value");
		
		select.deselectByValue("1");
		Util.sleep(2000);
		System.out.println("deselect by value");
		
		select.deselectAll();
		Util.sleep(2000);
		System.out.println("deselect all");

		select.deselectByVisibleText("single idly");
		Util.sleep(2000);
		System.out.println("select by text");
		driver.findElement(By.name("fb")).sendKeys("G:\\selenium\\material\\software testing.pdf");
		Util.sleep(2000);
		System.out.println("file uploaded");
		
		String heading = driver.findElement(By.xpath("//h2[text()=\"Ethical standards and patient\"]")).getText();
		System.out.println(heading);
		String actualHeading = "Ethical standards and patient";
		if (heading.equals(actualHeading))
		{
			System.out.println("pass");
		} else
		{
			System.out.println("fail");
		}
		driver.quit();
		System.out.println("closed the driver");
	}

}
