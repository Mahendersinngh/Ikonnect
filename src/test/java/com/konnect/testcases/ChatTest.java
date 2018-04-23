/**
 * 
 */
package com.konnect.testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.konnect.base.TestBase;
import com.konnect.pages.ChatPage;
import com.konnect.pages.GroupsPage;
import com.konnect.pages.HomePage;
import com.konnect.pages.LoginPage;
import com.konnect.pages.MyFilesPage;
import com.konnect.pages.MyNotesPage;
import com.konnect.pages.ProjectPage;
import com.konnect.pages.UpdateProjectPage;
import com.konnect.util.TestUtil;

/**
 * @author mahenderd
 *
 */
public class ChatTest extends TestBase {

	LoginPage loginPage;
    HomePage homePage;
    TestUtil testUtil;
    GroupsPage groupspage;
    ProjectPage projectpage;
    MyNotesPage mynotespage;
    MyFilesPage myfilespage;
    ChatPage chatpage;
    UpdateProjectPage updateprojectpage;
    String MyNotesCreation="MyNotesCreation";
    String MyNotesUpdate="MyNotesUpdate";
    String ChatSheet ="Chats";
   
   //String sheetName = "ExistingProject";
   //String SheetName1= "NewProject";
   public ChatTest() {
        super();
    }

   @BeforeClass
   //@BeforeMethod
    public void setup() throws InterruptedException {
        initialization();
        testUtil= new TestUtil();
        /*cloudpage = new Cloudpage();*/
        loginPage= new LoginPage();
        homePage = new HomePage();
        groupspage= new GroupsPage();
        projectpage= new ProjectPage();
        mynotespage = new MyNotesPage();
        updateprojectpage= new UpdateProjectPage();
        myfilespage= new MyFilesPage();
        chatpage = new ChatPage();
        homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        System.out.println("Login Sucessfull");
        Thread.sleep(8000);
        homePage.clickoncloudlink();
        Thread.sleep(4000);
   } 
   
   @Test(priority = 1, description = "***Clicked on Chats Link***")
	public void ClickonChatsLink() {
		homePage.ChatsTab();
		testUtil.SwitchToChatFrame();
		
		}
	
   @DataProvider(name="getDataOfChat")
	public Object[][] getDataOfChat() {
		Object data[][] = TestUtil.getTestData(ChatSheet);
		return data;
	}

