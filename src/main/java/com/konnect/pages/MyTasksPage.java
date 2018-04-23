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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.konnect.base.TestBase;

/**
 * @author mahenderd
 *
 */
public class MyTasksPage extends TestBase {


	//Click on Add Button of Mytask
		@FindBy(xpath="//span[@class='add_MyTask']")
		WebElement AddMyTasksLink;
		
		//Enter Task Name in Overview
		@FindBy(xpath="//input[@id='gtkMyTaskName'and @class='validate gtkMyTaskName']")
		WebElement TaskNamelink;
		
		//Enter Description in Overview
		@FindBy(xpath="//textarea[@id='gtkMyTaskDescription' and @class='materialize-textarea gtkMyTaskDescription']")
		WebElement Descriptionlink;
		
		//Highlighted Date link of Start Date
		@FindBy(xpath="//input[@id='TaskMstStartDate']")
		WebElement StartDatelink;
		
		//Due date link 
		@FindBy(xpath="//input[@id='TaskMstEndDate']")
		WebElement DueDateLink;
		
		//Enter Start Date
		@FindBy(xpath="//td[@class=' ui-datepicker-days-cell-over  ui-datepicker-today']")
		WebElement Selectstartdate;
		
		//Enter Due date
		@FindBy(xpath="//input[@id='TaskMstEndDate']")
		WebElement SelectDuedate;
		
		//Select Lowpriority
		@FindBy(xpath="//input[@id='priorityLow' and @value='2']")
		WebElement SelectPriorityLow;
		
		//Select PriorityNone
		@FindBy(xpath="//input[@id='priorityNone']")
		WebElement SelectPriorityNone;
		
		//Select PriorityMedium
		@FindBy(xpath="//input[@id='priorityMedium' and @value='3']")
		WebElement SelectPriorityMedium;
		
		//Select priorityHigh
		@FindBy(xpath="//input[@id='priorityHigh' and @value='4']")
		WebElement SelectPriorityHigh;
		
		//Click on Tag Link in Overview
		@FindBy(xpath="//input[@id='GtkMstTasktags' and @class='Mytasktags tasktagsList GtkMstTasktags']")
		WebElement AddTaglinkinMytasks;
		
		//Create Tag link in Overview module
		@FindBy(xpath="//div[@class='col-sm-7 p0']//span[@class='create_tag']")
		WebElement CreateTaginMyTasks;
		
		//Entering the Tag Name
		@FindBy(xpath="//input[@class='txtCreateNewtagName']")
		WebElement InputToCreateTaginMytasks;
		
		//Click Ok to Create the Tag.
		@FindBy(xpath="//span[@class='show_create']//i[@class='fa fa-check-circle CreateNewTag']")
		WebElement ClickToCreatetaginMyTasks;
		
		//Search the created Tag in Overview Module
		@FindBy(xpath="//input[@id='txtTagNameSearch']")
		WebElement SearchTagField;
		
		//Selecting the Tag from the List
		@FindBy(xpath="//li[@class='TagNameSelectAutoCompleteData']")
		WebElement SelectTag;
		
		//Selecting the Tag name to add
		@FindBy(xpath="//a[@id='atag_179']")
		WebElement SelectTagNameToAdd;
		
		//Select the tag name to Update
		@FindBy(xpath="//a[@id='atag_57']")
		WebElement SelectTagNameToUpdate;
		
		//Add Button of tags in Overview.
		@FindBy(xpath="//button[@class='btn btn-primary btnTagAdd TaskAssociateTag']")
		WebElement AddTagButtonofMyTasks;
		
		//Notes Link in my Tasks
		@FindBy(xpath="//a[@class='btntabTaskNotes' and @onclick='openMyTaskNoteTab(this);']")
		WebElement NotesLinkinMyTask;
		
		//Create Button in Notes
		@FindBy(xpath="//button[@id='btnCreatenote' and @class='btnCreatenote btn btnCss btn-primary  ml20']")
		WebElement CreateNoteslinkinMytask;
		
