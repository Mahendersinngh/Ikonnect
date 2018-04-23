/**
 * 
 */
package com.konnect.testcases;

import java.awt.AWTException;

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
import com.konnect.pages.ProjectPage;
import com.konnect.pages.UpdateProjectPage;
import com.konnect.util.TestUtil;

/**
 * @author mahenderd
 *
 */
public class MyLinksPageTest extends TestBase {

	LoginPage loginPage;
    HomePage homePage;
    TestUtil testUtil;
    GroupsPage groupspage;
    ProjectPage projectpage;
    MyNotesPage mynotespage;
    MyFilesPage myfilespage;
    ChatPage chatpage;
    MyLinkPage mylinkpage;
    UpdateProjectPage updateprojectpage;
    String MyNotesCreation="MyNotesCreation";
    String MyNotesUpdate="MyNotesUpdate";
    String ChatSheet ="Chats";
    String MylinksSheet ="MyLinksCreation";
    
   
   //String sheetName = "ExistingProject";
   //String SheetName1= "NewProject";
   public MyLinksPageTest() {
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
        mylinkpage=homePage.MyLinkstab();
   	} 	
	
   //Switching to Frame and clicking on Add My Link Icon.
   @Test(priority=1,description="***Successfully Clicked on + My Links***")
	public void ClickonAddLinks() {
		testUtil.switchToFrame();
		mylinkpage.clickonAddMyLinks();
	}
	

// Entering the details of the links,Uploading the Image & Click on Add to save the details
	@DataProvider(name="MyLinksCreation")
	public Object[][] getLinksTestData() {
		Object data[][] = TestUtil.getTestData(MylinksSheet);
		return data;
	}
	
	@Test(priority=2,dataProvider="MyLinksCreation",description="***Successfully Updated the details of Links***")
	public void MyLinksDetails(String Title,String Desc,String link,String NewTag,String ExistingTag) throws AWTException, InterruptedException {
		mylinkpage.AddLinkDetails(Title, Desc, link);
		Thread.sleep(2000);
	//**Create New tag
		//mylinkpage.Creationoftags(NewTag);
		Thread.sleep(2000);
		//Search Existing Tag.
		mylinkpage.SearchTag(ExistingTag);
		Thread.sleep(2000);
		mylinkpage.UploadImageinlinks(prop.getProperty("UploadImageinMyLinks"));
		mylinkpage.ClickonAddButtonoflinkDetails();
		Thread.sleep(3000);
	}
	  
	//Searching the Created data	
		@DataProvider(name="MyLinkSearch")
		public Object[][] getCreatedLinkNameData() {
			Object data[][] = TestUtil.getTestData(MylinksSheet);
			return data;
		}
		
		@Test(priority=3,dataProvider="MyLinkSearch",description="***Successfully Searched the created Link***")
		public void SearchCreatedLink(String Title,String Desc,String link,String NewTag,String ExistingTag) throws InterruptedException {
			Thread.sleep(5000);
			mylinkpage.SearchwithLinkName(Title);
		}
   
		@Test(priority=4,description="***Logged out Successfully***")
		public void LogoutfromMyLinkScreen() throws InterruptedException {
			Thread.sleep(2000);
			testUtil.switchToDefaultFrame();
			Thread.sleep(1000);
			homePage.logout();
			Thread.sleep(2000);
			System.out.println("Logged out Successfully...!!!!!");
		}
		
		@AfterClass
		public void teardown() {
			driver.quit();
		} 
      
   
   
}
