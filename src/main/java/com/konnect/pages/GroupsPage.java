/**
 * 
 */
package com.konnect.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.konnect.base.TestBase;

/**
 * @author mahenderd
 *
 */
public class GroupsPage extends TestBase {

	
	
	// For Logout from Groups
	@FindBy(xpath="//img[@id='imgusrProfileDP']")
	WebElement profileicon;
	// Logout button
	@FindBy(id="lnk")
	WebElement signout;
	//lnk
	
	
	
	@FindBy(xpath="/html/body/form/div[3]/aside/section/div[2]/div[2]/ul/li[2]/a")
	WebElement Groups;

	
	@FindBy(xpath="//*[@id=\"divGrpAddNew\"]")
	//@FindBy(xpath="//*[@id=\"divGrpAddNew\"]")
	//@FindBy(css="html.k-ff.k-ff58 body.skin-blue.sidebar-mini form#formMaster div.wrapper div.row div.col-md-12.no-padding div.col-md-12 div#example.gtkContentMst div.ordersGrid.table-responsive div#content div.KonnectHdr.grpHdr.pageHdrTitle i#divGrpAddNew.fa.fa-plus")
	WebElement GroupsAddNew;
	
	@FindBy(id="grpMsttxtGrpName")
	
	WebElement GroupName;
	
	@FindBy(id="grpMsttxtGrpDescr")
	WebElement Groupdescription;
	
	@FindBy(id="test3")
	WebElement radiobutton1;
	@FindBy(id="test4")
	WebElement radiobutton2;
	@FindBy(id="test5")
	WebElement radiobutton3;
	@FindBy(id="test6")
	WebElement radiobutton4;
	@FindBy(id="test7")
	WebElement radiobutton5;
	@FindBy(id="test8")
	WebElement radiobutton6;
	
	/*@FindBy(xpath="//*[@id=\"txtTagNameSearch\"]")
	WebElement AddTags;*/
	
	@FindBy(xpath="//input[@id='Grouptags']")
	WebElement AddTagsfield;
	
	@FindBy(xpath="//input[@type='text' and @id='txtTagNameSearch']")
	//@FindBy(xpath="//input[@id='txtTagNameSearch']")
	WebElement EnterTaginSearchfield;
	
	
	
	@FindBy(xpath="//a[text()='Create Tag']")
	WebElement selectCreatenewTag;
	
	@FindBy(xpath="//div[@class='allTags col-md-12 pr20 pl0 dvAddedTagstoSpan']")
	WebElement Clickonoutsidesearchfield;
	
	//@FindBy(xpath="//input[@id='txtTagNameSearch']")
	@FindBy(xpath="//input[@type='text' and @id='txtTagNameSearch']")
	WebElement EnterCreatedTagName;
	
	// search Icon
	@FindBy(xpath="//span[@class='fa fa-search tagnamesearch btntagnamesearch']")
	WebElement TagSearchIcon;
	
	@FindBy(css="#TagNameSearchsuggesstion-box > ul")
	WebElement SelectAutodisplayTag;
	
	// Just Click beside searchedTag
	@FindBy(xpath="//div[@class='allTags col-md-12 pr20 pl0 dvAddedTagstoSpan']")
	WebElement ClickbesidesearchedTag;
	
	// Select Searched tag after search
	////a[@class='tag AddTagtoSpan' and text()='Seleniumjunit7']
	//@FindBy(xpath="//ul[@class='ulTagAutoComplt ui-menu ui-widget ui-widget-content ui-autocomplete']")
	//@FindBy(xpath="//div[@id='dvTagsBody_S']")
	//@FindBy(xpath="//a[text()='Perfomance1']")
	////a[contains(text(),'Performance3')]
	@FindBy(xpath="//a[text()='Performance6']")
	WebElement SelectdisplayedTagaftersearch;
	
	
	
	// Verify Selected Tag is added
	
	@FindBy(xpath="//ul[@class='ulAddedTagstoSpan']")
	WebElement SelectedTagISdisplayingornot;
	
	// Click on ADD button at bottom after selecting Tag
	
	@FindBy(xpath="//button[text()='ADD']")
	WebElement TagADDbutton;
	
