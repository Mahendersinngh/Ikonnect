/**
 * 
 */
package com.konnect.testcases;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
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
public class ExistingGroupsAnnouncementTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	GroupsPage groupspage;
	String sheetName = "ExistingGroups";
	
	public ExistingGroupsAnnouncementTest() {
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
		System.out.println("Clicked on Cloud Link to Loan and Display Respective Links in CLoud Links");
		/*groupspage.clickongroups();
		//groupspage=homePage.clickongroups();
		testUtil.switchToFrame();
		groupspage.clickonAddnewGroup()*/;
		//groupspage=homePage.clickonAddnewGroup();
		//groupspage=homePage.clickoncloudlink();
		//groupspage=homePage.clickongroups();
	}
	
	
	
	@Test(priority=1)
	public void ClickOnGroupsLink() {
			groupspage.clickongroups();
			System.out.println("Clicked on GroupsLink where Page navigates to GROUPS PAGE");
		 }
		
	
	@Test(priority=2)
	public void ClickOnAddNewGroupsButton() throws InterruptedException {
			testUtil.switchToFrame();
			groupspage.clickonAddnewGroup();
			System.out.println("Clicked on New Groups + icon where Page navigated to NEW GROUP CREATION PAGE");
			Thread.sleep(1000);
		}
	
	
	@DataProvider
	public Object[][] getGroupsTestData(){
		Object data[][] = TestUtil.getTestData1(sheetName);
		return data;
	}

	@Test(priority=1, dataProvider="getGroupsTestData")
	public void ValidateExistingGroups(String GroupNameSearchField, String AnnouncementCommentsfield,String DiscussionComments) throws InterruptedException, AWTException {
		groupspage.EnterGroupname(GroupNameSearchField);
		System.out.println("Provided Existing Group Name from TestData in Search bar");
		Thread.sleep(3000);
		groupspage.clickonGroupSearchButton();
		System.out.println("Searched GROUPNAME is displayed");
		Thread.sleep(6000);
		groupspage.SelectSearchedGroup();
		System.out.println("Selected Searched Group to Post comments for Announcement and Discussions");
		Thread.sleep(2000);
		groupspage.EnterAnnouncementCommentsExisting(AnnouncementCommentsfield);
		System.out.println(" Entered Announcement Comments from TestData to POST");
		groupspage.clickonAttachmentIcon();
		System.out.println("Clicked on Attachement Icon");
		groupspage.FileBrowseButton();
		System.out.println("File Uploaded successfully as a  Attachement in Announcment");
		groupspage.postAnnouncement();
		System.out.println("Announcement Posted Sucessfully");
		groupspage.verifyAnnouncementpost();
		System.out.println("Verified Posted announcment comments is displyed in Comments section");
		//Assert.assertTrue(groupspage.verifyAnnouncementpost());	
		groupspage.ClickonFilesTabAnnouncement();
		System.out.println("Selected Files Tab");
		Assert.assertTrue(groupspage.VerifyAnnouncementFilepost());
		System.out.println("Verifed Attached document in Announcement is displayed in FILES");
		System.out.println("Existing MYGROUPS Announcement Validation Success");
		testUtil.switchToDefaultFrame();
		groupspage.verifyprofileicon();
		groupspage.logout();
		System.out.println("Logout Sucessfull");
	
	}

	@AfterMethod
	public void tearDown(){
	driver.quit();

	}


}
