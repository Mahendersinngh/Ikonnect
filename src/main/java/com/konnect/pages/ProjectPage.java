/**
 * 
 */
package com.konnect.pages;
  
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
  
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
  
import com.konnect.base.TestBase;
  
import junit.framework.Assert;
  
/**
 * @author mahenderd
 *
 */
public class ProjectPage extends TestBase {
  
    // For Logout from Groups
        @FindBy(xpath="//img[@id='imgusrProfileDP']")
        WebElement profileicon;
        // Logout button
        @FindBy(id="lnk")
        WebElement signout;
        //lnk
        
        // Try sibling -- //div[@id='control-quick-tab']//following::span[contains(text(),'Projects')]
        @FindBy(xpath="//div[@id='control-quick-tab']//following::span[contains(text(),'Projects')]")
       //@FindBy(xpath="//*[@id=\"treeviewParentLi_3_M\"]/a/span")
        @CacheLookup
        WebElement Projects;
  
        //Customized paths
        //@FindBy(xpath="//div[@class='col-sm-6 pl0']/i[@id='divprojectAddNew']")
        @FindBy(xpath="//*[@id=\"divprojectAddNew\"]")
        @CacheLookup
        //@FindBy(css="html.k-ff.k-ff58 body.skin-blue.sidebar-mini form#formMaster div.wrapper div.row div.col-md-12.no-padding div.col-md-12 div#example.gtkContentMst div.ordersGrid.table-responsive div#content div.KonnectHdr.grpHdr.pageHdrTitle i#divGrpAddNew.fa.fa-plus")
        WebElement ProjectsAddNew;
      
        @FindBy(id="gtkPrjProjectName")
        WebElement ProjectName;
          
        @FindBy(id="gtkPrjProjectDescription")
        WebElement ProjectDescription;
          
        @FindBy(id="prjMstStartDate_1")
       
        WebElement ProjCalanderStartDate;
     
        @FindBy(id="prjMstEndDate_1")
        WebElement ProjCalanderEndDate;
          
        @FindBy(xpath="//input[@id='priorityNone']")
        WebElement priorityNone;
          
        @FindBy(xpath="//input[@id='priorityLow']")
        WebElement priorityLow;
          
        @FindBy(xpath="//input[@id='priorityMedium']")
        WebElement priorityMedium;
          
        @FindBy(xpath="//input[@id='priorityHigh']")
        WebElement priorityHigh;
          
          
        @FindBy(xpath="//input[@id='Projecttags']")
        WebElement AddTagsfield;
          
        @FindBy(xpath="//input[@type='text' and @id='txtTagNameSearch']")
        //@FindBy(xpath="//input[@id='txtTagNameSearch']")
        WebElement EnterTaginSearchfield;
          
        @FindBy(xpath="//a[text()='Create Tag']")
        WebElement selectCreatenewTag;
          
        @FindBy(xpath="//div[@class='allTags col-md-12 pr20 pl0 dvAddedTagstoSpan']")
        WebElement Clickonoutsidesearchfield;
          
        //@FindBy(xpath="//input[@id='txtTagNameSearch']")
        @FindBy(xpath="//input[@type='text' and @id='txtTagNameSearch']")
        WebElement EnterCreatedTagName;
      
        // search Icon
        @FindBy(xpath="//span[@class='fa fa-search tagnamesearch btntagnamesearch']")
          
        WebElement TagSearchIcon;
          
        @FindBy(css="#TagNameSearchsuggesstion-box > ul")
        WebElement SelectAutodisplayTag;
          
        // Just Click beside searchedTag
        @FindBy(xpath="//div[@class='allTags col-md-12 pr20 pl0 dvAddedTagstoSpan']")
        WebElement ClickbesidesearchedTag;
          
        // TagsBody displayed
        @FindBy(xpath="//div[@class='tags_body']")
        WebElement TagBodydisplaying;
          
          
        // Select Searched tag after search
          
        @FindBy(xpath="//a[text()='SeleniumTAG5']")
        //@FindBy(xpath="//div[@class='tags_body']")
        WebElement SelectdisplayedTagaftersearch;
          
          
          
          
        // Verify Selected Tag is added
          
        @FindBy(xpath="//ul[@class='ulAddedTagstoSpan']")
        WebElement SelectedTagISdisplayingornot;
          
        // Click on ADD button at bottom after selecting Tag
          
        @FindBy(xpath="//button[text()='ADD']")
        WebElement TagADDbutton;
          
        //@FindBy(xpath="//span[@class='bFon grpMstAddMemberCount grpMstAddMemberCount_2']")
        @FindBy(xpath="//div[@class='col-md-11 crlbg']/a[1]")
        @CacheLookup
        WebElement ADDMembers;
          
        @FindBy(xpath="//*[@id=\"MemberLstUser_13\"]")
        @CacheLookup
        WebElement SelectVijayasMember;
          