	//@FindBy(xpath="//span[@class='bFon grpMstAddMemberCount grpMstAddMemberCount_2']")
	@FindBy(xpath="//a[@class='btn btn-circle grpMstAddMember']")
	WebElement ADDMembers;
	
	@FindBy(xpath="//*[@id=\"MemberLstUser_13\"]")
	WebElement SelectVijayasMember;
	
	@FindBy(id="gtkCommonbtnInviteSave")
	WebElement MembersSavebutton;
	
	@FindBy(xpath="//a[@class='btn btn-circle grpMstAddAdmin']")
	WebElement ADDAdmin;
	
	@FindBy(xpath="//*[@id=\"MemberLstUser_2\"]")
	WebElement SelectVarunasAdmin;
	
	@FindBy(id="gtkCommonbtnInviteSave")
	WebElement AdminSavebutton;
	
	@FindBy(xpath="//*[@id=\"gtkGrpMstCreateGrp\"]")
	WebElement CreateGroupbutton;
	
	//Click on MY Groups
	@FindBy(xpath="//span[text()='My Groups']")
	WebElement MyGroupsbutton;
	
	//@FindBy(xpath="//span//i[@class='fa fa-search']")
	@FindBy(xpath="//span[@class='grpSumMygrpSearch']//i")
	//@FindBy(xpath="/html/body/form/div[3]/div/div/div/div/div/div[1]/div[2]/div/div/div[1]/div/div[1]/div[1]/div/div/button")
	WebElement GroupsAdvanceSearch;
	
	// Group name search
	@FindBy(xpath="//div[@class=' pull-right pr15 grpSumMygrpSearchDiv']/input[@class='txtMyGrpsrchField']")
	WebElement GroupNameSearchField;
	
	// GroupSearch button
	@FindBy(xpath="//span[@class='grpSumMygrpSearch']//i")
	WebElement GroupSearchButton;
	
	@FindBy(css="a.pull-left")
	WebElement SelectSearchedGroups;
	
	@FindBy(css="#txtComment")
	WebElement AnnouncementCommentsfield;
	
	@FindBy(xpath="//*[@id=\"A_0\"]")
	WebElement AttachementIcon;
	
	@FindBy(xpath="//*[@id=\"cmntsDrpZoneOpen\"]/div/div/div/div/div")
	WebElement FileBrowsebutton;
	
	@FindBy(id="S0")
	WebElement AnnouncementPostButton;
	////div[@class='col-sm-10 mt10 no-padding']
	////div[@class='col-sm-10 mt10 no-padding']/div
	@FindBy(xpath="//div[@class='col-sm-10 mt10 no-padding']/div")
	WebElement PostedAnnouncment;
	
	@FindBy(css=".Files > a:nth-child(1)")
	WebElement SelectFilesTab;
	
	@FindBy(xpath="//div[text()='GroupsAnnouncementFile.docx']")
	
	WebElement Announcementuploadedfile;
	
	//@FindBy(xpath="//div[text()='GroupsAnnouncementFile.docx']/following::td[3][1][text()='03/07/2018']")
	
	
	// select discussion  with customized xpath using siblings-Following
	//@FindBy(xpath="//*[@id=\\\"divGroupViewTabs\\\"]/li[2]/a")
	
	//@FindBy(xpath="//*[@id='divGroupViewTabs']/following::li[@class='Discussion']/a")
	
	@FindBy(css="li.Discussion > a")
	WebElement DiscussionTab;
	
	@FindBy(xpath="//*[@id=\"A_0\"]")
	WebElement DisscussionAtttachmenticon;
	
	@FindBy(xpath="//div[@class='col-md-12 no-padding']/following::textarea[@id='txtComment']")
	WebElement DiscussionComments;
	
	@FindBy(xpath="//*[@id=\"cmntsDrpZoneOpen\"]/div/div/div/div/div")
	WebElement DiscussionFileBrowsebutton;
	
	@FindBy(id="S0")
	WebElement DiscussionPostButton;
	
