package Com.Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Student_Page 
{
	@FindBy(id = "index_number") private WebElement IndexOfStudentTB;
	@FindBy(id = "i_name") private WebElement InitialsOfStudentTB;
	@FindBy(id = "full_name") private WebElement FullNameOfStudentTB;
	@FindBy(id = "address") private WebElement AddressOfStudentTB;
	@FindBy(id = "email") private WebElement EmailOfStudentTB;
	@FindBy(id = "phone") private WebElement PhoneOfStudentTB;
	@FindBy(id = "b_date") private WebElement DOBOfStudentTB;
	@FindBy(id = "gender") private WebElement GenderOfStudentTB;
	@FindBy(id = "fileToUpload") private WebElement FileOfStudentTB;
	
	@FindBy(id = "g_index") private WebElement IndexOfGuradianTB;
	@FindBy(id = "g_full_name") private WebElement FullNameOfGuradianTB;
	@FindBy(id = "g_i_name") private WebElement InitialOfGuradianTB;
	@FindBy(id = "g_address") private WebElement AddressOfGuradianTB;
	@FindBy(id = "g_email") private WebElement EmailOfGuradianTB;
	@FindBy(id = "g_phone") private WebElement PhoneOfGuradianTB;
	@FindBy(id = "g_b_date") private WebElement DOBOfGuradianTB;
	@FindBy(id = "g_gender") private WebElement GenderOfGuradianTB;
	@FindBy(id = "g_fileToUpload") private WebElement FileOfGuradianTB;
	
	@FindBy(id = "btnSubmit") private WebElement StudentNextBtn;
	@FindBy(id = "grade") private WebElement GradeOfStudentTB;
	@FindBy(id = "btnSubmit1") private WebElement GradeSubmitBtn;
	

	@FindBy(id = "btnSubmit1") private WebElement Bill1StudentSubmitBtn;
//	@FindBy(id = "index_number") private WebElement IndexOfStudentTB;
	@FindBy(xpath = "//input[@id='checkbox']/ancestor::tbody//td[text()='Selenium']") private WebElement CheckBoxOfStudentTB;
	


	public Student_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCheckBoxOfStudentTB() {
		return CheckBoxOfStudentTB;
	}

	public WebElement getIndexOfStudentTB() {
		return IndexOfStudentTB;
	}

	public WebElement getInitialsOfStudentTB() {
		return InitialsOfStudentTB;
	}

	public WebElement getFullNameOfStudentTB() {
		return FullNameOfStudentTB;
	}

	public WebElement getAddressOfStudentTB() {
		return AddressOfStudentTB;
	}

	public WebElement getEmailOfStudentTB() {
		return EmailOfStudentTB;
	}

	public WebElement getPhoneOfStudentTB() {
		return PhoneOfStudentTB;
	}

	public WebElement getDOBOfStudentTB() {
		return DOBOfStudentTB;
	}

	public WebElement getGenderOfStudentTB() {
		return GenderOfStudentTB;
	}

	public WebElement getFileOfStudentTB() {
		return FileOfStudentTB;
	}

	public WebElement getIndexOfGuradianTB() {
		return IndexOfGuradianTB;
	}

	public WebElement getFullNameOfGuradianTB() {
		return FullNameOfGuradianTB;
	}

	public WebElement getInitialOfGuradianTB() {
		return InitialOfGuradianTB;
	}

	public WebElement getAddressOfGuradianTB() {
		return AddressOfGuradianTB;
	}

	public WebElement getEmailOfGuradianTB() {
		return EmailOfGuradianTB;
	}

	public WebElement getPhoneOfGuradianTB() {
		return PhoneOfGuradianTB;
	}

	public WebElement getDOBOfGuradianTB() {
		return DOBOfGuradianTB;
	}

	public WebElement getGenderOfGuradianTB() {
		return GenderOfGuradianTB;
	}

	public WebElement getFileOfGuradianTB() {
		return FileOfGuradianTB;
	}

	public WebElement getStudentNextBtn() {
		return StudentNextBtn;
	}
	
	public WebElement getGradeOfStudentTB() {
		return GradeOfStudentTB;
	}

	public WebElement getGradeSubmitBtn() {
		return GradeSubmitBtn;
	}
	
	public WebElement getBill1StudentSubmitBtn() {
		return Bill1StudentSubmitBtn;
	}

	
	public void StudentDetails(String IndexOfStudent,String InitialsOfStudent,String FullNameOfStudent,String AddressOfStudent,String EmailOfStudent,String PhoneOfStudent,String DOBOfStudent,String GenderOfStudent,String FileOfStudent)
	{
		IndexOfStudentTB.sendKeys(IndexOfStudent);
		InitialsOfStudentTB.sendKeys(InitialsOfStudent);
		FullNameOfStudentTB.sendKeys(FullNameOfStudent);
		AddressOfStudentTB.sendKeys(AddressOfStudent);
		EmailOfStudentTB.sendKeys(EmailOfStudent);
		PhoneOfStudentTB.sendKeys(PhoneOfStudent);
		DOBOfStudentTB.sendKeys(DOBOfStudent);
		GenderOfStudentTB.sendKeys(GenderOfStudent);
		FileOfStudentTB.sendKeys(FileOfStudent);
	}
	
	public void GuardianDetails(String IndexOfGuradian, String InitialOfGuradian, String FullNameOfGuradian,String AddressOfGuradian,String EmailOfGuradian,String PhoneOfGuradian,String DOBOfGuradian,String GenderOfGuradian,String FileOfGuradian )
	{
		IndexOfGuradianTB.sendKeys(IndexOfGuradian);
		InitialOfGuradianTB.sendKeys(InitialOfGuradian);
		FullNameOfGuradianTB.sendKeys(FullNameOfGuradian);
		AddressOfGuradianTB.sendKeys(AddressOfGuradian);
		EmailOfGuradianTB.sendKeys(EmailOfGuradian);
		PhoneOfGuradianTB.sendKeys(PhoneOfGuradian);
		DOBOfGuradianTB.sendKeys(DOBOfGuradian);
		GenderOfGuradianTB.sendKeys(GenderOfGuradian);
		FileOfGuradianTB.sendKeys(FileOfGuradian);
	}
	
	public void StudentNextBtn()
	{
		StudentNextBtn.click();
	}
	
	public void AddGradeToStudent()
	{
		GradeOfStudentTB.sendKeys("qsp-j2ee");
	}
	
	public void GradeSubmitBtn()
	{
		GradeSubmitBtn.click();
		Bill1StudentSubmitBtn.click();
	}
	
	public void CheckBoxOfStudentTB()
	{
		CheckBoxOfStudentTB.click();
	}
	
	public void Bill1StudentSubmitBtn()
	{
		Bill1StudentSubmitBtn.click();
	}
}