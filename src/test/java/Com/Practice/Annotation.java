package Com.Practice;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotation 
{
	@BeforeSuite
	public void BS()
	{
		System.out.println("before Suite");
	}
	
	@BeforeClass
	public void BC()
	{
		System.out.println("before class");
	}
	@BeforeMethod
	public void BM()
	{
		System.out.println("before Method");
	}
	@Test
	public void r()
	{
		System.out.println("Test1");
	}
	@Test
	public void a()
	{
		System.out.println("Test2");
	}
	@Test
	public void s()
	{
		System.out.println("Test3");
	}
	@AfterMethod
	public void AM()
	{
		System.out.println("AfterMethod");
	}
	@AfterClass
	public void AC()
	{
		System.out.println("AfterCkass");
	}
	@AfterSuite
	public void AS()
	{
		System.out.println("AfterSuite");
	}
	@Test
	public void n()
	{
		System.out.println("Test4");
	}
	
	@BeforeSuite
	public void BS1()
	{
		System.out.println("before Suite 2");
	}
	
	@AfterSuite
	public void AS1()
	{
		System.out.println("AfterSuite 2");
	}
	@AfterClass
	public void AC1()
	{
		System.out.println("AfterCkass2");
	}
}
