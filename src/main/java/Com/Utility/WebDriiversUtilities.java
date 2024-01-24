package Com.Utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.xml.sax.Locator;

import com.google.common.io.Files;

public class WebDriiversUtilities
{
	/**
	 * Maximize the Browser
	 */
	public void Maximize_Browser(WebDriver driver)
	{
		driver.manage().window().maximize();
	}

	/**
	 * Minimize the Browser
	 */
	public void Minimize_Browser(WebDriver driver)
	{
		driver.manage().window().minimize();
	}

	/**
	 * Implicitly Wait 
	 */
	public void Implicitly_Wait(WebDriver driver, int sec)
	{
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(sec));
	}

	/**
	 * Explicitly Wait class object creation
	 * @author Saransh Dwivedi
	 * @return 
	 */
	public WebDriverWait ExplicitlyWait_Obj(WebDriver driver, int sec)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
		return wait;
	}

	/**
	 * ExplicitlyWait for particular web element
	 * @param sec
	 * @param element
	 */
	public void ExplicitlyWait_Presence_of_Element(WebDriver driver, int sec, By locator)
	{
		ExplicitlyWait_Obj(driver, sec).until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	/**
	 * ExplicitlyWait for particular web element
	 * @param sec
	 * @param element
	 */
	public void ExplicitlyWait_ELement_to_be_Clickable(WebDriver driver, int sec, WebElement element)
	{
		ExplicitlyWait_Obj(driver, sec).until(ExpectedConditions.elementToBeClickable(element));
	}

	/**
	 * ExplicitlyWait for particular visibility of web element
	 * @param sec
	 * @param element
	 */
	public void Explicitly_Visibility_of_Element(WebDriver driver, WebElement element, int sec)
	{
		ExplicitlyWait_Obj(driver, sec).until(ExpectedConditions.visibilityOf(element));
	}


	/**
	 * Select class object creation
	 */
	public Select SelectClass_Obj(WebElement element)
	{
		Select sel = new Select(element);
		return sel;
	}

	/**
	 * Select the option by Index
	 * @return 
	 */
	public void Select_by_Index(WebElement element, int index)
	{
		SelectClass_Obj(element).selectByIndex(index);
	}

	/**
	 * Select the option by Value
	 */
	public void Select_by_Value(WebElement element, String Value)
	{
		SelectClass_Obj(element).selectByValue(Value);
	}

	/**
	 * Select the option by Visible Text
	 */
	public void Select_by_Visible_Text(WebElement element, String Value)
	{
		SelectClass_Obj(element).selectByVisibleText(Value);
	}

	/**
	 * Creating Action class Object
	 * @return 
	 */
	public Actions Action_Class_Obj(WebDriver driver)
	{

		Actions act = new Actions(driver);
		return act;
	}
	/**
	 * Move the cursor over the Element
	 */
	public void Mouse_Hover(WebElement target, WebDriver driver)
	{
		Action_Class_Obj(driver).moveToElement(target).build().perform();;
	}

	/**
	 * Right click on the Element
	 */
	public void Right_Click(WebElement target)
	{
		Action_Class_Obj(null).contextClick(target).build().perform();;
	}

	/**
	 * Double click on element
	 */
	public void Double_Click(WebElement target)
	{
		Action_Class_Obj(null).doubleClick(target).build().perform();;
	}

	/**
	 * Drag the element from src to dest
	 */
	public void Drag_and_Drop(WebElement source, WebElement target)
	{
		Action_Class_Obj(null).dragAndDrop(source, target).build().perform();;
	}

	/**
	 * using Robot class to press and release the key board buttons
	 */
	public void Key_Press() throws AWTException
	{
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_ALT);
		rob.keyRelease(KeyEvent.VK_ALT);
	}


	//Alert Pop-Up
	/**
	 * to accept the Alert
	 */
	public void Alert_PopUp_Accept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}

	/**
	 * to dismiss the Alert
	 */
	public void Alert_PopUp_Dismiss(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}

	/**
	 * to send the keys 
	 */
	public void Alert_PopUp_SendKeys(String key, WebDriver driver)
	{
		driver.switchTo().alert().sendKeys(key);
	}

	/**
	 * to get the text of the Alert
	 */
	public void Alert_PopUp_GetText(WebDriver driver)
	{
		driver.switchTo().alert().getText();
	}

	//Frames
	/**
	 * to get the frame by Index
	 */
	public void Frames_Switching_by(WebDriver driver, int index)
	{
		driver.switchTo().frame(index);
	}

	/**
	 * to get the frame by Name or Id
	 */
	public void Frames_Switch_by_ID_or_Name(WebDriver driver, String NameOrID)
	{
		driver.switchTo().frame(NameOrID);
	}

	/**
	 * 
	 */
	public void Frames_Switch_by_Element(WebElement element, WebDriver driver)
	{
		driver.switchTo().frame(element);
	}
	public void Frames_Switch_to_Default_Content(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	public void Frames_Switch_to_Parent_Frame(WebDriver driver)
	{
		driver.switchTo().parentFrame();
	}

	//Switch to Window
	public void Switch_to_Window(String nameOrandle, WebDriver driver)
	{
		driver.switchTo().window(nameOrandle);
	}

	//windowHandle
	public void windowHandle(WebDriver driver)
	{
		driver.getWindowHandle();
	}
	//windowHandles
	public void windowHandles(WebDriver driver)
	{
		Set<String> allWin = driver.getWindowHandles();
		for(String wh: allWin)
		{
			driver.switchTo().window(wh);
		}
	}

	//Scroll Operation
	public void Scroll_Bar_Manual(int x, int y, WebDriver driver)
	{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy("+x+","+y+")");
	}

	/**
	 * Take Screenshot
	 * @return 
	 * @throws IOException 
	 */
	public String ScreenShots( WebDriver driver, String ScreenShotName) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		{
			JavaUtilities jlib = new JavaUtilities();
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("./ScreenShots/"+ScreenShotName+jlib.getSystemDateInFormat()+".png");
			Files.copy(src, dest);
			return dest.getAbsolutePath();
		}
	}

	//Dis-able-Notification
	public void Disable_Notification()
	{
		EdgeOptions eo = new EdgeOptions();
		eo.addArguments("--disable-notifications=*");
	}

	/**
	 * this method is used to access the application
	 * @param url
	 */
	public void Get_to_URL(String url, WebDriver driver)
	{
		driver.get(url);
	}

	//Naviagate To
	public void Navigate_to_URL(String url, WebDriver driver)
	{
		driver.navigate().to(url);
	}

	/**
	 * Random Number
	 * 
	 */
	public int RandomNumber()
	{
		Random ran = new Random();
		int value = ran.nextInt(1000);
		return value;
	}
}
