package Com.Utility;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtilities {

	public Random RandomNumber()
	{
		Random ran = new Random();
		ran.nextInt();
		return ran;
	}
	
	public String getSystemDate()
	{
		 Date dt = new Date();
		 String date = dt.toString();
		 return date;
	}
	
	public String getSystemDateInFormat()
	{
		SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		Date dt = new Date();
		String date = dt.toString();
		String SystemDateInFormat = dateformat.format(dt);
		return SystemDateInFormat;
	}
}
