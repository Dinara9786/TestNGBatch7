package com.syntax.class02;

	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

	public class AllAnnotations {
		
		
		@BeforeSuite
		public void beforeSuite () {
			
			System.out.println("This is before method");
		}
		
		
		@Test
		public void testMethod () { // name of our test is testMethod
			
			System.out.println("This is actual test method");
		}
		
		@Test
		public void testMethod2 () {
			
			System.out.println("This is actual test method 2");
		}
		
		@Test
		public void testMethod3() {
			
			System.out.println("This is actual test meethod 3");
		}
		
		@AfterMethod
		public void afterMethod() {
			
			System.out.println("This is after method");
		}
		
		@BeforeClass
		public void beforeClass() {
			
			System.out.println("----This is before class annotation------");
		}
		@AfterClass
		public void afterClass() {
			
		System.out.println("--------This is after class annotation----------");
		}
		// only actual test PASSED
		// we run only 1 class = DifferentAnnotations
	}

	// before test and after test and beforeSuite and afterSuite will run??? 
