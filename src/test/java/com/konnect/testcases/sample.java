package com.konnect.testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class sample {

	@FindBy(xpath="//div[@id='control-quick-tab']//li[@id='treeviewParentLi_2_M']//following::span[contains(text(),'Konnections')]")
	WebElement Konnections;
    
    @FindBy(xpath="//div[@class='pageHdrTitle']//following::i[@id='divKonnectAddNew']")
    WebElement KonnectionAddNewButton;
    
    @FindBy(xpath="//div[@class='col-md-7 dvRecKonnSelectAll']//following::a[text()='Select All']")
    WebElement SelectAll;
    
    @FindBy(xpath="//div[@id='User_13']")
    WebElement VijayUser;
    
    
    @FindBy(xpath="//div[@class='col-md-7 dvRecKonnSelectAll']//following::a[text()='Unselect All']")
    WebElement UnSelectAll;
    
    @FindBy(xpath="//input[@id='btnKonnectRecMember']")
    WebElement KonnectButton;
    
    @FindBy(xpath="//div[@id='tabstrip']//following::span[text()='My Konnections']")
    WebElement MyConnections;
    
    @FindBy(xpath="//div[@id='tabstrip']//following::span[text()='All Konnections']")
    WebElement AllKonnections;
    
    @FindBy(xpath="//div[@class='col-md-12 dvRecKonnSearch']//following::input[@id='RecKonectMemSearch']")
    WebElement SearchField;
    
    @FindBy(xpath="//div[@class='col-md-12 dvRecKonnSearch']//following::span[@class='fa fa-search ml-15 RecKonnectSpnMemSearch']")
    WebElement SearchIcon;
    
    // MouseHover
    @FindBy(xpath="//div[@class='ikp_user_img Ikp_userImageSelect']")
    WebElement MouseHoveronUser;
    ////div[@class='ikp_user_name']//following::span
    
    @FindBy(xpath="//div[@class='box-body konnectMembers KonnMemberList']//following::span[@class='fa fa-close']")
    WebElement DeleteUser;
    
    @FindBy(xpath="//div[@class='sa-confirm-button-container']")
    WebElement AlertOKbutton;
	
    
    
 
    
    
    
    
}
