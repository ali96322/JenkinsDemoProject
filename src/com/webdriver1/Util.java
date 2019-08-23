package com.webdriver1;

public class Util 
{
	public static void sleep(long milisecond)
	{
		try 
		{
			Thread.sleep(milisecond);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
}
