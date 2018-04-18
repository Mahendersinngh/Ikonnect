/**
 * 
 */
package com.konnect.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.konnect.base.TestBase;
import com.konnect.base.TestBase2;
import com.konnect.loginpages.HomePage1;
import com.konnect.loginpages.LoginPage1;
import com.konnect.pages.GroupsPage;
import com.konnect.pages.HomePage;
import com.konnect.pages.KonnectionsPage;
import com.konnect.pages.LoginPage;
import com.konnect.pages.ProjectPage;
import com.konnect.util.TestUtil;
import com.konnect.util.TestUtil2;
import com.konnect.util.WebEventListener;

/**
 * @author mahenderd
 *
 */
public class KonnectionsPageTest extends TestBase {
	LoginPage loginPage;
    HomePage homePage;
    TestUtil testUtil;
    TestUtil2 testUtil2;
    LoginPage1 loginPage1;
    HomePage1 homePage1;
    GroupsPage groupspage;
    ProjectPage projectpage;
    KonnectionsPage konnectionpage;
    String Konnections = "KonnectionsUsers";
    String ProjectNotes ="ProjectNotesCreation";
    String ProjectLink = "ProjectLinksCreation";
    String ProjectTask = "ProjectTaskCreation";
    String Konnectionlogin = "Logins";

	 public KonnectionsPageTest() {
	        super();
	       }
	   
@BeforeClass
public void setup() throws InterruptedException {
		  initialization();
		  testUtil= new TestUtil();
		  testUtil2= new TestUtil2();
		  /*cloudpage = new Cloudpage();*/
		  loginPage= new LoginPage();
		  homePage = new HomePage();
		  loginPage1= new LoginPage1();
		  homePage1 = new HomePage1();
		  groupspage= new GroupsPage();
		  projectpage= new ProjectPage();
		  konnectionpage = new KonnectionsPage();
		  homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		  System.out.println("Login Sucessfull");   
		  Thread.sleep(8000);
		  homePage.clickoncloudlink();
		  System.out.println("Selected Cloud Icon");
		  Thread.sleep(3000);
		  homePage.clickonKonnections();
		  //Thread.sleep(6000);       
		}
	 
	@Test(priority=1)
	public void ClickonAddNewKonnections() throws InterruptedException {
		testUtil.switchToFrame();
		Thread.sleep(1000);
		konnectionpage.ClickonAddNewKonnection();
		Thread.sleep(2000);
		//konnectionpage.ClickonAllKonnections();
	  }	
	
	
	@Test(priority=2)
	public void ClickonAllKonnectionsTab() {
		konnectionpage.ClickonAllKonnections();
	
	  }	
	
	@DataProvider(name="KonnectionPage")
	public Object[][] getKonnectionTestdata(){
		       Object data[][] = TestUtil.getTestData(Konnections);
		       return data;
	   	 	}
	 
	@Test(priority=2,dataProvider="KonnectionPage")
	public void SearchUserToSelect(String SearchUsers1,String SearchUsers2,String MyKonnectedRequestSentUser1,String MyKonnectedRequestSentUser2) throws InterruptedException{ 
		  konnectionpage.SearchUsers1(SearchUsers1);
		  Thread.sleep(2000);
		   
	   }
	
	@Test(priority=3)
	public void SelectVijayUser() throws InterruptedException {
		konnectionpage.ClickonSunilUser();
		//konnectionpage.ClickonVijayUser();
		Thread.sleep(1000);
	
	  }	
	
	@Test(priority=4)
	public void ClickonKonnect() throws InterruptedException {
		konnectionpage.ClickonKonnectButton();
		Thread.sleep(2000);
	
	  }	
	
	@Test(priority=5)
	public void NavigatetoMyKonnections() throws InterruptedException {
		konnectionpage.ClickonMyKonnections();
		Thread.sleep(3000);
	  }
	
	
	@DataProvider(name="KonnectionPage1")
	public Object[][] getKonnectionselectedTestdata(){
		       Object data[][] = TestUtil.getTestData(Konnections);
		       return data;
	   	 	}
	 
