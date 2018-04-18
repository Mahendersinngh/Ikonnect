/**
 * 
 */
package com.konnect.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.konnect.base.TestBase;

/**
 * @author mahenderd
 *
 */
public class KonnectionsPage extends TestBase {

	
	
	//  Tset For Logout from Groups
    @FindBy(xpath="//img[@id='imgusrProfileDP']")
    WebElement profileicon;
    // Logout button
    @FindBy(id="lnk")
    WebElement signout;
    //lnk	
	
	// Konnections
    @FindBy(xpath="//div[@id='control-quick-tab']//li[@id='treeviewParentLi_2_M']//following::span[contains(text(),'Konnections')]")
	WebElement Konnections;
    
    //@FindBy(xpath="//*[@id=\"divKonnectAddNew\"]")
    //@FindBy(xpath="//div[@class='pageHdrTitle']//following::i[@id='divKonnectAddNew']")
    @FindBy(css="#divKonnectAddNew")
    WebElement KonnectionAddNewButton;
    
    @FindBy(xpath="//div[@class='col-md-7 dvRecKonnSelectAll']//following::a[text()='Select All']")
    WebElement SelectAll;
    
    @FindBy(xpath="//div[@id='User_13']")
    WebElement VijayUser;
    
    @FindBy(xpath="//div[@id='User_6']")
    WebElement SunilUser;
    
    @FindBy(xpath="//div[@class='col-md-7 dvRecKonnSelectAll']//following::a[text()='Unselect All']")
    WebElement UnSelectAll;
    
    @FindBy(xpath="//input[@id='btnKonnectRecMember']")
    WebElement KonnectButton;
    
    @FindBy(xpath="//div[@id='tabstrip']//following::span[text()='My Konnections']")
    WebElement MyConnections;
    
    @FindBy(xpath="//div[@id='tabstrip']//span[@class='k-loading k-complete']//following::span[text()='All Konnections']")
    //@FindBy(xpath="//div[@id='tabstrip']//following::span[text()='All Konnections']")
    WebElement AllKonnections;
    
    @FindBy(xpath="//div[@class='col-md-12 dvRecKonnSearch']//following::input[@id='RecKonectMemSearch']")
    WebElement SearchField;
    
    @FindBy(xpath="//div[@class='col-md-12 dvRecKonnSearch']//following::span[@class='fa fa-search ml-15 RecKonnectSpnMemSearch']")
    WebElement SearchIcon;
    
    // MouseHover
    @FindBy(xpath="//div[@class='ikp_user_img Ikp_userImageSelect']")
    WebElement MouseHoveronUser;
    ////div[@class='ikp_user_name']//following::span
    
    //Deleted Already connected User
    @FindBy(xpath="//div[@class='box-body konnectMembers KonnMemberList']//following::span[@class='fa fa-close']")
    WebElement DeleteUser;
    
    @FindBy(xpath="//div[@class='sa-confirm-button-container']")
    WebElement AlertOKbutton;
	
    // Cancel Request sent to Other user
    @FindBy(xpath="//div[@class='ikp_user_CancelReq']//span[@class='CancelRequest']")
    WebElement CancelRequest;
    
    @FindBy(xpath="//div[@class='col-md-12 dvMyKonnSearch']//following::input[@id='MyKonectMemSearch']")
    WebElement MyKonnectionSearchfield;
    
    @FindBy(xpath="//div[@class='col-md-12 dvMyKonnSearch']//following::span[@class='fa fa-search ml-15 MyKonnectSpnMemSearch']")
    WebElement MyKonnectionSearchIcon;
    
	@FindBy(xpath="//div[@class='box-body konnectMembers KonnMemberList PenKonnections']//following::ul//li[1]")
	WebElement MyKonnectionAllRequestSentusers;
    
	
	@FindBy(xpath="//div[@class='col-md-2  input-field mtrialDrpdwn']//select[@class='konmMemAllKonFilter']")
	WebElement SelectFilter;
	
	@FindBy(xpath="Another Login")
	WebElement Anotherlogin;
    
    
    
    
    
    
    
    
    
    
    
    
    public KonnectionsPage() {
        PageFactory.initElements(driver, this);
    }
    
