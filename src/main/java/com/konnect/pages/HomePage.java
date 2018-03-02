package com.konnect.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.konnect.base.TestBase;
import com.konnect.util.TestUtil;

public class HomePage extends TestBase {
	
	/*TestUtil testUtil;
	testUtil= new TestUtil();
	testUtil.switchToFrame();*/
	
	//Cloud icon
		/*@FindBy(xpath ="//*[@id=\\\"mstLiKonnectTab\\\"]/a")
		WebElement cloudlink;*/
		//@CacheLookup
		//@FindBy(id="mstLiKonnectTab")
		@FindBy(xpath="/html/body/form/div[3]/aside/section/div[1]/ul/li[2]/a")
		WebElement leftcloudlink;
		//@CacheLookup
		
		@FindBy(id="mstLiSettings")
		WebElement leftsettings;
		
		//Homelink at Left panel
		@FindBy(id="mstLiTradeindexTab")
		WebElement lefthomelink;
		
		/*@FindBy(xpath="/html/body/form/div[3]/aside/section/div[1]/ul/li[1]/a")
		WebElement homelink;*/
		//@FindBy(linkText = "#control-menu-tab")
		//@FindBy(LinkText="//*[@class='fa fa-home']")
		
		// profile image at right side
		@FindBy(id="imgusrProfileDP")
		WebElement profileicon;
		
		//@FindBy(xpath="//*[@id=\"spngtkUserProfileName\"]")
		@FindBy(id="spngtkUserProfileName")
		//@FindBy(xpath="//p[contains(text(),'Sagar Pachipala']")
		WebElement verifyusername;
		// Logout
		@FindBy(id="lnk")
		WebElement signout;
		
		@FindBy(xpath="/html/body/form/div[3]/aside/section/div[2]/div[2]/ul/li[2]/a")
		WebElement Groups;
		
		
		//@FindBy(css="#divGrpAddNew")
		@FindBy(xpath="//*[@id=\"divGrpAddNew\"]")
		//@FindBy(css="html.k-ff.k-ff58 body.skin-blue.sidebar-mini form#formMaster div.wrapper div.row div.col-md-12.no-padding div.col-md-12 div#example.gtkContentMst div.ordersGrid.table-responsive div#content div.KonnectHdr.grpHdr.pageHdrTitle i#divGrpAddNew.fa.fa-plus")
		WebElement GroupsAddNew;
		
		@FindBy(id="grpMsttxtGrpName")
		WebElement Groupname;
		
		@FindBy(id="grpMsttxtGrpDescr")
		WebElement Groupdescription;
		
		//@FindBy()

		// Initializing the Page Objects:
		public HomePage() {
			PageFactory.initElements(driver, this);
		}
		
		//Actions
		public String verifyHomePageTitle(){
			return driver.getTitle();
		}

		/*public String cickonProfilepage() {
			profileicon.click();
			return null;
		}*/

		/*public void clickonsignout() 
		{
			signout.click();
		}
		
		

		public void cickonProfilepage() {
			profileicon.click();
		}*/

		public GroupsPage clickoncloudlink()
		{
			leftcloudlink.click();
			return new GroupsPage();
		}
		
		public GroupsPage clickongroups() {
			Groups.click();
			return new GroupsPage();
			
		}

		public GroupsPage clickonAddnewGroup(){
			
			//driver.switchTo().frame("window_frame");
			//driver.switchTo().frame("GTKCntMstIframe");
			GroupsAddNew.click();
			return new GroupsPage();
		}
		
		
		public void Groupname() {
			
			Groupname.sendKeys("Seleniumgroup");
		}
		
		//public boolean verifyCorrectUserName(){
			//return userNameLabel.isDisplayed();
		//}
		
		//public ContactsPage clickOnContactsLink(){
			//contactsLink.click();
			//return new ContactsPage();
		//}
		
		//public DealsPage clickOnDealsLink(){
			//dealsLink.click();
			//return new DealsPage();
		//}
		
		//public TasksPage clickOnTasksLink(){
			//tasksLink.click();
			//return new TasksPage();
		//}
		
		//public void clickOnNewContactLink(){
			//Actions action = new Actions(driver);
			//action.moveToElement(contactsLink).build().perform();
			//newContactLink.click();
			
		//}
		
			
	
	

}
