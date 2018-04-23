package com.konnect.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
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
		@FindBy(css=".fa-cloud")
		@CacheLookup
		//@FindBy(xpath="/html/body/form/div[3]/aside/section/div[1]/ul/li[2]/a")
		WebElement leftcloudlink;
		
		
		@FindBy(id="mstLiSettings")
		WebElement leftsettings;
		
		//Homelink at Left panel
		@FindBy(id="mstLiTradeindexTab")
		WebElement lefthomelink;
		
		/*@FindBy(xpath="/html/body/form/div[3]/aside/section/div[1]/ul/li[1]/a")
		WebElement homelink;*/
		//@FindBy(linkText = "#control-menu-tab")
		//@FindBy(LinkText="//*[@class='fa fa-home']")
		

		@FindBy(xpath="//img[@id='imgusrProfileDP']")
		WebElement profileicon;
		
		//@FindBy(xpath="//*[@id=\"spngtkUserProfileName\"]")
		@FindBy(id="spngtkUserProfileName")
		//@FindBy(xpath="//p[contains(text(),'Sagar Pachipala']")
		WebElement verifyusername;
		// Logout
		@FindBy(id="lnk")
		WebElement signout;
		//lnk
		
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
		
		
		@FindBy(xpath="//*[@id=\"treeviewParentLi_3_M\"]/a/span")
		@CacheLookup
		WebElement Projects;
		
		@FindBy(xpath="//div[@id='control-quick-tab']//li[@id='treeviewParentLi_2_M']//following::span[contains(text(),'Konnections')]")
		WebElement Konnections;
		
		
		//Click on MyNotes Tab
		@FindBy(xpath="//*[@id=\"treeviewParentLi_4_M\"]/a/span")
		WebElement MyNotes;
		
		//Click on MyNotes Tab
		@FindBy(xpath = "//li[@id='treeviewParentLi_4_M']")
		WebElement MyNoteslink;

	//Click on MyFiles tab.
		@FindBy(xpath="//li[@id='treeviewParentLi_11_M']")
		//@FindBy(xpath="//div[@id='control-quick-tab']//following::ul[@class='sidebar-menu']//following::span[contains(text(),'My Files')]")
		WebElement MyFilespagelink;
		
	//Click on Chat Tab.
		@FindBy(xpath="//li[@id='treeviewParentLi_10_M']")
		WebElement ChatLink;
		
		
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
		
		
		public LoginPage verifyprofileicon() {
			profileicon.isDisplayed();
			profileicon.click();
			return new LoginPage();
		}
		

		public LoginPage logout() {
			profileicon.click();
			signout.click();
			return null;
			
		}
		

		public GroupsPage clickoncloudlink()
		{
			leftcloudlink.click();
			return new GroupsPage();
		}
		
		public void clickoncloudlink2()
		{
			leftcloudlink.click();
			List<WebElement> alllinks =driver.findElements(By.cssSelector(".fa-cloud"));
	        String a[]=new String[alllinks.size()];
	        for(int i=0;i<alllinks.size();i++)
	        {
	            a[i]=alllinks.get(i).getText(); 
	            if(a[i].startsWith("c"))
	            {
	                System.out.println("clicking on this link::"+driver.findElement(By.cssSelector(".fa-cloud")).getText());
	                driver.findElement(By.cssSelector(".fa-cloud")).click();  

	            }
	            else
	            {
	                System.out.println("does not starts with c so not clicking");
	            }
	        }
			
			
		}
		
		
		public ProjectPage clickoncloudlink1()
		{
			
			leftcloudlink.click();
			return new ProjectPage();
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
		
		
		public void ClickonMyNotes() {
			MyNotes.click();
		}
		

		public ProjectPage clickonProjects() {
			Projects.click();
			return new ProjectPage();
		}	
	
	
		//click on MyFilesTab
		public MyFilesPage MyFilesTab() {
			MyFilespagelink.click();
			return new MyFilesPage();
		}
		
	//Click on Chats Tab
		public ChatPage ChatsTab() {
			ChatLink.click();
			return new ChatPage();
		}
		
	/*//Click on My Tasks Tab.	
		public MyTasksPage MyTaskstab() {
			WebElement ele = driver.findElement(By.xpath("//*[@id='treeviewParentLi_13_M']/a"));
		    JavascriptExecutor executor = (JavascriptExecutor)driver;
		    executor.executeScript("arguments[0].click();", ele);    
		    return new MyTasksPage();
		}*/
		
	//Click on My Links tab	
		public MyLinkPage MyLinkstab() {
			WebElement ele = driver.findElement(By.xpath("//*[@id='treeviewParentLi_12_M']/a"));
		    JavascriptExecutor executor = (JavascriptExecutor)driver;
		    executor.executeScript("arguments[0].click();", ele);    
		    return new MyLinkPage();
		}
		
		
		
		
		 public void clickonKonnections() {
		    	Konnections.click();
		    }

}
