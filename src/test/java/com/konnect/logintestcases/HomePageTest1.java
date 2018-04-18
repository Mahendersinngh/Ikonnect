/**
 * 
 */
package com.konnect.logintestcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.konnect.base.TestBase;
import com.konnect.base.TestBase2;
import com.konnect.loginpages.HomePage1;
import com.konnect.loginpages.LoginPage1;
import com.konnect.pages.GroupsPage;
import com.konnect.pages.HomePage;
import com.konnect.pages.LoginPage;
import com.konnect.util.TestUtil;

/**
 * @author mahenderd
 *
 */
public class HomePageTest1 extends TestBase2 {

	LoginPage1 loginPage1;
	HomePage1 homePage1;
	
	//Cloudpage cloudpage;
	GroupsPage groupspage;
	
	TestUtil testUtil;
	
	public HomePageTest1() {
		super();
	}
	//test cases should be separated -- independent with each other
		//before each test case -- launch the browser and login
		//@test -- execute test case
		//after each test case -- close the browser
	//@BeforeMethod
	@BeforeClass
	public void setup() {
		initialization();
		
		/*cloudpage = new Cloudpage();*/
		groupspage= new GroupsPage();
		loginPage1= new LoginPage1();
		homePage1 = new HomePage1();
		homePage1=loginPage1.login(prop.getProperty("username1"), prop.getProperty("password1"));
		System.out.println("Login Sucessfull");
		testUtil= new TestUtil();
		//testUtil.switchToFrame();
	}

	@Test(priority=1)
	public void verifyHomePageTitleTest(){
	
	try {
		Thread.sleep(8000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	String homePageTitle = homePage1.verifyHomePageTitle();
	Assert.assertEquals(homePageTitle, "GTK Content Portal","Home page title not matched");
	System.out.println("Verified HomePage Title");
	//homePage1.clickoncloudlink();
	homePage1.clickoncloudlink1();
	System.out.println("Clicked on Cloud Icon to Loan and Display respective Links");
	
	}
	
	/*@Test(priority=2)
	public void verifyprofilepage() {
		homePage.cickonProfilepage();
	}*/
	
	/*@Test(priority=2)
	public void clickonCloudpageTest() {
		homePage.clickoncloudlink();
	}*/
		//homePage.clickongroups();
		//testUtil.switchToFrame();
		//driver.switchTo().frame("GTKCntMstIframe");
		//testUtil.switchToFrame();
		//homePage.clickonAddnewGroup();
		//homePage.Groupname();
		//groupspage=homePage.clickongroups();
		//homePage.clickongroups();
	//}
	/*@Test(priority=3)
	public void ClickonGroupsTest()  {
		//clickonCloudpageTest();
		homePage.clickoncloudlink();
		homePage.clickongroups();
		homePage.clickonAddnewGroup();
		homePage.Groupname();
		
	}*/
	
		/*public void clikconsignout() {
			homePage.clickonsignout();
	}*/
	
	/*@Test(priority=3)
	public void clikconsignout() {
		homePage.clickonsignout();
	}*/
	//@Test(priority=3)
	/*public void verifyusernameTest() {
		//Assert.assertTrue(homePage.verifyusername());
		//boolean verifyusername= homePage.verifyusername();
		//Assert.assertEquals(verifyusername, "Sagar Pachipala", "Username is not matched");
	}
*/
	//@AfterMethod
	@AfterClass
	public void tearDown(){
	driver.quit();
	
	}
	
}