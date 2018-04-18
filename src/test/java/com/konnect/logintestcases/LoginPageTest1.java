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
import com.konnect.pages.HomePage;
import com.konnect.pages.LoginPage;

/**
 * @author mahenderd
 *
 */
public class LoginPageTest1 extends TestBase2  {

	LoginPage1 loginPage1;
	HomePage1 homePage1;
	
	
	public LoginPageTest1(){
		super();
	}
	//@BeforeMethod
	@BeforeClass
	public void setUp() {
		initialization();
		//loginPage1 = new LoginPage1();
		loginPage1= new LoginPage1();
		homePage1 = new HomePage1();
	}
	
	//@Test(priority=2)
	/*public void loginPageTitleTest()
	{
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Gtkonnect logo");
	}*/
	
	@Test(priority=1)
	public void GTKLogoImageTest(){
		boolean flag = loginPage1.validateGTKimage();
		Assert.assertTrue(flag);	
	}
	
	@Test(priority=2)
	public void LoginTest()
	{
		//loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		homePage1 = loginPage1.login(prop.getProperty("username1"), prop.getProperty("password1"));
		/*boolean flag = loginPage.verifyprofileicon();
		Assert.assertTrue(flag);*/
		/*loginPage = homePage.verifyprofileicon();
		loginPage = homePage.logout();
		System.out.println("Logut sucesfull");*/
		
	}
	
	/*// Verify Profile sample checks in
	@Test(priority=3)
	public void validateprofileiconTest() {
		loginPage = homePage.verifyprofileicon();
		
	}*/
	
	// Logout
	@Test(priority=4)
	public void LogoutTest() {
		loginPage1 = homePage1.logout();
	}
	//@AfterMethod
	@AfterClass
	public void tearDown(){
		driver.quit();
	}
	
	
}
