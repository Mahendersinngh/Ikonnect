/**
 * 
 */
package com.konnect.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.konnect.base.TestBase;
import com.konnect.pages.GroupsPage;
import com.konnect.pages.HomePage;
import com.konnect.pages.LoginPage;
import com.konnect.util.TestUtil;

/**
 * @author mahenderd
 *
 */
public class HomePageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	//Cloudpage cloudpage;
	GroupsPage groupspage;
	
	TestUtil testUtil;
	
	public HomePageTest() {
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
		loginPage= new LoginPage();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
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
	String homePageTitle = homePage.verifyHomePageTitle();
	Assert.assertEquals(homePageTitle, "GTK Content Portal","Home page title not matched");
	System.out.println("Verified HomePage Title");
	homePage.clickoncloudlink();
	homePage.clickoncloudlink1();
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