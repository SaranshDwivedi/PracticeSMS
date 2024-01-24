package Com.Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Teacher_Page 
{
	@FindBy(id ="index_number" ) private WebElement IndexNoTB;
	@FindBy(id ="full_name" ) private WebElement FullNameTB;
	@FindBy(id ="i_name" ) private WebElement InitialsTB;
	@FindBy(id ="address" ) private WebElement AddressTB;
	@FindBy(id ="gender" ) private WebElement GenderTB;
	@FindBy(id ="phone" ) private WebElement PhnNumTB;
	@FindBy(id ="email" ) private WebElement EmailTB;
	@FindBy(id ="fileToUpload" ) private WebElement PicTB;
	@FindBy(id ="btnSubmit" ) private WebElement SubmitBtn;

	@FindBy(xpath ="//input[@class='form-control input-sm']" ) private WebElement searchBtn;
	@FindBy(xpath = "//td[text()='Saransh ']") private WebElement serachResultText;

	@FindBy(xpath = "//h4[text()='Saransh']") private WebElement profileText;
//	@FindBy(id ="" ) private WebElement ;


	public WebElement getProfileText() {
		return profileText;
	}

	public WebElement getSerachResultText() {
		return serachResultText;
	}

	public Teacher_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public WebElement getIndexNoTB() {
		return IndexNoTB;
	}

	public WebElement getFullNameTB() {
		return FullNameTB;
	}

	public WebElement getInitialsTB() {
		return InitialsTB;
	}

	public WebElement getAddressTB() {
		return AddressTB;
	}

	public WebElement getGenderTB() {
		return GenderTB;
	}

	public WebElement getPhnNumTB() {
		return PhnNumTB;
	}

	public WebElement getEmailTB() {
		return EmailTB;
	}

	public WebElement getPicTB() {
		return PicTB;
	}

	public WebElement getSubmitBtn() {
		return SubmitBtn;
	}
	
	//- - - - - - - - - -- - - - -  -- - -  - -
	
	public void IndexNoTB(String IndexNo)
	{
		IndexNoTB.sendKeys(IndexNo);
	}
	public void FullNameTB(String Name)
	{
		FullNameTB.sendKeys(Name);
	}
	public void InitialsTB(String Initials)
	{
		InitialsTB.sendKeys(Initials);
	}
	public void AddressTB(String Address)
	{
		AddressTB.sendKeys(Address);
	}
	public void GenderTB(String gen)
	{
		GenderTB.sendKeys(gen);
	}
	public void PhnNumTB(String Num)
	{
		PhnNumTB.sendKeys(Num);
	}
	public void EmailTB(String email)
	{
		EmailTB.sendKeys(email);
	}
	public void PicTB(String picPath)
	{
		PicTB.sendKeys(picPath);
	}
	public void SubmitBtn()
	{
		SubmitBtn.click();
	}
	public void searchBtn(String teacherName)
	{
		searchBtn.sendKeys(teacherName);
	}
	public String serachResultText()
	{
		String serachResult = serachResultText.getText();
		return serachResult;
	}
	public String profileText()
	{
		String profile = profileText.getText();
		return profile;
	}
}
