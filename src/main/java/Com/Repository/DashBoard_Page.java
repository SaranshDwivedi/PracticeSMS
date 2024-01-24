package Com.Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoard_Page 
{
	@FindBy(xpath = "//i[@class='fa fa-flag']/ancestor::a") private WebElement MyProfileTab;
	@FindBy(xpath = "//span[text()='Classroom']") private WebElement ClassRommTab;
	@FindBy(xpath = "//span[text()='Grade']") private WebElement GradeTab;
	@FindBy(xpath = "//span[text()='Subject']") private WebElement SubjectTab;
	@FindBy(xpath = "//span[text()='Teacher']") private WebElement TeacherTab;
	@FindBy(xpath = "//a[text()=' Add Teacher']") private WebElement  AddTeacher_SubTab;
	@FindBy(xpath = "//a[text()=' All Teacher']") private WebElement  AllTeacher_SubTab;
	@FindBy(xpath = "//span[text()='Subject Routing']") private WebElement SubjectRoutingTab;
	@FindBy(xpath = "//span[text()='Timetable']") private WebElement TimetableTab;
	@FindBy(xpath = "//span[text()='Student']") private WebElement StudentTab;
	@FindBy(xpath = "//a[text()=' Add Student']") private WebElement AddStudent_SubTab;
	@FindBy(xpath = "//a[text()=' All Student']") private WebElement AllStudent_SubTab;
	@FindBy(xpath = "//a[text()=' Leave Student']") private WebElement LeaveStudent_SubTab;
	@FindBy(xpath = "//span[text()='Student Payment']") private WebElement StudentPaymentTab;
	@FindBy(xpath = "//span[text()='Attendance']") private WebElement AttendanceTab;
	@FindBy(xpath = "//a[text()=' Add Attendance']") private WebElement  AddAttendance_SubTab;
	@FindBy(xpath = "//a[text()='Student Attendance History ']") private WebElement StudentAttendanceHistory_SubTab;
	@FindBy(xpath = "//a[text()=' Teacher Attendance History']") private WebElement  TeacherAttendanceHistory_SubTab;
	@FindBy(xpath = "//span[text()='Exam']") private WebElement ExamTab;
	@FindBy(xpath = "//a[text()='Create Exam']") private WebElement CreateExam_SubTab;
	@FindBy(xpath = "//a[text()=' Exam Timetable']") private WebElement  ExamTimetable_SubTab;
	@FindBy(xpath = "//a[text()='Student Exam Marks']") private WebElement StudentExamMarks_SubTab;
	@FindBy(xpath = "//a[text()='Student Exam Marks History']") private WebElement StudentExamMarksHistory_SubTab;
	@FindBy(xpath = "//span[text()='Petty Cash']") private WebElement PettyCashTab;
	@FindBy(xpath = "//span[text()='Friends']") private WebElement FriendsTab;
	@FindBy(xpath = "//a[text()=' Add Friends']") private WebElement  AddFriends_SubTab;
	@FindBy(xpath = "//a[text()=' My Friends']") private WebElement  MyFriends_SubTab;
	@FindBy(xpath = "//span[text()='Event']") private WebElement EventTab;
	@FindBy(xpath = "//a[text()=' My Events']") private WebElement  MyEvents_SubTab;
	@FindBy(xpath = "//a[text()=' All Events']") private WebElement  AllEvents_SubTab;
	@FindBy(xpath = "//a[@class=\"dropdown-toggle\"]/ancestor::ul[@class='nav navbar-nav']//span[text()='Jay G']") private WebElement LogOutTab;
	@FindBy(xpath = "//a[text()='Sign out']") private WebElement SignOutTab;

	//a[text()='Sign out']
	//Initialization
	public DashBoard_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Utilization
	public WebElement getMyProfileTab() {
		return MyProfileTab;
	}

	public WebElement getClassRommTab() {
		return ClassRommTab;
	}

	public WebElement getGradeTab() {
		return GradeTab;
	}

	public WebElement getSubjectTab() {
		return SubjectTab;
	}

	public WebElement getTeacherTab() {
		return TeacherTab;
	}

	public WebElement getAddTeacher_SubTab() {
		return AddTeacher_SubTab;
	}

	public WebElement getAllTeacher_SubTab() {
		return AllTeacher_SubTab;
	}

	public WebElement getSubjectRoutingTab() {
		return SubjectRoutingTab;
	}

	public WebElement getTimetableTab() {
		return TimetableTab;
	}

	public WebElement getStudentTab() throws Throwable {
		Thread.sleep(1000);
		return StudentTab;
	}

	public WebElement getAddStudent_SubTab() throws Throwable {
		//Thread.sleep(1000);
		return AddStudent_SubTab;
	}

	public WebElement getAllStudent_SubTab() {
		return AllStudent_SubTab;
	}

	public WebElement getLeaveStudent_SubTab() {
		return LeaveStudent_SubTab;
	}

	public WebElement getStudentPaymentTab() {
		return StudentPaymentTab;
	}

	public WebElement getAttendanceTab() {
		return AttendanceTab;
	}

	public WebElement getAddAttendance_SubTab() {
		return AddAttendance_SubTab;
	}

	public WebElement getStudentAttendanceHistory_SubTab() {
		return StudentAttendanceHistory_SubTab;
	}

	public WebElement getTeacherAttendanceHistory_SubTab() {
		return TeacherAttendanceHistory_SubTab;
	}

	public WebElement getExamTab() {
		return ExamTab;
	}

	public WebElement getCreateExam_SubTab() {
		return CreateExam_SubTab;
	}

	public WebElement getExamTimetable_SubTab() {
		return ExamTimetable_SubTab;
	}

	public WebElement getStudentExamMarks_SubTab() {
		return StudentExamMarks_SubTab;
	}

	public WebElement getStudentExamMarksHistory_SubTab() {
		return StudentExamMarksHistory_SubTab;
	}

	public WebElement getPettyCashTab() {
		return PettyCashTab;
	}

	public WebElement getFriendsTab() {
		return FriendsTab;
	}

	public WebElement getAddFriends_SubTab() {
		return AddFriends_SubTab;
	}

	public WebElement getMyFriends_SubTab() {
		return MyFriends_SubTab;
	}

	public WebElement getEventTab() {
		return EventTab;
	}

	public WebElement getMyEvents_SubTab() {
		return MyEvents_SubTab;
	}

	public WebElement getAllEvents_SubTab() {
		return AllEvents_SubTab;
	}
	
	public WebElement getLogOutTab() {
		return LogOutTab;
	}

	public WebElement getSignOutTab() {
		return SignOutTab;
	}

	//Operational
	
	public void MyProfileTab()
	{
		MyProfileTab.click();
	}
	public void classroomTab()
	{
		ClassRommTab.click();
	}
	public void GardeTab()
	{
		GradeTab.click();
	}
	public void SubjectTab()
	{
		SubjectTab.click();
	}
	public void TeacherTab()
	{
		TeacherTab.click();
	}
	public void AddTeacher_SubTab()
	{
		AddTeacher_SubTab.click();
	}
	public void AllTeacher_SubTab()
	{
		AllTeacher_SubTab.click();
	}
	public void SubjectRoutingTab()
	{
		SubjectRoutingTab.click();
	}
	public void TimetableTab()
	{
		TimetableTab.click();
	}
	public void StudentTab()
	{
		StudentTab.click();
	}
	public void AddStudent_SubTab()
	{
		AddStudent_SubTab.click();
	}
	public void AllStudent_SubTab()
	{
		AllStudent_SubTab.click();
	}
	public void LeaveStudent_SubTab()
	{
		LeaveStudent_SubTab.click();
	}
	public void StudentPaymentTab()
	{
		StudentPaymentTab.click();
	}
	public void AttendanceTab()
	{
		AttendanceTab.click();
	}
	public void AddAttendance_SubTab()
	{
		AddAttendance_SubTab.click();
	}
	public void StudentAttendanceHistory_SubTab()
	{
		StudentAttendanceHistory_SubTab.click();
	}
	public void TeacherAttendanceHistory_SubTab()
	{
		TeacherAttendanceHistory_SubTab.click();
	}
	public void ExamTab()
	{
		ExamTab.click();
	}
	public void CreateExam_SubTab()
	{
		CreateExam_SubTab.click();
	}
	public void ExamTimetable_SubTab()
	{
		ExamTimetable_SubTab.click();
	}
	public void StudentExamMarks_SubTab()
	{
		StudentExamMarks_SubTab.click();
	}
	public void PettyCashTab()
	{
		PettyCashTab.click();
	}	
	public void FriendsTab()
	{
		FriendsTab.click();
	}
	public void AddFriends_SubTab()
	{
		AddFriends_SubTab.click();
	}
	public void  MyFriends_SubTab()
	{
		 MyFriends_SubTab.click();
	}
	public void EventTab()
	{
		EventTab.click();
	}
	public void MyEvents_SubTab()
	{
		MyEvents_SubTab.click();
	}
	public void AllEvents_SubTab()
	{
		AllEvents_SubTab.click();
	}
//	public void LogOutApp(WebDriver driver) throws InterruptedException
//	{
//		WebElement JayG= driver.findElement(By.xpath("//a[@class=\"dropdown-toggle\"]/ancestor::ul[@class='nav navbar-nav']//span[text()='Jay G']"));
//		Actions act = new Actions(driver);
//		act.moveToElement(JayG).build().perform();
//		Thread.sleep(700);
//		JayG.click();
//		Thread.sleep(500);
//		
//		WebElement SignOut = driver.findElement(By.xpath("//a[text()='Sign out']"));
//		act.moveToElement(SignOut).build().perform();
//		SignOut.click();
//		
//	}
	public void LogOutApp(WebDriver driver) throws InterruptedException
	{
		Actions act = new Actions(driver);
		act.moveToElement(LogOutTab).build().perform();
		Thread.sleep(700);
		LogOutTab.click();
		Thread.sleep(500);
		
		//WebElement SignOut = driver.findElement(By.xpath("//a[text()='Sign out']"));
		act.moveToElement(SignOutTab).build().perform();
		SignOutTab.click();
		
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
//	public void ()
//	{
//		
//	}
//	
//	public void ()
//	{
//		
//	}
//	public void ()
//	{
//		
//	}public void ()
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
//	public void ()
//	{
//		
//	}
	
	
}