        @FindBy(xpath="//input[@type='button' and @id='gtkCommonbtnMemberSave']")
        @CacheLookup
        WebElement MembersSavebutton;
          
          
        @FindBy(xpath="//div[@class='col-md-11 crlbg']/a[2]")
        @CacheLookup
        WebElement ADDManagers;
          
        @FindBy(xpath="//img[@id='MemberLstUser_2']")
        @CacheLookup
        WebElement SelectVarunasAdmin;
          
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
          
        @FindBy(xpath="//input[@id='prjFiles_1']")
        WebElement ProjectFileUploadbutton;
          
        //@FindBy(xpath="//input[@id='prjFiles_1']")
        @FindBy(xpath="//*[@id=\"prjFiles_1\"]")
        //@FindBy(xpath="//div[@class='k-button k-upload-button']/input")
        WebElement ProjectFileUploadbutton1;
          
        // Click on CreateNew Button
        @FindBy(xpath="//input[@type='button']")
        WebElement ProjectCreatebutton;
          
          
          
          
          
          
        // Project Notes Link
        @FindBy(xpath="//li[@class='litabnote liprjTab']")
        WebElement ProjectNotes;
          
        @FindBy(xpath="//button[@id='btnCreatenote']")
        WebElement NotesNewCreateButton;
          
        @FindBy(xpath="//div[@class='input-field']/following::textarea[@id='txtNoteTile']")
        WebElement NotesName;
          
        @FindBy(xpath="//div[@class='input-field']/following::input[@id='txtNoteSource']")
        WebElement NotesSource;
          
          
        @FindBy(xpath="//div[@class='input-field']/following::textarea[@id='txtNoteDetail']")
        WebElement NotesDetailSource;
          
        @FindBy(xpath="//div[@class='input-field']/following::textarea[@id='txtUserNote']")
        WebElement NotesUserNote;
          
        //ADD Notes TAG
        //@FindBy(xpath="//div[@class='dvNotesumTaglist']/following::input[@id='NoteTag']")
        @FindBy(css="#NoteTag")
        WebElement NotesAddTagbutton;
          
          
        // Tag Search box
          
          
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
          
          
        // Select Searched tag after search
          
        @FindBy(css="#atag_151")
        //@FindBy(xpath="//div[@class='tags_body']")
        WebElement SelectdisplayedNoteTagaftersearch;
          
          
        // Verify Selected Tag is added
          
        @FindBy(css=".ulAddedTagstoSpan")
        WebElement SelectedNotesTagISdisplayingornot;
                  
        // Click on ADD button at bottom after selecting Tag
                  
        @FindBy(css=".btnTagAdd")
        WebElement NotesTagADDbutton;
          
        @FindBy(css="#gtkPrjMstAddNote")
        WebElement NotesADDbutton;
          
        // After Creating Notes
        //Verify Added Notes
          
        @FindBy(css=".OpenLink")
        WebElement NoteSourceLinkdisplayed;
          
          
          
          
          
        // Project LINK
          
        @FindBy(xpath="//li[@class='litablink liprjTab']/a")
        WebElement ProjectLink;
          
        @FindBy(css="#grpsumCreateGrpDiv > div:nth-child(1) > div")
        WebElement LinksCreatebutton;
          
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
          
        
          
        // Select Project Discussion
        //@FindBy(css=".btntabprojectDiscussion")
        @FindBy(xpath="//a[@class='btntabprojectDiscussion']")
        WebElement SelectProjectDiscussionTab;
          
        @FindBy(css="#A_0")
        WebElement DiscussionAttachmentIcon;
          
        @FindBy(xpath="//div[@class='k-button k-upload-button']//input[@id='cmntUpldFilesStatic']")
        WebElement DiscussionFileBrowsebutton;
          
          
          
        ////body[@autocorrect='off' and @contenteditable='true']
        // xpath = //div[@class='cmntDrpZone']/div/div/div/div/input
        //@FindBy(xpath="//*[@id=\"comments\"]/div/table/tbody/tr[2]/td/iframe")
       
        // xpaht below and not correct -- //div[@class='k-resize-handle']/preceding::textarea[@id='txtComment']
        //@FindBy(xpath="//iframe[@cd_frame_id_='ae9dbe573bed089db1ad9c594c60f94b']")
        //@FindBy(xpath="//div[@id='comments']//following::tr//td[@role='presentation']")
        
        @FindBy(xpath="html//body[@autocorrect='off' and @contenteditable='true' ]")
        //@FindBy(xpath="//div[@id='comments']")
        WebElement DiscussionCommnetsField;
          
       // Pree=eding -- //div[@class='k-resize-handle']/preceding::textarea[@id='txtComment']/preceding::iframe   
          
        //@FindBy(xpath="//div[@class='col-md-12 no-padding']//div[@id='Tags']/following::img[@class='SendComm']")
        @FindBy(css="#S0")
        WebElement DiscussionPostButton;
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
        // Select Project Task TAb
        
