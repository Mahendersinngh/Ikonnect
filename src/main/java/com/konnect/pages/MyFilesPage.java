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
public class MyFilesPage extends TestBase {

	
	//Element of Choose file button	
		@FindBy(xpath="//div[@class='demo-section k-content']")
		WebElement ClickonChooseFileButton;

	//Upload File button
		@FindBy(xpath="//input[@value='Upload file' and @class='btn btn-primary pull-left btn-lg gtkmyfileupload' ]")
		WebElement ClickonUploadButton;
		
	//Select option in My Files
		@FindBy(xpath="//button[@class='btn btn-default btn-sm dropdown-toggle Srchselectclass']")
		WebElement SelectButtoninMyFiles;
		
	//Search Icon in My Files
		@FindBy(xpath="//button[@id='btnsearchfilename']//span[@class='fa fa-search']")
		WebElement SearchIconinMyFiles;
		
	//Search the file name by giving input
		@FindBy(xpath="//input[@id='txtFileNameSearch' and @class='txtFileNameSearch search-box ui-autocomplete-input' ]")
		WebElement Searchfield;

	//Search button 
		@FindBy(xpath="//button[@id='btnfileNameSearch' and @class='btn btn-primary btnfileNameSearch']")
		WebElement SearchButton;
		
	//logout profile link
		@FindBy(xpath="//img[@id='imgusrProfileDP' and @class='img-circle img-usrPrfileDP online']")
		WebElement ClickonprofileIcon;

	//SignoutButton
		@FindBy(xpath="//a[@id='lnk' and @class='btn btn-default btn-flat sign_out_btn']")
		WebElement SignOut;	
		

		public MyFilesPage() {
			PageFactory.initElements(driver, this);
		}
		
	//Choose file Button in MyFiles.	
		public void ChooseFileButton() {
			ClickonChooseFileButton.click();
		}

	//upload file path in My Files.
		public void UploadFileinmyFiles(String PathofFile) throws AWTException, InterruptedException {
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
		
	//Upload file button in My Files.
		public void UploadButton() {
			ClickonUploadButton.click();
		}
		
	//Click on Search icon
		public void SearchIconinMyFiles() throws InterruptedException {
			SearchIconinMyFiles.click();
			Thread.sleep(1000);
			Searchfield.sendKeys("MyFilesIkonnect");
			SearchButton.click();
		}

	//logout
		public void Loggedout() {
			ClickonprofileIcon.click();
			SignOut.click();
		}
			
	
	
	
	
	
	
	
	
	
	
	
	
	
}
