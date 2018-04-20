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
	
	// ADD Notes
		@FindBy(xpath = "//button[@class='btn btnAddNote']/i")
		WebElement AddNoteButton;

		// Notes Link
		@FindBy(xpath = "//textarea[@id='txtNoteTile']")
		WebElement NotesName;

		// Source Name Link
		@FindBy(xpath = "//input[@id='txtNoteSource']")
		WebElement Sourcename;

		// Source Notes Link
		@FindBy(xpath = "//textarea[@id='txtNoteDetail']")
		WebElement SourceNotes;

		// User notes link
		@FindBy(xpath = "//textarea[@id='txtUserNote']")
		WebElement UserNote;

		// Tags Link
		@FindBy(xpath = "//input[@id='NoteTag']")
		WebElement Tagslink;

		// Clicking on Create tag link
		@FindBy(xpath = "//div[@class='col-sm-7 p0']//span[@class='create_tag']")
		WebElement CreateTag;

		// Entering the new data of the Tag
		@FindBy(xpath = "//input[@class='txtCreateNewtagName']")
		WebElement InputToCreateTag;

		// Click OK to Create New Tag
		@FindBy(xpath = "//i[@class='fa fa-check-circle CreateNewTag']")
		WebElement ClickToCreatetag;

		// Searching field of the Tag
		@FindBy(xpath = "//input[@id='txtTagNameSearch']")
		WebElement SearchTagField;

		// Selecting the tag from the list
		@FindBy(xpath = "//li[@class='TagNameSelectAutoCompleteData']")
		WebElement SelectTag;

		// Select Tag to Add tag
		@FindBy(xpath = "//a[@id='atag_179']")
		WebElement SelectTagNameToAdd;

		// Add Button of Tags to add the tag
		@FindBy(xpath = "//button[@class='btn btn-primary btnTagAdd MenuNoteSumAssociateTag']")
		WebElement AddButtonofTag;

		// Add Button to save the details of the Notes.
		@FindBy(xpath = "//input[@class='btn-primary gtkPrjMstAddNote']")
		WebElement AddButtonofNotes;

		// Searching the Created Notes.
		@FindBy(xpath = "//input[@class='txtNoteSourceSearch validate']")
		WebElement SearchCreatednotes;

		// Clicking on Search Icon.
		@FindBy(xpath = "//span[@class='SearchGTKNote']//i[@class='fa fa-search']")
		WebElement clickonsearchicon;
		
		//Click on Edit Button
		@FindBy(xpath="//span[@class='fa fa-pencil noticon' and @title='Edit']")
		WebElement ClickonEdit;
		
		//Click on Text field to Edit
		@FindBy(xpath="//input[@type='text' and@name='NoteTitle']")
		WebElement Textfield;
		
		//Save the Updated field
		@FindBy(xpath="//span[@title='Save']")
		WebElement Savefield;
		
		//Search the Notes Title after Editting.
		@FindBy(xpath="//input[@class='txtNoteSourceSearch validate valid']")
		WebElement SearchFieldafterEdit;

		// logout profile link
		@FindBy(xpath = "//img[@id='imgusrProfileDP' and @class='img-circle img-usrPrfileDP online']")
		WebElement ClickonprofileIcon;

		// SignoutButton
		@FindBy(xpath = "//a[@id='lnk' and @class='btn btn-default btn-flat sign_out_btn']")
		WebElement SignOut;


    public MyNotesPage() {
        PageFactory.initElements(driver, this);
    }
  	
	public void ClickonMyNotes() {
		MyNotes.click();
	}
	
	public void ClickonMyNotesADDbutton() {
		MyNoteAddbutton.click();
		
	}
	
	// Entering the details in the Notes.
		public void AddNewNotes(String Notes, String Source, String SorceNote, String UserNotes) throws InterruptedException {
			NotesName.sendKeys(Notes);
			Sourcename.sendKeys(Source);
			SourceNotes.sendKeys(SorceNote);
			UserNote.sendKeys(UserNotes);
			// Clicking on tags link
			Tagslink.click();
			Thread.sleep(2000);
		//To create Tag	
			/*//Click on to Create the Tag.
			CreateTag.click();
			// click Ok to Create Tag.
			Thread.sleep(2000);
			InputToCreateTag.sendKeys(Tags);*/
		}

		
		public void ClickOkToCreateTag() {
			ClickToCreatetag.click();
			
		}
		
		
		public void CreateNewMyNotesTag(String CreateNewMyNotesTag) throws InterruptedException {
			CreateTag.click();
			InputToCreateTag.sendKeys(CreateNewMyNotesTag);
			ClickToCreatetag.click();
			//SearchTagField.click();
			//SelectTag.click();
			//InputToCreateTag.click();
			
			Thread.sleep(2000);
			//InputToCreateTag.sendKeys(CreateNewMyNotesTag);
			
		}	
		
		// Search the tag field
		public void SearchCreatedTag(String ExistingTag) {
			SearchTagField.sendKeys(ExistingTag);
		}

		// Searching & Selecting the Created tag
		public void ClicktoSearchCreatedTag() {
			SearchTagField.click();
			SelectTag.click();
		}

		// Selecting the Tag.
		public void ClickonTagNametoAdd() {
			SelectTagNameToAdd.click();

		}

		// Add button to add Notes
		public void ClickonADDTags() {
			AddButtonofTag.click();
		}

		// Click on Add Notes to save the details
		public void ClickonADDNotes() {
			AddButtonofNotes.click();
		}

		// Searching the created Notes.
		public void SearchNotes(String Notes) throws InterruptedException {
			SearchCreatednotes.sendKeys(Notes);
			Thread.sleep(2000);
			clickonsearchicon.click();
		}
		
		//Edit the created Notes
		public void EditNotesTitle(String NotesTitle) throws InterruptedException {
			ClickonEdit.click();
			Thread.sleep(1000);
			Textfield.clear();
			Thread.sleep(1000);
			Textfield.sendKeys(NotesTitle);
			Thread.sleep(2000);
			Savefield.click();

		}
		
		//Search the Notes
		public void SearchAfterEdit(String NotesTitle) throws InterruptedException {
			SearchFieldafterEdit.clear();
			SearchCreatednotes.sendKeys(NotesTitle);
			Thread.sleep(1000);
			clickonsearchicon.click();
			
		}
	
	
	
	
}
