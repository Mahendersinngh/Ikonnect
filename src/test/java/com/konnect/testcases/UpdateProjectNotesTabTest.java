/**
 * 
 */
package com.konnect.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.konnect.base.TestBase;
import com.konnect.pages.GroupsPage;
import com.konnect.pages.HomePage;
import com.konnect.pages.LoginPage;
import com.konnect.pages.ProjectPage;
import com.konnect.pages.UpdateProjectPage;
import com.konnect.util.TestUtil;

/**
 * @author mahenderd
 *
 */
//@Test(priority=11,testName="Project Note Update")	
public class UpdateProjectNotesTabTest extends TestBase {

		LoginPage loginPage;
	    HomePage homePage;
	    TestUtil testUtil;
	    GroupsPage groupspage;
	    ProjectPage projectpage;
	    UpdateProjectPage updateprojectpage;
	    String ProjectNotes ="ProjectNotesCreation";
	    String ProjectSheet="NewProject";
	    String ProjectTasksheet = "ProjectTaskCreation";
	
  public UpdateProjectNotesTabTest() {
       super();
   	}
	
  //@BeforeClass(alwaysRun = true)
   //@BeforeMethod
  //@BeforeTest
  //@BeforeSuite
  @BeforeClass
    public void setup() throws InterruptedException {
        initialization();
        testUtil= new TestUtil();
        loginPage= new LoginPage();
        homePage = new HomePage();
        groupspage= new GroupsPage();
        projectpage= new ProjectPage();
        updateprojectpage= new UpdateProjectPage();
        homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        System.out.println("Login Sucessfull");   
        Thread.sleep(8000);
        homePage.clickoncloudlink();
        Thread.sleep(4000);
        projectpage.clickonProjects();
        Thread.sleep(4000);
   	 }   
  
   @Test(priority=10, testName="ValidateProjectSearchIcon")
   public void ClickonProjectSearchIcontogetProjectname() throws InterruptedException {
	 	   testUtil.switchToFrame();
	 	   updateprojectpage.ClickonExistingProjectSearchIcon();
	 	   System.out.println("Searching Existing Project......");
	 	   Thread.sleep(5000);
   }
   
   @DataProvider(name="ProjectNote")
   public Object[][] getProjectsTestdata(){
	       Object data[][] = TestUtil.getTestData1(ProjectSheet);
	       return data;
   	 	}
 
   @Test(priority=11,dataProvider="ProjectNote")
   public void SearchProjectnameforNotesUpdate(String ProjectNameSearchinputfield,String ProjectDescription,String EnterTaginSearchfield,String EnterCreatedTagName, String GroupSearchinputTextField) throws InterruptedException {
	  	   updateprojectpage.ExistingProjectNameSearchinputfied(ProjectNameSearchinputfield);
	  	   Thread.sleep(2000);
	  	   updateprojectpage.ClickonProjecTsearchbutton();
	  	   Thread.sleep(2000);
	  	   System.out.println("Searched Project Displayed");
	  	   updateprojectpage.VerifySearchedProject();
	  	   Thread.sleep(2000);
	  	   updateprojectpage.ClickonSearchedProject();
	  	   System.out.println("Clicked on Searched Project To Update");
	  	   //Thread.sleep(3000);
	  	   //updateprojectpage.ClickonLinksTabtoUpdate();
	  	   Thread.sleep(3000);  
		}
	   
   @Test(priority=12)
   public void ValidateNotesTabNavigation() throws InterruptedException {
		   projectpage.ClickonProjectNotes();
		   System.out.println("***Clicked on Notes Tab To Update Project Level Notes details***");
		   Thread.sleep(5000);
	   }   
		
	@DataProvider(name="Note")
	public Object[][] getProjectNotesTestdata(){
		 Object data[][] = TestUtil.getTestData1(ProjectNotes);
		 return data;
	   }
	
	@Test(priority=13,dataProvider="Note")
	public void UpdateProjectNotesname(String EditandUpdateNotesName, String NotesSource,String NotesDetailSource,String NotesUserNote,String EnterNotesTaginSearchfield,String EnterCreatedNotesTagName) throws InterruptedException {
			Thread.sleep(4000);
			updateprojectpage.NotesSearchinputfield(EditandUpdateNotesName);
			Thread.sleep(3000);
			/*updateprojectpage.EditandUpdatenotesName();
			Thread.sleep(2000);*/
		}	
	
	@Test(priority=14)
	public void SelectandAddNotesTag() throws InterruptedException {
			updateprojectpage.ClickonNewNoteTagAdd();
			Thread.sleep(3000);
			updateprojectpage.EnterExistingNotesTagName();
			Thread.sleep(2000);	
			updateprojectpage.SelectandaddNoteTag();
			Thread.sleep(3000);
	   }
	//testName="VerifyAddedNotesTagToastMessage"
	@Test(priority=15)
	public void VerifyAddedNotesTagToastMessage() throws InterruptedException {
		updateprojectpage.VerifyNotesTagAdded();  
	   }	
	
	/*/// NEW NOTES CREATION need to change the sheet Skipping as not required
	@DataProvider  
	@Test(priority=3, dataProvider="getProjectNewNotesTestdata")
	public void ValidateProjectNewNotesCreation(String NotesName, String NotesSource,String NotesDetailSource,String NotesUserNote,String EnterNotesTaginSearchfield,String EnterCreatedNotesTagName) throws InterruptedException {
		
		updateprojectpage.NewNotesAddplus();
		Thread.sleep(3000);
		projectpage.createNewProjectNotes(NotesName, NotesSource, NotesDetailSource, NotesUserNote);
        System.out.println("Added Project Notes Details");
        Thread.sleep(3000);
          
        // Notes New Tag Adding -- Skipping
        //projectpage.CreateNewNoteTag(EnterNotesTaginSearchfield);
        //System.out.println("New NOTES TAG Created");
       // Thread.sleep(3000);
          
        // Existing Note Tag Adding
        projectpage.EnterExistingNotesTagName(EnterCreatedNotesTagName);
        System.out.println("Searching Existing NOTES TAG");
        projectpage.SelectandaddNoteTag();
        System.out.println("Selected Existing NOTES TAG");
        Thread.sleep(4000);
        projectpage.clickonNotesADDbutton();
        System.out.println("Created New NOTES Sucessfully");
        Thread.sleep(5000);
        projectpage.verifyAddedNotes();
        System.out.println("Verfied Created NOTES");
        Thread.sleep(4000);  
		
	}	*/
	
	
	@Test(priority=16)
	public void LogoutfromNotesScreen() {
		  testUtil.switchToDefaultFrame();
		  updateprojectpage.Logout();
	  }
	
	
	//AfterMethod
	@AfterClass 
	//@AfterTest
	//@AfterSuite
	public void tearDown(){
	  driver.quit();
	   
	   } 

	   
	   
}
