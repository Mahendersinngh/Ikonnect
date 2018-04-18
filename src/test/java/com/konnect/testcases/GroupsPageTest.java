/**
 * 
 */
package com.konnect.testcases;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.konnect.base.TestBase;
import com.konnect.pages.GroupsPage;
import com.konnect.pages.HomePage;
import com.konnect.pages.LoginPage;
import com.konnect.pages.ProjectPage;
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
	ProjectPage projectpage;
	String sheetName = "NewGroups";
	//String sheetName1 = "NewTag";
	
 public GroupsPageTest() {
		super();
	}
	
	@BeforeClass
	//@BeforeMethod
 public void setup() throws InterruptedException {
			initialization();
			testUtil= new TestUtil();
			/*cloudpage = new Cloudpage();*/
			loginPage= new LoginPage();
			homePage = new HomePage();
			groupspage= new GroupsPage();
			projectpage=new ProjectPage();
			homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
			Thread.sleep(8000);
			System.out.println("Logged into the Application");
			groupspage=homePage.clickoncloudlink();
			System.out.println("Clicked on Cloud Icon to Display and Select Groups and other links");
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
	
	@DataProvider(name="GroupsName")
	public Object[][] getGroupsTestData(){
		Object data[][] = TestUtil.getTestData1(sheetName);
		return data;
	}
	@Test(priority=3, dataProvider="GroupsName")
	public void ProvideNewGroupName(String GroupName , String Groupdescription,String EnterTaginSearchfield,String EnterCreatedTagName, String GroupNameSearchField ) throws InterruptedException, AWTException{	
			groupspage.createNewGroup(GroupName, Groupdescription);
			System.out.println("Provided GroupNAME and GroupDESCRIPTION from TESTDATA");
			groupspage.selectradiobutton();
			System.out.println("Selected Company Type and Access Radio buttons");
			groupspage.clikconAddNewTaG();
			System.out.println("Navigated to ADD NEW TAG or To Select Existing TAG");
			
			// CREATING NEW TAG stopped
			/*groupspage.EnterNewTagName(EnterTaginSearchfield);
			groupspage.clickoncreateNewTag();
			System.out.println("New Tag created");
			groupspage.clickonoutsidesearchtab();*/
			
			groupspage.verifyEnterCreatedTagName(EnterCreatedTagName);
			//System.out.println("Tag Name added");
			groupspage.ClickonSearchIcon();
			Thread.sleep(1000);
			//groupspage.selectonAutodisplayTag();
			groupspage.clikconbesidesearchedTag();
			groupspage.selectTagAftersearch();
			System.out.println("Select Created or Existing TAG after Tag Search");
			groupspage.verifydisplayedTagisSelected();
			//public void validatedisplayedTagisSelected()
			//Assert.assertTrue(groupspage.verifydisplayedTagisSelected(), "Tag is not selected after search ");
			groupspage.clickonTagADDbutton();
			System.out.println("Added TAG after Search");
			
		}
	
	@Test(priority=4)
	public void validateCreatedNewGroup() throws InterruptedException{
			groupspage.ClickonAddNEWMembers();
			Thread.sleep(3000);
			System.out.println("Clicked on Add NEW Members where Page Navigated to Select MEMBERS from List of Members");
			groupspage.SelectMembers();
			System.out.println("Selected MEMBER from the list of Members");
			groupspage.SaveMembers();
			System.out.println("Saved Selected MEMBER");
			groupspage.ClickonAddNEWAdmin();
			Thread.sleep(3000);
			System.out.println("Clicked on Add NEW ADMIN Where Page Navigated to Select ADMIN from List of Admins");
			groupspage.SelectAdmin();
			System.out.println("Selected ADMIN from the list of ADMINS");
			groupspage.SaveAdmin();
			System.out.println("Saved Selected ADMIN");
			groupspage.clikconCreateGroupbutton();
			System.out.println("Groups Created Sucessfully");
			groupspage.clickonMyGroups();
			System.out.println("Clicked on MYGROUPS to Verify created GROUP");
		}
	/*	
	@DataProvider(name="CreatedGroupsName")
	public Object[][] getGroupscreatedTestData(){
			Object data[][] = TestUtil.getTestData1(sheetName);
			return data;
		}
	@Test(priority=5, dataProvider="CreatedGroupsName")
	public void validateCreatedNewGroup(String GroupName , String Groupdescription,String EnterTaginSearchfield,String EnterCreatedTagName, String GroupNameSearchField ) throws InterruptedException, AWTException{
			groupspage.clickonGroupsAdvancesearch();
			groupspage.EnterGroupname1(GroupNameSearchField);
			Thread.sleep(2000);
			System.out.println("Provided Group Name to Search in MYGROUPS");
			groupspage.clickonGroupSearchButton();
			System.out.println("Searched GROUPNAME is displayed");
			Thread.sleep(2000);
		}
	@Test(priority=6)
	public void SelectsearchedGroup() {
			groupspage.SelectSearchedGroup();
			System.out.println("Selected Searched Group to Post comments for Announcement and Discussions");
		}
		
	@Test(priority=7)
	public void PostAnnouncement() throws InterruptedException, AWTException {
			groupspage.EnterAnnouncementComments();
			System.out.println(" Entered Announcement Comments to POST");
			groupspage.clickonAttachmentIcon();
			System.out.println("Clicked on Attachement Icon to Browse files");
			//groupspage.EnterAnnouncementcomments(AnnouncementComments);
			groupspage.FileBrowseButton();
			System.out.println("File Uploaded successfully as a  Attachement in Announcment");
			groupspage.postAnnouncement();
			System.out.println("Announcement Posted Sucessfully");
			//groupspage.verifyAnnouncementpost();
			//Assert.assertTrue(groupspage.verifyAnnouncementpost());
			//System.out.println("Posted Announcment is displyaing", groupspage.verifyAnnouncementpost());
			groupspage.verifyAnnouncementpost();
			System.out.println("Verified Posted Announcement comments is displyed in Comments section");
			groupspage.ClickonFilesTabAnnouncement();
			Assert.assertTrue(groupspage.VerifyAnnouncementFilepost());
			System.out.println("Verifed Attached document in Announcement is displayed in FILES");
			}
	@Test(priority=7)
	public void PostDiscussion() throws InterruptedException, AWTException {
			groupspage.ClickonDiscussionTab();
			System.out.println("Clicked on Discussion");
			groupspage.EnterDiscussionCommentsfield();
			System.out.println("Discussion is");
			groupspage.ClickonDiscussionAttachement();
			System.out.println("Navigated to Select MEMBERS");
			groupspage.DiscussionFileBrowse();
			groupspage.PostDiscussion();
			System.out.println("Discussion Posted Sucessfully");
			Assert.assertTrue(groupspage.VerifyDiscussionpost());
			System.out.println("Verified Posted Discussion comments is displyed in Comments section");
			groupspage.ClickonFilesTabdiscussion();
			System.out.println("Clicked and Moved to Files Section");
			Assert.assertTrue(groupspage.verifyDiscussionFilepost());
			System.out.println("Verifed Attached document in Disscussion is displayed in FILES section");
			System.out.println("Groups Created and Verfied Sucessfuly with Comments in MyGROUPS");
		 }
	*/
	@Test(priority=9)
	public void LogoutfromGroups() {
		testUtil.switchToDefaultFrame();
		groupspage.logout();
		System.out.println("Logout Sucessfull");
	 }
	
	@AfterClass	
	//@AfterMethod
		public void tearDown(){
		//driver.quit();

		}
}



