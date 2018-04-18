/**
 * 
 */
package com.konnect.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.konnect.base.TestBase;
import com.konnect.pages.HomePage;
import com.konnect.pages.LoginPage;

/**
 * @author mahenderd
 *
 */
public class LoginPageTest extends TestBase  {

	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest(){
		super();
	}
	//@BeforeMethod
	@BeforeClass
	public void setUp() {
		initialization();
		loginPage = new LoginPage();	
	}
	
	//@Test(priority=2)
	/*public void loginPageTitleTest()
	{
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Gtkonnect logo");
	}*/
	
	@Test(priority=1)
	public void GTKLogoImageTest(){
		boolean flag = loginPage.validateGTKimage();
		Assert.assertTrue(flag);	
	}
	
	@Test(priority=2)
	public void LoginTest()
	{
		//loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		/*boolean flag = loginPage.verifyprofileicon();
		Assert.assertTrue(flag);*/
		/*loginPage = homePage.verifyprofileicon();
		loginPage = homePage.logout();
		System.out.println("Logut sucesfull");*/
		
	}
	
	/*// Verify Profile
	@Test(priority=3)
	public void validateprofileiconTest() {
		loginPage = homePage.verifyprofileicon();
		
	}*/
	
	// Logout
	@Test(priority=4)
	public void LogoutTest() {
		loginPage = homePage.logout();
	}
	//@AfterMethod
	@AfterClass
	public void tearDown(){
		driver.quit();
	}
	
	
}