	@FindBy(xpath="//div[@class='col-sm-10 mt10 no-padding']/following::div[text()=' ExistingGroupsDiscussion ']")
	WebElement PostedDiscussion;
	

	@FindBy(xpath="//div[text()='GroupsAnnouncementFile.docx']")
	WebElement Discussionuploadedfile;
	
	
	
	
	
	
	
	
	
	
	
	
	public GroupsPage() {
		PageFactory.initElements(driver, this);
	}
	

/*public GroupsPage clickonAddnewGroup(){
	
	GroupsAddNew.click();
	return new GroupsPage();
}
public void Groupname() {
	
	Groupname.sendKeys("Seleniumgroup");
}
*/
	public LoginPage verifyprofileicon() {
		profileicon.isDisplayed();
		profileicon.click();
		return new LoginPage();
	}
	

	public void logout() {
		profileicon.click();
		signout.click();
	}
	
	
	
	
	public GroupsPage clickongroups() {
		Groups.click();
		return new GroupsPage();
	}
	
	// Create NEW group button +
	public GroupsPage clickonAddnewGroup(){
		
		//driver.switchTo().frame("window_frame");
		//driver.switchTo().frame("GTKCntMstIframe");
		GroupsAddNew.click();
		return new GroupsPage();
	}
	
	
	public GroupsPage createNewGroup(String Groupname, String GroupDescription){
		
		
		GroupName.sendKeys(Groupname);
		Groupdescription.sendKeys(GroupDescription);
	   return new GroupsPage();
	}
	
	
	//Existing Groups Selection
		public void SearchExistingGroup(String Existinggroup) {
			
		}
	
	
	
		public GroupsPage selectradiobutton() {
		radiobutton2.click();
		radiobutton4.click();
		return new GroupsPage();
		}
	public void clikconAddNewTaG() {
		AddTagsfield.click();
		
	}

	public String EnterNewTagName(String NewTagName) {
		EnterTaginSearchfield.sendKeys(NewTagName);
		return NewTagName;
	}
	
	public void clickonoutsidesearchtab() {
		Clickonoutsidesearchfield.click();
	}
	
	//Create New Tag Filter upon New Name
	public void clickoncreateNewTag() {
		
		Actions action =new Actions(driver);
		action.moveToElement(selectCreatenewTag).build().perform();
		selectCreatenewTag.click();
		
	}
	// After Creating New Tag Searching tag with name
	public String verifyEnterCreatedTagName(String SearchCreatedTagName) {
		EnterCreatedTagName.sendKeys(SearchCreatedTagName);
		return SearchCreatedTagName;
	}
	
	// Tag Search icon
	public void ClickonSearchIcon() {
		TagSearchIcon.click();
	}
	// Tag search with Auto Filter -- Not Working
	public void selectonAutodisplayTag() {
		SelectAutodisplayTag.click();
	}

	public void clikconbesidesearchedTag() {
		ClickbesidesearchedTag.click();
	}
	
	public void selectTagAftersearch() {
		
		
		//#dvTagsBody_J > ul
		/*WebElement ele = driver.findElement(By.cssSelector("html.k-ff.k-ff58 body.skin-blue.sidebar-mini form#formMaster div.wrapper div.row div.col-md-12.no-padding div.col-md-12 div#example.gtkContentMst div.ordersGrid.table-responsive div#content div.row.tagPopup div.col-md-12 div.row div.box-body.noti_body.p0 div#mySidenav.remnav.mySidenav div.rem_body div.box-body.pt0 div.tags_body section.Section_J.AllSection div.tag_char div#dvTagsBody_J.dvTagsBody_J ul.add_tags"));
		WebElement ele = driver.findElement(By.cssSelector("html.k-ff.k-ff58 body.skin-blue.sidebar-mini form#formMaster div.wrapper div.row div.col-md-12.no-padding div.col-md-12 div#example.gtkContentMst div.ordersGrid.table-responsive div#content div.row.tagPopup div.col-md-12 div.row div.box-body.noti_body.p0 div#mySidenav.remnav.mySidenav div.rem_body div.box-body.pt0 div.tags_body section.Section_J.AllSection div.tag_char div#dvTagsBody_J.dvTagsBody_J ul.add_tags"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
		*/
		SelectdisplayedTagaftersearch.click();
		
		/*Actions action =new Actions(driver);
		action.moveToElement(SelectdisplayedTagaftersearch).build().perform();
		SelectdisplayedTagaftersearch.click();
	*/
	}

	

