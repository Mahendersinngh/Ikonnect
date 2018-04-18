/**
 * 
 */
package com.konnect.testcases;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
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
public class ExistingGroupsDiscussionTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	GroupsPage groupspage;
	String sheetName = "ExistingGroups";
	
	public ExistingGroupsDiscussionTest() {
		super();
	}
	@BeforeMethod
	public void setup() {
		initialization();
		testUtil= new TestUtil();
		/*cloudpage = new Cloudpage();*/
		loginPage= new LoginPage();
		homePage = new HomePage();
		groupspage= new GroupsPage();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		System.out.println("Login Sucessfull");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		groupspage=homePage.clickoncloudlink();
		/*groupspage.clickongroups();
		//groupspage=homePage.clickongroups();
		testUtil.switchToFrame();
		groupspage.clickonAddnewGroup()*/;
		//groupspage=homePage.clickonAddnewGroup();
		//groupspage=homePage.clickoncloudlink();
		//groupspage=homePage.clickongroups();
	}
	
	@DataProvider
	public Object[][] getGroupsTestData(){
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}

	@Test(priority=1, dataProvider="getGroupsTestData")
	public void ValidateExistingGroups(String GroupNameSearchField, String AnnouncementCommentsfield,String DiscussionComments) throws InterruptedException, AWTException {
		groupspage.clickongroups();
		System.out.println("Clicked on GroupsLink where Page navigates to GROUPS PAGE");
		//groupspage=homePage.clickongroups();
		testUtil.switchToFrame();
		
		groupspage.clickonMyGroups();
		System.out.println("Clicked on MYGROUPS to Select Existing Groups");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		groupspage.clickonGroupsAdvancesearch();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		groupspage.EnterGroupname(GroupNameSearchField);
		System.out.println("Provided Existing Group Name from TestData in Search bar");
		Thread.sleep(3000);
		groupspage.clickonGroupSearchButton();
		System.out.println("Searched GROUPNAME is displayed");
		Thread.sleep(6000);
		groupspage.SelectSearchedGroup();
		System.out.println("Selected Searched Group to Post comments for Announcement and Discussions");
		Thread.sleep(3000);
		groupspage.ClickonDiscussionTab();
		groupspage.EnterdiscussionCommentsExisting(DiscussionComments);
		System.out.println(" Entered Discussion Comments from TestData to POST");
		groupspage.clickonAttachmentIcon();
		System.out.println("Clicked on Attachement Icon to Browse files");
		groupspage.DiscussionFileBrowse();
		System.out.println("File Uploaded successfully as a  Attachement in Discussion");
		groupspage.PostDiscussion();
		System.out.println("Discussion Posted Sucessfully");
		groupspage.VerifyDiscussionpost();
		System.out.println("Verified Posted Discussion comments is displyed in Comments section");
		groupspage.ClickonFilesTabdiscussion();
		System.out.println("Selected Files Tab");
		Assert.assertTrue(groupspage.verifyDiscussionFilepost());
		System.out.println("Verifed Attached document in Discussion is displayed in FILES");
		System.out.println("Existing MYGROUPS Discussion Validation Success");
		testUtil.switchToDefaultFrame();
		groupspage.verifyprofileicon();
		groupspage.logout();
		System.out.println("Logout Sucessfull");
	
	}	
	
}
