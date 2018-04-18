/**
 * 
 */
package com.konnect.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.konnect.base.TestBase;

/**
 * @author mahenderd
 *
 */
public class UpdateProjectPage extends TestBase {

	
	// For Logout from Groups
    @FindBy(xpath="//img[@id='imgusrProfileDP']")
    WebElement profileicon;
    // Logout button
    @FindBy(id="lnk")
    WebElement signout;
    //lnk
	
	
	@FindBy(xpath="//div[@class='col-sm-2 col-xs-2 probtn p0']//span//i[@class='fa fa-search']")
    //@FindBy(xpath="//*[@id=\"searchfilersDiv\"]/div[2]/div[1]/button/span")
	WebElement ProjectSearchIcon;
	
	@FindBy(xpath="//input[@id='txtprojectsumProjectNameSearch']")
	WebElement ProjectNameSearchinputfield;
	
	@FindBy(xpath="//button[@id='btnprojectsumprojectSearch']")
	WebElement ProjectSearchbutton;
	
	@FindBy(xpath="//img[@class='gtkProjSummaryProjIcon']")
	WebElement MyProjectAftersearch;
	
	@FindBy(xpath="//img[@class='gtkProjSummaryProjIcon']")
	WebElement MyProjectClick;
	
	   
    @FindBy(id="gtkPrjProjectDescription")
    WebElement ProjectDescriptioninputfield;
    
    @FindBy(xpath="//div[@class='input-field']//textarea[@id='gtkPrjProjectDescription']")
    WebElement UpdateProjectDesccrip;
	
	@FindBy(xpath="//div[@class='col-md-11 crlbg']/a[1]")
    @CacheLookup
    WebElement ADDMembers;
      
    @FindBy(xpath="//*[@id=\"gtkCommonMemberLstMemberList1\"]/li[3]/div/span")
    @CacheLookup
    WebElement UnSelectVijayasMember;
    
    @FindBy(xpath="//*[@id=\"MemberLstUser_15\"]")
    WebElement SelectGeethikaasMember;
      
    @FindBy(xpath="//input[@type='button' and @id='gtkCommonbtnMemberSave']")
    @CacheLookup
    WebElement MembersSavebutton;
    // Group Admin Manager
    
    
    @FindBy(xpath="//div[@class='col-md-11 crlbg']/a[2]")
    @CacheLookup
    WebElement ADDManagers;
      
    @FindBy(xpath="//li[@title='Varun K']//span[@class='imgCheck gtkCommonMemberLstManagerList k-state-selected']")
    @CacheLookup
    WebElement DeSelectVarunasAdmin;
    
    @FindBy(xpath="//img[@id='MemberLstUser_14']")
    WebElement SelectSagarGoneasManagers;
      
    @FindBy(xpath="//input[@type='button' and @id='gtkCommonbtnMemberSave']")
    @CacheLookup
    WebElement AdminSavebutton;
      
      
    @FindBy(xpath="//div[@class='col-md-11 crlbg']/a[3]")
    WebElement ADDGroups;
      
    @FindBy(xpath="//div[@id='btnGrpGroupSrch']")
    WebElement GroupSearchIcon;
      
    @FindBy(xpath="//input[@id='memLsttxtGroupNameSearch']")
    WebElement GroupSearchinputTextField;
      
    @FindBy(xpath="//button[@id='grpLstbtnSearch']")
    WebElement GroupSearchButton;
      
    @FindBy(xpath="//li[@class='liMimbersList text-center']")
    WebElement SelectSearchedGroup;
      
    @FindBy(xpath="//input[@type='button' and @id='gtkCommonbtnMemberSave']")
    WebElement GroupsADDbutton;
	
    @FindBy(xpath="//input[@id='priorityNone']")
    WebElement priorityNone;
      
    @FindBy(xpath="//input[@id='priorityLow']")
    WebElement priorityLow;
      
    @FindBy(xpath="//input[@id='priorityMedium']")
    WebElement priorityMedium;
      
    @FindBy(xpath="//input[@id='priorityHigh']")
    WebElement priorityHigh;
    
    @FindBy(xpath="//div[@class='col-md-12 col-sm-12 projviewmodedis']//input[@value='Update']")
    WebElement ProjectUpdatebutton;
   
    @FindBy(xpath="//div[@class='toast-message']")
    WebElement ProjectUpdatedMessage;
    
    
    
    // Update Links
   /* @FindBy(xpath="//li[@class='litablink liprjTab']/a")
    WebElement ProjectLink;*/  
	
	
	
	
	  
    @FindBy(xpath="//li[@class='litablink liprjTab']/a")
    WebElement UpdateProjectLink;
  /*    
    @FindBy(css="#grpsumCreateGrpDiv > div:nth-child(1) > div")
    WebElement LinksCreatebutton;*/
    
    @FindBy(xpath="//div[@class='add_link btnOpenPopup']/i")
	WebElement UpdateandAddNewLinksbutton;
      
    // Link Title Name
    @FindBy(xpath="//div[@class='input-field']/following::textarea[@id='txtLinkTitle']")
    WebElement LinkTitleinputfield;
    // Link Desc
    @FindBy(xpath="//div[@class='input-field']/following::textarea[@id='txtLinkDescr']")
    WebElement LinkDescription;
    // Link Text
    @FindBy(xpath="//div[@class='input-field']/following::textarea[@id='txtLinkSrc']")
    WebElement LinkText;
    // Clicking on New Link Tag Field
    @FindBy(xpath="//input[@id='LinkTag']")
    WebElement LinkNewTagAddnavigation;
    // Adding one More Tag to Link
    
