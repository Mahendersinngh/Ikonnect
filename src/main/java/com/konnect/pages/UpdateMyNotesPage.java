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
public class UpdateMyNotesPage extends TestBase {

	// Searching the Created Notes.
	@FindBy(xpath = "//input[@class='txtNoteSourceSearch validate']")
	WebElement SearchCreatednotes;

	// Clicking on Search Icon.
	@FindBy(xpath = "//span[@class='SearchGTKNote']//i[@class='fa fa-search']")
	WebElement clickonsearchicon;

	// Click on Edit Button
	@FindBy(xpath = "//span[@class='fa fa-pencil noticon' and @title='Edit']")
	WebElement ClickonEdit;

	// Click on Text field to Edit
	@FindBy(xpath = "//input[@type='text' and @name='NoteTitle']")
	WebElement Textfield;

	// Save the Updated field
	@FindBy(xpath = "//span[@title='Save']")
	WebElement Savefield;
	
	//Add Tag to Update
	@FindBy(xpath="//span[contains(text(),'Add Tag')]")
	WebElement AddTagtoUpdate;
	
	// Searching field of the Tag
	@FindBy(xpath = "//input[@id='txtTagNameSearch']")
	WebElement SearchTagField;
	
	//Search Icon
	@FindBy(xpath="//span[@class='fa fa-search tagnamesearch btntagnamesearch']")
	WebElement SearchIconofTag;
	
	//Select Tag
	@FindBy(xpath="//a[@id='atag_57']")
	WebElement SelectTag;
	
	//Add button to add Tags
	@FindBy(xpath="//button[@class='btn btn-primary btnTagAdd MenuNoteSumPopupAssociateTag']")
	WebElement AddtagButton;

	// Search the Notes Title after Editing.
	@FindBy(xpath = "//input[@class='txtNoteSourceSearch validate valid']")
	WebElement SearchFieldafterEdit;
	
	
	public UpdateMyNotesPage() {
		PageFactory.initElements(driver, this);
	}

	// Searching the created Notes.
		public void SearchNotes(String Notes) throws InterruptedException {
			SearchCreatednotes.sendKeys(Notes);
			Thread.sleep(2000);
			clickonsearchicon.click();
		}
		
		//Edit the created Notes
		public void EditNotesTitle(String Notes) throws InterruptedException {
			ClickonEdit.click();
			Thread.sleep(5000);
			Textfield.clear();
			Thread.sleep(2000);
			Textfield.sendKeys(Notes);
			Thread.sleep(2000);
			Savefield.click();
		}	
		//Search the Notes
		public void SearchAfterEdit(String Notes) throws InterruptedException {
			SearchFieldafterEdit.clear();
			SearchCreatednotes.sendKeys(Notes);
			Thread.sleep(1000);
			clickonsearchicon.click();
		}
		
		//Add tag to Update
		public void AddTagtoUpdate() throws InterruptedException {
			AddTagtoUpdate.click();
			Thread.sleep(2000);
			SearchTagField.sendKeys("Analysis");
			SearchIconofTag.click();
			Thread.sleep(1000);
			SelectTag.click();
			Thread.sleep(2000);
			AddtagButton.click();
	
		}
}