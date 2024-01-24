package Com.Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClassRoom_Page 
{
	@FindBy(id = "name") private WebElement CRNameTB;
	@FindBy(id = "student_count") private WebElement CRstudentCountTB;
	@FindBy(id = "btnSubmit") private WebElement CRSubmitBtn;
	@FindBy(xpath = "//label[text()='Search:']") private WebElement CRSearchTB;
	@FindBy(xpath = "//a[text()='Edit']") private WebElement CREditBtn;
	@FindBy(id = "name1") private WebElement CRUDNameTB;
	@FindBy(id = "student_count1") private WebElement CRUDstudentCountTB;
	@FindBy(id = "btnSubmit1") private WebElement CRUDSubmitBtn;
	@FindBy(xpath = "//a[text()='Next']") private WebElement CRNextBtn;
	@FindBy(xpath = "//a[text()='Previous']") private WebElement CRPrevioushBtn;
	@FindBy(xpath ="//td[text()='QSP-J2EE']" ) private WebElement ActualDataText;

	public ClassRoom_Page (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	public WebElement getCRNameTB() {
		return CRNameTB;
	}


	public WebElement getCRstudentCountTB() {
		return CRstudentCountTB;
	}


	public WebElement getCRSubmitBtn() {
		return CRSubmitBtn;
	}


	public WebElement getCRSearchTB() {
		return CRSearchTB;
	}


	public WebElement getCREditBtn() {
		return CREditBtn;
	}


	public WebElement getCRUDNameTB() {
		return CRUDNameTB;
	}


	public WebElement getCRUDstudentCountTB() {
		return CRUDstudentCountTB;
	}


	public WebElement getCRUDSubmitBtn() {
		return CRUDSubmitBtn;
	}


	public WebElement getCRNextBtn() {
		return CRNextBtn;
	}


	public WebElement getCRPrevioushBtn() {
		return CRPrevioushBtn;
	}
	
	public WebElement getActualDataText() {
		return ActualDataText;
	}

	// - - - - - - - - - - - - - - - - - - - - - - -
	
	public void CRNameTB(String NameOfClassroom)
	{
		CRNameTB.sendKeys(NameOfClassroom);
	}
	public void CRstudentCountTB(String StudentCount)
	{
		CRstudentCountTB.sendKeys(StudentCount);
	}
	public void CRSubmitBtn()
	{
		CRSubmitBtn.click();
	}
	public void CRSearchTB(String YourClassroomName)
	{
		CRSearchTB.sendKeys(YourClassroomName);
	}
	public String ActualDataText()
	{
		String text = ActualDataText.getText();
		return text;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