	public boolean verifydisplayedTagisSelected() {
		 SelectedTagISdisplayingornot.isDisplayed();
		 return false;		
		
	}

	public void clickonTagADDbutton() {
		TagADDbutton.click();
	}

	
	// Action to Select ADD NEW Members
	// Clicking on + to ADD NEW MEMBER from Sidebar
	public void ClickonAddNEWMembers() {
		
		/*Actions action =new Actions(driver);
		action.moveToElement(ADDMembers).build().perform();
		ADDMembers.click();*/
		
		WebElement ele = driver.findElement(By.xpath("//a[@class='btn btn-circle grpMstAddMember']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
	}

	public void SelectMembers() {
		Actions action =new Actions(driver);
		action.moveToElement(SelectVijayasMember).build().perform();
		SelectVijayasMember.click();
	}

	public void SaveMembers() {
		MembersSavebutton.click();
	}


// Clicking on + to ADD NEW ADMIN from Sidebar
	public void ClickonAddNEWAdmin() {
		
		/*Actions action =new Actions(driver);
		action.moveToElement(ADDMembers).build().perform();
		ADDMembers.click();*/
		
		WebElement ele = driver.findElement(By.xpath("//a[@class='btn btn-circle grpMstAddAdmin']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
	
		/*Actions action =new Actions(driver);
		action.moveToElement(ADDAdmin).build().perform();
		ADDAdmin.click();*/
	
	
	}

	public void SelectAdmin() {
		
		Actions action =new Actions(driver);
		action.moveToElement(SelectVarunasAdmin).build().perform();
		SelectVarunasAdmin.click();
	}

	public void SaveAdmin() {
		AdminSavebutton.click();
	}

	
	public void clikconCreateGroupbutton() {
		
		//Not able to perfom action classes
		/*Actions action =new Actions(driver);
		action.moveToElement(CreateGroupbutton).build().perform();
		CreateGroupbutton.click();*/
		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"gtkGrpMstCreateGrp\"]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
		
	}
	
	public void clickonMyGroups() {
		MyGroupsbutton.click();
	}
	
	public void clickonGroupsAdvancesearch() {
		GroupsAdvanceSearch.click();
	}
	
	// For created Group
	public void EnterGroupname1(String Existinggroup) {
		GroupNameSearchField.sendKeys(Existinggroup);
	}
	
	//For Existing Group pulling data from Xls
	public void EnterGroupname(String Existinggroupname) {
		GroupNameSearchField.sendKeys(Existinggroupname);
	}
	
	public void clickonGroupSearchButton() {
		GroupSearchButton.click();
	}
	
	public void SelectSearchedGroup() {
		SelectSearchedGroups.click();
	}
	
	
	// For New Groups created Hardcoded as String allowing only 5 parameters
	public void EnterAnnouncementComments() {
		AnnouncementCommentsfield.sendKeys("GroupsAnnouncement");
	}
	
	// For Existing Groups pulling data from "ExistingGroups" sheet
	public void EnterAnnouncementCommentsExisting(String ExtGrpAnnouncementComments) {
		AnnouncementCommentsfield.sendKeys(ExtGrpAnnouncementComments);	
	
	}
	public void clickonAttachmentIcon() {
		AttachementIcon.click();
	}
	
	

	public void FileBrowseButton() throws InterruptedException /*throws InterruptedException, AWTException*/, AWTException {
		
		
		StringSelection sel = new StringSelection("E:\\upload doc\\GroupsAnnouncementFile.docx");
		 
		   // Copy to clipboard
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
		 System.out.println("selection" +sel);
		// Wait for 5 seconds
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@id=\"cmntsDrpZoneOpen\"]/div/div/div/div/div")).click();
		 System.out.println("Browse button clicked in Task doc upload");
		 
		 // Create object of Robot class
		 Robot robot = new Robot();
		 Thread.sleep(1000);
		      
		  // Press Enter
		 robot.keyPress(KeyEvent.VK_ENTER);
		 
		// Release Enter
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
		  // Press CTRL+V
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_V);
		 
		// Release CTRL+V
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 robot.keyRelease(KeyEvent.VK_V);
		 Thread.sleep(1000);
		        
		  //Press Enter 
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
				
	}
	
	
	public void postAnnouncement() {
		AnnouncementPostButton.click();
	}
	
	/*public boolean verifyAnnouncementpost() {
		if(PostedAnnouncment.isDisplayed())
			Assert.assertEquals(PostedAnnouncment, "[[ChromeDriver: chrome on XP (0123a675c8212916ba118d9b0a8475f7)] -> xpath: //div[@class='col-sm-10 mt10 no-padding']/div]","Announcement is not displayed");
		return false ;	
	}*/
	
	
	public void verifyAnnouncementpost() {
		PostedAnnouncment.isDisplayed();
	}

	public void ClickonFilesTabAnnouncement() {
		SelectFilesTab.click();
	}
	
	public boolean VerifyAnnouncementFilepost() {
		return Announcementuploadedfile.isDisplayed();
	}
	
	
	public void ClickonDiscussionTab() {
		DiscussionTab.click();
	}
	
	//For New Groups creation Hardcoded due to limit of Parameters
	public void EnterDiscussionCommentsfield() {
		DiscussionComments.sendKeys("GroupsDiscussion");
	}
	// For Existing Groups pulling data from "ExistingGroupsDiscussion" cell from ExistingGrousp xls
	public void EnterdiscussionCommentsExisting(String AnnouncementComments) {
		DiscussionComments.sendKeys(AnnouncementComments);	
	
	}
	
	
	
	public void ClickonDiscussionAttachement() {
		DisscussionAtttachmenticon.click();
	}
	
	public void DiscussionFileBrowse() throws InterruptedException, AWTException {
		
		 StringSelection sele = new StringSelection("E:\\upload doc\\GroupsDiscussionFile.docx");
		 
		   // Copy to clipboard
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sele,null);
		 System.out.println("selection" +sele);
		// Wait for 5 seconds
		 Thread.sleep(5000);
		 //driver.findElement(By.cssSelector("#Discussion > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
		 //driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div/div/div/div[1]/div[2]/div/div/div[4]/div/div[3]/div[1]/div/div[2]/div[1]/div[1]/div[2]/div/div/div/div/div")).click();
		 //driver.findElement(By.xpath("//*[@id=\"cmntsDrpZoneOpen\"]/div/div/div/div/div")).click();
		 System.out.println("Discussion Browse button clicked in Task doc upload");
		 
		 // Create object of Robot class
		 Robot robott = new Robot();
		 Thread.sleep(1000);
		      
		  // Press Enter
		 robott.keyPress(KeyEvent.VK_ENTER);
		 
		// Release Enter
		 robott.keyRelease(KeyEvent.VK_ENTER);
		 
		  // Press CTRL+V
		 robott.keyPress(KeyEvent.VK_CONTROL);
		 robott.keyPress(KeyEvent.VK_V);
		 
		// Release CTRL+V
		 robott.keyRelease(KeyEvent.VK_CONTROL);
		 robott.keyRelease(KeyEvent.VK_V);
		 Thread.sleep(1000);
		        
		  //Press Enter 
		 robott.keyPress(KeyEvent.VK_ENTER);
		 robott.keyRelease(KeyEvent.VK_ENTER);
		 driver.findElement(By.cssSelector("#Discussion > div:nth-child(1) > div:nth-child(1) > div:nth-child(6) > div:nth-child(1) > img:nth-child(3)")).click();
			
	}
	
	public void PostDiscussion() {
		DiscussionPostButton.click();
	}
	
	public boolean VerifyDiscussionpost() {
		return PostedDiscussion.isDisplayed();
	
	}
	
	public void ClickonFilesTabdiscussion() {
		SelectFilesTab.click();
	}
	
	public boolean verifyDiscussionFilepost() {
		return Discussionuploadedfile.isDisplayed();
	}
	
}