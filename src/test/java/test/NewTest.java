package test;

import org.testng.annotations.Test;

public class NewTest {
  @Test(dependsOnGroups={"integration"})
  public void f() 
  {
	  System.out.println("hi");
  }
}
