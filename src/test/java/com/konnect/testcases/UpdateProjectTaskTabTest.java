/**
 * 
 */
package com.konnect.testcases;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
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
import com.konnect.util.TetUtilExcelReader;

/**
 * @author mahenderd
 *
 */
public class UpdateProjectTaskTabTest extends TestBase {

	LoginPage loginPage;
    HomePage homePage;
    TestUtil testUtil;
    GroupsPage groupspage;
    ProjectPage projectpage;
    UpdateProjectPage updateprojectpage;
    TetUtilExcelReader testUtilexcelreader;
    String ProjectSheet="NewProject";
    String ProjectTasksheet = "ProjectTaskCreation";


  public UpdateProjectTaskTabTest() {
       super();
   }
	 
  @BeforeClass
  //@BeforeMethod
   public void setup() throws Exception {
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
       System.out.println("Selected Cloud Icon");
       Thread.sleep(4000);
       projectpage.clickonProjects();
       System.out.println("Selected Project");
  	}   
  @Test(priority=25)
  public void ValidateProjectSearchIconforTask() {
	   testUtil.switchToFrame();
	   updateprojectpage.ClickonExistingProjectSearchIcon();
  	}
	
  @DataProvider(name="ProjectPageSearchTask")
  public Object[][] getProjectsTestdata(){
      Object data[][] = TestUtil.getTestDataUpdate(ProjectSheet);
      return data;
  	}
  
  @Test(priority=26, dataProvider="ProjectPageSearchTask")
  public void SearchProjectnameforTaskUpdate(String ProjectNameSearchinputfield,String ProjectDescription,String EnterTaginSearchfield,String EnterCreatedTagName, String GroupSearchinputTextField) throws InterruptedException {
	   System.out.println("Searching Existing Project......"); 
	   updateprojectpage.ExistingProjectNameSearchinputfied(ProjectNameSearchinputfield);
	   Thread.sleep(2000);
	   updateprojectpage.ClickonProjecTsearchbutton();
	   System.out.println("Searched Project Displayed");
	   Thread.sleep(2000);
	   updateprojectpage.VerifySearchedProject();
	   Thread.sleep(2000);
	   updateprojectpage.ClickonSearchedProject();
	   System.out.println("Select Searched Project To Update");
	   Thread.sleep(3000);
	   //updateprojectpage.ClickonLinksTabtoUpdate();
	   Thread.sleep(5000);
	   projectpage.ClickonProjectTaskTab();
	   System.out.println("***Clicked on TASK Tab To Update Task details***");
	   Thread.sleep(2000);
	  /* updateprojectpage.SearchTaskName(TaskNameSearchfield);
	   updateprojectpage.ClickonTaskSearchIcon();
	   Thread.sleep(3000);*/   
	   
  }
 
  @DataProvider(name="ProjectTaskNoteLinksearch")
  public Object[][] getProjectsTaskTestdata(){
      Object data[][] = TestUtil.getTestDataUpdate(ProjectTasksheet);
      return data;
  }
    
  @Test(priority=27, dataProvider="ProjectTaskNoteLinksearch")
  public void SearchandUpdateProjectTask(String TaskNameSearchfield, String ProjTaskDesc, String TaskNewTagSearchinputfield, String TaskExistingTagSearchinputfield, String NotesSearchinputfield, String NotesSource,String NotesDetailSource,String NotesUserNote,String EnterNotesTaginSearchfield,String EnterCreatedNotesTagName,String UpdateTaskLinkSearchinputfield, String LinkDescription, String LinkText, String LinkTaginputSearchfield, String LinkTagExistingSearchfield) throws InterruptedException, AWTException {
	  	 System.out.println("Searching TASKNAME.... ");
		 updateprojectpage.SearchTaskName(TaskNameSearchfield);
  		 updateprojectpage.ClickonTaskSearchIcon();
  		 System.out.println("Found Searched TASK ");
  		 updateprojectpage.ClickonSearchedTask();
  		 System.out.println("Selected Searched TASK to update ");
  		 Thread.sleep(3000);
  		 updateprojectpage.UpdateTaskDescript();
  		 System.out.println("***..Updating ProjectTask..***");
  		 Thread.sleep(2000);
  		 updateprojectpage.UpdateTaskCalendarEndDate();
  		 updateprojectpage.SelectTaskPriority();
  		 updateprojectpage.UpdateTask();
  		 System.out.println("Task Tab Details Updated");
  		 Thread.sleep(2000);
  		 updateprojectpage.ClickonTaksNotes();
  		 System.out.println("Navigated to TaskNotes Tab and Updating Notes Details ");
  		 Thread.sleep(3000);
  		 updateprojectpage.SearchandSelectTaskNotes(NotesSearchinputfield);
  		 Thread.sleep(2000);
  		 //updateprojectpage.updateTaskNoteSearchandEdit();
  		 //updateprojectpage.EnterNewTaskNotesNameandSave();
  		 updateprojectpage.AddTaskNotesTag();
  		 updateprojectpage.EnterExistingNotesTagName();
		 Thread.sleep(2000);	
		 updateprojectpage.SelectandaddNoteTag();
		Thread.sleep(3000);
  		 System.out.println("TaskNotes details UpdatedSuccessfully...  ");
  		 Thread.sleep(3000);
  		 updateprojectpage.clickonTaskLink();
  		 System.out.println("Navigated to TaskLink Tab and Updating Link details... ");
  		 Thread.sleep(3000);
  		 updateprojectpage.EnterTaskSearchField(UpdateTaskLinkSearchinputfield);
  		 updateprojectpage.UpdateTaskLinkSearchIcon();
  		 Thread.sleep(2000);
  		 updateprojectpage.TasklinkEditbutton();
  		 Thread.sleep(3000);
  		 updateprojectpage.UpdateProjectTaskLinkdetails();
  		 Thread.sleep(2000);
  		 updateprojectpage.ClikconOnLinkUpdate();
  		 System.out.println("TaskLink details Updated Successfully...");
  		//updateprojectpage.VerifyLinkUpdateDate();	 
  	 }
 
  @Test(priority=28)
  public void ClickonTaskDiscussion() throws InterruptedException {
		  projectpage.TaskDiscussionTab();
	      System.out.println("Navigated to Task Discussion Tab");
	      Thread.sleep(3000);
	      testUtil.switchToInnerFrame();
	      Thread.sleep(3000);
	      projectpage.EnterDiscussionComments();
	      System.out.println("Added disscussion Comments");
	      Thread.sleep(5000);
	      testUtil.switchToParentFrame();
	      Thread.sleep(8000);
	      // *****Task Discussion Attachement not working
	      //projectpage.ClickonDiscussionAttachement();
	      //Thread.sleep(4000);
	      //projectpage.ClickonDiscussionFileBrowseButton();
	      //Thread.sleep(5000); 
	      projectpage.ProjectPostDiscussion();
	      System.out.println("Posted Comments in Task Disccsuion Tab");
	      Thread.sleep(1000);
	      System.out.println("###..ProjectTask Updated Successfully..###");
  }
  
  
  @Test(priority=29)
  public void LoggedOutfromTaskScreen() {
		  testUtil.switchToDefaultFrame();
		  updateprojectpage.Logout();
		  System.out.println("Logout Successfull ");
  }
 

  @AfterClass   
  //@AfterMethod
  public void tearDown(){
  driver.quit();
  }


}

