/**
 * 
 */
package com.konnect.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
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
	
	
	@BeforeMethod
	
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
	public void gtkLogoImageTest(){
		boolean flag = loginPage.validateGTKimage();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=2)
	public void loginTest()
	{
		//loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	public void Logout() {
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
		
	
}
