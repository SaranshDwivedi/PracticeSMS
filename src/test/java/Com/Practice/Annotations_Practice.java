package Com.Practice;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotations_Practice 
{
	@Test
	public void Test1()
	{
		System.out.println("-- AP Test1 --");
	}
	
	@Test
	public void Test2()
	{
		System.out.println("-- AP Test2 --");
	}
	
	@BeforeMethod
	public void BM1()
	{
		System.out.println("-- Before Method1 --");
	}
	
	@AfterSuite
	public void AS1()
	{
		System.out.println("-- After Suite1 --");
	}
	
	@AfterClass
	public void AC1()
	{
		System.out.println("-- After Class1 --");
	}
	
	@AfterMethod
	public void AM1()
	{
		System.out.println("-- After Method1 --");
	}
	
	@AfterClass
	public void AC2()
	{
		System.out.println("-- After Class2 --");
	}
	
	@BeforeSuite
	public void BS1()
	{
		System.out.println("-- Before Suite1 --");
	}
	
	@BeforeClass
	public void BC1()
	{
		System.out.println("-- Before Class --");
	}
	
	@AfterClass
	public void AC3()
	{
		System.out.println("-- After Class3 --");
	}
	
	@BeforeSuite
	public void BS2()
	{
		System.out.println("-- Before Suite2 --");
	}
	
	@BeforeMethod
	public void BM2()
	{
		System.out.println("-- Before Method2 --");
	}
}
