/**
 * 
 */
package com.konnect.pages;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.konnect.base.TestBase;
import com.konnect.util.TestUtil;

/**
 * @author mahenderd
 *
 */
public class UpdateMyTasksPageTest extends TestBase {

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
    String MyTaskUpdate= "MyTasksUpdate";

    
    
   
   //String sheetName = "ExistingProject";
   //String SheetName1= "NewProject";
   public UpdateMyTasksPageTest() {
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
	
   @DataProvider(name="SearchingTask")
	public Object[][] getTasksNamefromExcel() {
		Object data[][] = TestUtil.getTestDataUpdate(MyTaskUpdate);
		return data;
	}

	@Test(priority = 1, dataProvider ="SearchingTask",description="***Successfully searched the created Task***")
	public void SearchExistedTaskName(String TaskName, String TaskDesc, String DueDate, String NewTag, String ExistingTags,String Notes, String Srcname, String srcnotes,
			String usrnotes,String NewTaginNotes,String ExistingTaginNotes,String Title,String LinkDesc, String Link,String NewTaginLinks,String ExistingTaginLinks)
			throws InterruptedException {
		testUtil.switchToFrame();
		mytaskpage.SearchingAlltasks(TaskName);
		mytaskpage.SelectDataAfterSearchingTasksinAll();
		System.out.println("Selected the Task");
	}
	

	// Updating the task by searching open and closed tasks	
		@DataProvider(name="UpdatingTask")
		public Object[][] getTasksNamefromExcelToSearch() {
			Object data[][] = TestUtil.getTestDataUpdate(MyTaskUpdate);
			return data;
		}
		
		@Test(priority = 2,dataProvider="UpdatingTask",description="***Searched & updated the data successfully***" )
		public void VerifyTheTask(String TaskName, String TaskDesc, String DueDate, String NewTag, String ExistingTags,String Notes, String Srcname, String srcnotes,
				String usrnotes,String NewTaginNotes,String ExistingTaginNotes,String Title,String LinkDesc, String Link,String NewTaginLinks,String ExistingTaginLinks) throws InterruptedException, AWTException {
			
		//***To select the Data in closed tasks
			/*mytaskpage.ClickonOpenTasks();
			  mytaskpage.SearchingOpentasks("MyTasks2");
			if(driver.findElement(By.xpath("//div[@class='divPrjOpenTaskViewSummary' and text()='No matches found.']")).isDisplayed()) {
				Thread.sleep(2000);
				mytaskpage.ClickonClosedTasks();
				mytaskpage.SearchingClosedTasks("MyTasks2");
		    	Thread.sleep(2000);
		    	mytaskpage.SelectDataAfterSearchingTasksinClose();
			}else {
			    mytaskpage.ClickonOpenTasks();
				mytaskpage.SearchingOpentasks("MyTasks2");
				mytaskpage.SelectDataAfterSearchingTasksinOpen();
			}*/
			
		//****To select the data in open tasks.	
			mytaskpage.ClickonOpenTasks();
			mytaskpage.SearchingOpentasks(TaskName);
			if(driver.findElement(By.xpath("//div[@class='divPrjOpenTaskViewSummary']//div[@class='box-body pl0 ptb0 pr0']//ul[@class='products-list task_left_view sortable']"))
					.isDisplayed()) 
			{
		    mytaskpage.SelectDataAfterSearchingTasksinOpen();
			}
			else {
				Thread.sleep(2000);
				mytaskpage.ClickonClosedTasks();
				mytaskpage.SearchingClosedTasks(TaskName);
		    	Thread.sleep(2000);
		    	mytaskpage.SelectDataAfterSearchingTasksinClose();
			}
		//Updating the name of the task which is Created already	
		    //mytaskpage.UpdatingExistingTaskName();
		    Thread.sleep(2000);
			mytaskpage.UpdatingTaskDetails();
			Thread.sleep(2000);
			mytaskpage.ClickonUpdateButtonofTasks();
			Thread.sleep(2000);
			System.out.println("Successfully Updated the Task");
		}
		
		//Logout
		@Test(priority = 3,description="***Logged out Successfully***")
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
