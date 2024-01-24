package Com.Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Grade_Page 
{
	@FindBy(id = "name") private WebElement GRNameTB;
	@FindBy(id = "admission_fee") private WebElement GRAdmisnFeeTB;
	@FindBy(id = "hall_charge") private WebElement GRHallChargeTB;
	@FindBy(id = "btnSubmit") private WebElement GRNextBtn;
	@FindBy(id = "mark_range_text_1") private WebElement GR_RG_NameTB;
	@FindBy(id = "mark_grade_text_1") private WebElement GR_RG_GradeTB;
	@FindBy(id = "mark_range_text_2") private WebElement GR_RG_Name1TB;
	@FindBy(id = "mark_grade_text_2") private WebElement GR_RG_Grade1TB;
	@FindBy(id = "mark_range_text_3") private WebElement GR_RG_Name2TB;
	@FindBy(id = "mark_grade_text_3") private WebElement GR_RG_Grade2TB;
	@FindBy(id = "mark_range_text_4") private WebElement GR_RG_Name3TB;
	@FindBy(id = "mark_grade_text_4") private WebElement GR_RG_Grade3TB;
	@FindBy(id = "btnSubmit1") private WebElement GR_RG_SubmitBtn;
	@FindBy(xpath = "//span[@class='glyphicon glyphicon-plus']") private WebElement GR_RG_AddBtn;
	@FindBy(xpath = "//label[text()='Search:']") private WebElement GD_SearchTB;
	

	public Grade_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getGRNameTB() {
		return GRNameTB;
	}

	public WebElement getGD_SearchTB() {
		return GD_SearchTB;
	}

	public WebElement getGRAdmisnFeeTB() {
		return GRAdmisnFeeTB;
	}

	public WebElement getGRHallChargeTB() {
		return GRHallChargeTB;
	}

	public WebElement getGRNextBtn() {
		return GRNextBtn;
	}

	public WebElement getGR_RG_NameTB() {
		return GR_RG_NameTB;
	}

	public WebElement getGR_RG_GradeTB() {
		return GR_RG_GradeTB;
	}

	public WebElement getGR_RG_Name1TB() {
		return GR_RG_Name1TB;
	}

	public WebElement getGR_RG_Grade1TB() {
		return GR_RG_Grade1TB;
	}

	public WebElement getGR_RG_Name2TB() {
		return GR_RG_Name2TB;
	}

	public WebElement getGR_RG_Grade2TB() {
		return GR_RG_Grade2TB;
	}

	public WebElement getGR_RG_Name3TB() {
		return GR_RG_Name3TB;
	}

	public WebElement getGR_RG_Grade3TB() {
		return GR_RG_Grade3TB;
	}

	public WebElement getGR_RG_SubmitBtn() {
		return GR_RG_SubmitBtn;
	}
	
	public WebElement getGR_RG_AddBtn() {
		return GR_RG_AddBtn;
	}
	
	//Business Operation
	public void GRNameTB(String GradeName)
	{
		GRNameTB.sendKeys(GradeName);
	}
	public void GD_SearchTB(String YourGradeName)
	{
		GD_SearchTB.sendKeys(YourGradeName);
	}
	public void GRAdmisnFeeTB(String AddFee)
	{
		GRAdmisnFeeTB.sendKeys();
	}
	public void GRHallChargeTB(String HallCharge)
	{
		GRHallChargeTB.sendKeys(HallCharge);
	}
	public void GRNextBtn()
	{
		GRNextBtn.click();
	}
	public void GR_RG_NameTB(String Range1)
	{
		GR_RG_NameTB.sendKeys(Range1);
	}
	public void GR_RG_NameTB1(String Grade1)
	{
		GR_RG_GradeTB.sendKeys(Grade1);
	}
	public void GR_RG_Name2TB(String Range2)
	{
		GR_RG_Name2TB.sendKeys(Range2);
	}
	public void GR_RG_NameTB2(String Grade2)
	{
		GR_RG_Name2TB.sendKeys(Grade2);
	}
	public void GR_RG_Name3TB(String Range3)
	{
		GR_RG_Name3TB.sendKeys(Range3);
	}
	public void GR_RG_NameTB3(String Grade3)
	{
		GR_RG_Name3TB.sendKeys(Grade3);
	}
	public void GR_RG_SubmitBtn()
	{
		GR_RG_SubmitBtn.click();
	}
	public void GR_RG_AddBtn()
	{
		GR_RG_AddBtn.click();
	}
	public void GD_SearchTB()
	{
		GD_SearchTB.click();
	}
//	public void ()
//	{
//		
//	}
//	public void ()
//	{
//		
//	}
//	public void ()
//	{
//		
//	}
//	public void ()
//	{
//		
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