        @FindBy(linkText="TASKS")
        //@FindBy(xpath="//li[@class='litabtask liprjTab']/a")
        WebElement SelectProjectTasksTab;
          
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

        
       @FindBy(xpath="//div[@class='col-md-12 pb15 dvprjtaskadd']//input[@class='btn btn-primary btn-lg gtkPrjAddTask' and @value='ADD']")
       WebElement ProjectTaskSaveButton;
        // TaksNotes  
       @FindBy(linkText="Notes")
       WebElement TaskNotesLink;
          // Task Not Create New Button
       @FindBy(xpath="//button[@id='btnCreatenote']")
       WebElement TaskNoteCreatebutton;
       // Task Link 
       @FindBy(linkText="Links")
       WebElement TaskLink;
      
       // Task Link Create button
       @FindBy(xpath="//div[@class='add_link btnOpenPopup btn btn-primary btnCss  ml20']")
       WebElement TaskLinkCreateNewButton;
       // Task Discussion Tab
       
       //@FindBy(xpath="//a[@class='btntabTaskComment']")
       
       @FindBy(linkText="Discussions")
       //@FindBy(xpath="//div[@class='nav-tabs-custom task_tabs_custom']//ul[@class='nav nav-tabs']//a[@class='btntabTaskComment']")
       WebElement TaskDiscussionTab;
       
       
       
       
       // Project FILES Tab
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
          
          
      
        public ProjectPage() {
            PageFactory.initElements(driver, this);
        }
      
  
        public ProjectPage clickonProjects() {
            //Projects.click();
            WebElement ele = driver.findElement(By.xpath("//div[@id='control-quick-tab']//following::span[contains(text(),'Projects')]"));
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            executor.executeScript("arguments[0].click();", ele);
            ele.click();
            ////div[@id='control-quick-tab']//following::span[contains(text(),'Projects')]
            
            return new ProjectPage();
        }
      
        public ProjectPage clickonAddnewProject(){
              
            //driver.switchTo().frame("window_frame");
            //driver.switchTo().frame("GTKCntMstIframe");
            ProjectsAddNew.click();
            return new ProjectPage();
        }
      
        // For New Project Creation
        public String createNewProject(String projectnameexcel,String projectdescriptionexcel){
              
            ProjectName.sendKeys(projectnameexcel);
            ProjectDescription.sendKeys(projectdescriptionexcel);
            return null;
           
        }
          
        /*//Existing Project Selection
        public void SearchExistingProject(String Existinggroup) {
                      
                }*/
          
          
    /*public void clickonCalendarStarDate(String TodaysDate) {
        ProjCalanderStartDate.sendKeys(TodaysDate);
    }*/
          
