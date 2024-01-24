package Com.Practice;

import org.testng.annotations.Test;

public class DemoTest 
{
	@Test(groups = "Mob")
	public void Test1()
	{
		System.out.println("-- Demo TS1 --");
	}
	
	@Test(groups = "App")
	public void Test2()
	{
		System.out.println("-- Demo TS2 --");
	}
	
	@Test(groups = {"App" , "Mob"})
	public void Test3()
	{
		System.out.println("-- Demo TS3 --");
	}
	
}