    @FindBy(xpath="//div[@class='proLinktagclick']")
    WebElement ExistinglinkAddTag;
      
    // LinkTag Search/inputfield
    @FindBy(css="#txtTagNameSearch")
    WebElement LinkTaginputSearchfield;
      
    //LinkTag Add New Tag uppon Suggestion
    @FindBy(css=".TagSearchCreateNewTag > a")
    WebElement LinkNewTagCreatesuggestion;
      
    // For Existing  TagSearch
    @FindBy(css="#txtTagNameSearch")
    WebElement LinkTagExistingSearchfield;
      
    //LinkTagSeaarch Icon
    @FindBy(css="span.fa-search")
    WebElement LinkTagSearchIcon;
    // LinkTag display after search
    @FindBy(css="#atag_151")
    WebElement LinkTagSelectsearchedTag;
      
    @FindBy(css=".ulAddedTagstoSpan")
    WebElement LinkTagverifySelected;
      
    @FindBy(css=".btnTagAdd")
    WebElement LinkTagSavebutton;
      
    @FindBy(xpath="//input[@id='gtkPrjMstAddLink']")
    WebElement LinkSaveButton;
      
    @FindBy(xpath="//div[@id='dvQVLinkTitle']")
    WebElement CreatedLink;
     // Finding Edit Links 
    
    @FindBy(xpath="//div[@class='input_search']//input[@name='search']")
	WebElement Linksearchinputfield;
    
    @FindBy(xpath="//div[@class='input_search']//input[@name='search']//following::i[@class='fa fa-search SearchprjLink']")
    WebElement LinkSearchIcon;
    
    @FindBy(xpath="//div[@class='EditLink']")
    WebElement LinkEditbutton;
    
    @FindBy(xpath="//div[@class='col-sm-10 pl15']//input[@id='gtkPrjMstAddLink']")
    WebElement LinkUpdatebutton;
    
    @FindBy(xpath="//div[@id='prjAddLinkImg']//following::i[@class='fa fa-image']")
    WebElement LinkFileUpload;
    
    @FindBy(xpath="//span[@class='pull-right last_mod_date']//span[@id='spnQVLastModifyDate']")
    WebElement LinkUpdatedDate;
    
    // Update Notes
    // Project Notes Link
    @FindBy(xpath="//li[@class='litabnote liprjTab']")
    WebElement ProjectNotes;
  
    // Notes Search input field
    @FindBy(xpath="//input[@class='txtNoteSourceSearch validate']")
    WebElement NotesSearchInputField;
    
    // Notes Search icon 
    @FindBy(xpath="//input[@class='txtNoteSourceSearch validate']/following::i[@class='fa fa-search']")
    WebElement NotesSearchIcon;
    
    
    // Notes Pencil Edit button
    ////*[@id="GTKNoteSumGrid_Task_1"]/table/tbody/tr/td[2]/div/span
    @FindBy(xpath="//span[@class='fa fa-pencil noticon']")
    WebElement NotesPencilEditbutton;
    
    // Notes Name Field
    @FindBy(xpath="//input[@name='NoteTitle']")
    WebElement NotesNamefield;    
    
    @FindBy(xpath="//input[@name='NoteTitle']/following::span[@title='Save']")
    WebElement NoteSavebutton;
    // Notes Add New  Tag
    @FindBy(xpath="//div[@class='taggridl']//div//span[@class='tagtitlestyls']")
    WebElement NotesAddNewTagbutton; 
    
    
    @FindBy(xpath="//input[@type='text' and @id='txtTagNameSearch']")
    //@FindBy(xpath="//input[@id='txtTagNameSearch']")
    WebElement EnterNotesTaginSearchfield;
      
    @FindBy(css="#TagNameSearchsuggesstion-box > ul > li > a")
    WebElement selectNotesCreatenewTag;
      
    @FindBy(xpath="//div[@class='allTags col-md-12 pr20 pl0 dvAddedTagstoSpan']")
    WebElement ClickonNotesoutsidesearchfield;
      
    //@FindBy(xpath="//input[@id='txtTagNameSearch']")
    @FindBy(xpath="//input[@type='text' and @id='txtTagNameSearch']")
    WebElement EnterCreatedNotesTagName;
  
    // Notes Search Icon
    @FindBy(css="#mySidenav > div > div.box-body.pt0 > div.col-sm-12.p0 > div.col-sm-5.dvSearchTag > div > div > span")
    WebElement NotesTagSearchIcon;
      
      
    @FindBy(css=".allTags")
    WebElement ClickbesidesearchedNoteTag;
      
    // TagsBody displayed
    @FindBy(xpath="//div[@class='tags_body']")
    WebElement NoteTagBodydisplaying;
    
    @FindBy(css="#atag_160")
    //@FindBy(xpath="//div[@class='tags_body']")
    WebElement SelectdisplayedNoteTagaftersearch;
      
      
    // Verify Selected Tag is added
      
    @FindBy(css=".ulAddedTagstoSpan")
    WebElement SelectedNotesTagISdisplayingornot;
              
    // Click on ADD button at bottom after selecting Tag
              
    @FindBy(css=".btnTagAdd")
    WebElement NotesTagADDbutton;
     
   @FindBy(xpath="//div[@class='toast-message']")
   WebElement NotesAddedToastMessage;
   
