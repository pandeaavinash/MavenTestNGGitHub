package test;

import org.testng.annotations.Test;

public class MultiThreading {
  
  @Test(groups={"Integration"},priority=0)
  public void Read() 
  {
	  System.out.println("In Read method of Integration group");
  }
  
  @Test(groups={"Regression"},dependsOnGroups="Integration")
  public void write()
  {
	  System.out.println("In Write method of Regression group");
  }
}