		//Enter Notes Name
		@FindBy(xpath = "//textarea[@id='txtNoteTile']")
		WebElement NotesName;
		
		//Enter Source name
		@FindBy(xpath = "//input[@id='txtNoteSource']")
		WebElement Sourcename;
		
		//Enter Source Notes
		@FindBy(xpath = "//textarea[@id='txtNoteDetail']")
		WebElement SourceNotes;
		
		//Enter User Notes
		@FindBy(xpath = "//textarea[@id='txtUserNote']")
		WebElement UserNote;
		
		//Tags in Notes Module
		@FindBy(xpath="//input[@id='NoteTag']")
		WebElement Tags;
		
		//Creating Tags in Note module
		@FindBy(xpath="//div[@class='col-sm-7 p0']//span[@class='create_tag']")
		WebElement CreateTag;
		
		//Entering the Tag name 
		@FindBy(xpath="//input[@class='txtCreateNewtagName']")
		WebElement InputToCreateTag;
		
		//Click OK to create tag on Notes module
		@FindBy(xpath="//i[@class='fa fa-check-circle CreateNewTag']")
		WebElement ClickToCreatetag;
		
		//Search the Created tag in Tags
		@FindBy(xpath="//input[@id='txtTagNameSearch']")
		WebElement SearchTagFieldinNotes;
		
		//Click on Search button to search the tag.
		@FindBy(xpath="//span[@class='fa fa-search tagnamesearch btntagnamesearch']")
		WebElement SearchTagbutton;
		
		//Selecting the Tag Name to add
		@FindBy(xpath="//a[@id='atag_179']")
		WebElement SelectTagNameToAddinNotes;
		
		//Click on Add button to add Notes
		@FindBy(xpath="//button[@class='btn btn-primary btnTagAdd MenuNoteSumAssociateTag']")
		WebElement AddButtonofTaginNotes;
		
		//Click on cancel Button in Notes
		@FindBy(xpath="//a[@id='gtkPrjMstCancelNote']")
		WebElement CancelButtonofNotes;
		
		//Add button of Notes
		@FindBy(xpath="//input[@id='gtkPrjMstAddNote' and @class='btn-primary gtkPrjMstAddNote']")
		WebElement AddButtonofNotes;
		
		//Click on Link Tab
		@FindBy(xpath="//div[@class='nav-tabs-custom task_tabs_custom']//ul[@class='nav nav-tabs']//li[@class='links_tasks litabTskpnlAll']/a")
		WebElement ClickonLinkTab;
		
		//Create New link in Link Tab
		@FindBy(xpath="//div[@class='add_link btnOpenPopup btn btn-primary btnCss  ml20']")
		WebElement Createlinkinlinktab;
		
		//Add Link if Already link is created.
		@FindBy(xpath="//div[@class='add_link btnOpenPopup']//i[@class='fa fa-plus']")
		WebElement AddLinkagainstTask;
		
		//Enter Title of the Link
		@FindBy(xpath="//textarea[@id='txtLinkTitle' and @class='txtLinkTitle materialize-textarea' ]")
		WebElement EnterTitleName;
		
		//Enter Description of the link
		@FindBy(xpath="//textarea[@id='txtLinkDescr' and @class='txtLinkDescr materialize-textarea' ]")
		WebElement EnterDescription;
		
		//Enter the Link
		@FindBy(xpath="//textarea[@id='txtLinkSrc' and @class='txtLinkSrc materialize-textarea' ]")
		WebElement EnterLink;
		
		//Enter Tags in the Link
		@FindBy(xpath="//input[@id='LinkTag' and @class='LinkTag LinkTagsList' ]")
		WebElement EnterTags;
		
		//Click on Create tag in Links
		@FindBy(xpath="//div[@class='col-sm-7 p0']//span[@class='create_tag']")
		WebElement CreateTaginlinks;
				
		//Enter Tag Name in InputField
		@FindBy(xpath="//input[@class='txtCreateNewtagName']")
		WebElement InputToCreateTaginLinks;
				
