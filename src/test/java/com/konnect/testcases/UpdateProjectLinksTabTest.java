/**
 * 
 */
package com.konnect.testcases;

import java.awt.AWTException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
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
public class UpdateProjectLinksTabTest extends TestBase {
	
	LoginPage loginPage;
    HomePage homePage;
    TestUtil testUtil;
    GroupsPage groupspage;
    ProjectPage projectpage;
    UpdateProjectPage updateprojectpage;
    
   String ProjectLinkSheet= "ProjectLinksCreation";
   String ProjectSheet="NewProject";
	
   public UpdateProjectLinksTabTest() {
       super();
   }
	
   @BeforeClass
   //@BeforeMethod
   //@BeforeSuite
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
        System.out.println("Selected Cloud Icon");
        Thread.sleep(4000);
        projectpage.clickonProjects();
        System.out.println("Selected Project");
   	}   
   @Test(priority=16)
   public void ClickonProjectSearchIcon() {
	   testUtil.switchToFrame();
	   updateprojectpage.ClickonExistingProjectSearchIcon();
	   System.out.println("Searching Existing Project......");
   	}
	

   @DataProvider(name="ProjectPageSearch")
   public Object[][] getProjectsTestdata(){
       Object data[][] = TestUtil.getTestDataUpdate(ProjectSheet);
       return data;
   	 }
   @DataProvider  
   @Test(priority=17, dataProvider="ProjectPageSearch")
   public void SearchProjectnameforLinksUpdate(String ProjectNameSearchinputfield,String ProjectDescription,String EnterTaginSearchfield,String EnterCreatedTagName, String GroupSearchinputTextField) throws InterruptedException {
	   updateprojectpage.ExistingProjectNameSearchinputfied1(ProjectNameSearchinputfield);
	   Thread.sleep(2000);
	   updateprojectpage.ClickonProjecTsearchbutton();
	   Thread.sleep(2000);
	   System.out.println("Searched Project Displayed");
	   updateprojectpage.VerifySearchedProject();
	   Thread.sleep(2000);
	   updateprojectpage.ClickonSearchedProject();
	   System.out.println("Select Searched Project To Update");
	   Thread.sleep(3000);
	   updateprojectpage.ClickonLinksTabtoUpdate();
	   System.out.println("***Clicked on Links Tab To Update Link details***");
	   Thread.sleep(5000);
   	}
	   
	// Second DataProvider for Links Creation
   //Skipping Not required
 /*  @DataProvider
   public Object[][] getProjectslinkscreateTestdata(){
       Object data[][] = TestUtil.getTestDataUpdate(sheetName);
       return data;
   }
   @DataProvider  
   @Test(priority=2, dataProvider="getProjectslinkscreateTestdata")
   public void ValidateExistingProjectnamelinks(String ProjectNameSearchinputfield) throws InterruptedException {
	   updateprojectpage.ExistingProjectNameSearchinputfied(ProjectNameSearchinputfield);
	   Thread.sleep(2000);
	   updateprojectpage.ClickonProjecTsearchbutton();
	   Thread.sleep(2000);
	   updateprojectpage.VerifySearchedProject();
	   Thread.sleep(2000);
	   updateprojectpage.ClickonSearchedProject();
	   Thread.sleep(2000);
	   updateprojectpage.ClickonLinksTabtoUpdate();
	   Thread.sleep(3000);
   }   
   */
   
	 @DataProvider(name="ProjectLinksearch")
	 public Object[][] getProjectlinkTestdata(){
	       Object data[][] = TestUtil.getTestDataUpdate(ProjectLinkSheet);
	       return data;
	   	}
	   
	 @DataProvider  
	 @Test(priority=18, dataProvider="ProjectLinksearch")
	 public void UpdateNewProjectLink(String Linksearchinputfield, String LinkDescription, String LinkText, String LinkTaginputSearchfield, String LinkTagExistingSearchfield) throws InterruptedException {
		  Thread.sleep(3000);
		  updateprojectpage.LinkSearch(Linksearchinputfield);
		  System.out.println("Searching LinkName.... ");
		  System.out.println("Found Searched LinkName ");
		  Thread.sleep(2000);
		  updateprojectpage.ClickonEditLink();
		  System.out.println("Editing Searched LinkName to update ");
		   //updateprojectpage.clickonUpdateNewLink(); 
		  Thread.sleep(3000);
		  updateprojectpage.UpdateNewProjectLinkdetails();
		  System.out.println("Link details modifying... ");
		  Thread.sleep(1000);
		  
	    }
	  
	 @Test(priority=19) 
	 public void LinkUpdateImageUpload() throws InterruptedException, AWTException {
		  updateprojectpage.Linkuploadfile(prop.getProperty("linkupdateImageIconupload"));
		  System.out.println("Link Profile Icon Uploaded ");
		  Thread.sleep(2000);
	  	}
	  
	 @Test(priority=20) 
	 public void SaveUpdatedLink() throws InterruptedException {
		   updateprojectpage.ClikconOnLinkUpdate();
		   Thread.sleep(3000);
	  	}
	 @Test(priority=21)
	 public void GetLinkUpdatedDate() throws InterruptedException {
		   updateprojectpage.VerifyLinkUpdateDate();
		   Thread.sleep(2000);
	  	}
	 
	 @Test(priority=22)
	 public void AddLinkTag() throws InterruptedException {
		   updateprojectpage.ClickonExistingLinkAddTag();
		   System.out.println("Adding Tag to Link ");
		   Thread.sleep(2000);
		   updateprojectpage.EnterExistingNotesTagName();
		   Thread.sleep(1000);	
		   updateprojectpage.SelectandaddNoteTag();
		   System.out.println("tag Added to Existing Link succcessfully ");
		   System.out.println("###Link Details Updated Successfully...## ");
	  	}  
	  
	  // Discussion Tab Project Level if required can be merged with Links
	  
	  /*@Test(priority=9)
      public void validateProjectDiscussionTab() throws InterruptedException, AWTException {
         
      projectpage.ClickonProjectDiscussionTab();
      System.out.println("***Navigated to Project Discussion Tab***"); 
      Thread.sleep(3000);
    
      testUtil.switchToInnerFrame();
      projectpage.EnterDiscussionComments();
      System.out.println("Entered Commments"); 
      Thread.sleep(5000);
      testUtil.switchToParentFrame();
      Thread.sleep(5000);
      
      
      //projectpage.ClickonDiscussionAttachement();
     // Thread.sleep(4000);
     // projectpage.ClickonDiscussionFileBrowseButton();
      Thread.sleep(5000);
      
     // FF JSON ERROr by Dev as syntax error is displaying 
      projectpage.ProjectPostDiscussion();
      System.out.println("Project Discussion Comments Posted Sucessfully "); 
      }
       */  
    
	@Test(priority=23)
	public void LogoutfromLinksTab() {
		testUtil.switchToDefaultFrame();
		updateprojectpage.Logout();
		System.out.println("Logged Out Sucessfully ");
		
	  }  
	 
	  
   @AfterClass   
   //@AfterMethod
	 //@AfterSuite
   public void tearDown(){
   driver.quit();
   }
	
}
