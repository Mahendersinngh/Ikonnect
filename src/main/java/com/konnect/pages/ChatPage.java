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
public class ChatPage extends TestBase {


	//Click on search Chat
		@FindBy(xpath="//input[@id='txtSrchChatPeople']")
		WebElement SearchPeopleinChat;
		
		//Select Contact from the list
		//@FindBy(xpath="//li[@class='person']//span[@class='name' and text()='Sudhakar P']")
		@FindBy(xpath="//span[@class='name' and text()=' Sunil  B, Vijay  Hinge, +2']")
		WebElement SelectContact;
		
		//Add Icon to add people
		@FindBy(xpath="//button[@class='btn btn-default dropdown-toggle add_user']")
		WebElement AddButtoninChat;
		
		//Search People to add in Chat
		@FindBy(xpath="//input[@id='txtSrchPeople']")
		WebElement SearchFieldToAddpeople;
		
		//Select the Participant from the List to add into Chat
		@FindBy(xpath="//ul[@class='SrchPeople']//li[@class='person']//span[@class='name' and text()='Vijay Hinge']")
		WebElement AddparticipantFromlist;
		
		//Add Participant to Group
		@FindBy(xpath="//button[@onclick='AddSelectedToGroup();']")
		WebElement AddparticipantToGroup;
		
		//TextArea in Chat
		@FindBy(css="body.chat_editor")
		WebElement TextAreaofChat;
		
		//Click on EMOJi
		//@FindBy(xpath="//span[@class='write-link smiley']")
		@FindBy(css="span#create.write-link.smiley")
		WebElement Emoji;
		
		//Click on Bold
		@FindBy(xpath="//a[@title='Bold']")
		WebElement ClickonBold;
		
		//Click on Italic
		@FindBy(xpath="//a[@title='Italic']")
		WebElement ClickonItalic;
		
		//Click on UderLine
		@FindBy(xpath="//a[@title='Underline']")
		WebElement UnderLine;
		
		//Click on InsertBullet
		@FindBy(xpath="//a[@title='Insert unordered list']")
		WebElement InsertBullet;
		
		//Text Format Link
		@FindBy(xpath="//span[@class='write-link rich_text_a']")
		WebElement TextFormatLink;
		
		//Center Alignment Link
		@FindBy(xpath="//span[@class='k-tool-icon k-icon k-i-align-center']")
		WebElement CenterAlignment;
		
		//Right Alignment Link
		@FindBy(xpath="//span[@class='k-tool-icon k-icon k-i-align-right']")
		WebElement RightAlignment;
		
		//Select Format Dropdown
		@FindBy(xpath="//li[@class='k-tool-group']")
		WebElement SelectFormat;
		
		//Select the font 
		@FindBy(xpath="//li[@class='k-item' and @data-offset-index='3']")
		WebElement HeadingFormat;
		
		//Insert Order
		@FindBy(xpath="//span[@class='k-tool-icon k-icon k-i-list-ordered']")
		WebElement InsertOrder;
		
		//Attach the File in the Chat.
		@FindBy(xpath="//span[@class='write-link attach']")
		WebElement AttachFile;
		
		//Click on Files iCon
		@FindBy(xpath="//div[@class='IndividualChat']//following::div[@class='top']//following::li[@id='liChatTopNamesunilbgtkonnectcom']//following::li[@id='liChatTopNamevijayhgtkonnectcom']//following::li[@id='liChatTopNameSudhakarpgtkonnectcom']//following::li[@id='liChatTopNamevarunkumarkgtkonnectcom']//following::li[@id='liOpenFiles']")
		WebElement Files;
		
		//Click on Checkbox of Files
		@FindBy(xpath="//input[@id='checkBox_files']")
		WebElement CheckboxofFiles;
		
		//Click on Download Button
		@FindBy(xpath="//input[@value='Download']")
		WebElement DownloadButton;
		
		//Close the chat box
		@FindBy(xpath="//div[@class='chatiframe']//a[@class='closebtn']")
		WebElement Closechatbox;
		
		//logout profile link
		@FindBy(xpath="//img[@id='imgusrProfileDP' and @class='img-circle img-usrPrfileDP online']")
		WebElement ClickonprofileIcon;

		//SignoutButton
		@FindBy(xpath="//a[@id='lnk' and @class='btn btn-default btn-flat sign_out_btn']")
		WebElement SignOut;
		

		public ChatPage() {
			PageFactory.initElements(driver, this);
		}
		
		//Click on Search Filed
		public void ClickonSearchField(String ContactName) {
			SearchPeopleinChat.sendKeys(ContactName);
		}
		
		//Select the contact from the list of people
		public void SelectContactfromList(){
			SelectContact.click();
		}

		//Add Button in Chats
		public void AddIconinChats(String AddParticipant) throws InterruptedException {
			AddButtoninChat.click();
			SearchFieldToAddpeople.sendKeys(AddParticipant);
			Thread.sleep(2000);
			AddparticipantFromlist.click();
			Thread.sleep(2000);
			AddparticipantToGroup.click();
		}
		
		//Add Text to chat
		public void AddTextinChatField(String Message) throws InterruptedException {
			/*TextAreaofChat.click();
			Thread.sleep(4000);*/
			TextAreaofChat.sendKeys(Message);
		}
		
		//Click on Emoji Link
		public void EmojiLink() {
			Emoji.click();
		}
		
		//click on Text Format
		public void TextFormat() {
			TextFormatLink.click();
		}
		
		//Select bold in Text
		public void SelectBold() {
			ClickonBold.click();
		}
		
		//Select Italic in Text
		public void SelectItalicIcon() {
			ClickonItalic.click();
		}
		
		//Select Underline in Text
		public void SelectUnderLine() {
			UnderLine.click();
		}
		
		//Insert Bullet in Text
		public void InsertBulletIcon() {
			InsertBullet.click();
		}
		
		//select center Alignment
		public void CenterAlignmentLink() {
			CenterAlignment.click();
		}
		
		//Select Right Alignment
		public void RightAlignmentLink() {
			RightAlignment.click();
		}
		
		//Insert Order list
		public void OrderedList() {
			InsertOrder.click();
		}
		
		//Select Format from Dropdown
		public void SelectHeadingFormat() throws InterruptedException {
			SelectFormat.click();
			Thread.sleep(3000);
			HeadingFormat.click();
		}
		
		//Select Files link and click on Checkbox
		public void FilesinChat() throws InterruptedException, AWTException {
			Files.click();
			Thread.sleep(2000);
			CheckboxofFiles.click();
			Thread.sleep(2000);
			DownloadButton.click();
			Thread.sleep(5000);
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ESCAPE);
			robot.keyRelease(KeyEvent.VK_ESCAPE);
		}
		
		//Click on TextFormat Link
		public void ClickTextFormat(String PathofFile) throws AWTException, InterruptedException {
			AttachFile.click();
			Thread.sleep(2000);
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
		
		//Click on Close button of chat
		public void CloseButton() {
			Closechatbox.click();
		}
		
		//Logout
		public void LoggedOut() throws InterruptedException {
			ClickonprofileIcon.click();
			Thread.sleep(1000);
			SignOut.click();
			}
	
	
	
	
}