		//Click ok to create Tag
		@FindBy(xpath="//i[@class='fa fa-check-circle CreateNewTag']")
		WebElement ClickToCreateTaginlinks;
		
		//Search tags
		@FindBy(xpath="//input[@id='txtTagNameSearch' and @class='txtTagNameSearch search-box ui-autocomplete-input' ]")
		WebElement SearchTagsinLinks;
		
		//Click on Search button of tags
		@FindBy(xpath="//span[@class='fa fa-search tagnamesearch btntagnamesearch']")
		WebElement SearchButtonofTags;
		
		//Click on Selected tag
		@FindBy(xpath="//a[@id='atag_179']")
		WebElement SelectTaginLinks;
		
		//Click on Add Button to Add Tags in Links
		@FindBy(xpath="//button[@class='btn btn-primary btnTagAdd LinkCrAssociateTag']")
		WebElement AddButtonofTagsinLinks;
		
		//Click on Add Button of Links
		@FindBy(xpath="//input[@value='Add' and @id='gtkPrjMstAddLink']")
		WebElement AddButtonoflinks;

	  //Searching the Created tasks
		//selecting All tab to search Tasks
		@FindBy(xpath="//li[@id='All']//a[@class='all_tasks']")
		WebElement ClickAllTasks;
		
		//Search tasks in All
		@FindBy(xpath="//input[@class='txtPrjTaskAllSearch validate mt5']")
		WebElement SearchfieldinAll;
		
		//Search Icon in All tab
		@FindBy(xpath="//i[@class='fa fa-search btnPrjTaskAllSearch']")
		WebElement SearchIconinAll;
		
		//Select OpenTab to search Tasks
		@FindBy(xpath="//li[@id='Open']//a[@class='open_tasks']")
		WebElement ClickOpenTasks;
		
		//Search Tasks in Open
		@FindBy(xpath="//input[@class='txtPrjTaskOpenSearch validate mt5']")
		WebElement SearchfieldinOpen;
		
		//Search Icon in Open Tab
		@FindBy(xpath="//i[@class='fa fa-search btnPrjTaskOpenSearch']")
		WebElement SearchIconinOpen;
		
		//Select ClosedTab to Search Tasks
		@FindBy(xpath="//li[@id='Close']//a[@class='close_tasks']")
		WebElement ClickCloseTasks;
		
		//Search Tasks in Closed
		@FindBy(xpath="//input[@class='txtPrjTaskCloseSearch validate mt5']")
		WebElement SearchfieldinClosed;
		
		//Search Icon in Closed.
		@FindBy(xpath="//i[@class='fa fa-search btnPrjTaskCloseSearch']")
		WebElement SearchIconinClosed;
		
		//To select the task after searching with task name in All
		@FindBy(xpath="//div[@class='divPrjTaskViewSummary']//ul[@class='products-list task_left_view sortable']")
		WebElement SelectTaskafterSearchinAll;
		
		//Select the task after searching with task name in Open.
		@FindBy(xpath="//div[@class='divPrjOpenTaskViewSummary']")
		WebElement SelectTaskafterSearchinOpen;
			
		//Select the task after searching with task name in close
		@FindBy(xpath="//div[@class='divPrjCloseTaskViewSummary']")
		WebElement SelectTaskafterSearchinClose;
		
		//Update Taskname 
		@FindBy(xpath="//input[@class='validate gtkMyTaskName valid' and @id='gtkMyTaskName']")
		WebElement UpdatetaskNameLink;
		
		//My Calendar
		@FindBy(xpath="//li[@class='myTaskCalendar']//div[@class='dropdown']")
		WebElement MyCalender;
		
		//Calendar list
		@FindBy(xpath="//*[@id=\"left_task_list\"]/div[2]/ul/li[4]/div/ul")
		WebElement CalendarList;
		
		//Select Today from Calendar list
		@FindBy(linkText="Today")
		WebElement TodayinCalendarList;
		
		//Select Current month in Calendar
		@FindBy(linkText="Current Month")
		WebElement CurrentMonthinCalendarList;
		
