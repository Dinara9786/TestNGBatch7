package com.syntax.class01;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task2 {
//		Create class that will have:
//		Before and After Class annotation
//		Before and After Method annotation
//		2 methods with Test annotation

	@BeforeClass
	public void beforeClass() {
		System.out.println("=======Let us do smth before class===========");
	}	
	
	@BeforeMethod
	
	public void beforeMethod() {
		System.out.println("Before method");
	}
	
	@Test 
	
	public void testMethod01 (){
	
	System.out.println("First we shall test method 1");
	}
	
	@Test
	public void testMethod02 () {
		System.out.println("Then we shall test method 2");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	
	@AfterClass
	public void afterClass() {
		
		System.out.println("=====This is the result after class=====");
	}
	
}
