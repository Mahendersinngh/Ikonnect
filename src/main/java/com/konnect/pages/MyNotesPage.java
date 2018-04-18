/**
 * 
 */
package com.konnect.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.konnect.base.TestBase;

/**
 * @author mahenderd
 *
 */
public class MyNotesPage extends TestBase {

	@FindBy(xpath="//*[@id=\"treeviewParentLi_4_M\"]/a/span")
	WebElement MyNotes;
	
	@FindBy(xpath="//button[@class='btn btnAddNote']/i")
	WebElement MyNoteAddbutton;
	

    public MyNotesPage() {
        PageFactory.initElements(driver, this);
    }
  	
	public void ClickonMyNotes() {
		MyNotes.click();
	}
	
	public void ClickonMyNotesADDbutton() {
		MyNoteAddbutton.click();
		
	}
	
	
}
