package com.syntax.class01;

import org.testng.annotations.Test;

public class TestNGDependencies {
	
	
	@Test
	public void login()  { 
		System.out.println("Test that logges in into the application");
	}
	
	@Test (dependsOnMethods="login") // only and only if LOGIN pass then checkReport will get executed // dependsOnMethods ="login" = dependancy
	public void checkReport() {
		System.out.println("Test that checks reports and has navigation to the report steps");
	}

}
