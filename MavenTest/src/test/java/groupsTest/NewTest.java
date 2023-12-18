package groupsTest;

import org.testng.annotations.Test;

public class NewTest {
  @Test(groups = "Regression")
  public void test2() {
	  System.out.println("Regression Test case"); 
	  }
  
  @Test(groups = "Regression")
  public void test3() {
	  System.out.println("Regression Test case"); 
	  }
  @Test(groups ="Regression")
  public void test4() {
	  System.out.println("Regression Test case"); 
	  }
  @Test (groups ="Regression")
  public void test5() {
	  System.out.println("Regression Test case"); 
	  }
  
  @Test(groups = " Sanity")
	public void test15() {
		  System.out.println("Sanity Test case"); 
		  }
  @Test (groups = "smoke")
  public void test6() {
	  System.out.println("smoke Test case"); 
	  }
  @Test(groups = "smoke")
  public void test7() {
	  System.out.println("smoke Test case"); 
	  }
  @Test(groups = "smoke")
  public void test8() {
	  System.out.println("smoke Test case"); 
	  }
  @Test (groups= "smoke")
  public void test9() {
	  System.out.println("smoke Test case"); 
	  }
}
