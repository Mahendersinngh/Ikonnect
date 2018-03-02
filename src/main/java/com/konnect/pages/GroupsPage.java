/**
 * 
 */
package com.konnect.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.konnect.base.TestBase;

/**
 * @author mahenderd
 *
 */
public class GroupsPage extends TestBase {

	

	@FindBy(xpath="//*[@id=\"divGrpAddNew\"]")
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
	
	@FindBy(id="Grouptags")
	WebElement AddTagsfield;
	
	@FindBy(xpath="//*[@id=\"TagNameSearchsuggesstion-box\"]/ul")
	WebElement EnterTaginSearchfield;
	
	@FindBy(xpath="//*[@id=\"mySidenav\"]/div/div[2]/div[2]")
	WebElement SearchSuggestion;
	

	
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
	public void createNewGroup(String Groupname, String GroupDescription){
		
		
		GroupName.sendKeys(Groupname);
		Groupdescription.sendKeys(GroupDescription);
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
	
	
}