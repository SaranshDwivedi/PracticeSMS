package Com.Practice;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

public class IRCTC_Busses {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new EdgeDriver();
		EdgeOptions eo = new EdgeOptions();
		eo.addArguments("--disabled-notifications=*");
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		
		//click on BUSSES
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=' BUSES ']")).click();
		
		String oldwin = driver.getWindowHandle();
		Set<String> allwin = driver.getWindowHandles();
		
		Iterator<String> win = allwin.iterator();
		while(win.hasNext())
		{
			String winID = win.next();
			String title = driver.switchTo().window(winID).getTitle();
			System.out.println(title);
			
			if(title.contains("IRCTC Bus - Online Bus Ticket Booking | Bus Reservation"))
			{
				break;
			}
		}
		
		//depature
		Thread.sleep(1000);
		WebElement deprtTO = driver.findElement(By.xpath("//form[@class=\"ng-untouched ng-pristine ng-valid\"]//input[@id=\"departFrom\"]"));
		deprtTO.click();
		
		Thread.sleep(1000);
		deprtTO.sendKeys("Bangalore");
		
		Thread.sleep(4000);
		deprtTO.sendKeys(Keys.ARROW_DOWN);
		deprtTO.sendKeys(Keys.ENTER);
//		WebElement departTOBanglore = driver.findElement(By.xpath("//div[@text()='Bangalore']"));
		Actions act = new Actions(driver);
//		act.contextClick(departTOBanglore).build().perform();
		
		Thread.sleep(500);
		WebElement departTo = driver.findElement(By.xpath("//input[@id=\"goingTo\"]"));
		deprtTO.click();
		Thread.sleep(500);
		
		//goa
		departTo.sendKeys("goa");
		Thread.sleep(4000);
		departTo.sendKeys(Keys.ARROW_DOWN);
		departTo.sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//div[@text()='Goa']")).click();
		//act.contextClick(departToGoa).build().perform();
		
		//date
		Thread.sleep(1000);
		WebElement departureDate = driver.findElement(By.xpath("//label[.='Departure Date']"));
		departureDate.click();
		
		//29 Jan
		Thread.sleep(4000);
		WebElement calander = driver.findElement(By.xpath("//div[@class=\"ui-datepicker-title\"]/ancestor::div[@id=\"ui-datepicker-div\"]//a[.='29']"));
		act.contextClick(calander);
		
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,-250)");
		
		//click on search button
		Thread.sleep(1000);
		WebElement searchBtn = driver.findElement(By.xpath("//button[text()='Search Bus ']"));
		act.contextClick(searchBtn);
		//details
		
	
	}
}
