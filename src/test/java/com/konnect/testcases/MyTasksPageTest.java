/**
 * 
 */
package com.konnect.testcases;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.konnect.base.TestBase;
import com.konnect.pages.ChatPage;
import com.konnect.pages.GroupsPage;
import com.konnect.pages.HomePage;
import com.konnect.pages.LoginPage;
import com.konnect.pages.MyFilesPage;
import com.konnect.pages.MyLinkPage;
import com.konnect.pages.MyNotesPage;
import com.konnect.pages.MyTasksPage;
import com.konnect.pages.ProjectPage;
import com.konnect.pages.UpdateProjectPage;
import com.konnect.util.TestUtil;

/**
 * @author mahenderd
 *
 */
public class MyTasksPageTest extends TestBase {

	LoginPage loginPage;
    HomePage homePage;
    TestUtil testUtil;
    GroupsPage groupspage;
    ProjectPage projectpage;
    MyNotesPage mynotespage;
    MyFilesPage myfilespage;
    ChatPage chatpage;
    MyLinkPage mylinkpage;
    MyTasksPage mytaskpage;
    UpdateProjectPage updateprojectpage;
    String MyNotesCreation="MyNotesCreation";
    String MyNotesUpdate="MyNotesUpdate";
    String ChatSheet ="Chats";
    String MylinksSheet ="MyLinksCreation";
    String MyLinksUpdate ="MyLinksUpdate";
    String MyTasksSheet = "MyTasksCreation";
   //String sheetName = "ExistingProject";
   //String SheetName1= "NewProject";
   public MyTasksPageTest() {
        super();
    }

   @BeforeClass
   //@BeforeMethod
    public void setup() throws InterruptedException {
        initialization();
        testUtil= new TestUtil();
        /*cloudpage = new Cloudpage();*/
        loginPage= new LoginPage();
        homePage = new HomePage();
        groupspage= new GroupsPage();
        projectpage= new ProjectPage();
        mynotespage = new MyNotesPage();
        updateprojectpage= new UpdateProjectPage();
        myfilespage= new MyFilesPage();
        chatpage = new ChatPage();
        mylinkpage= new  MyLinkPage();
        homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        System.out.println("Login Sucessfull");
        Thread.sleep(8000);
        homePage.clickoncloudlink();
        Thread.sleep(4000);
        mytaskpage = homePage.MyTaskstab();
   	} 			
	
// Switching to Frame and clicking on Add button
	@Test(priority = 1, description = "***Clicked on Add (+) My Tasks***")
	public void MyTasksTabTest() {
		testUtil.switchToFrame();
		mytaskpage.AddMyTaskLinkTest();
	}
	
	
	// Getting Data from Excel of Overview Details and selecting tags.
	@DataProvider(name ="CreatingTasks")
	public Object[][] getTasksTestData() {
		Object data[][] = TestUtil.getTestData(MyTasksSheet);
		return data;
	}

