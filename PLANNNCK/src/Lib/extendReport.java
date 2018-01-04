package Lib;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class extendReport {
	public static ExtentReports extent;
	public static ExtentTest test;
	static 
	{
		Calendar calender=Calendar.getInstance();
		SimpleDateFormat formater=new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		extent=new ExtentReports(System.getProperty("user.dir")+ "\\Reports\\test" +formater.format(calender.getTime())+".html",false);
		
			}
	public void getResult(ITestResult result)
	{
		if(result.getStatus()== ITestResult.SUCCESS)
		{
			test.log(LogStatus.PASS, result.getName()+ "Test is Pass");
		}
		else if(result.getStatus()== ITestResult.SKIP)
		{
			test.log(LogStatus.SKIP, result.getName()+"Test is Skipped and Skip Reason:-"+result.getThrowable());
			
		}
		else if(result.getStatus()==ITestResult.FAILURE)
		{
		 test.log(LogStatus.ERROR, result.getName()+"--Test is Failed--"+result.getThrowable());	
		}
		else if(result.getStatus()==ITestResult.STARTED)
		{
		 test.log(LogStatus.INFO, result.getName()+"--Test is Started--");	
		}
	}
	@AfterMethod
	public void afterMethod(ITestResult result)
	{
		getResult(result);
	}
	@BeforeMethod
	public void beforeMethod(Method result)
	{
		test=extent.startTest(result.getName());
		test.log(LogStatus.INFO, result.getName()+"--Test Started--");
	}
	@AfterClass(alwaysRun=true)
	public void endTest()
	{
		extent.endTest(test);
		extent.flush();
	}

}
