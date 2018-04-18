/**
 * 
 */
package com.konnect.updateprojecttestcases;

import java.awt.AWTException;

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
public class UpdateProjectDiscussionTabTest extends TestBase {
	
	LoginPage loginPage;
    HomePage homePage;
    TestUtil testUtil;
    GroupsPage groupspage;
    ProjectPage projectpage;
    UpdateProjectPage updateprojectpage;
    
   String ProjectLinkSheet= "ProjectLinksCreation";
   String ProjectSheet="NewProject";
	
   public UpdateProjectDiscussionTabTest() {
       super();
   }

   @BeforeClass
   //@BeforeMethod
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
   @Test(priority=38)
   public void ValidateProjectSearchIconforDiscussion() {
	   testUtil.switchToFrame();
	   updateprojectpage.ClickonExistingProjectSearchIcon();
   }
	

   @DataProvider(name="ProjectsearchforDiscussion")
   public Object[][] getProjectsTestdata(){
       Object data[][] = TestUtil.getTestData(ProjectSheet);
       return data;
   }
    
   @Test(priority=39, dataProvider="ProjectsearchforDiscussion")
   public void SearchProjectnameforDiscussionUpdate(String ProjectNameSearchinputfield,String ProjectDescription,String EnterTaginSearchfield,String EnterCreatedTagName, String GroupSearchinputTextField) throws InterruptedException {
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
	  }
   
   @Test(priority=40)
   public void ValidateProjectDiscussionTab() throws InterruptedException, AWTException {
      
	    projectpage.ClickonProjectDiscussionTab();
	    System.out.println("***Navigated to Project Discussion Tab***"); 
	    Thread.sleep(2000);
	    testUtil.switchToInnerFrame();
	    projectpage.EnterDiscussionComments();
	    System.out.println("Entered Commments"); 
	    Thread.sleep(1000);
	    testUtil.switchToParentFrame();
	    //Thread.sleep(2000);
	    /*//projectpage.ClickonDiscussionAttachement();
	    // Thread.sleep(4000);
	    // projectpage.ClickonDiscussionFileBrowseButton();
	    //Thread.sleep(5000);
	   */
	    // FF JSON ERROr by Dev as syntax error is displaying 
	    projectpage.ProjectPostDiscussion();
	    System.out.println("Project Discussion Comments Posted Sucessfully "); 
   	  }
 
/*
   @Test(priority=41)
   public void LogoutfromDisscussionTab() {
	   testUtil.switchToDefaultFrame();
	   updateprojectpage.Logout();
	   System.out.println("Logout Successfull ");
   }*/
   
   @AfterClass   
   //@AfterMethod
   public void tearDown(){
   driver.quit();
   	}
 
   
   
}