		//getting all the TaskNames in Summary
		@FindBy(xpath="//div[@class='divPrjOpenTaskViewSummary']//ul[@class='products-list task_left_view sortable ui-sortable']")
		WebElement GetAllTasksName;
		
		//Selecting the Sorting link
		@FindBy(xpath="//div[@class='btn-group']//i[@class='glyphicon glyphicon-sort dropdown-toggle']")
		WebElement ClickonSortinglink;
		
		//Selecting the sorting by Status in All.
		@FindBy(xpath="//ul[@class='dropdown-menu drpstls']//a[@class='MyTaskSortbyStatus']")
		WebElement SortByStatusintasks;
		
		//Selecting the sorting by Order in All
		@FindBy(xpath="//ul[@class='dropdown-menu drpstls']//li[@class='MyTaskSortbyorder']")
		WebElement SortByOrderintasks;
		
		
		public MyTasksPage() {
			PageFactory.initElements(driver, this);
		}

	//Click on Add Icon of tasks.
		public void AddMyTaskLinkTest() {
			AddMyTasksLink.click();
		}

	//Entering the task details inOverview
		public void AddTaskDetails(String TaskName,String Desc,String DueDate) throws AWTException {
			TaskNamelink.sendKeys(TaskName);
			Descriptionlink.sendKeys(Desc);
			StartDatelink.click();
			Selectstartdate.click();
			DueDateLink.click();
			SelectDuedate.sendKeys(DueDate);
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			SelectPriorityLow.click();
	        
	     //To Slide the WorkStatus(after Selecting priority)
	        Actions Slider = new Actions(driver);
	        WebElement MoveScrollbar = driver.findElement(By.cssSelector("#slidecontainer"));
	        Slider.moveToElement(MoveScrollbar).clickAndHold().moveByOffset(0,100).release().perform(); 
			AddTaglinkinMytasks.click();
		
		}
		
	//Create New Tag
		public void CreateNewTag(String NewTag) throws InterruptedException {
			CreateTaginMyTasks.click();
			InputToCreateTaginMytasks.sendKeys(NewTag);
			Thread.sleep(2000);
			ClickToCreatetaginMyTasks.click();
		}
		
	//Selecting the tags from the list while searching the tags.	
		public void SelectExistingTags(String Tags) throws InterruptedException {
			SearchTagField.sendKeys(Tags);
			Thread.sleep(1000);
			SearchTagbutton.click();
			SelectTagNameToAdd.click();
			AddTagButtonofMyTasks.click();
		}

	//Uploading the file in the overview
		public void Uploadfile(String PathofFile) throws AWTException, InterruptedException {
			WebElement ele = driver.findElement(By.xpath("//div[@class='k-button k-upload-button']"));
		    JavascriptExecutor executor = (JavascriptExecutor)driver;
		    executor.executeScript("arguments[0].scrollIntoView();",ele);
		    Thread.sleep(2000);
		    ele.click();
		    Thread.sleep(2000);
			StringSelection ss = new StringSelection(PathofFile);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			Thread.sleep(4000);
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			Thread.sleep(1000);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(1000);
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			robot.keyRelease(KeyEvent.VK_ENTER);
		
		}

	//saving the Details of Overview by using pageScroll Down	
		public void SaveDetailsofOverviewTasks() {
			WebElement Element = driver.findElement(By.xpath("//input[@class='btn btn-primary btn-lg gtkAddMyTask' and @value='ADD']"));
		    JavascriptExecutor executor = (JavascriptExecutor)driver;
		    executor.executeScript("arguments[0].scrollIntoView();",Element);
		    Element.click();
		}