	@Test(priority = 2, dataProvider = "getDataOfChat", description = "***Message Sent Successfully with all Fonts..!!!***")
	public void ChatConversation(String ContactName, String AddParticipant, String Message, String Heading,
			String MessageAtUploadFile,String BoldMessage, String ItalicMsg, String UnderLineMsg) throws InterruptedException, AWTException {
		Thread.sleep(2000);
		// Searching the contact Name
		//***chatpage.ClickonSearchField(ContactName);
		//Select the contact from List
		chatpage.SelectContactfromList();
		Thread.sleep(3000);
		//Add Participants
		//chatpage.AddIconinChats(AddParticipant);
		testUtil.SwitchToFrameofTextinChat();
		// Adding only text message and click on OK
		chatpage.AddTextinChatField(Message);
		Robot R = new Robot();
		R.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		R.keyRelease(KeyEvent.VK_ENTER);

	//*************************HEADING********************************************************	
		
			// Heading
			testUtil.switchToParentFrame();
			// Click on Text Format link
			chatpage.TextFormat();
			//Select Heading
			chatpage.SelectHeadingFormat();
			Thread.sleep(2000);
			chatpage.CenterAlignmentLink();
			testUtil.SwitchToFrameofTextinChat();
			chatpage.AddTextinChatField(Heading);
			Thread.sleep(3000);
			R.keyPress(KeyEvent.VK_CONTROL);
			R.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			R.keyRelease(KeyEvent.VK_ENTER);
			R.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(2000);
			testUtil.switchToParentFrame();
			// Click on Text Format link
			chatpage.TextFormat();
			
	//**************************************UPLOADING FILE**************************************
		// Uploading the file
			Thread.sleep(4000);
			chatpage.ClickTextFormat(prop.getProperty("UploadFileinChat"));
			Thread.sleep(2000);
			// Switch to frame to send text
			testUtil.SwitchToFrameofTextinChat();
			// Message in Text
			chatpage.AddTextinChatField(MessageAtUploadFile);
			Thread.sleep(3000);
			R.keyPress(KeyEvent.VK_CONTROL);
			R.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			R.keyRelease(KeyEvent.VK_ENTER);
			R.keyRelease(KeyEvent.VK_CONTROL);
			
	//*****************************SENDING TEXT IN BOLD*******************************************		
			
			// Text Message in Bold
			testUtil.switchToParentFrame();
		    chatpage.TextFormat();
			// Select Bold
			chatpage.SelectBold();
			// Switch to frame to send text in Text Format Body
			testUtil.SwitchToFrameofTextinChat();
			chatpage.AddTextinChatField(BoldMessage+"......");
			Thread.sleep(3000);
			R.keyPress(KeyEvent.VK_CONTROL);
			R.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			R.keyRelease(KeyEvent.VK_ENTER);
			R.keyRelease(KeyEvent.VK_CONTROL);
			
	//**************************SENDING TEXT IN ITALIC*********************************************************
			
			// Text Message in Italic
		     testUtil.switchToParentFrame();
			// Select Italic
			chatpage.SelectItalicIcon();
			//Select Center Alignment
			chatpage.RightAlignmentLink();
			// Switch to frame to send text in Text Format Body
		    testUtil.SwitchToFrameofTextinChat();
			chatpage.AddTextinChatField(ItalicMsg+"...!!!");
			Thread.sleep(3000);
			R.keyPress(KeyEvent.VK_CONTROL);
			R.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			R.keyRelease(KeyEvent.VK_ENTER);
			R.keyRelease(KeyEvent.VK_CONTROL);
			
	//************************SENDING THE TEXT WITH UNDERLINE & BULLET*************************************
			
			// Text Message in UnderlineMsg
		    testUtil.switchToParentFrame();
			// Select Underline
			chatpage.SelectUnderLine();
			//Select Bullet
			chatpage.InsertBulletIcon();
			// Switch to frame to send text in Text Format Body
		    testUtil.SwitchToFrameofTextinChat();
			chatpage.AddTextinChatField(UnderLineMsg);
			//To enter next line
			R.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			R.keyRelease(KeyEvent.VK_ENTER);
			chatpage.AddTextinChatField("Global Trade Management");
			Thread.sleep(1000);
			R.keyPress(KeyEvent.VK_CONTROL);
			R.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			R.keyRelease(KeyEvent.VK_ENTER);
			R.keyRelease(KeyEvent.VK_CONTROL);
			
//************************SENDING THE TEXT WITH POINTS*************************************		
			
			//Text message in points
		    testUtil.switchToParentFrame();
			//Insert Order
			chatpage.OrderedList();
			// Switch to frame to send text in Text Format Body
		    testUtil.SwitchToFrameofTextinChat();
			chatpage.AddTextinChatField("Create and present the project Charter");
			//To enter next line
			R.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			R.keyRelease(KeyEvent.VK_ENTER);
		//---------------------------------------
			chatpage.AddTextinChatField("Manage project scope");
			//To enter next line
			R.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			R.keyRelease(KeyEvent.VK_ENTER);
		//---------------------------------------
			chatpage.AddTextinChatField("Manage Project timelines");
			Thread.sleep(1000);
			R.keyPress(KeyEvent.VK_CONTROL);
			R.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			R.keyRelease(KeyEvent.VK_ENTER);
			R.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(2000);
			testUtil.switchToParentFrame();
			//Click on Text Format link to quit 
			chatpage.TextFormat();
			Thread.sleep(10000);		
	}	

	@Test(priority=3,description="***Downloaded the files in the Chat...!!***")
	public void DownloadFilesinChat() throws InterruptedException, AWTException {
		chatpage.FilesinChat();
	}
	
	@Test(priority=4,description="***Closed Chat Box Successfully...****")
	public void CloseChatTab() throws InterruptedException {
		Thread.sleep(5000);
		testUtil.switchToParentFrame();
		Thread.sleep(2000);
		chatpage.CloseButton();
	}

	
	/*@Test(priority=3,description="Entered Msg & Attached Successfully")
	public void FormatofTheChat() throws AWTException, InterruptedException {
		chatpage.ClickTextFormat(property.getProperty("UploadFileinChat"));
		Thread.sleep(5000);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.cssSelector("span.write-link.send::before"))).build().perform();
		WebElement switchLabel = driver.findElement(By.cssSelector("span.write-link.send"));
		String pseudo = ((JavascriptExecutor)driver)
		        .executeScript("return window.getComputedStyle(arguments[0], ':before').getPropertyValue('sendMessage()');",switchLabel).toString();
		System.out.println(pseudo);
		WebElement web_Element_To_Be_Hovered = driver.findElement(By.cssSelector("span.write-link.send::before"));
		Actions builder = new Actions(driver);
		builder.moveToElement(web_Element_To_Be_Hovered).build().perform();
		//driver.findElement(By.cssSelector("span.write-link.send::before")).click();
		Robot R = new Robot();
		R.keyPress(KeyEvent.VK_CONTROL);
		R.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		R.keyRelease(KeyEvent.VK_ENTER);
		R.keyRelease(KeyEvent.VK_CONTROL);
		
	}*/
	
	@Test(priority=5,description="***Logged out successfully...!!!!***")
	public void Logout() throws InterruptedException {
		testUtil.switchToParentFrame();
		chatpage.LoggedOut();
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}	
	
	
	
}
