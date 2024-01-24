package Com.Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Exam_Page 
{
	@FindBy(id = "name") private WebElement ExNameTB;
	@FindBy(id = "btnSubmit") private WebElement ExSubmitBtn;
	@FindBy(xpath = "//input[@class='form-control input-sm']") private WebElement ExSearchTB;
	@FindBy(xpath = "//a[@class='btn btn-success btn-sm pull-right']") private WebElement ExAddBtn;
	@FindBy(xpath = "//td[text()='QSP-J2EE']") private WebElement actualDataText;
	@FindBy(xpath = "//a[text()='Delete']") private WebElement DeleteBtn;
	@FindBy(id = "btnYes") private WebElement YesDelBtn;
	//btnYes
	public Exam_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getExNameTB() {
		return ExNameTB;
	}

	public WebElement getExSubmitBtn() {
		return ExSubmitBtn;
	}

	public WebElement getExSearchTB() {
		return ExSearchTB;
	}
	public WebElement getActualDataText() {
		return actualDataText;
	}

	//Business Login	
	public void ExNameTB(String ExamName)
	{
		ExNameTB.sendKeys(ExamName);
	}

	public WebElement getExAddBtn() {
		return ExAddBtn;
	}

	public void ExSubmitBtn()
	{
		ExSubmitBtn.click();
	}

	public void ExSearchTB(String searchExamName)
	{
		ExSearchTB.sendKeys(searchExamName);
	}

	public void ExAddBtn()
	{
		ExAddBtn.click();
	}
	
	public String actualDataText()
	{
		String actual = actualDataText.getText();
		return actual;
	}
	
	public void DeleteBtn() throws InterruptedException
	{
		Thread.sleep(1500);
		DeleteBtn.click();
		Thread.sleep(500);
		YesDelBtn.click();
	}

	public WebElement getDeleteBtn() {
		return DeleteBtn;
	}

	public WebElement getYesDelBtn() {
		return YesDelBtn;
	}
}
