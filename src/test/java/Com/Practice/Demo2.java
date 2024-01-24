package Com.Practice;

import org.testng.annotations.Test;

public class Demo2 {
	@Test(groups = "App")
	public void CreateAcc()
	{
		System.out.println("Providng Credentials");
	}
	
	@Test(dependsOnMethods = "CreateAcc")
	public void Login()
	{
		System.out.println("Login into App");
	}
	
	@Test(groups = "App")
	public void Logout()
	{
		System.out.println("Logout from App");
	}
}