   // Add New NOTE 
   @FindBy(xpath="//button[@class='btn btnAddNote']")
   WebElement NewNoteAddPlusbutton;
   
   // Verify Added Number of tags
   @FindBy(xpath="//div[@class='taggridl']//following::div[@id='notetag']")
   WebElement NumberofTagsAdded;
   
    
    
    // TASK UPDATE
   
   
   @FindBy(linkText="TASKS")
   //@FindBy(xpath="//li[@class='litabtask liprjTab']/a")
   WebElement SelectProjectTasksTab;
   
   //Existing Task Name Search
   @FindBy(xpath="//input[@class='txtPrjTaskAllSearch validate mt5']")
   WebElement TaskNameSearchfield;
   
   //@FindBy(xpath="//input[@class='txtPrjTaskAllSearch validate mt5 valid']//following::i[@class='fa fa-search btnPrjTaskAllSearch']")
   @FindBy(css="#all_tasks > div > div.box-header.p0 > form > span > i") 
   WebElement TaskSearchIcon; 
   
   @FindBy(xpath="//div[@class='divPrjTaskViewSummary']//following::div[@class='product-title clearfix']")
   WebElement SelectSearchedTask;
   
   @FindBy(xpath="//div[@class='input-field']//textarea[@id='gtkPrjTaskDescription']")
   WebElement ProjUpdateTaskDescription;
   
   
   // Task NAme
   @FindBy(xpath="//div[@class='input-field']/following::input[@id='gtkPrjTaskName']")
   WebElement ProjTaskName;
     
   @FindBy(xpath="//div[@class='input-field']/following::textarea[@id='gtkPrjTaskDescription']")
   WebElement ProjTaskDesc;
     
   // Task Calander Start date
   @FindBy(xpath="//input[@id='TaskMstStartDate']")
   WebElement TaskCalanderStartDate;
     
   @FindBy(id="ui-datepicker-div")
   WebElement MouseoverCalendar;
     
   @FindBy(css=".ui-datepicker-days-cell-over")
   WebElement SelectTodaysDateHighlighted;
     
   //Task Calander End Date
   @FindBy(xpath="//input[@id='TaskMstEndDate']")
   WebElement TaskCalanderEndDate;
    
   
   // Slider
   @FindBy(xpath="//div[@id='slidecontainer']")
   WebElement SelectSLider;
   
   
   //Priority Tasks
   // Low Priority
   @FindBy(xpath="//ul[@class='taskPriority mt15']//div[@class='priorityLow']/input[@id='priorityLow']")
   WebElement TaskPriorityLow;
   // Medium
   @FindBy(xpath="//ul[@class='taskPriority mt15']//div[@class='priorityMedium']/input[@id='priorityMedium']")
   WebElement TaskPriorityMedium;
   // High
   @FindBy(xpath="//ul[@class='taskPriority mt15']//div[@class='priorityHigh']/input[@id='priorityHigh']")
   WebElement TaskPriorityHigh;
     
   // Tag Add field
   @FindBy(xpath="//div[@class='input-field1']//input[@id='GtkMstTasktags']")
   WebElement TaskAddTagfield;
     
   // Task Tag Search New inputfield
   @FindBy(xpath="//div[@class='input-field mt0']/input[@type='text']")
   WebElement TaskNewTagSearchinputfield;
     
   // Task New Tag Suggested 
     
   @FindBy(css="#TagNameSearchsuggesstion-box > ul > li > a")
   WebElement TaskNewTagCreatesuggestion;
     
   // Task Search Existing Tag input searchfield
   @FindBy(css="#txtTagNameSearch")
   WebElement TaskExistingTagSearchinputfield;
     
   // Task Search Icon fro existing Tag
   @FindBy(css="span.fa-search")
   WebElement TaskTagSearchIcon;


   // Task Tag display after search
     
     
   @FindBy(xpath="//a[text()='SeleniumTAG5']")
   //@FindBy(css="#atag_151")
   //@FindBy(xpath="//div[@class='tags_body']")
   WebElement SelectdisplayedTaskTagaftersearch;
     
   @FindBy(css="#atag_151")
   WebElement TaskTagSelectsearchedTag;
             
   @FindBy(css=".ulAddedTagstoSpan")
   WebElement TaskTagverifySelected;
             
   @FindBy(css=".btnTagAdd")
   WebElement TaskTagSavebutton;
        
     
   @FindBy(css=".taskMstAddMemberCount")
   //@FindBy(xpath="//div[@class='col-sm-11 crlbg']//a[@class='btn btn-circle taskMstAddMember']/span[@class='bFon taskMstAddMemberCount taskMstAddMemberCount_1']")
   WebElement AddTaskMembers;
     
   //unable to clikc with image id
   //@FindBy(xpath="//img[@id='MemberLstUser_13']")
   //Tried with Id xpath
   @FindBy(xpath="//*[@id=\"MemberLstUser_13\"]")
   WebElement SelectVijayasTaskMember;
     
   @FindBy(xpath="//input[@type='button' and @id='gtkCommonbtnMemberSave']")
   WebElement MembersTaskSavebutton;
     
   @FindBy(xpath="//div[@class='demo-section k-content']//div[@class='k-button k-upload-button']//input[@id='prjtaskFiles_1']")
   WebElement TaskFileUpload;

