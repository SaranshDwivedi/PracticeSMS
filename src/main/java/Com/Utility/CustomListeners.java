package Com.Utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class CustomListeners implements ITestListener
{
	ExtentReports report;
	ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) 
	{
		//Test Execution Start from here
		String MethodName = result.getMethod().getMethodName();
		test = report.createTest(MethodName);
		Reporter.log(MethodName+" Execution Started", true);
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		 String MethodName = result.getMethod().getMethodName();
		 test.log(Status.PASS, MethodName+" Passed ");
		 Reporter.log(MethodName+" Executed Successfully");
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		String methodName = result.getMethod().getMethodName();
		try 
		{
			WebDriiversUtilities wlib = new WebDriiversUtilities();
			String path = wlib.ScreenShots(BaseClassMain.sdriver , methodName);
			test.addScreenCaptureFromPath(path);
			test.log(Status.FAIL, methodName+" Failed ");
			test.log(Status.FAIL, result.getThrowable());
			Reporter.log(methodName+ " --> Failed");
		
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result)
	{
		String methodName = result.getMethod().getMethodName();
		test.log(Status.SKIP, methodName+" Skipped ");
		test.log(Status.SKIP, result.getThrowable());
		Reporter.log(methodName+" --> Skipped");
	}

	@Override
	public void onStart(ITestContext context)
	{
		//Configure Report 
		ExtentSparkReporter htmlreports = new ExtentSparkReporter("./ExtentsReports");
		htmlreports.config().setDocumentTitle("SMS Project");
		htmlreports.config().setTheme(Theme.STANDARD);
		htmlreports.config().setReportName("Student Management System");
		
		report = new ExtentReports();
		report.attachReporter(htmlreports);
		report.setSystemInfo("Base Plateform", "OS");
		report.setSystemInfo("Base Browser", "Edge");
		report.setSystemInfo("Base URL", "http://rmgtestingserver/domain/Student_Management_System/view/login.php");
		report.setSystemInfo("Reporter Name", "Saransh Dwivedi");
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		report.flush();
	}

}
