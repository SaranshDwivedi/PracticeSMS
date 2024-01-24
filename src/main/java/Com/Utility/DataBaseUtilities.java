package Com.Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class DataBaseUtilities
{
	Connection conn = null;
	public void DataBase_Connection() throws Throwable 
	{
		//Register to driver
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);

		//Connect to DB
		conn = DriverManager.getConnection(IPathConstant.DB_URL, IPathConstant.DB_UserName, IPathConstant.DB_Password);
	}

	public void Resgister_to_DataBase() throws Throwable
	{
		//update query
		Statement state = conn.createStatement();
		String query = "select * from rmg;" ;

		//execute the query
		int result = state.executeUpdate(query);
		if(result > 1)
		{
			System.out.println("Data Created successfully");
		}
		else
		{
			System.out.println("Data is not Created");
		}
	}

	public void Close_DataBase() throws Throwable
	{
		//Disconnect the DataBase
		conn.close();
	}
}
