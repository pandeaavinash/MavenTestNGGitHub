package test;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import resources.CustomReport;
import resources.Report;

public class NewTest 
{
  @Test
  public void Test1() 
  {
	  System.out.println("hi");
	  Report.test.log(LogStatus.PASS, "pass");
	  //Report.test.log(LogStatus.PASS, "avinash");
  }
  @Test
  public void Test2() 
  {
	  System.out.println("hi");
	  Report.test.log(LogStatus.PASS, "pass");
	  //Report.test.log(LogStatus.PASS, "avinash");
  }
}
