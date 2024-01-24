package Com.Practice;

import org.testng.annotations.Test;

public class Priority 
{
	@Test(enabled = true)
	public void CreateAcc()
	{
		System.out.println("Providng Credentials");
	}
	
	@Test(dependsOnMethods = "CreateAcc")
	public void Login()
	{
		System.out.println("Login into App");
	}
	
	@Test
	public void Logout()
	{
		System.out.println("Logout from App");
	}
}
