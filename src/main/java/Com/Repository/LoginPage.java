package Com.Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(id = "email") private WebElement LogInTB;
	@FindBy(id = "password") private WebElement PwdTB;
	@FindBy(id = "btnSubmit") private WebElement SubmitBTN;
	
	//Initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Utilization
	public WebElement getLogInTB() {
		return LogInTB;
	}

	public WebElement getPwdTB() {
		return PwdTB;
	}

	public WebElement getSubmitBTN() {
		return SubmitBTN;
	}
	
	
	//Operational
	public void LoginTB(String Key)
	{
		LogInTB.sendKeys(Key);
	}
	public void PwdTB(String password)
	{
		PwdTB.sendKeys(password);
	}
	public void SubmitBtn()
	{
		SubmitBTN.click();
	}
	
}