	@Test(priority = 2, dataProvider ="CreatingTasks", description = "***Successfully added the Overview Details***")
	public void MyOverviewDetailsTest(String TaskName, String TaskDesc, String DueDate, String NewTag, String ExistingTags,String Notes, String Srcname, String srcnotes,
			String usrnotes,String NewTaginNotes,String ExistingTaginNotes,String Title,String LinkDesc, String Link,String NewTaginLinks,String ExistingTaginLinks) throws InterruptedException, AWTException {
		mytaskpage.AddTaskDetails(TaskName, TaskDesc, DueDate);
		Thread.sleep(2000);
		// **Create New tag
		// mytaskpage.CreateNewTag(NewTag);
		Thread.sleep(3000);
		mytaskpage.SelectExistingTags(ExistingTags);
		
		// uploading Doc file in Overview
		Thread.sleep(3000);
        mytaskpage.Uploadfile(prop.getProperty("UploadFileinOverviewofTasks"));
		System.out.println("File uploaded successfully");
		
		// Click on Save
		Thread.sleep(2000);
		mytaskpage.SaveDetailsofOverviewTasks();
		Thread.sleep(6000);
		
	//**********************Notes in MyTasks****************************
		
		//Moving to Notes and Creating New notes
		mytaskpage.MoveToNotesinMyTask();
		Thread.sleep(3000);
		mytaskpage.ClickonNoteslink();
		Thread.sleep(3000);
		mytaskpage.CreateNewNotes();
		mytaskpage.createDetailsofNotes(Notes, Srcname, srcnotes, usrnotes);
		Thread.sleep(2000);
		
		// Create New Tag in Notes
		mytaskpage.CreateNewTaginNotes(NewTaginNotes);
		Thread.sleep(3000);

		// Search Existing Tag in Notes
		mytaskpage.SearchExistingTaginNotes(ExistingTaginNotes);
		Thread.sleep(2000);

		// Click on Add Button of Notes
		mytaskpage.ClickonAddButtonofNotes();

		if (driver.findElement(By.xpath("//div[text()='Please enter Notes']")).isDisplayed()) {
			Thread.sleep(2000);
			mytaskpage.ClickonCancelButtonofNotes();
		} else {
			System.out.println("Notes created successfully");
		}
		
	//****************Links In Tasks********************************	

		// Moving to links and clicking on links
		mytaskpage.MoveToLinksinMyTasks();
		Thread.sleep(2000);
		mytaskpage.ClickonLinksinMyTasks();
		Thread.sleep(2000);
		
		// Creating new links or Add Links if the links are already created
		if (driver.findElement(By.xpath("//div[@class='add_link btnOpenPopup btn btn-primary btnCss  ml20']"))
				.isDisplayed()) {
			mytaskpage.CreateLink();
		} else {
			mytaskpage.AddlinkAgainstTasks();
		}
		
		//Add Link Details
		mytaskpage.AddlinkinMytasks(Title, LinkDesc, Link);
		Thread.sleep(2000);
		
		// Creating New tags in Links
		mytaskpage.CreateNewTaginLinks(NewTaginLinks);
		Thread.sleep(2000);

		// Searching the Existing Tags
		mytaskpage.SearchExistingTaginLinks(ExistingTaginLinks);

		// Uploading the Image
		mytaskpage.UploadImage(prop.getProperty("UploadImageinLinkofTasks"));
		System.out.println("Image Uploaded successfully");
		Thread.sleep(2000);

		mytaskpage.ClickonAddButtonofLink();
		System.out.println("Link details added Successfully..!!");
		
	}
	
	// Getting data to Search the Task Name.
	@DataProvider(name ="SearchingTask")
	public Object[][] getTasksNamefromExcel() {
		Object data[][] = TestUtil.getTestData(MyTasksSheet);
		return data;
	}

	@Test(priority = 3, dataProvider ="SearchingTask", description = "***searched the created Task***")
	public void SearchExistedTaskName(String TaskName, String Desc, String DueDate, String NewTag, String ExistingTag)
			throws InterruptedException {
		mytaskpage.ClickonAllTasks();
		mytaskpage.SearchingAlltasks(TaskName);
		// mytaskpage.SelectDataAfterSearchingTasksinAll();
		System.out.println("Selected the Task");
	}
	
	// selecting the Calendar which is in All

	@Test(priority = 4, description = "***Successfully Selected Calendar***")
	public void SelectCalenderinAllTAsks() throws InterruptedException, AWTException {
		mytaskpage.ClickonAllTasks();
		Thread.sleep(1000);
		mytaskpage.SelectCalendar();
		Thread.sleep(2000);
	}

	// Sorting the Data of the tasks by Status in All
	@Test(priority = 5, description = "*** Data Sorted Successfully ***")
	public void SortingTasksDatabyStatus() throws InterruptedException {
		// Click on All link
		mytaskpage.ClickonAllTasks();
		// Select the Sort option
		mytaskpage.DataSortofTasksbyStatus();
		Thread.sleep(3000);
		// Click on Open link
		mytaskpage.ClickonOpenTasks();
		// Select the Sort option
		mytaskpage.DataSortofTasksbyStatus();
		Thread.sleep(3000);
		// Click on Closed link
		mytaskpage.ClickonClosedTasks();
		// Select the Sort option
		mytaskpage.DataSortofTasksbyStatus();
		Thread.sleep(3000);
	}

	// Logout
	@Test(priority = 6, description = "***Logged out Successfully***")
	public void Logout() throws InterruptedException {
		testUtil.switchToDefaultFrame();
		homePage.logout();
		}

	@AfterClass
	public void teardown() throws InterruptedException {
		driver.quit();
		Thread.sleep(5000);
	}
	

}
