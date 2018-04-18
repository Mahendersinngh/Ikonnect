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
public class UpdateProjectFilesTabTest extends TestBase {
	
	LoginPage loginPage;
    HomePage homePage;
    TestUtil testUtil;
    GroupsPage groupspage;
    ProjectPage projectpage;
    UpdateProjectPage updateprojectpage;
    String ProjectLinkSheet= "ProjectLinksCreation";
    String ProjectSheet="NewProject";
	
   public UpdateProjectFilesTabTest() {
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
   
   @Test(priority=31)
   public void ValidateProjectSearchIconforFileUpdate() {
		   testUtil.switchToFrame();
		   updateprojectpage.ClickonExistingProjectSearchIcon();
   	 	}

   @DataProvider(name="ProjectPageProjectSearch")
   public Object[][] getProjectsTestdata(){
       Object data[][] = TestUtil.getTestData1(ProjectSheet);
       return data;
   	 }
   @DataProvider  
   @Test(priority=32, dataProvider="ProjectPageProjectSearch")
   public void SearchProjectnameforFilesUpdate(String ProjectNameSearchinputfield,String ProjectDescription,String EnterTaginSearchfield,String EnterCreatedTagName, String GroupSearchinputTextField) throws InterruptedException {
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
	
	@Test(priority=33)
	public void VerifyandvalidateUploadedfile() throws InterruptedException {
		   projectpage.ClickonFilesTab();
		   System.out.println("***Navigated to FILES Tab***");
		   Thread.sleep(3000);
		   updateprojectpage.SearchProjectTaskFileUpload();
		   //Thread.sleep(2000);
		   updateprojectpage.VerifyProjectFile();
		   System.out.println("Verified Uploaded Files");
	   }
	   
	 @Test(priority=34)
	 public void DownloadFile() throws InterruptedException {
		   projectpage.clickonSelectbutton();
		   //Thread.sleep(2000);
		   projectpage.SelectandDownloadFile();
		   System.out.println("Downloaded Files");
		   //Thread.sleep(5000);
	   	}
	 @Test(priority=35)
	 public void DeleteFile() throws InterruptedException {
		   projectpage.SelectandDeleteFile();
		   //Thread.sleep(3000);
		   projectpage.DeleteFileIcon();
		   System.out.println("Deleted Project TaskUploaded Files");
	   	}
	 @Test(priority=36)
	 public void ValidateDeletedFile() throws InterruptedException { 
		   Thread.sleep(3000);
		   	projectpage.VerifyDeletedFile();
		   	System.out.println("Verified Deleted Files");
	  	}
	 
	 @Test(priority=37)
	 public void LogoutfromFilesTab() {
		testUtil.switchToDefaultFrame();
		updateprojectpage.Logout();
		System.out.println("Logout Successfull");
	  } 
	  	 
	 @AfterClass   
	  //@AfterMethod
	 public void tearDown(){
	  driver.quit();
	 }
	 
	 
   
   
}
