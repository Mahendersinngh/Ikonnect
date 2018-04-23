/**
 * 
 */
package com.konnect.testcases;

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
public class UpdateMyLinksPageTest extends TestBase {

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
    String MyLinksUpdate ="MyLinksUpdate";
    
   
   //String sheetName = "ExistingProject";
   //String SheetName1= "NewProject";
   public UpdateMyLinksPageTest() {
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
	
 //Searching the Created data	
 		@DataProvider(name="MyLinkSearch")
 		public Object[][] getCreatedLinkNameData() {
 			Object data[][] = TestUtil.getTestDataUpdate(MyLinksUpdate);
 			return data;
 		}
 		
 		@Test(priority=1,dataProvider="MyLinkSearch",description="***Successfully Searched the created Link***")
 		public void SearchCreatedLink(String Title,String Desc,String link,String NewTag,String ExistingTag) throws InterruptedException {
 			testUtil.switchToFrame();
 			Thread.sleep(5000);
 			mylinkpage.SearchwithLinkName(Title);
 		}
 	
 //Updating the Data of the links
 		@DataProvider(name="MyLinkUpdate")
 		public Object[][] getDataToUpdateLink() {
 			Object data[][] = TestUtil.getTestDataUpdate(MyLinksUpdate);
 			return data;
 		}
 		
 		@Test(priority=2,dataProvider="MyLinkUpdate",description="***Editted the Data Successfully***")
 		public void UpdateDataofLinks(String Title,String Desc,String link,String NewTag,String ExistingTag) throws InterruptedException {
 			//Click on Edit Button
 			Thread.sleep(2000);
 			mylinkpage.ClickingonEditLink();
 			Thread.sleep(2000);
 		//**Updating the Link Name
 			//updatemylinkpage.UpdateTitleName(Title);
 			Thread.sleep(2000);
 			//Adding the tags.
 			mylinkpage.AddTagstoUpdate();
 			Thread.sleep(2000);
 			//Click on Update Button
 			mylinkpage.UpdateLinkDetails();		
 		}
 		
 //Searching the Data after Updating the Details	from Update Excel File
 		@DataProvider(name="MyLinkSearchAfterUpdate")
 		public Object[][] getLinkNameData() {
 			Object data[][] = TestUtil.getTestDataUpdate(MyLinksUpdate);
 			return data;
 		}
 		
 		@Test(priority=3,dataProvider="MyLinkSearchAfterUpdate",description="***Searched the Updated Link***")
 		public void SearchLinkAfterUpdating(String Title,String Desc,String link,String NewTag,String ExistingTag) throws InterruptedException {
 			Thread.sleep(4000);
 			mylinkpage.SearchwithLinkName(Title);
 			Thread.sleep(2000);
 		}	

 		//Adding the tags directly to the links
 		@Test(priority=4,description="***Added tags Successfully***")
 		public void AddtagsDirectlyAgainstLink() throws InterruptedException {
 			mylinkpage.AddTagsAgainstLink();
 			Thread.sleep(2000);
 		}
 		
 	//Deleting the Created Links
 		/*@Test(priority=5,description="***Deleted link Successfully***")
 		public void DeleteLinkTest() throws InterruptedException, AWTException {
 			updatemylinkpage.DeleteLinks();
 			Thread.sleep(2000);
 		}*/
 		
 	//Logout	
 		@Test(priority=6,description="***Logged out Successfully***")
 		public void Logout() throws InterruptedException {
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
