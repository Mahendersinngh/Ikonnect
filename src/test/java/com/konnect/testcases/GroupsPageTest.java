/**
 * 
 */
package com.konnect.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
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
public class GroupsPageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	GroupsPage groupspage;
	String sheetName = "NewGroups";
	String sheetName1 = "NewTag";
	
	public GroupsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		testUtil= new TestUtil();
		/*cloudpage = new Cloudpage();*/
		groupspage= new GroupsPage();
		loginPage= new LoginPage();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		groupspage=homePage.clickoncloudlink();
		groupspage=homePage.clickongroups();
		testUtil.switchToFrame();
		groupspage=homePage.clickonAddnewGroup();
		//groupspage=homePage.clickoncloudlink();
		//groupspage=homePage.clickongroups();
	}
/*
	@Test(priority=1)
	public void CloudpageTest() {
		homePage.clickoncloudlink();
	}
	
	@Test(priority=2)
	public void clickonGroups() {
		groupspage=homePage.clickongroups();
	}
		*/
	
	@DataProvider
	public Object[][] getGroupsTestData(){
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}

	@Test(priority=1, dataProvider="getGroupsTestData")
	public void validateCreateNewGroup(String GroupName , String Groupdescription,String EnterTaginSearchfield  ){
		groupspage.createNewGroup(GroupName, Groupdescription);
		groupspage.selectradiobutton();
		System.out.println("Selected Company Type and Access Radio buttons");
		groupspage.EnterNewTagName(EnterTaginSearchfield);
		System.out.println("Tag Name added");
		
//		@DataProvider
//		public Object[][] getTagsTestData(){
//			Object data[][] = TestUtil.getTestData(sheetName1);
//			return data;
//		@Test(dataProvider="getTagsTestData")
//		public void ValidateAddNewTag(String EnterTaginSearchfield) {
//		groupspage.EnterNewTagName(NewTagName);
//		groupspage.EnterNewTagName(EnterTaginSearchfield);
//		}
//	}
	
	}
	/*@Test(priority=2)
	public void selectradiobuttonTest() {
		groupspage.selectradiobutton();
		GroupsPage radio= groupspage.selectradiobutton();
		radio.selectradiobutton();
		
	
	}*/
	
	
		@AfterMethod
		public void tearDown(){
		//driver.quit();

		}
}