	//pageScrollup to Find Notes tab.	
		public void MoveToNotesinMyTask() throws AWTException {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_PAGE_UP);
			robot.keyRelease(KeyEvent.VK_PAGE_UP);
		    
		}
		
	//Click on Notes link in my Task	
		public void ClickonNoteslink() {
			NotesLinkinMyTask.click();
		}
		
	//Click on Create link on Notes	
		public void CreateNewNotes() {
			CreateNoteslinkinMytask.click();
		}

	//Entering the Details of Notes
		public void createDetailsofNotes(String Notes,String Srcname,String srcnotes,String usrnotes) 
				throws InterruptedException {
			NotesName.sendKeys(Notes);
			Sourcename.sendKeys(Srcname);
			SourceNotes.sendKeys(srcnotes);
			UserNote.sendKeys(usrnotes);
			Tags.click();
			Thread.sleep(3000);
		}

		//Create New Tag in Notes
		public void CreateNewTaginNotes(String NewTag) throws InterruptedException {
			CreateTag.click();
			Thread.sleep(2000);
			InputToCreateTag.sendKeys(NewTag);
			Thread.sleep(2000);
			ClickToCreatetag.click();	
		}
		
	//Search Existing Tag
		public void SearchExistingTaginNotes(String ExistingTag) {
			SearchTagFieldinNotes.sendKeys(ExistingTag);
			SearchTagbutton.click();
			SelectTagNameToAddinNotes.click();
			AddButtonofTaginNotes.click();
		}

	//Add Button of Notes	
		public void ClickonAddButtonofNotes() {
			AddButtonofNotes.click();
		}
		
	//cancel Button of Notes
		public void ClickonCancelButtonofNotes() {
			CancelButtonofNotes.click();
		}
		
	//pageScrollUp to Find linksTab
		public void MoveToLinksinMyTasks() throws AWTException {
		    Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_PAGE_UP);
			robot.keyRelease(KeyEvent.VK_PAGE_UP);
		}
		
	//Click on Link Tab	
		public void ClickonLinksinMyTasks() {
			ClickonLinkTab.click();
		}
		
	//Click on Create Icon in links	
		public void CreateLink() {
			Createlinkinlinktab.click();	
		}
		
	//Click on Add Icon in Links 
		public void AddlinkAgainstTasks() {
			AddLinkagainstTask.click();	
		}

	//Entering the Details of Links
		public void AddlinkinMytasks(String Title,String Desc,String Link) throws InterruptedException {
			EnterTitleName.sendKeys(Title);
			EnterDescription.sendKeys(Desc);
			EnterLink.sendKeys(Link);
			EnterTags.click();
			Thread.sleep(3000);
		}

	//Create New tag in Links
		public void CreateNewTaginLinks(String NewTag) throws InterruptedException {
			CreateTaginlinks.click();
			InputToCreateTaginLinks.sendKeys(NewTag);
			Thread.sleep(2000);
		    ClickToCreateTaginlinks.click();
		}
		
	//Search Existing Tag
		public void SearchExistingTaginLinks(String ExistingTag) {
			SearchTagsinLinks.sendKeys(ExistingTag);
			SearchButtonofTags.click();
			SelectTaginLinks.click();
			AddButtonofTagsinLinks.click();
		}
		
	//Uploading Image in Links Tab
		public void UploadImage(String pathofImage) throws AWTException, InterruptedException {
			WebElement ele = driver.findElement(By.xpath("//div[@id='prjLinkIcon']//div[@id='prjAddLinkImg']"));
		    JavascriptExecutor executor = (JavascriptExecutor)driver;
		    executor.executeScript("arguments[0].scrollIntoView();",ele);
		    ele.click();
		    Thread.sleep(2000);
			StringSelection ss = new StringSelection(pathofImage);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			Thread.sleep(1000);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(1000);
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
		
	//Click on AddButton of Links
		public void ClickonAddButtonofLink() {
			AddButtonoflinks.click();
		}
	//Click on All Tasks Link
		public void ClickonAllTasks() {
			ClickAllTasks.click();
		}

	//Searching All tasks	
		public void SearchingAlltasks(String DataFromTasks) throws InterruptedException {
			SearchfieldinAll.sendKeys(DataFromTasks);
			Thread.sleep(2000);
			SearchIconinAll.click();
		}
		
	//Click on Open Tasks link
		public void ClickonOpenTasks() {
			ClickOpenTasks.click();
		}

	//Searching Open tasks
		public void SearchingOpentasks(String DataFromTasks) throws InterruptedException {
			SearchfieldinOpen.sendKeys(DataFromTasks);
			Thread.sleep(2000);
			SearchIconinOpen.click();
		}
		
	//Click on Closed Tasks link
		public void ClickonClosedTasks() {
			ClickCloseTasks.click();
		}
		
	//Searching Closed Tasks
		public void SearchingClosedTasks(String DataFromTasks) throws InterruptedException {
			SearchfieldinClosed.sendKeys(DataFromTasks);
			Thread.sleep(2000);
			SearchIconinClosed.click();
		}
		
	//Selecting the Data from the list after searching the Task
		public void SelectDataAfterSearchingTasksinAll() {
			SelectTaskafterSearchinAll.click();
		}

	//Sorting the Task Details in All by Status
		public void DataSortofTasksbyStatus() {
			ClickonSortinglink.click();
			SortByStatusintasks.click();
		}
	//Sorting the Task Details in All by order
		public void DataSortofTasksbyOrder() {
			ClickonSortinglink.click();
			SortByOrderintasks.click();
		}
		
		
	//Cancel Button of Tasks	
		public void CancelButtonofTasks() throws InterruptedException {
			WebElement ele = driver.findElement(By.xpath("//a[@id='gtkPrjMstCancelNote']"));
		    JavascriptExecutor executor = (JavascriptExecutor)driver;
		    executor.executeScript("arguments[0].scrollIntoView();",ele);
		    Thread.sleep(2000);
		    ele.click();
		}
		
	//Selecting the summary after searching the Task in Open
		public void SelectDataAfterSearchingTasksinOpen() {
			SelectTaskafterSearchinOpen.click();
		}
		
	//Selecting the summary after searching the Task in Close
			public void SelectDataAfterSearchingTasksinClose() {
				SelectTaskafterSearchinClose.click();
			}
				
	//Selecting the list from the calendar
		public void SelectCalendar() throws InterruptedException, AWTException {
			MyCalender.click();
			//TodayinCalendarList.click();
			CurrentMonthinCalendarList.click();
		}
		
	//**********Updating the task Details***********************
		
		//Updating the Task name.
			public void UpdatingExistingTaskName() throws InterruptedException {
				Thread.sleep(2000);
				UpdatetaskNameLink.clear();
				Thread.sleep(2000);
				TaskNamelink.sendKeys("My Tasks Overview");	
			}
			
		//Updating the Tasks
			public void UpdatingTaskDetails() throws AWTException, InterruptedException {	
				DueDateLink.clear();
				Thread.sleep(1000);
				DueDateLink.sendKeys("12/30/2018");
				Robot robot = new Robot();
				robot.keyPress(KeyEvent.VK_ENTER);
				Thread.sleep(1000);
				robot.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(1000);
				//SelectPriorityMedium.click();
				SelectPriorityHigh.click();
			//clicking on add tag link to update the Tags.	
				AddTaglinkinMytasks.click();
				Thread.sleep(3000);
			//click on search link of the tag.
				SearchTagField.sendKeys("Analysis");
			//click on search icon of Tag.
				SearchTagbutton.click();
			// Select the tag Name to Update
				SelectTagNameToUpdate.click();
			//Click on Add to add Tags.
				AddTagButtonofMyTasks.click();
				
			}
			
		//Update Button of tasks after updating the details of task	
			public void ClickonUpdateButtonofTasks() throws InterruptedException, AWTException {
				WebElement ele = driver.findElement(By.xpath("//input[@class='btn btn-primary btn-lg gtkAddMyTask' and @value='Update']"));
			    JavascriptExecutor executor = (JavascriptExecutor)driver;
			    executor.executeScript("arguments[0].scrollIntoView();",ele);
			    Thread.sleep(2000);
			    ele.click();
			    Robot R= new Robot();
				R.keyPress(KeyEvent.VK_PAGE_UP);
				Thread.sleep(2000);
				R.keyRelease(KeyEvent.VK_PAGE_UP);
			}

	
	
}
