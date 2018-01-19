package resources;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Report 
{
	public static ExtentReports report = null;
	public static ExtentTest test = null;
	
	public static ExtentReports createReport()
	{
		if(report == null)
		{
			report = new ExtentReports("E:\\Avinash.html", true, DisplayOrder.OLDEST_FIRST);
			
		}
		return report;
	}
	
	public static ExtentTest createTest(String testname)
	{
		if(test == null)
		{
			//test = new ExtentTest(testname, "");
			test = report.startTest(testname);
			
		}
		return test;
	}
	
	public static void endTest()
	{
		if(test != null)
		{
			report.endTest(test);
			test = null;
		}
	}

	public static void closeReport()
	{
		if(report != null)
		{report.flush();			
			report.close();
			report = null;
			
		}
		
	}
	
	/*public static void main(String[] args){
	
	
		
			report = new ExtentReports("E:\\Avinash.html", true, DisplayOrder.OLDEST_FIRST);
			
			//test = new ExtentTest("Avinash", "");	
			test = report.startTest("abc");
		test.log(LogStatus.PASS, "click","button");
	
		if(test != null)
		{
			report.endTest(test);
			test = null;
		}
	

		if(report != null)
		{report.flush();			
			report.close();
			report = null;
			
		}
		
	}
*/}


