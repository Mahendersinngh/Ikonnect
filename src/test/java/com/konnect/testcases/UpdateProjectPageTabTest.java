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
//@Test(priority=1,testName="Project Tab Update")
public class UpdateProjectPageTabTest extends TestBase  {
	 	LoginPage loginPage;
	    HomePage homePage;
	    TestUtil testUtil;
	    GroupsPage groupspage;
	    ProjectPage projectpage;
	    UpdateProjectPage updateprojectpage;
	    String ProjectSheet="NewProject";
	   public UpdateProjectPageTabTest() {
	        super();
	    }
	   
	  //@BeforeSuite
	   //@BeforeClass(alwaysRun = true)
	   //@BeforeMethod
	   @BeforeClass
	   //@BeforeTest
	  public void setup() throws InterruptedException {
	        initialization();
	        testUtil= new TestUtil();
	        /*cloudpage = new Cloudpage();*/
	        loginPage= new LoginPage();
	        homePage = new HomePage();
	        groupspage= new GroupsPage();
	        projectpage= new ProjectPage();
	        updateprojectpage= new UpdateProjectPage();
	        homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	        System.out.println("Login Sucessfull");   
	        Thread.sleep(6000);
	        homePage.clickoncloudlink();
	        System.out.println("Selected Cloud Icon");
	        Thread.sleep(3000);
	        projectpage.clickonProjects();
	        System.out.println("Selected Project");
	        Thread.sleep(2000);
	   }   
	   
	   @Test(priority=1)
	   //@Test(priority=1, testName="ValidateProjectSearchIcon")
	   public void ValidateProjectSearchIcon() throws InterruptedException {
		   testUtil.switchToFrame();
		   Thread.sleep(1000);
		   updateprojectpage.ClickonExistingProjectSearchIcon();
	   }
	   
	   @DataProvider(name="ProjectPage")
       public Object[][] getProjectsTabTestData(){
           Object data[][] = TestUtil.getTestData1(ProjectSheet);
           return data;
       }
      
       @Test(priority=2,dataProvider="ProjectPage")
       public void ValidateExistingProjectname(String ProjectNameSearchinputfield,String ProjectDescription,String EnterTaginSearchfield,String EnterCreatedTagName, String GroupSearchinputTextField) throws InterruptedException {
    	   System.out.println("Searching Existing Project......");
    	  /* testUtil.switchToFrame();
		   Thread.sleep(1000);
		   updateprojectpage.ClickonExistingProjectSearchIcon();*/
    	   //testUtil.switchToFrame();
		   //updateprojectpage.ClickonExistingProjectSearchIcon();
    	   Thread.sleep(3000);
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
       
	  @Test(priority=3) 
	  public void UpdateProjectDescription() throws InterruptedException {
		  updateprojectpage.UpdateProjectDesc();
		  System.out.println("***Updating Project Tab Details...***");
		  Thread.sleep(2000);
		  
	  	}
      
	  @Test(priority=4)
	  public void SetCalendarExpiryDate() {
		  updateprojectpage.clickonTaskCalendarEndDate();
	  }
	  
	  @Test(priority=5)
	  public void UpdateGroupMembersandManagers() throws InterruptedException {
		  updateprojectpage.ClickonAddNEWMemberstoUpdate();
		  Thread.sleep(2000);
		  updateprojectpage.ClickonAdminstoUpdate();
		  Thread.sleep(2000);
		  System.out.println("Updated Group Members and Managers");
		  
		  //String GroupSearchinputTextField
		  /*projectpage.GroupSearchText();*/
	  } 
	  
	
	  /*@DataProvider
      public Object[][] getProjectTestdata(){
          Object data[][] = TestUtil.getTestData1(SheetName1);
          return data;
      }
	  @DataProvider 
      @Test(priority=7, dataProvider="getProjectTestdata")
	  
      public void ValidateExistingGroupMemeberUpdate(String GroupSearchinputTextField) throws InterruptedException {
      //String sheetName1 = "NewProject";
      updateprojectpage.ClickonAddNEWGroups();
      Thread.sleep(3000);
      updateprojectpage.GroupSearchText(GroupSearchinputTextField);
      Thread.sleep(2000);
      updateprojectpage.SearchandUpdateGroups();
	  
	  }*/
	  
	  @Test(priority=6)
	  public void UpdatePrioritytoHigh() throws InterruptedException {
		  updateprojectpage.SelectPriority();
		  Thread.sleep(1000);
	  }
	  @Test(priority=7)
	  public void UpdateProjectTab(){
		  updateprojectpage.UpdateProjectbutton();
	  }  
	  @Test(priority=8)
	  public void ValidateUpdatedProjectToastMessage(){
		  updateprojectpage.VerifyProjectUpdated();
		  System.out.println("###Updated Project Tab Details Sucessfully###");
	  }  
	  @Test(priority=9)
	  public void LoggedoutfromProjectTab() {
		  testUtil.switchToDefaultFrame();
		  updateprojectpage.Logout();
		  System.out.println("Logout Succesfull");
	  }
	
	  
	  //@AfterSuite
	  //@AfterClass(alwaysRun = true)
	@AfterClass
	  //@AfterTest
	public void tearDown(){
	    driver.quit();
		//driver.close();
	   
	   } 
	 
	   
}
