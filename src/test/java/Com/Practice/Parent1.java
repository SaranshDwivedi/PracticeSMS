package Com.Practice;

import org.testng.annotations.Test;

public class Parent1 {
	@Test(dependsOnMethods = "CreateAcc")
	public void Login()
	{
		System.out.println("Login into App");
	}
	

}
