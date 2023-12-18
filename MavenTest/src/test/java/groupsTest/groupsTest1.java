package groupsTest;

import org.testng.annotations.Test;

public class groupsTest1 {
	@Test(groups = "sanity")
	  public void test10() {
		  System.out.println("sanity Test case"); 
		  }
	@Test(groups = "sanity")
	public void test11() {
		  System.out.println("sanity Test case"); 
		  }
	@Test(groups = "E2E")
	public void test12() {
		  System.out.println("E2E Test case"); 
		  }
	@Test(groups= "E2E")
	public void test13() {
		  System.out.println("E2E Test case"); 
		  }
	@Test(groups="sanity")
	public void test14() {
		  System.out.println("Sanity Test case"); 
		  }
}
