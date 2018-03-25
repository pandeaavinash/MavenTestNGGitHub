package test;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import resources.Report;

public class ExtentReportTest 
{
	@Test
	  public void Test3() 
	  {
		System.out.println();
		  System.out.println("hi");
		  Report.test.log(LogStatus.PASS, "pass");
		  //Report.test.log(LogStatus.PASS, "avinash");
	  }
	  @Test
	  public void Test4() 
	  {
		  System.out.println("hi");
		  Report.test.log(LogStatus.PASS, "pass");
		  //Report.test.log(LogStatus.PASS, "avinash");
	  }

}