   // Task UPDATE SAVE button
  @FindBy(xpath="//div[@class='col-md-12 pb15 dvprjtaskadd']//input[@class='btn btn-primary btn-lg gtkPrjAddTask' and @value='Update']")
  WebElement ProjectTaskSaveButton;
   // TaksNotes  
  @FindBy(linkText="Notes")
  WebElement TaskNotesLink;
  
  
  // Notes Search Field
  @FindBy(xpath="//div[@class='input-field DvNoteSourceSearch']//input[@class='txtNoteSourceSearch validate']")
  WebElement NotesSearchinputfield;
  
  @FindBy(xpath="//div[@id='GTKNoteSumGrid_Task_1']//input[@name='NoteTitle']")
  WebElement TaskNotesName;
  
  @FindBy(xpath="//*[@id=\"notes_tasks\"]/div/div[1]/div/span/i")
  WebElement TaskNotesSearchIcon;
  
  @FindBy(xpath="//*[@id=\"GTKNoteSumGrid_Task_1_active_cell\"]/span[1]")
  WebElement TaskNotesNameSavebutton;
  @FindBy(xpath="//div[@id='GTKNoteSumGrid_Task_1']//div[@class='taggridl']//div//span[@class='tagtitlestyls']")
  WebElement TaskNoteAddTag;
  
     // Task Not Create New Button
  @FindBy(xpath="//button[@id='btnCreatenote']")
  WebElement TaskNoteCreatebutton;
  // Task Link 
  @FindBy(linkText="Links")
  WebElement TaskLink;
  
  @FindBy(xpath="//div[@class='input_search']//input[@name='search']")
  WebElement UpdateTaskLinkSearchinputfield;
  
  @FindBy(xpath="//div[@class='input_search']//following::i[@class='fa fa-search SearchprjLink']")
  WebElement UpdateTaskSearchIcon;
  
  @FindBy(xpath="//div[@class='EditLink']")
  WebElement UpdateTaskEditLink;
  
  
  // Task Link Create button
  @FindBy(xpath="//div[@class='add_link btnOpenPopup btn btn-primary btnCss  ml20']")
  WebElement TaskLinkCreateNewButton;
  // Task Discussion Tab
  
  //@FindBy(xpath="//a[@class='btntabTaskComment']")
  
  @FindBy(linkText="Discussions")
  //@FindBy(xpath="//div[@class='nav-tabs-custom task_tabs_custom']//ul[@class='nav nav-tabs']//a[@class='btntabTaskComment']")
  WebElement TaskDiscussionTab;
  
  // FILES UPDATE
  
  
//Project FILES Tab
  //@FindBy(linkText="FILES")
  @FindBy(xpath="//a[@class='btntabprojectFiles']")
  WebElement ProjectFilesTab;
  
  
     /* @FindBy(xpath="//a[@class='btntabprojectFiles']")
      WebELement ProjectFilesTab;*/
  
  @FindBy(xpath="//button[@id='btnsearchfilename']")
  WebElement FileSearchIcon;
  
  @FindBy(xpath="//input[@id='txtFileNameSearch']")
  WebElement FileSearchInputField;
  
  @FindBy(xpath="//button[@id='btnfileNameSearch']")
  WebElement FileSearchbutton;
  
  @FindBy(xpath="//div[@class='customer-name']")
  WebElement DisplayedFileAfterSearch;
  
  @FindBy(xpath="//button[@class='btn btn-default btn-sm dropdown-toggle Srchselectclass']")
  WebElement SelectButton;
  
  @FindBy(xpath="//li[@id='btndownloadicon']")
  WebElement SelectFileDownloadIcon;
  
  @FindBy(xpath="//div[@id='PrjsumFilegrid']//input[@name='FileID']")
  WebElement SelectFileCheckbox;
  
  @FindBy(xpath="//i[@class='fa fa-download mt5']")
  WebElement FileDownloadbutton;
  
  @FindBy(xpath="//ul[@class='dropdown-menu mt5']/li[@id='btndeleteicon']")
  WebElement FileDeletebutton;
  
  @FindBy(xpath="//span[@id='btnfiledelete']/i")
  WebElement FileDeleteIcon;
  
  @FindBy(xpath="//div[@class='sa-button-container']/div[@class='sa-confirm-button-container']")
  WebElement DeleteConfirmOKbutton;
  
  // xpath=//div[@id='toast-container']//div//div[contains(text(),'Attachment deleted sucessfully')]
  //xpath=//div[contains(text(),'Attachment deleted sucessfully')]
  @FindBy(xpath="//div[@class='toast-message']")
  WebElement DeletesuccessToastmessage;
     
     

    
	
    public UpdateProjectPage() {
        PageFactory.initElements(driver, this);
    }
  	
