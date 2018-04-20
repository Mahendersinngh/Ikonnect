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
import com.konnect.pages.MyNotesPage;
import com.konnect.pages.ProjectPage;
import com.konnect.pages.UpdateMyNotesPage;
import com.konnect.pages.UpdateProjectPage;
import com.konnect.util.TestUtil;

/**
 * @author mahenderd
 *
 */
public class UpdateMyNotesPageTest extends TestBase{
	LoginPage loginPage;
    HomePage homePage;
    TestUtil testUtil;
    GroupsPage groupspage;
    ProjectPage projectpage;
    MyNotesPage mynotespage;
    UpdateMyNotesPage updatemynotespage;
    UpdateProjectPage updateprojectpage;
    String MyNotesCreation="MyNotesCreation";
    String MyNotesUpdate="MyNotesUpdate";
    //String sheetName = "ExistingProject";
   //String SheetName1= "NewProject";
   
  public UpdateMyNotesPageTest() {
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
        updatemynotespage = new UpdateMyNotesPage();
        homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        System.out.println("Login Sucessfull");
        Thread.sleep(5000);
        homePage.clickoncloudlink(); 
        System.out.println("Clicked on Cloud Link");
   }

   @Test(priority=1)
   public void ClickonMyNotes() {
	   homePage.ClickonMyNotes();
	   //mynotespage.ClickonMyNotes();
   }

   @DataProvider(name="MyNoteUpdate")
	public Object[][] getMyNotesTestData() {
		Object data[][] = TestUtil.getTestDataUpdate(MyNotesUpdate);
		return data;
	}

	@Test(priority=2,dataProvider="MyNoteUpdate",description= "***Updated MyNotes Details Successfully..!!!***")
	public void AddNewNotesTest(String Notes, String Source, String SorceNote, String UserNotes,String ExistingTag,String InputToCreateTag) throws InterruptedException {	
		testUtil.switchToFrame();
		Thread.sleep(4000);
		updatemynotespage.SearchNotes(Notes);
		Thread.sleep(2000);
		updatemynotespage.EditNotesTitle(Notes);
		Thread.sleep(4000);
		updatemynotespage.AddTagtoUpdate();
		Thread.sleep(3000);
	 }
	
	@Test(priority =3,description = "***Logged Out Successfully***")
	public void Logout() throws InterruptedException {
			testUtil.switchToDefaultFrame();
			homePage.logout();
		}
		
	@AfterClass
	// BeforeMethod
	public void teardown() {
		driver.quit();
		
	}
	
	
}
