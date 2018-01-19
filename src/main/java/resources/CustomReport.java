package resources;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class CustomReport implements ISuiteListener, IInvokedMethodListener 
{
	public static ExtentReports report = null;
	public static ExtentTest test = null;

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		test = Report.createTest(testResult.getMethod().getMethodName());
		System.out.println(testResult.getMethod().getMethodName());
		System.out.println("Before Method !!");
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		Report.endTest();
		System.out.println("After Method !!");
	}

	@Override
	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub
		System.out.println("Suite Start !!");
		report = Report.createReport();		
	}

	@Override
	public void onFinish(ISuite suite) {
		// TODO Auto-generated method stub
		Report.closeReport();
		System.out.println("Suite End !!");
	}

}
