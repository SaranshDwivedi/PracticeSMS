package Com.Practice;

import org.testng.annotations.Test;

public class SampleClass2 {
	
		@Test(groups = "App")
		public void Test1()
		{
			System.out.println("-- SC2 TS1 --");
		}
		
		@Test(groups = "App")
		public void Test2()
		{
			System.out.println("-- SC2 TS2 --");
		}
	}

