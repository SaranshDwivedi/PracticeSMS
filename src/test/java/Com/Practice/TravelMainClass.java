package Com.Practice;

import org.testng.annotations.Test;

public class TravelMainClass 
{
	@Test(dataProviderClass = Practice_1.class, dataProvider = "Travel")
	public void TravelMain(String src, String dest)
	{
		System.out.println(src+"-->" +dest);
	}
}