    public void clickonKonnections() {
    	Konnections.click();
    }
    
    
    public void ClickonAddNewKonnection() {
    	KonnectionAddNewButton.click();
    }
    
    
    public void ClickonAllKonnections() {
    	//AllKonnections.click();
    	 WebElement ele = driver.findElement(By.xpath("//div[@id='tabstrip']//span[@class='k-loading k-complete']//following::span[text()='All Konnections']"));
         JavascriptExecutor executor = (JavascriptExecutor)driver;
         executor.executeScript("arguments[0].click();", ele);
         //ele.click();
    	
    	
    }
    
    
    public String SearchUsers1(String User1) throws InterruptedException {
    	SearchField.sendKeys(User1);
    	Thread.sleep(1000);
    	SearchIcon.click();
		return User1;
    }
    
    public String SearchUsers2(String User2) throws InterruptedException {
    	SearchField.sendKeys(User2);
    	Thread.sleep(1000);
    	SearchIcon.click();
		return User2;
    }
    
    
    public void ClickonVijayUser() {
    	VijayUser.click();
    }
    public void ClickonSunilUser() {
    	SunilUser.click();
    }
    
    public void ClickonKonnectButton() {
    	KonnectButton.click();
    }
    
    public void ClickonMyKonnections() {
    	MyConnections.click();
    }
   
    public String MyKonnectedRequestSentUser1(String MyKonnectionUser1) throws InterruptedException {
    	MyKonnectionSearchfield.sendKeys(MyKonnectionUser1);
    	Thread.sleep(2000);
    	MyKonnectionSearchIcon.click();
		return MyKonnectionUser1;
    }
    
    public String MyKonnectedRequestSentUser2(String MyKonnectionUser2) throws InterruptedException {
    	MyKonnectionSearchfield.sendKeys(MyKonnectionUser2);
    	Thread.sleep(1000);
    	MyKonnectionSearchIcon.click();
		return MyKonnectionUser2;
    }
    
    
    
    public void Mouseoveruser() throws InterruptedException {
    	//MouseHoveronUser.click();
    	Actions action =new Actions(driver);
    	action.moveToElement(driver.findElement(By.xpath("//div[@class='ikp_user_img Ikp_userImageSelect']")));
    	action.build().perform();
    	//CancelRequest.click();
    	WebElement ele = driver.findElement(By.xpath("//div[@class='ikp_user_CancelReq']//span[@class='CancelRequest']"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele);
    	Thread.sleep(1000);
    	AlertOKbutton.click();
    	
    }
    
    public void VerifyRequestCancellation() {
    	 WebElement Toastmessage = driver.findElement(By.xpath("//div[@class='toast-message']"));
   		System.out.println("Printing : " + Toastmessage.getAttribute("textContent"));
    }

    public void selectAllUsersinAllKonnections() throws InterruptedException {
    	//SelectAll.click();
    	
    	////div[@class='col-md-7 dvRecKonnSelectAll']//following::a[text()='Select All']
    	 WebElement ele = driver.findElement(By.xpath("//div[@class='col-md-7 dvRecKonnSelectAll']//following::a[text()='Select All']"));
         JavascriptExecutor executor = (JavascriptExecutor)driver;
         executor.executeScript("arguments[0].click();", ele);
    	Thread.sleep(2000);
    	UnSelectAll.click();
    	Thread.sleep(2000);
    	SelectAll.click();
    	Thread.sleep(2000);
    	KonnectButton.click();
    	
    }

    public void Verifyrequestsentusers() {
    	MyKonnectionAllRequestSentusers.isDisplayed();
    	
    	WebElement AllUsers = driver.findElement(By.xpath("//div[@class='box-body konnectMembers KonnMemberList PenKonnections']//following::ul//li[1]//div[@class='ikp_user_name']"));
    	System.out.println("Printing : " + AllUsers.getAttribute("textContent"));
    	
    }

    public void selectpendingAcceptance() throws InterruptedException {
    	Select pselect=new Select(driver.findElement(By.xpath("//div[@class='col-md-2  input-field mtrialDrpdwn']//select[@class='konmMemAllKonFilter']")));
    	Thread.sleep(1000);
    	pselect.selectByVisibleText("Pending Acceptance");
    }













}




