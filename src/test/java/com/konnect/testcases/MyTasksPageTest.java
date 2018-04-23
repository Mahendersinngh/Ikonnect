/**
 * 
 */
package com.konnect.testcases;

import org.testng.annotations.BeforeClass;

import com.konnect.base.TestBase;
import com.konnect.pages.ChatPage;
import com.konnect.pages.GroupsPage;
import com.konnect.pages.HomePage;
import com.konnect.pages.LoginPage;
import com.konnect.pages.MyFilesPage;
import com.konnect.pages.MyLinkPage;
import com.konnect.pages.MyNotesPage;
import com.konnect.pages.MyTasksPage;
import com.konnect.pages.ProjectPage;
import com.konnect.pages.UpdateProjectPage;
import com.konnect.util.TestUtil;

/**
 * @author mahenderd
 *
 */
public class MyTasksPageTest extends TestBase {

	LoginPage loginPage;
    HomePage homePage;
    TestUtil testUtil;
    GroupsPage groupspage;
    ProjectPage projectpage;
    MyNotesPage mynotespage;
    MyFilesPage myfilespage;
    ChatPage chatpage;
    MyLinkPage mylinkpage;
    MyTasksPage mytaskpage;
    UpdateProjectPage updateprojectpage;
    String MyNotesCreation="MyNotesCreation";
    String MyNotesUpdate="MyNotesUpdate";
    String ChatSheet ="Chats";
    String MylinksSheet ="MyLinksCreation";
    String MyLinksUpdate ="MyLinksUpdate";
    
    String TasksSheet = "MyTasks";
	String Notesintasks = "MyNotesinTasks";
	String Linksintasks = "MyLinksinTasks";
    
    
   
   //String sheetName = "ExistingProject";
   //String SheetName1= "NewProject";
   public MyTasksPageTest() {
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
	
	
	
	
	
	
}