	public void ClickonExistingProjectSearchIcon() {
		//ProjectSearchIcon.click();
		
		WebElement ele = driver.findElement(By.xpath("//div[@class='col-sm-2 col-xs-2 probtn p0']//span//i[@class='fa fa-search']"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele);
		
	}
	
	public String ExistingProjectNameSearchinputfied(String ProjectName) {
		ProjectNameSearchinputfield.sendKeys(ProjectName);
		return ProjectName;
	}
	
	
	
	public String ExistingProjectNameSearchinputfied1(String ProjectName) {
		ProjectNameSearchinputfield.sendKeys(ProjectName);
		return ProjectName;
	}
	
	
	
		
	/*public String ProjectDescription(String ProjectDescription ) {
		ProjectDescriptioninputfield.sendKeys(ProjectDescription);
		return ProjectDescription;
	}*/
	public void UpdateProjectDesc() throws InterruptedException {
		
		driver.findElement(By.xpath("//div[@class='input-field']//textarea[@id='gtkPrjProjectDescription']")).sendKeys(Keys.chord(Keys.CONTROL, "a",Keys.DELETE),"Updated desccription");
		
		
		/*UpdateProjectDesccrip.click();
		UpdateProjectDesccrip.clear();
		//UpdateProjectDesccrip.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);
		UpdateProjectDesccrip.sendKeys("Testchange");*/
		/*
		 WebElement Description = driver.findElement(By.xpath("//div[@class='input-field']//textarea"));
		 Description.clear();
		 Description.sendKeys("Updated ProjectDescription");
		 Description.sendKeys(Keys.TAB);	*/
		
		
	}
	
	public void ClickonProjecTsearchbutton() {
		ProjectSearchbutton.click();
	}

	public boolean VerifySearchedProject() {
		//MyProjectAftersearch.isDisplayed();
		if( driver.findElement(By.xpath("//img[@class='gtkProjSummaryProjIcon']")).isDisplayed()){
            System.out.println("Existing Project is Displayed");
            }else{
            System.out.println("Existing Project is NOT Displayed");
            }
        return false;	
	}
	
	
	public void ClickonSearchedProject() {
		MyProjectClick.click();
	}

	
	public void clickonTaskCalendarEndDate() {
        
        //driver.findElement(By.id("prjMstEndDate_1")).click();
        WebElement dateBox = driver.findElement(By.xpath("//input[@id='prjMstEndDate_1']"));
        dateBox.clear();
        dateBox.sendKeys("06/30/2018");
        dateBox.sendKeys(Keys.TAB);
    }
	
	 public void ClickonAddNEWMemberstoUpdate() throws InterruptedException {
         
         /*Actions action =new Actions(driver);
         action.moveToElement(ADDMembers).build().perform();
         ADDMembers.click();*/
           
         WebElement ele = driver.findElement(By.xpath("//div[@class='col-md-11 crlbg']/a[1]"));
         JavascriptExecutor executor = (JavascriptExecutor)driver;
         executor.executeScript("arguments[0].click();", ele);
         Thread.sleep(3000);
         UnSelectVijayasMember.click();
         Thread.sleep(2000);
         SelectGeethikaasMember.click();
         Thread.sleep(2000);
         MembersSavebutton.click();
       
     }	
	
	 
	 public void ClickonAdminstoUpdate() throws InterruptedException {
         
         /*Actions action =new Actions(driver);
         action.moveToElement(ADDMembers).build().perform();
         ADDMembers.click();*/
           
         WebElement ele = driver.findElement(By.xpath("//div[@class='col-md-11 crlbg']/a[2]"));
         JavascriptExecutor executor = (JavascriptExecutor)driver;
         executor.executeScript("arguments[0].click();", ele);
         Thread.sleep(3000);
         DeSelectVarunasAdmin.click();
         Thread.sleep(2000);
         SelectSagarGoneasManagers.click();
         Thread.sleep(2000);
         AdminSavebutton.click();
           
     }
	 
	 
	 public void ClickonAddNEWGroups() throws InterruptedException {
         
         /*Actions action =new Actions(driver);
         action.moveToElement(ADDMembers).build().perform();
         ADDMembers.click();*/
           
         WebElement ele = driver.findElement(By.xpath("//div[@class='col-md-11 crlbg']/a[3]"));
         JavascriptExecutor executor = (JavascriptExecutor)driver;
         executor.executeScript("arguments[0].click();", ele);
         Thread.sleep(3000);
         GroupSearchIcon.click();
	 }
	 
	 
	 
	 public void GroupSearchText(String ExistingGroupMemberselection ) throws InterruptedException {
         
	        GroupSearchinputTextField.sendKeys(ExistingGroupMemberselection);
	          
	          
	    }
	  public void SearchandUpdateGroups() throws InterruptedException {
          
	        GroupSearchButton.click();
	        Thread.sleep(3000);
	        SelectSearchedGroup.click();
	        Thread.sleep(2000);
	        GroupsADDbutton.click(); 
	 
	  }
	
	  
	  public void SelectPriority() {
          
		  priorityHigh.click();
		  /*priorityMedium.click();
          priorityLow.click();
          priorityNone.click();*/
      }
	  
	  
	  public void UpdateProjectbutton() {
		  WebElement ele = driver.findElement(By.xpath("//div[@class='col-md-12 col-sm-12 projviewmodedis']//input[@value='Update']"));
	         JavascriptExecutor executor = (JavascriptExecutor)driver;
	         executor.executeScript("arguments[0].click();", ele);
	         //Thread.sleep(3000);
		  //ProjectUpdatebutton.click();
	  }
	  
	  
	  public void VerifyProjectUpdated() {
		  WebElement Toastmessage = driver.findElement(By.xpath("//div[@class='toast-message']"));
  		System.out.println("Printing : " + Toastmessage.getAttribute("textContent"));
	  }
	  
	  
	  
	  // Update Project LINKS
	  public void clickonUpdateNewLink() {
		  UpdateandAddNewLinksbutton.click();
	  }
	  
	  public void LinkSearch(String LinkTitleName) throws InterruptedException {
		  Linksearchinputfield.sendKeys(LinkTitleName);
		  Thread.sleep(2000);
		  LinkSearchIcon.click();
	  }
	 
	  public void ClickonEditLink() {
		  LinkEditbutton.click();
	  }
	  
	  
	  public void ClickonLinksTabtoUpdate() {
		  UpdateProjectLink.click();
	  }
	  public void UpdateNewProjectLinkdetails() {
		  /*LinkTitleinputfield.clear();
		  LinkTitleinputfield.sendKeys(UpdateNewLinkTitle);*/
		  LinkDescription.clear();
          LinkDescription.sendKeys("UpdateLinKDesc");
          LinkText.clear();
          LinkText.sendKeys("LINK=http://gtkonnect.com");
		   
            
      }
	  
	  
	  public void Linkuploadfile(String linkupdateImageIconupload) throws InterruptedException, AWTException {
		  
	
      	
		  WebElement ele = driver.findElement(By.xpath("//div[@id='prjAddLinkImg']//following::i[@class='fa fa-image']"));
		    JavascriptExecutor executor = (JavascriptExecutor)driver;
		    executor.executeScript("arguments[0].scrollIntoView();",ele);
		    ele.click();
		    
		    StringSelection ss = new StringSelection(linkupdateImageIconupload);
		    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		    Robot robot = new Robot();
		    // Press Enter
            robot.keyPress(KeyEvent.VK_ENTER); 
           // Release Enter
            robot.keyRelease(KeyEvent.VK_ENTER); 
             // Press CTRL+V
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
           // Release CTRL+V
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);
            Thread.sleep(1000);        
             //Press Enter 
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
	  }
	  
	  
	  
