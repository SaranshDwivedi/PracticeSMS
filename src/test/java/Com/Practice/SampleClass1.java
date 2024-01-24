package Com.Practice;

import org.testng.annotations.Test;

public class SampleClass1 
{
	@Test(priority = 2)
	public void LoginTest()
	{
		System.out.println("--login to app--");
	}
	@Test(dependsOnMethods = "LoginTest")
	public void EditTest()
	{
		System.out.println("--edit the app--");
	}
	@Test(invocationCount = 3)
	public void LogoutTest()
	{
		System.out.println("--Logout the app--");
	}
	
}
