/**
 * 
 */
package com.konnect.testcases;

import java.awt.AWTException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.konnect.base.TestBase;
import com.konnect.pages.GroupsPage;
import com.konnect.pages.HomePage;
import com.konnect.pages.LoginPage;
import com.konnect.pages.MyFilesPage;
import com.konnect.pages.MyNotesPage;
import com.konnect.pages.ProjectPage;
import com.konnect.pages.UpdateProjectPage;
import com.konnect.util.TestUtil;

/**
 * @author mahenderd
 *
 */
public class MyFilesPageTest extends TestBase  {

	LoginPage loginPage;
    HomePage homePage;
    TestUtil testUtil;
    GroupsPage groupspage;
    ProjectPage projectpage;
    MyNotesPage mynotespage;
    MyFilesPage myfilespage;
    UpdateProjectPage updateprojectpage;
    String MyNotesCreation="MyNotesCreation";
    String MyNotesUpdate="MyNotesUpdate";
   
   //String sheetName = "ExistingProject";
   //String SheetName1= "NewProject";
   public MyFilesPageTest () {
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
        homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        System.out.println("Login Sucessfull");
        Thread.sleep(5000);
        homePage.clickoncloudlink();         
   }
	
   @Test(priority=1, description="Clicked on MyFilesLink")
   public void ClickonMyFilesLink() throws InterruptedException {
	   Thread.sleep(2000);
	   homePage.MyFilesTab();
	   
   }
   @Test(priority=2,description="***Successfully Selected the File***")
	public void ClickonChooseFileinMyFilesToUpload() throws InterruptedException {
		testUtil.switchToFrame();
		Thread.sleep(1000);
		myfilespage.ChooseFileButton();
	}
	
	@Test(priority=3,description="***Uploaded the file Successfully***")
	public void UploadFileinMyFiles() throws AWTException, InterruptedException {
		myfilespage.UploadFileinmyFiles(prop.getProperty("UploadFileinMyFiles"));
		myfilespage.UploadButton();
		System.out.println("Excel File Uploaded Successfully in My Files.");
	}

	@Test(priority=4,description="***Searched the Uploaded file***")
	public void SearchUploadedFile() throws InterruptedException {
		myfilespage.SearchIconinMyFiles();
		Thread.sleep(2000);
	}
	
	@Test(priority=5,description="***Logged Out Successfully***")
	public void Logout() throws InterruptedException {
		testUtil.switchToDefaultFrame();
		Thread.sleep(2000);
		myfilespage.Loggedout();
		Thread.sleep(2000);
		System.out.println("Logged Out Successfully..!!!!");
	}
	
	
	@AfterClass    
	//AfterMethod  
	public void tearDown(){
	    //driver.quit();
	 }  
	
	
	
	
	
}