    public void clickonCalendarStartDate() {
        /*WebElement dateBox = driver.findElement(By.id("prjMstStartDate_1"));
        dateBox.sendKeys("03/08/2018");
        dateBox.sendKeys(Keys.TAB);*/
          
          
        driver.findElement(By.id("prjMstStartDate_1")).click();
        WebElement   datepicker = driver.findElement(By.id("ui-datepicker-div"));  
        List<WebElement> rows=  datepicker.findElements(By.tagName("tr"));  
        List<WebElement> columns= datepicker.findElements(By.tagName("td"));
          
        // Not Working for in both FF and Chrome
       // datepicker.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight']")).click();
          
        // working for FF
        //datepicker.findElement(By.cssSelector("#ui-datepicker-div > table > tbody > tr:nth-child(2) > td.ui-datepicker-days-cell-over.ui-datepicker-today")).click();
          
          
        //working for FireFox
        //datepicker.findElement(By.cssSelector(".ui-datepicker-days-cell-over")).click();
         
        WebElement ele = driver.findElement(By.cssSelector(".ui-datepicker-days-cell-over"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele);
                       /* for (WebElement cell: columns){  
                            //Select 20th Date   
                            if (cell.getText().equals("9")){  
                                cell.findElement(By.xpath("9")).click();   
                                    break;
                                      
                                    if (cell.getText().equals(today){  
                                       
                                        cell.click();
                                          
                                        //cell.findElement(By.cssSelector(".ui-datepicker-days-cell-over")).click();   
                                          break;
                                      
                                      
                                      
                            }  
                                }   
          
        */
      
    }
      
      
      
    public void clickonCalendarEndDate() {
          
        //driver.findElement(By.id("prjMstEndDate_1")).click();
        WebElement dateBox = driver.findElement(By.id("prjMstEndDate_1"));
        dateBox.sendKeys("12/31/2018");
        dateBox.sendKeys(Keys.TAB);
          
        /*WebElement Enddate = driver.findElement(By.id("ui-datepicker-div"));
          
        Enddate.findElement(By.cssSelector(".ui-datepicker-next")).click();*/
          
          
          
          
          
    }
      
      
      
      
    public void clikconAddNewTaG() {
          
        WebElement ele = driver.findElement(By.xpath("//input[@id='Projecttags']"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele);
          
          
        /*
        Actions action =new Actions(driver);
        action.moveToElement(AddTagsfield).build().perform();
        action.click();*/
        //AddTagsfield.click();
          
    }
      
    public String EnterprojectTagName(String projecttagname) {
        EnterTaginSearchfield.sendKeys(projecttagname);
        return projecttagname;
    }
      
    public void clickonoutsidesearchtab() {
        Clickonoutsidesearchfield.click();
    }
      
    //Create New Tag Filter upon New Name
    public void clickoncreateNewTag() {
          
        Actions action =new Actions(driver);
        action.moveToElement(selectCreatenewTag).build().perform();
        selectCreatenewTag.click();
    }
      
    // After Creating New Tag Searching tag with name
        public String verifyEnterCreatedTagName(String SearchCreatedTagName) {
            EnterCreatedTagName.sendKeys(SearchCreatedTagName);
            return SearchCreatedTagName;
        }
      
        // Tag Search icon
        public void ClickonSearchIcon() {
            TagSearchIcon.click();
        }
        // Tag search with Auto Filter -- Not Working
        public void selectonAutodisplayTag() {
            SelectAutodisplayTag.click();
        }
  
        public void clikconbesidesearchedTag() {
            ClickbesidesearchedTag.click();
        }
          
        public void verifyTagsBodydisplayed() {
            TagBodydisplaying.isDisplayed();
            //TagBodydisplaying.getAttribute("link");
        }
          
          
          
        public void selectTagAftersearch() {
        SelectdisplayedTagaftersearch.click();  
          
        }
  
        public boolean verifydisplayedTagisSelected() {
             SelectedTagISdisplayingornot.isDisplayed();
             return false;      
              
        }
  
        public void clickonTagADDbutton() {
            TagADDbutton.click();
        }
  
        public void ClickonAddNEWMembers() throws InterruptedException {
              
            /*Actions action =new Actions(driver);
            action.moveToElement(ADDMembers).build().perform();
            ADDMembers.click();*/
              
            WebElement ele = driver.findElement(By.xpath("//div[@class='col-md-11 crlbg']/a[1]"));
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            executor.executeScript("arguments[0].click();", ele);
            Thread.sleep(2000);
            SelectVijayasMember.click();
            Thread.sleep(1000);
            MembersSavebutton.click();
  
          
        }
  
          
          
        public void ClickonAddNEWManagers() throws InterruptedException {
              
            /*Actions action =new Actions(driver);
            action.moveToElement(ADDMembers).build().perform();
            ADDMembers.click();*/
              
            WebElement ele = driver.findElement(By.xpath("//div[@class='col-md-11 crlbg']/a[2]"));
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            executor.executeScript("arguments[0].click();", ele);
            Thread.sleep(2000);
            SelectVarunasAdmin.click();
            Thread.sleep(1000);
            AdminSavebutton.click();
              
        }
          
          
          
        public void ClickonAddNEWGroups() throws InterruptedException {
              
            /*Actions action =new Actions(driver);
            action.moveToElement(ADDMembers).build().perform();
            ADDMembers.click();*/
              
            WebElement ele = driver.findElement(By.xpath("//div[@class='col-md-11 crlbg']/a[3]"));
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            executor.executeScript("arguments[0].click();", ele);
            Thread.sleep(2000);
            GroupSearchIcon.click();
              
            //GroupSearchinputTextField.sendKeys("Junit19");
            /*Thread.sleep(2000);
            GroupSearchButton.click();
            Thread.sleep(3000);
            SelectSearchedGroup.click();
            Thread.sleep(2000);
            GroupsADDbutton.click();*/
        }
          
          
    public void GroupSearchText(String ExistingGroupMemberselection ) throws InterruptedException {
          
        GroupSearchinputTextField.sendKeys(ExistingGroupMemberselection);
          
          
    }
          
    public void SearchandAddGroups() throws InterruptedException {
          
        GroupSearchButton.click();
        Thread.sleep(2000);
        SelectSearchedGroup.click();
        Thread.sleep(1000);
        GroupsADDbutton.click();
          
          
    }
      
        public void SelectPriority() {
            priorityMedium.click();
            /*priorityHigh.click();
            priorityLow.click();
            priorityNone.click();*/
        }
  
     
        public void BrowseProjectFile(String ProjectLevelProjectTabFileUpload) throws InterruptedException, AWTException {
             WebElement elementToClick = driver.findElement(By.xpath("//div[@class='col-md-12 no-padding PrjMstAttachmentsdiv']//div[@class='k-widget k-upload k-header k-upload-sync k-upload-empty']//div[@class='k-button k-upload-button']"));
          // Scroll the browser to the element's Y position
          ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,"+elementToClick.getLocation().y+")");
          // Click the element
           elementToClick.click();   
         
           /*
 		  WebElement ele = driver.findElement(By.xpath("//div[@id='prjAddLinkImg']//following::i[@class='fa fa-image']"));
 		    JavascriptExecutor executor = (JavascriptExecutor)driver;
 		    executor.executeScript("arguments[0].scrollIntoView();",ele);
 		    ele.click();*/
 		    
 		    StringSelection ss = new StringSelection(ProjectLevelProjectTabFileUpload);
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
          
        
        // CREATE NEW PROJECT button
        public void ClickonCreateProjectbutton()
        {
              
              
            WebElement ele = driver.findElement(By.xpath("//input[@type='button']"));
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            executor.executeScript("arguments[0].click();", ele);
            //ProjectCreatebutton.click();
          
        }
          
        public void VerifyProjectcreatedmessage() {
  		  WebElement Toastmessage = driver.findElement(By.xpath("//div[@class='toast-message']"));
    		System.out.println("Printing : " + Toastmessage.getAttribute("textContent"));
  	  }
        
      // FILES Verification
        public void ClickonFilesTab() {
        
        	WebElement ele = driver.findElement(By.xpath("//a[@class='btntabprojectFiles']"));
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            executor.executeScript("arguments[0].click();", ele);
        	
        	//ProjectFilesTab.click();
        	
        }
        
        public void SearchProjectCreationFile() throws InterruptedException {
        	FileSearchIcon.click();
        	Thread.sleep(2000);
        	FileSearchInputField.sendKeys("ProjectCreationFile");
        	Thread.sleep(3000);
        	FileSearchbutton.click();
        }
        
       public void VerifyProjectFile() {
    	  
           if( driver.findElement(By.xpath("//div[@class='customer-name']")).isDisplayed()){
               System.out.println("ProjectCreationFile is displayed");
               }else{
               System.out.println("ProjectCreationFile is NOT displayed");
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
    
    	
        public void ClickonProjectNotes() {
            
        	 WebElement ele = driver.findElement(By.linkText("NOTES"));
             JavascriptExecutor executor = (JavascriptExecutor)driver;
             executor.executeScript("arguments[0].click();", ele); 
        	
        	//ProjectNotes.click();
        }
          
        public void ClickonProjectNotesCreatebutton() {
            NotesNewCreateButton.click();
        }
          
        public String createNewProjectNotes(String Notesname, String Source,String SourceNotes,String UserNotes){
            NotesName.sendKeys(Notesname);
            NotesSource.sendKeys(Source);
            NotesDetailSource.sendKeys(SourceNotes);
            NotesUserNote.sendKeys(UserNotes);
            NotesAddTagbutton.click();
            //EnterNotesTaginSearchfield.sendKeys(NotesTagName);
            //EnterCreatedNotesTagName.sendKeys(SearchCreatedNotesTag);
            return null;    
        }
        
        public void ClickonAddNoteTagbutton() {
        	NotesAddTagbutton.click();
        }
        
        // Auto Dispalay
        public void CreateNewNoteTag(String NotesTagName) throws InterruptedException  {
              
            EnterNotesTaginSearchfield.sendKeys(NotesTagName);
           Thread.sleep(3000); 
            selectNotesCreatenewTag.click();
            //from projecttag
            ClickonNotesoutsidesearchfield.click();
        }
          
        public void EnterExistingNotesTagName(String SearchCreatedNotesTag) throws InterruptedException
        {
        	EnterCreatedNotesTagName.clear();
        	EnterCreatedNotesTagName.sendKeys(SearchCreatedNotesTag);
            Thread.sleep(2000);
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
          
        public void clickonNotesADDbutton() {
            NotesADDbutton.click();
        }
          
        public void verifyAddedNotes() {
            //NoteSourceLinkdisplayed.isDisplayed();
              
            if( driver.findElement(By.cssSelector(".OpenLink")).isDisplayed()){
                System.out.println("Created Project Notes is displayed ");
                }else{
                System.out.println("Notes is NOT displayed");
                }
              
        }
          
        public void ClickonProjectLinks() {
            
        	 WebElement ele = driver.findElement(By.linkText("LINKS"));
             JavascriptExecutor executor = (JavascriptExecutor)driver;
             executor.executeScript("arguments[0].click();", ele);
        	
        	//ProjectLink.click();
        }
          
        public void ClikconCreateNewLinkbutton(){
            LinksCreatebutton.click();
              
        }
          
        public String CreateNewProjectLinkdetails(String LinkTitleName, String Linksdescriptionexcel, String LinkTextfield) {
            LinkTitleinputfield.sendKeys(LinkTitleName); 
            LinkDescription.sendKeys(Linksdescriptionexcel);
            LinkText.sendKeys(LinkTextfield);
            return LinkTitleName;   
              
        }
  
        public void ClickonAddNewLinkNewTag() {
            LinkNewTagAddnavigation.click();
        }
          
        public void CreateNewLinkTag(String NewLinkTagName) {
            LinkTaginputSearchfield.sendKeys(NewLinkTagName);
            LinkNewTagCreatesuggestion.click();
          
        }
          
        public void SearchExistingLinkTagname(String ExistingLinkTag) {
        	LinkTagExistingSearchfield.clear();
        	LinkTagExistingSearchfield.sendKeys(ExistingLinkTag);
            LinkTagSearchIcon.click();
        }
  
        public void SelectandSaveLinkTag() {
            LinkTagSelectsearchedTag.click();
            
            if( driver.findElement(By.cssSelector(".ulAddedTagstoSpan")).isDisplayed()){
                System.out.println("Link Tag is not Selected ");
                }else{
                System.out.println("Link Tag is not Selected");
                }
            LinkTagSavebutton.click();  
              
        }
  
        public void SaveLinkDetails() {
            LinkSaveButton.click();
        }
  
        public boolean VerifyCreatedLink() {
            //CreatedLink.isDisplayed();
              
            if( driver.findElement(By.xpath("//div[@id='dvQVLinkTitle']")).isDisplayed()){
                System.out.println("Created Link Tag is Displayed ");
                }else{
                System.out.println("Created Link Tag is NOT Displayed");
                }
            return false;   
              
              
        }
          
        public void ClickonProjectDiscussionTab() {
        	//SelectProjectDiscussionTab.click();
        	 WebElement ele = driver.findElement(By.xpath("//a[@class='btntabprojectDiscussion']"));
             JavascriptExecutor executor = (JavascriptExecutor)driver;
             executor.executeScript("arguments[0].click();", ele);
             //ele.click();
        	
            
              
        }
          
          
        public void ClickonDiscussionAttachement() {
            DiscussionAttachmentIcon.click();
        }
          
        public void ClickonDiscussionFileBrowseButton() throws AWTException, InterruptedException {
            //DiscussionFileBrowsebutton.click();

       	 StringSelection sel = new StringSelection("E:\\upload doc\\ProjectDiscussionFile.docx");
            
            // Copy to clipboard
          Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
          System.out.println("selection" +sel);
         // Wait for 5 seconds
          Thread.sleep(8000);
          //Driver direct path to click element
          /*driver.findElement(By.xpath("//div[@class='k-button k-upload-button']/input")).click();
          ////div[@class='k-button k-upload-button']/span[text()='Drop Files Here']
          System.out.println("Browse button clicked in Project for doc uploading");*/
            
           //Wait for 5 seconds
          //Thread.sleep(5000);
          //JavaScript Executor to click on element
          // Working with ForeFOx ---- .k-button > span
          // -- //*[@id=\"prjFiles_1\"]
          WebElement ele = driver.findElement(By.xpath("//div[@class='k-button k-upload-button']//input[@id='cmntUpldFilesStatic']"));
          JavascriptExecutor executor = (JavascriptExecutor)driver;
          executor.executeScript("arguments[0].click();", ele);
            
           
           
           
            
          //Action Classes to clikck on element
            
     /*  Actions action =new Actions(driver);
         action.moveToElement(ProjectFileUploadbutton1).build().perform();
         ProjectFileUploadbutton1.click();
         System.out.println("Browse button clicked in Project for doc uploading");
          */
           
         /*// Expected Condition Explicitwait not working
          //WebDriver driver;
         WebElement element;
         WebDriverWait wait = new WebDriverWait(driver, 30);
         element= wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#prjFiles_1")));
         */
         // Not Working with Expected wait also
         /*WebElement myDynamicElement =(new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"prjFiles_1\"]")));
         myDynamicElement.click();*/
          // Create object of Robot class
          Robot robot = new Robot();
          Thread.sleep(1000);
                 
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
          
          
        public void EnterDiscussionComments() throws InterruptedException {
            //DiscussionCommnetsField.click();
            DiscussionCommnetsField.sendKeys("Project Discussion");
           Thread.sleep(2000);
            //DiscussionPostButton.click();
        
        }
          
      public void ProjectPostDiscussion() throws InterruptedException { 
    	 
    	 //DiscussionPostButton.click();
    	 //WebElement ele = driver.findElement(By.cssSelector("#S0"));
    	 //driver.findElement(By.cssSelector("#comments > div")).getCssValue("#S0");
    	 //WebElement ele = driver.findElement(By.xpath("//div[@id='Tags']/following::img[@class='SendComm']"));
    	 /* WebElement ele = driver.findElement(By.cssSelector("#S0"));
    	 // Working for chrome
    	  //WebElement ele = driver.findElement(By.xpath("//div[@class='col-md-12 no-padding']//div[@id='Tags']/following::img[@class='SendComm']"));
         JavascriptExecutor executor = (JavascriptExecutor)driver;
         executor.executeScript("arguments[0].click();", ele);
         ele.click();*/
         
       
         //DiscussionPostButton.click();
    	  
    	  Actions action =new Actions(driver);
          action.moveToElement(DiscussionPostButton).build().perform();
          action.click();
          Thread.sleep(3000);
          DiscussionPostButton.click();
    	 
      }
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
        // Project TASK
        public void ClickonProjectTaskTab() {
            
        	
        	 WebElement ele = driver.findElement(By.linkText("TASKS"));
             JavascriptExecutor executor = (JavascriptExecutor)driver;
             executor.executeScript("arguments[0].click();", ele); 
        	
        	//SelectProjectTasksTab.click();
              
              
        }
          
    public String ProvideTaskdetails(String TaskName, String TaskDesccription){
        ProjTaskName.sendKeys(TaskName);
        ProjTaskDesc.sendKeys(TaskDesccription);
        return TaskName;
    }
          
          
        public void clickonTaskCalendarStartDate() {
            
        	//WebElement dateBox = driver.findElement(By.id("prjMstStartDate_1"));
            //dateBox.sendKeys("03/08/2018");
            //dateBox.sendKeys(Keys.TAB);
              
              
            driver.findElement(By.xpath("//input[@id='TaskMstStartDate']")).click();
            WebElement   datepicker = driver.findElement(By.id("ui-datepicker-div"));  
            List<WebElement> rows=  datepicker.findElements(By.tagName("tr"));  
            List<WebElement> columns= datepicker.findElements(By.tagName("td"));
              
            // Not Working for in both FF and Chrome
           // datepicker.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight']")).click();
              
            // working for FF
            //datepicker.findElement(By.cssSelector("#ui-datepicker-div > table > tbody > tr:nth-child(2) > td.ui-datepicker-days-cell-over.ui-datepicker-today")).click();
              
              
            //working for FireFox
            //datepicker.findElement(By.cssSelector(".ui-datepicker-days-cell-over")).click();
             
            WebElement ele = driver.findElement(By.cssSelector(".ui-datepicker-days-cell-over"));
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            executor.executeScript("arguments[0].click();", ele);       
          
          
        }
          
        public void clickonTaskCalendarEndDate() {
              
            //driver.findElement(By.id("prjMstEndDate_1")).click();
            WebElement dateBox = driver.findElement(By.xpath("//input[@id='TaskMstEndDate']"));
            dateBox.sendKeys("12/31/2018");
            dateBox.sendKeys(Keys.TAB);
        }
          
        public void SelectTaskPriority() {
            //TaskPriorityLow.click();
            //TaskPriorityMedium.click();
            //TaskPriorityHigh.click();
            
            WebElement ele = driver.findElement(By.xpath("//ul[@class='taskPriority mt15']//div[@class='priorityMedium']/input[@id='priorityMedium']"));
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            executor.executeScript("arguments[0].click();", ele); 
            
              
        }
          
        public void ClickonAddTaskTagfield() {
            
        	
        	 WebElement ele = driver.findElement(By.xpath("//div[@class='input-field1']//input[@id='GtkMstTasktags']"));
             JavascriptExecutor executor = (JavascriptExecutor)driver;
             executor.executeScript("arguments[0].click();", ele); 
        	//TaskAddTagfield.click();
        }
          
        // New TaskTag Creation
        public String EnterNewTaskTagCreationSearchfield(String NewTaskTagName) throws InterruptedException {
           TaskNewTagSearchinputfield.sendKeys(NewTaskTagName);
            //TaskNewTagSearchinputfield.click();
           Thread.sleep(1000);
           TaskNewTagCreatesuggestion.click();
           return NewTaskTagName;
        }
          
        public void EnterExistingTaskTagSearcfield(String ExistingTaskTag) throws InterruptedException {
            TaskExistingTagSearchinputfield.sendKeys(ExistingTaskTag);
            Thread.sleep(2000);    
            TaskTagSearchIcon.click();
        }
          
        public void SelectDisplayedTaskTag() {
            SelectdisplayedTaskTagaftersearch.isDisplayed();
              
            if( driver.findElement(By.cssSelector("#atag_151")).isDisplayed()){
                System.out.println("TaskTag is Displayed after Search");
                }else{
                System.out.println("TaskTag is NOT Displayed after Search");
                }
              
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            SelectdisplayedTaskTagaftersearch.click();
        }
          
        public boolean VerifySelectedTaskTag() {
            if( driver.findElement(By.cssSelector(".ulAddedTagstoSpan")).isDisplayed()){
                System.out.println("TaskTag is Selected");
                }else{
                System.out.println("TaskTag is NOT Selected");
                }
            return false;
        }
          
        public void ClickonTaskTagSavebutton() {
            TaskTagSavebutton.click();
        }
          
        
        public void TaskDragandDropSlider() {
        	
        	
        //WebElement From = driver.findElement(By.xpath("//div[@id='slidecontainer']"));
        	 
  		//WebElement To = driver.findElement(By.xpath("//span[@id='gtkTaskProgessbar']"));
   
  		  //Actions builder = new Actions(driver);
   
   	      //Action dragAndDrop = builder.clickAndHold(From).moveToElement(To).release(To).build();
   
  		 // dragAndDrop.perform();
        	
        	
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
        	int numberOfPixelsToDragScrollBarSide=60;
        	//int numberOfPixelsToDragTheScrollbarDown = 5000;
        	dragger.moveToElement(draggablePartOfScrollbar).clickAndHold().moveByOffset(0,numberOfPixelsToDragScrollBarSide).release().perform();	
        	
        	
        }
        
        
        
        
        
        public void AddTaskMember() throws InterruptedException {
              
            WebElement ele = driver.findElement(By.cssSelector(".taskMstAddMemberCount"));
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            executor.executeScript("arguments[0].click();", ele);
            /*Thread.sleep(3000);
          
            //AddTaskMembers.click();
              
            //SelectVijayasTaskMember.isDisplayed();
            if(SelectVijayasTaskMember.isDisplayed()) {
                System.out.println("Members is displayed");{
                }else{
                    System.out.println("Memeber is not displayed");
                }
                }
              
            if(SelectVijayasTaskMember.isDisplayed()){
                System.out.println("Members is displayed");
                }else{
                System.out.println("Memeber is not displayed");
                }
              
            Thread.sleep(2000);
            // css=#MemberLstUser_13
            // xpath=//*[@id=\"MemberLstUser_13\"]
            WebElement ele1 = driver.findElement(By.xpath("//*[@id=\"MemberLstUser_13\"]"));
            JavascriptExecutor executor1 = (JavascriptExecutor)driver;
            executor1.executeScript("arguments[0].click();", ele);
            Thread.sleep(3000);
              
            SelectVijayasTaskMember.click();
            Thread.sleep(3000);
            MembersTaskSavebutton.click();*/
              
        }
          
        public void selectandSaveTaskMember() throws InterruptedException {
              
            WebElement ele = driver.findElement(By.cssSelector("#MemberLstUser_13"));
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            executor.executeScript("arguments[0].click();", ele);
            Thread.sleep(3000);
              
            //SelectVijayasTaskMember.click();
            Thread.sleep(6000);
            MembersTaskSavebutton.click();
        }
          
          
        public void TaskFileUpload(String ProjectTaskFileUpload) throws InterruptedException, AWTException {
            
           WebElement elementToClick = driver.findElement(By.xpath("//div[@class='col-sm-12 no-padding mt20']//div[@class='k-widget k-upload k-header k-upload-sync k-upload-empty']//div[@class='k-button k-upload-button']"));
           // Scroll the browser to the element's Y position
           ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,"+elementToClick.getLocation().y+")");
           // Click the element
            elementToClick.click();
            
           StringSelection sel = new StringSelection(ProjectTaskFileUpload);
           Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
           System.out.println("selection" +sel); 
           Robot robot = new Robot();
           //Thread.sleep(1000);
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
          
          
        public void ClickonTaskSavebutton() {
        	
        	////div[@class='col-md-12 pb15 dvprjtaskadd']//input[@class='btn btn-primary btn-lg gtkPrjAddTask' and @value='ADD']
        	  
            WebElement ele = driver.findElement(By.xpath("//div[@class='col-md-12 pb15 dvprjtaskadd']//input[@class='btn btn-primary btn-lg gtkPrjAddTask' and @value='ADD']"));
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            executor.executeScript("arguments[0].click();", ele);
            //Thread.sleep(3000);
        	//ProjectTaskSaveButton.click();
        }
          
       public void ClickonTaskNotelink() throws InterruptedException {
    	    // CALLING ALL THE EXISTING NOTES methods in Test methods
    	   ////TaskNotesLink.click();
    	   WebElement ele = driver.findElement(By.linkText("Notes"));
           JavascriptExecutor executor = (JavascriptExecutor)driver;
           executor.executeScript("arguments[0].click();", ele);
    	// driver.findElement(By.linkText("Notes")).click(); 
           /*  Actions action =new Actions(driver);
   		action.moveToElement(TaskNotesLink).build().perform();
        action.doubleClick();  
           */
    	   Thread.sleep(8000);
    	   TaskNoteCreatebutton.click();
    	   
       }
      
       public void ClickonTaskLinkandCreate() {
    	   //TaskLink.click();
    	   
    	   WebElement ele = driver.findElement(By.linkText("Links"));
           JavascriptExecutor executor = (JavascriptExecutor)driver;
           executor.executeScript("arguments[0].click();", ele);
    	   
    	  
    	   //TaskLinkCreateNewButton.click();
    	   
       }
       
       
       public void TaskLinkCreateButton() {
    	   TaskLinkCreateNewButton.click();
       
       }
       
       public void TaskDiscussionTab() {
    	   
    	   WebElement ele = driver.findElement(By.linkText("Discussions"));
           JavascriptExecutor executor = (JavascriptExecutor)driver;
           executor.executeScript("arguments[0].click();", ele);
    	   
    	   
    	  /* WebElement ele = driver.findElement(By.xpath("//div[@class='nav-tabs-custom task_tabs_custom']//ul[@class='nav nav-tabs']//a[@class='btntabTaskComment']"));
           JavascriptExecutor executor = (JavascriptExecutor)driver;
           executor.executeScript("arguments[0].click();", ele);
    	   ele.click();*/
    	   //TaskDiscussionTab.click();
    	   //Discussions
       }
       
}