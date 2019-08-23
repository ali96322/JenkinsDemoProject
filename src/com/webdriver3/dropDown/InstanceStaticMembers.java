//package com.webdriver3.dropDown;
//
//public class InstanceStaticMembers
//{
//	int i= 10;
//	static int j = 20;
//	void m1()
//	{
//		int l = 30;
//		static int m = 40;//Illegal modifier for parameter o; only final is permitted
//		final double x = 26;
////		final String val = "abc";
//		System.out.println(i);
//		System.out.println(j);
//		System.out.println(l);
//		System.out.println(m);
//		System.out.println(x);
//		System.out.println(val);
//	}
//	static void m2()
//	{
//		int n = 50;
//		static int o = 60;//Illegal modifier for parameter o; only final is permitted
//		final double x = 26;
//		final String val = "abc";
//		System.out.println(i);//Cannot make a static reference to the non-static field i
//		System.out.println(j);
//		System.out.println(n);
//		System.out.println(o);
//		System.out.println(x);
//		System.out.println(val);
//	}
//	public static void main(String[] args)
//	{
//		System.out.println(i);//Cannot make a static reference to the non-static field i
//		System.out.println(obj.i);//obj cannot be resolved to a variable
//		System.out.println(j);
//		final double x = 26;
//		final String val = "abc";
//		InstanceStaticMembers obj = new InstanceStaticMembers();
//		System.out.println(i);//Cannot make a static reference to the non-static field i
//		System.out.println(obj.i);
//		System.out.println(j);
//		final double x = 26;//dublicate local variable
//		final String val = "abc";//dublicate local variable
//		
//		System.out.println(n);//n cannot be resolved to a variable
//		System.out.println(o);//o cannot be resolved to a variable
//		System.out.println(x);
//		System.out.println(val);
//	}
//
//}