	  public void ClikconOnLinkUpdate() {
		  LinkSaveButton.click();
	  }
	  
	  public void VerifyLinkUpdateDate() {

	 		WebElement UpdatedDate = driver.findElement(By.xpath("//span[@class='pull-right last_mod_date']//span[@id='spnQVLastModifyDate']"));
	 		System.out.println("Printing Link Updated Date : " + UpdatedDate.getAttribute("textContent"));
	  }
	  
	  public void ClickonExistingLinkAddTag() {
		  ExistinglinkAddTag.click();
	  }
	  
	  
	  
	  public void UpdateProjectNotesTab() {
		  ProjectNotes.click();
	  }
	  
	  
	  
	  // Trying to pul notes name from Created Notes
	  
	  
	  
	  
	  public String TestsamplePullNotesSearchinputfield(String Notesname) throws InterruptedException {
		  
		/* NotesSearchInputField.sendKeys(Notesname);
		 Thread.sleep(2000);
		 NotesSearchIcon.click();*/
		 
		 return Notesname;
	  
	  }
	  
	  /// Sample
	  
	  public String PullNotesSearchinputfield(String Notesname) throws InterruptedException {
		  	NotesSearchInputField.sendKeys(Notesname);
			 Thread.sleep(2000);
			 NotesSearchIcon.click();
			 
			 
			 return Notesname;
	  }
	  
	  
	  public String NotesSearchinputfield(String Notesname) throws InterruptedException {
		  
		 NotesSearchInputField.sendKeys(Notesname);
		 Thread.sleep(2000);
		 NotesSearchIcon.click();
		 return Notesname;
	  
	  }
	  
	  public String EditandUpdatenotesName() throws InterruptedException {
		  NotesPencilEditbutton.click();
		  Thread.sleep(3000);
		  NotesNamefield.clear();
		  Thread.sleep(2000);
		  NotesNamefield.sendKeys("ProjectNotesUpdated");
		  Thread.sleep(2000);
		  NoteSavebutton.click();
		return null;
		
	  
	  }
	  
	  
	 public void ClickonNewNoteTagAdd() {
		 NotesAddNewTagbutton.click();
	 }
	  
	 public void EnterExistingNotesTagName() throws InterruptedException
     {
     	EnterCreatedNotesTagName.clear();
     	EnterCreatedNotesTagName.sendKeys("NotesTag");
         Thread.sleep(3000);
         NotesTagSearchIcon.click();
         ClickbesidesearchedNoteTag.click();
         if( driver.findElement(By.xpath("//div[@class='tags_body']")).isDisplayed()){
             System.out.println("TagsBody is Visible");
             }else{
             System.out.println("TagsBody is InVisible");
             }
     }
	  
	 public void SelectandaddNoteTag() throws InterruptedException {
         SelectdisplayedNoteTagaftersearch.click();
         if( driver.findElement(By.cssSelector(".ulAddedTagstoSpan")).isDisplayed()){
             System.out.println("Tag is Selected");
             }else{
             System.out.println("Tag is  NOT Selected");
             }
         Thread.sleep(3000);
         NotesTagADDbutton.click();
           
     } 
	  
	 public void VerifyNotesTagAdded() {
 		
 		WebElement Toastmessage = driver.findElement(By.xpath("//div[@class='toast-message']"));
 		System.out.println("Printing : " + Toastmessage.getAttribute("textContent"));
 		
 		/*String expectedMessage = "Attachment deleted sucessfully";
 		String message = driver.findElement(By.xpath("//div[@class='toast-message']")).getText();
 		Assert.assertTrue("Attachment is not Deleted", message.contains(expectedMessage));	
 		*/
 		
 		//DeletesuccessToastmessage.getText();
 	}
 	  
	public void NewNotesAddplus() {
		NewNoteAddPlusbutton.click();
	}
	  
