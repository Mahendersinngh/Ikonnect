/**
 * 
 */
package com.konnect.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.konnect.base.TestBase;
import com.konnect.pages.GroupsPage;
import com.konnect.pages.HomePage;
import com.konnect.pages.LoginPage;
import com.konnect.pages.MyNotesPage;
import com.konnect.pages.ProjectPage;
import com.konnect.pages.UpdateProjectPage;
import com.konnect.util.TestUtil;

/**
 * @author mahenderd
 *
 */
public class MyNotesPageTest extends TestBase {

	 LoginPage loginPage;
	    HomePage homePage;
	    TestUtil testUtil;
	    GroupsPage groupspage;
	    ProjectPage projectpage;
	    MyNotesPage mynotespage;
	    UpdateProjectPage updateprojectpage;
	    
	   
	   String sheetName = "ExistingProject";
	   //String SheetName1= "NewProject";
	   public MyNotesPageTest() {
	        super();
	    }
	
	   @BeforeClass
	   //@BeforeMethod
	    public void setup() {
	        initialization();
	        testUtil= new TestUtil();
	        /*cloudpage = new Cloudpage();*/
	        loginPage= new LoginPage();
	        homePage = new HomePage();
	        groupspage= new GroupsPage();
	        projectpage= new ProjectPage();
	        mynotespage = new MyNotesPage();
	        updateprojectpage= new UpdateProjectPage();
	        homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	        System.out.println("Login Sucessfull");   
	        homePage.clickoncloudlink();
	       
	        
	   }
	
	   @Test(priority=1)
	   public void ClickonMyNotes() {
		   mynotespage.ClickonMyNotes();
	   }
	
	   @Test(priority=2)
	   public void ClickonMyNotesAddbutton() {
		   testUtil.switchToFrame();
		   mynotespage.ClickonMyNotesADDbutton();
	   }
	   
	   @AfterClass   
	   //AfterMethod
	    public void tearDown(){
	    //driver.quit();
	    }  
	   
	   
}
