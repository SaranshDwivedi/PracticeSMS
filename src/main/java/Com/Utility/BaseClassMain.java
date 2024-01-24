package Com.Utility;

import org.testng.annotations.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import Com.Repository.DashBoard_Page;

public class BaseClassMain 
{
	public DataBaseUtilities dlib = new DataBaseUtilities();
	public ExcelUtilities elib = new ExcelUtilities();
	public FileUtilities flib = new FileUtilities();
	public JavaUtilities jlib = new JavaUtilities();
	public WebDriiversUtilities wlib = new WebDriiversUtilities();

	public WebDriver driver;
	public static WebDriver sdriver;
	@BeforeSuite(alwaysRun=true)//for batch r group execution
	//@BeforeSuite
	public void config_BS() throws Throwable
	{
		dlib.DataBase_Connection();

		Reporter.log("--DB connceted successfully-- ", true);
	}

	
	@BeforeClass(alwaysRun=true)//for batch r group execution
	//@BeforeClass
	public void config_BC() {
		driver= new EdgeDriver();
		
		sdriver = driver;
		
		wlib.Maximize_Browser(driver);

		Reporter.log("browser launched", true);

	}

	@BeforeMethod(alwaysRun=true) //for batch r group execution
	//@BeforeMethod
	public void config_BM() throws Throwable {
		driver.get(flib.Read_Data_from_Prop("url"));
		wlib.Implicitly_Wait(driver, 20);

		Reporter.log("application launched", true);

	}

	@AfterMethod(alwaysRun=true)//for batch r group execution
	//@AfterMethod
	public void config_AM() throws Throwable {
		DashBoard_Page db = new DashBoard_Page(driver);
		Thread.sleep(2000);
		db.LogOutApp(driver);
		Reporter.log("logged out ", true);
	}

	@AfterClass(alwaysRun=true)//for batch r group execution
	//@AfterClass
	public void config_AC() {

		driver.quit();

		Reporter.log("browser closed", true);

	}

	@AfterSuite(alwaysRun=true)//for batch r group execution
	//@AfterSuite
	public void config_AS() throws Throwable {
		dlib.Close_DataBase();
		Reporter.log("DB closed",true);
	}

}


