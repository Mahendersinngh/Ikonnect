/**
 * 
 */
package com.konnect.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.konnect.base.TestBase;
import com.konnect.pages.Cloudpage;
import com.konnect.pages.GroupsPage;
import com.konnect.pages.HomePage;
import com.konnect.pages.LoginPage;
import com.konnect.util.TestUtil;

/**
 * @author mahenderd
 *
 */
public class CloudPageTest extends TestBase {

	
	LoginPage loginPage;
	HomePage homePage;
	GroupsPage groupspage;
	Cloudpage cloudpage;
	TestUtil testUtil;
	public CloudPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		testUtil= new TestUtil();
		cloudpage = new Cloudpage();
		groupspage= new GroupsPage();
		loginPage= new LoginPage();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		/*cloudpage=cloudpage.clickonGroupsPage();
		groupspage=groupspage.clickonAddnewGroup();*/
	}
	
	/*
	@Test(priority=1)
	public void clickonCloudpageTest() {
		cloudpage = cloudpage.clickoncloudpage();
	}*/
	
	@Test(priority=1)
	public void clickongroupsTest() {
		cloudpage= cloudpage.clickonGroups();
	}
	
	
	@Test(priority=2)
	public void clickonGroupsTest() {
		testUtil.switchToFrame();
		groupspage = groupspage.clickonAddnewGroup();
	}

	/*public void GroupsAddNew() {
		testUtil.switchToFrame();
		groupspage = homePage.clickongroups();
	}*/

	
	@AfterMethod
	public void tearDown(){
	//driver.quit();
	
	}

}






