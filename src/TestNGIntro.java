import org.testng.annotations.Test;

public class TestNGIntro {
	
	@Test // we use this annotation ot mark a method as a test method

	public void testOne () {
		
		System.out.println("I am test 1");
		
	}
	
	@Test
	public void testTwo() {
		
		System.out.println("I am test 2");
	}
	
	@Test
	public void testThree () {
		System.out.println("I am test 3");
		
		// all test methods will get executed in alphabetical order
	}
}
