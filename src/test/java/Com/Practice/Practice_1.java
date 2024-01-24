package Com.Practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Practice_1 
{
	@DataProvider
	public Object Travel()
	{
		Object[][] obj = new Object[3][2];
		
		obj[0][0] = "Honshu";
		obj[0][1] = "Hokaido";
		obj[1][0] = "Canabarra";
		obj[1][1] = "Sydney";
		obj[2][0] = "Switzerland";
		obj[2][1] = "Finnland";
		
		return obj;
	}
	@DataProvider(name = "saransh")
	public Object DreamTravel()
	{
		Object[][] obj = new Object[3][2];
		
		obj[0][0] = "Honshu";
		obj[0][1] = "Hokaido";
		obj[1][0] = "Canabarra";
		obj[1][1] = "Sydney";
		obj[2][0] = "Switzerland";
		obj[2][1] = "Finnland";
		
		return obj;
	}
	
	@Test(dataProvider = "saransh")
	public void Credentials(String src, String Dest)
	{
		System.out.println(src+"--->" +Dest);
	}
}