	// Update Task
	public void SearchTaskName(String ExistingTaskName) throws InterruptedException {
		TaskNameSearchfield.sendKeys(ExistingTaskName);
		Thread.sleep(2000);
		//TaskSearchIcon.click();
		
	}
	  
	
	public void ClickonTaskSearchIcon() {
		TaskSearchIcon.click();
	}
	public void ClickonSearchedTask() {
		//  //div[@class='product-title clearfix'] 
		//  //div[@class='divPrjTaskViewSummary']//following::div[@class='product-title clearfix']
		/*WebElement ele = driver.findElement(By.xpath("//div[@class='product-title clearfix']"));
	    JavascriptExecutor executor = (JavascriptExecutor)driver;
	    executor.executeScript("arguments[0].scrollIntoView();",ele);
	    ele.click();*/
	    

	       if( driver.findElement(By.xpath("//div[@class='product-title clearfix']")).isDisplayed()){
	           System.out.println("Searched Task is displayed to Update");
	           }else{
	           System.out.println("Searched Task is NOT displayed to Update");
	           }  
		
		
	    WebElement ele = driver.findElement(By.xpath("//div[@class='product-title clearfix']"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele); 
		
		//SelectSearchedTask.click();
	}
	  
	public void UpdateTaskDescript() {
		ProjUpdateTaskDescription.clear();
		ProjUpdateTaskDescription.sendKeys("TaskUpdated");
	}
	  
	  public void UpdateTaskCalendarEndDate() {
          
          //driver.findElement(By.id("prjMstEndDate_1")).click();
          WebElement dateBox = driver.findElement(By.xpath("//input[@id='TaskMstEndDate']"));
          dateBox.clear();
          dateBox.sendKeys("06/30/2018");
          dateBox.sendKeys(Keys.TAB);
      }  
	  
	  
	  public void SelectTaskPriority() {
          //TaskPriorityLow.click();
          //TaskPriorityMedium.click();
          //TaskPriorityHigh.click();
          
          WebElement ele = driver.findElement(By.xpath("//*[@id=\"dvoverview_tasks\"]/div/div[1]/div[6]/ul/li[4]/div"));
          JavascriptExecutor executor = (JavascriptExecutor)driver;
          executor.executeScript("arguments[0].click();", ele);
          ele.click();
          
         /* WebElement ele = driver.findElement(By.xpath("//ul[@class='taskPriority mt15']//div[@class='priorityHigh']/input[@id='priorityHigh']"));
		    JavascriptExecutor executor = (JavascriptExecutor)driver;
		    executor.executeScript("arguments[0].scrollIntoView();",ele);
		    ele.click(); */
          
          
            
      }  
	  
	  

      public void UpdateTaskDragandDropSlider() {
      	
      	
     /* WebElement From = driver.findElement(By.xpath("//div[@id='slidecontainer']"));
      	 
		WebElement To = driver.findElement(By.xpath("//span[@id='gtkTaskProgessbar']"));
 
		  Actions builder = new Actions(driver);
 
 	      Action dragAndDrop = builder.clickAndHold(From).moveToElement(To).release(To).build();
 
		  dragAndDrop.perform();*/
      	
      	
      	 //Working but the value is not correct which is in pixels 30=62
      	//WebElement slider = driver.findElement(By.xpath("//div[@id='slider']/span"));
      	//WebElement slider = driver.findElement(By.cssSelector("#TaskProgressRange"));
      	/*WebElement slider = driver.findElement(By.cssSelector("#slidecontainer"));
      	Actions move = new Actions(driver);
          Action action = (Action) move.dragAndDropBy(slider, 30, 0).build();
          action.perform();  	*/
      	
      	// Working fine 20=50
      	Actions dragger = new Actions(driver);
      	WebElement draggablePartOfScrollbar = driver.findElement(By.cssSelector("#slidecontainer"));
      	int numberOfPixelsToDragScrollBarSide=50;
      	//int numberOfPixelsToDragTheScrollbarDown = 5000;
      	dragger.moveToElement(draggablePartOfScrollbar).clickAndHold().moveByOffset(0,numberOfPixelsToDragScrollBarSide).release().perform();	
      	
      	
      }
	  
	  
	  
	  
	  
	  public void TaskFileUpload(String UpdateTaskFileUpload) throws InterruptedException, AWTException {
          	
		  	WebElement ele = driver.findElement(By.xpath("//div[@class='col-sm-12 no-padding mt20']//div[@class='k-widget k-upload k-header k-upload-sync k-upload-empty']//div[@class='k-button k-upload-button']"));
		    JavascriptExecutor executor = (JavascriptExecutor)driver;
		    executor.executeScript("arguments[0].scrollIntoView();",ele);
		    ele.click();
		    
		    StringSelection ss = new StringSelection(UpdateTaskFileUpload);
		    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		    Robot robot = new Robot();
		    robot.keyPress(KeyEvent.VK_CONTROL);
		    robot.keyPress(KeyEvent.VK_V);
		    robot.keyRelease(KeyEvent.VK_V);
		    robot.keyRelease(KeyEvent.VK_CONTROL);
		    robot.keyPress(KeyEvent.VK_ENTER);
		    robot.keyRelease(KeyEvent.VK_ENTER);
	  }
	  
	 public void UpdateTask() {
		 
		 ////div[@class='col-md-12 pb15 dvprjtaskadd']//input[@class='btn btn-primary btn-lg gtkPrjAddTask' and @value='Update']
		 
		 //ProjectTaskSaveButton.click();
		 
		  WebElement ele = driver.findElement(By.xpath("//div[@class='col-md-12 pb15 dvprjtaskadd']//input[@class='btn btn-primary btn-lg gtkPrjAddTask' and @value='Update']"));
          JavascriptExecutor executor = (JavascriptExecutor)driver;
          executor.executeScript("arguments[0].click();", ele);
          //ele.click();
		 
	 }
	  
	  public void ClickonTaksNotes() {
		  //TaskNotesLink.click();
		  
		  WebElement ele = driver.findElement(By.linkText("Notes"));
          JavascriptExecutor executor = (JavascriptExecutor)driver;
          executor.executeScript("arguments[0].click();", ele);
		  
	  }
	  
	  
	  public void ClearSearchedNote() throws InterruptedException {
		  NotesSearchinputfield.clear();
	  }
	  
	  public void SearchandSelectTaskNotes(String Notesname) throws InterruptedException {
		  NotesSearchinputfield.sendKeys(Notesname);
		  TaskNotesSearchIcon.click();
		  Thread.sleep(3000);
		  NotesPencilEditbutton.click(); 
		  
		 // Working 
		  /*public void SearchandSelectTaskNotes(String ExistingTaskNotesName) throws InterruptedException {
			  NotesSearchinputfield.sendKeys(ExistingTaskNotesName);
			  TaskNotesSearchIcon.click();
			  Thread.sleep(3000);
			  NotesPencilEditbutton.click(); 
		  */
	  }
	  
	  public void updateTaskNoteSearchandEdit() throws InterruptedException {
		  TaskNotesSearchIcon.click();
		  Thread.sleep(3000);
		  
	  }
	  
	  public void clickonEditbutton() {
		  NotesPencilEditbutton.click();
	  }
	  public void EnterNewTaskNotesNameandSave() throws InterruptedException {
		//div[@id='GTKNoteSumGrid_Task_1']//input[@name='NoteTitle']
		  TaskNotesName.clear();
		  TaskNotesName.sendKeys("UpdatedTaskNote");
		  Thread.sleep(2000);
		  TaskNotesNameSavebutton.click();
		  
	  }
	  
	  public void AddTaskNotesTag() {
		  TaskNoteAddTag.click();
	  }
	  
	  
	  
	  public void clickonTaskLink() {
		  TaskLink.click();
	  }

	  public void EnterTaskSearchField(String LinkTitleName) {
		  UpdateTaskLinkSearchinputfield.sendKeys(LinkTitleName);
	  }
	  
	  public void UpdateTaskLinkSearchIcon() {
		  UpdateTaskSearchIcon.click();
	  }
	  
	  public void TasklinkEditbutton() {
		  UpdateTaskEditLink.click();
	  }
	  // Task Link Update
	  public String UpdateProjectTaskLinkdetails() {
		  /*LinkTitleinputfield.clear();
		  LinkTitleinputfield.sendKeys("UpdatedNewLinkTitle");*/
		  LinkDescription.clear();
          LinkDescription.sendKeys("UpdatedLinKDesc");
          LinkText.clear();
          LinkText.sendKeys("http://gtkonnect.com");
		return null;
          
            
      }
	  
// Files Verification Updated
	  
	  public void ClickonFilesTab() {
	        
      	WebElement ele = driver.findElement(By.xpath("//a[@class='btntabprojectFiles']"));
          JavascriptExecutor executor = (JavascriptExecutor)driver;
          executor.executeScript("arguments[0].click();", ele);
      	
      	//ProjectFilesTab.click();
      	
      }
      
      public void SearchProjectTaskFileUpload() throws InterruptedException {
      	FileSearchIcon.click();
      	Thread.sleep(2000);
      	FileSearchInputField.sendKeys("ProjectTaskFileUpload");
      	Thread.sleep(3000);
      	FileSearchbutton.click();
      }
      
     public void VerifyProjectFile() {
  	  
         if( driver.findElement(By.xpath("//div[@class='customer-name']")).isDisplayed()){
             System.out.println("TaskFileUpload is displayed");
             }else{
             System.out.println("TaskFileUpload is NOT displayed");
             }  
     }
  	   
  	 public void clickonSelectbutton() throws InterruptedException { 
  		 SelectButton.click();
  		 Thread.sleep(2000);
  		 SelectFileDownloadIcon.click();
  		
     }
     
  	 
  	public void SelectandDownloadFile() throws InterruptedException {
  		SelectFileCheckbox.click();
  		Thread.sleep(3000);
  		FileDownloadbutton.click();
  	}
      
  	public void SelectandDeleteFile() throws InterruptedException {
  		
  		SelectButton.click();
  		Thread.sleep(3000);
  		FileDeletebutton.click();
  		
  	}
  	
  	
  	public void DeleteFileIcon() throws InterruptedException {
  		FileDeleteIcon.click();
  		Thread.sleep(5000);
  		DeleteConfirmOKbutton.click();
  		
  		
  	}
  	
  	
  	public void VerifyDeletedFile() {
  		
  		WebElement Toastmessage = driver.findElement(By.xpath("//div[@class='toast-message']"));
  		System.out.println("Printing : " + Toastmessage.getAttribute("textContent"));
  		
  		/*String expectedMessage = "Attachment deleted sucessfully";
  		String message = driver.findElement(By.xpath("//div[@class='toast-message']")).getText();
  		Assert.assertTrue("Attachment is not Deleted", message.contains(expectedMessage));	
  		*/
  		
  		//DeletesuccessToastmessage.getText();
  	}
  	
	  
	  public LoginPage Logout() {
			profileicon.isDisplayed();
			profileicon.click();
			signout.click();
			return new LoginPage();
		}
		
}