	@Test(priority=6,dataProvider="KonnectionPage1")
	public void SearchRequestSentUser(String SearchUsers1,String SearchUsers2,String MyKonnectedRequestSentUser1,String MyKonnectedRequestSentUser2) throws InterruptedException{ 
		  konnectionpage.MyKonnectedRequestSentUser1(MyKonnectedRequestSentUser1);
		  Thread.sleep(3000);
		   
	}
	@Test(priority=7)
	public void DeleteRequestSentUser() throws InterruptedException {
		konnectionpage.Mouseoveruser();
		Thread.sleep(1000);
		
	}
	
	@Test(priority=8)
	public void VerifyUserRequestCancellledStatus() throws InterruptedException {
		konnectionpage.VerifyRequestCancellation();
		Thread.sleep(4000);
		
	}
	
	@Test(priority=9)
	public void NavigatetoAllKonnections() {
		konnectionpage.ClickonAllKonnections();
	
	  }	
	
	@Test(priority=10)
	public void SelectAllAndKonnect() throws InterruptedException {
		konnectionpage.selectAllUsersinAllKonnections();
		Thread.sleep(1000);
		konnectionpage.ClickonMyKonnections();
		Thread.sleep(2000);
	
	  }	
	
	@DataProvider(name="KonnectionPage2")
	public Object[][] getKonnectionselecAllTestdata(){
		       Object data[][] = TestUtil.getTestData(Konnections);
		       return data;
	   	 	}
	 
	@Test(priority=11,dataProvider="KonnectionPage2")
	public void SearchAnyoneuserinMyKonnections(String SearchUsers1,String SearchUsers2,String MyKonnectedRequestSentUser1,String MyKonnectedRequestSentUser2) throws InterruptedException{ 
		  konnectionpage.MyKonnectedRequestSentUser1(MyKonnectedRequestSentUser2);
		  Thread.sleep(2000);
	}
	
	@Test(priority=12)
	public void DeleteRequestSentoneuser() throws InterruptedException {
		konnectionpage.Mouseoveruser();
	}
	
	
	@Test(priority=11)
	public void VerifyAllRequestSentUser() throws InterruptedException {
		konnectionpage.Verifyrequestsentusers();
		Thread.sleep(2000);
		konnectionpage.ClickonAllKonnections();
		Thread.sleep(2000);
	}
	
	@Test(priority=12)
	public void SelectPendingAcceptance() throws InterruptedException {
		konnectionpage.selectpendingAcceptance();
		Thread.sleep(2000);
	}
	
	
	@Test(priority=13)
	 public void Logoutfromkonnections() {
			   testUtil.switchToDefaultFrame();
			   homePage.logout();
			   //driver.quit();
			   //driver.close();
			 }


	//@AfterMethod    
	/*@AfterClass   
	public void tearDown(){
		driver.quit();
	}*/
	
//############################SECOND LOGIN with VIJAY ############################//
	
	@DataProvider(name="Login")
	public Object[][] getKonnectionLoginTestdata(){
		       Object data[][] = TestUtil.getTestData(Konnectionlogin);
		       return data;
	   	 	}
	
	@Test(priority=14,dataProvider="Login")
	public void SecondLogin(String username1,String password1) throws InterruptedException {
		loginPage.SecondUserLogin(username1, password1);
		Thread.sleep(6000);
		// Already clicked and unable to do after re login to same session
		//homePage.clickoncloudlink2();
		//System.out.println("Selected Cloud Icon");
		//Thread.sleep(3000);
		homePage.clickonKonnections();	
		       
	}

	@Test(priority=15)
	public void ClickonAddNewKonnections1() throws InterruptedException {
		testUtil.switchToFrame();
		Thread.sleep(1000);
		konnectionpage.ClickonAddNewKonnection();
		Thread.sleep(2000);
		//konnectionpage.ClickonAllKonnections();
	  }	

	//@AfterMethod    
	@AfterClass   
	public void tearDown(){
		//driver.quit();
		}

}


