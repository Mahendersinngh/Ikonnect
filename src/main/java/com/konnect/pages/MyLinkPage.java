/**
 * 
 */
package com.konnect.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.konnect.base.TestBase;

/**
 * @author mahenderd
 *
 */
public class MyLinkPage extends TestBase {

	
	//Click on Add My links Icon
		@FindBy(xpath="//span[@class='add_link my_add_link btnOpenPopup']//i[@class='fa fa-plus']")
		WebElement AddMyLinks;

	//Title link
		@FindBy(xpath="//textarea[@id='txtLinkTitle' and @class='txtLinkTitle materialize-textarea']")
		WebElement TitleoftheLink;

	//Description Link
		@FindBy(xpath="//textarea[@id='txtLinkDescr' and @class='txtLinkDescr materialize-textarea']")
		WebElement DescriptionLink;
		
	//Enter the Link details
		@FindBy(xpath="//textarea[@id='txtLinkSrc' and @class='txtLinkSrc materialize-textarea']")
		WebElement Link;
		
	//Tags link
		@FindBy(xpath="//input[@id='LinkTag' and @class='LinkTag LinkTagsList']")
		WebElement TagsinLinks;
		
	// Clicking on Create tag link
		@FindBy(xpath = "//div[@class='col-sm-7 p0']//span[@class='create_tag']")
		WebElement CreateTag;

	// Entering the new data of the Tag
		@FindBy(xpath = "//input[@class='txtCreateNewtagName']")
		WebElement InputToCreateTag;

	// Click OK to Create New Tag
		@FindBy(xpath = "//i[@class='fa fa-check-circle CreateNewTag']")
		WebElement ClickToCreatetag;

	//Search Tags
		@FindBy(xpath="//input[@id='txtTagNameSearch' and @class='txtTagNameSearch search-box ui-autocomplete-input']")
		WebElement SearchTags;

	//Search Icon in links
		@FindBy(xpath="//span[@class='fa fa-search tagnamesearch btntagnamesearch']")
		WebElement SearchButton;
		
	//Select Tag(Static)
		@FindBy(xpath="//a[@id='atag_57']")
		WebElement SelectTag;
		
	//Add tags
		@FindBy(xpath="//button[@class='btn btn-primary btnTagAdd LinkCrAssociateTag']")
		WebElement AddButtonofTags;

	//UploadImage
		@FindBy(xpath="//div[@id='prjAddLinkImg']//i[@class='fa fa-image']")
		WebElement UploadImage;
		
	//Search the Link
		@FindBy(xpath="//input[@class='txtLinkvalidate validate']")
		WebElement SearchCreatedLinks;
		
	//Search Icon 
		@FindBy(xpath="//i[@class='fa fa-search SearchprjLink']")
		WebElement ClickonSearchIcon;
		
	//Add Button of Links
		@FindBy(xpath="//input[@id='gtkPrjMstAddLink']")
		WebElement AddLinkDetails;
		
		
	//******************* To Update My Links*****************************
		
		//Edit the Link	
		@FindBy(xpath = "//ul[@class='list_view']//div[@class='EditLink']")
		WebElement EditLink;

		// Select tag to Update new (Static)
		@FindBy(xpath = "//a[@id='atag_66']")
		WebElement SelectTagtoUpdate;

		// Select the tag which is adding directly against the Link
		@FindBy(xpath = "//a[@id='atag_137']")
		WebElement SelectTagDirectlyAtLink;

		// Add button of tags when tags adding directly against the link
		@FindBy(xpath = "//button[@class='btn btn-primary btnTagAdd LinkAssociateTag']")
		WebElement AddButtonofTagsAgainstlink;

		// Update button in Links
		@FindBy(xpath = "//input[@id='gtkPrjMstAddLink' and @value='Update']")
		WebElement UpdateLink;

		// Add tag Link against the Link directly
		@FindBy(xpath = "//ul[@class='list_view']//div[@class='proLinktagclick']")
		WebElement AddtagLinkatListview;

		// Delete Icon link against the Link
		@FindBy(xpath = "//ul[@class='list_view']//div[@class='DeleteLink']")
		WebElement DeleteLink;

		public MyLinkPage() {
			PageFactory.initElements(driver, this);
		}
		
	//Clicking on Add My Links Icon	
		public void clickonAddMyLinks() {
			AddMyLinks.click();
		}

	//Enter all the details of Links
		public void AddLinkDetails(String Title,String Desc,String link) throws InterruptedException {
			TitleoftheLink.sendKeys(Title);
			DescriptionLink.sendKeys(Desc);
			Link.sendKeys(link);
			Thread.sleep(1000);
			TagsinLinks.click();
		}
		
	// Creation of tags
		public void Creationoftags(String NewTag) throws InterruptedException {
			// Click on to Create the Tag.
			CreateTag.click();
			// click Ok to Create Tag.
			Thread.sleep(2000);
			InputToCreateTag.sendKeys(NewTag);
			ClickToCreatetag.click();
		}
		
		//Search Created Tag
		public void SearchTag(String ExistingTag) {
			SearchTags.sendKeys(ExistingTag);
			SearchButton.click();
			SelectTag.click();
			AddButtonofTags.click();
		}

	//Upload Image in My Links	
		public void UploadImageinlinks(String PathofFile) throws AWTException, InterruptedException {
			UploadImage.click();
			StringSelection ss = new StringSelection(PathofFile);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(1000);
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
		
	//Click on Add Button to save the details of links.	
		public void ClickonAddButtonoflinkDetails() {
			AddLinkDetails.click();
		}

	//Searching the created links.	
		public void SearchwithLinkName(String Title) {
			SearchCreatedLinks.sendKeys(Title);
			ClickonSearchIcon.click();
		}
		
	//************************** To Udpate My Links***********	
		
		//Edit link the created Link
			public void ClickingonEditLink() {
				EditLink.click();
			}
			
		//Updating the Title of the link
		public void UpdateTitleName(String Title) throws InterruptedException {
			TitleoftheLink.clear();
			Thread.sleep(1000);
			TitleoftheLink.sendKeys(Title);
		}
			

		//Add tags to update the Links
			public void AddTagstoUpdate() {
				TagsinLinks.click();
				SearchTags.sendKeys("Bookmark");
				SearchButton.click();
				SelectTagtoUpdate.click();
				AddButtonofTags.click();
			}
			
		//Updating the Link
			public void UpdateLinkDetails() {
				UpdateLink.click();
			}
			
		//adding the tags directly
			public void AddTagsAgainstLink() throws InterruptedException {
				AddtagLinkatListview.click();
				Thread.sleep(2000);
				SearchTags.sendKeys("Documents");
				SearchButton.click();
				SelectTagDirectlyAtLink.click();
				AddButtonofTagsAgainstlink.click();
			}
			
		//Deleting the links
			public void DeleteLinks() throws InterruptedException, AWTException {
				DeleteLink.click();
				Thread.sleep(2000);
				Robot R= new Robot();
				R.keyPress(KeyEvent.VK_ENTER);
				R.keyRelease(KeyEvent.VK_ENTER);
			}

		
	
	
}
