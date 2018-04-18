/**
 * 
 */
package com.konnect.testcases;
  
import java.awt.AWTException;
 
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
  
import com.konnect.base.TestBase;
import com.konnect.pages.GroupsPage;
import com.konnect.pages.HomePage;
import com.konnect.pages.LoginPage;
import com.konnect.pages.ProjectPage;
import com.konnect.util.TestUtil;
  
/**
 * @author mahenderd
 *
 */
   public class ProjectPageTest extends TestBase {
  
	    LoginPage loginPage;
	    HomePage homePage;
	    TestUtil testUtil;
	    GroupsPage groupspage;
	    ProjectPage projectpage;
	    String sheetName = "NewProject";
	    String ProjectNotes ="ProjectNotesCreation";
	    String ProjectLink = "ProjectLinksCreation";
	    String ProjectTask = "ProjectTaskCreation";
      
   public ProjectPageTest() {
        super();
       }
   
  
   @BeforeClass
   public void setup() throws InterruptedException {
	        initialization();
	        testUtil= new TestUtil();
	        /*cloudpage = new Cloudpage();*/
	        loginPage= new LoginPage();
	        homePage = new HomePage();
	        groupspage= new GroupsPage();
	        projectpage= new ProjectPage();
	        homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	        System.out.println("Login Sucessfull");   
	        Thread.sleep(8000);
	        homePage.clickoncloudlink();
	        System.out.println("Selected Cloud Icon");
	        Thread.sleep(2000);
	        projectpage.clickonProjects();
	        System.out.println("Selected Project");
     }
   
   @DataProvider(name="DPProjecttabCreation")
   public Object[][] getProjectsTestdata(){
          Object data[][] = TestUtil.getTestData(sheetName);
          return data;
        }
          
   @Test(priority=1,dataProvider="DPProjecttabCreation")
   public void ValidateCreateNewProject(String ProjectName , String ProjectDescription,String EnterTaginSearchfield,String EnterCreatedTagName, String GroupSearchinputTextField ) throws InterruptedException, AWTException {
            //String ProjCalanderStartDate
            //projectpage.clickonProjects();
            System.out.println("Navigated to PROJECTS Page by clicking on Projects links from HomePage");
            testUtil.switchToFrame();
            projectpage.clickonAddnewProject();
            System.out.println("Clicked on ADD NEW Project and navigated to NEWPROJECT data filling page");
            Thread.sleep(2000);
            projectpage.createNewProject(ProjectName, ProjectDescription);
            //Thread.sleep(1000);
            // Selects Current Date from Calendar
            projectpage.clickonCalendarStartDate();
            System.out.println("Selected Curent Date as StartDate");
            // End date final set to 31/12/2018
            projectpage.clickonCalendarEndDate();
            System.out.println("Selected End of the Year Date as EndDate like 31/12/2018");
            Thread.sleep(1000);
            
            // Priority Selection
            projectpage.SelectPriority();
            System.out.println("Selected Priority");
            Thread.sleep(1000);
         
            // Project Tag Adding
            projectpage.clikconAddNewTaG();
            System.out.println("Clicked on Add New TaG which navigates to Tag Creation/Selection");
              
             // Creating New Tag Skippin/Commented
            /*projectpage.EnterprojectTagName(EnterTaginSearchfield);
            System.out.println("Provided Tag Name to Create");
            projectpage.clickoncreateNewTag();
            System.out.println("New Tag Created");
            projectpage.clickonoutsidesearchtab();*/
              
   
            // Selecting Existing Tag At Project LEVEL
            projectpage.verifyEnterCreatedTagName(EnterCreatedTagName);
            Thread.sleep(1000);
            projectpage.ClickonSearchIcon();
            System.out.println("Existing Tag is displaying after Search");
            Thread.sleep(1000);
            projectpage.clikconbesidesearchedTag();
            projectpage.verifyTagsBodydisplayed();
            projectpage.selectTagAftersearch();
            System.out.println("Tag is Selected");
            projectpage.verifydisplayedTagisSelected();
            projectpage.clickonTagADDbutton();
            System.out.println("Tag is Added Sucessfully");
            Thread.sleep(1000);
              
            // Members Adding
              
            projectpage.ClickonAddNEWMembers();
            System.out.println("Memebers Added Succesfully");
            Thread.sleep(2000);
            projectpage.ClickonAddNEWManagers();
            System.out.println("Manager Added Successfully");
            Thread.sleep(2000);
            projectpage.ClickonAddNEWGroups();
            System.out.println("Clicked on Groups to select Group frm list of Groups");
            Thread.sleep(1000);
            projectpage.GroupSearchText(GroupSearchinputTextField);
            System.out.println("Searched Groups by entering groupname from Testdata sheet");
            Thread.sleep(1000);
            projectpage.SearchandAddGroups();
            System.out.println("Groups Added Sucessfully");
            Thread.sleep(1000);
           
            // File Upload Skipping in Chrome
            // FireFOx
            projectpage.BrowseProjectFile(prop.getProperty("ProjectLevelProjectTabFileUpload"));
           //updateprojectpage.Linkuploadfile(prop.getProperty("linkupdatefileupload"));
            System.out.println("File Uploaded successfully");
            Thread.sleep(1000);
            projectpage.ClickonCreateProjectbutton();  
            System.out.println("Projects Created Sucessfully");
            projectpage.VerifyProjectcreatedmessage();
            Thread.sleep(3000);
          
        }
   
        //##### PROJECT LEVEL  NOTES CREATION@@@@@####
         // Notes Creation Start Skippin as Created Notes is not displaying
        // Notes Creation Methods 
        
   @DataProvider(name="DPProjectNotesCreation")
   public Object[][] getProjectNotesTestdata(){
          Object data[][] = TestUtil.getTestData(ProjectNotes);
          return data;
        } 
        
   @Test(priority=3,dataProvider="DPProjectNotesCreation")    
   public void CreateProjectNotes(String NotesName, String NotesSource,String NotesDetailSource,String NotesUserNote,String EnterNotesTaginSearchfield,String EnterCreatedNotesTagName) throws InterruptedException, AWTException  {
        	        
        projectpage.ClickonProjectNotes();
        System.out.println("Navigated to ProjectNotesScreen");
        Thread.sleep(2000);
        projectpage.ClickonProjectNotesCreatebutton();
        // Notes Data Adding
        projectpage.createNewProjectNotes(NotesName, NotesSource, NotesDetailSource, NotesUserNote);
        System.out.println("Added Project Notes Details");
        Thread.sleep(3000);  
        // Notes New Tag Adding -- Skipping 
        //projectpage.CreateNewNoteTag(EnterNotesTaginSearchfield);
        //System.out.println("New NOTES TAG Created");
        // Thread.sleep(3000);  
        // Existing Note Tag Adding
        
        projectpage.EnterExistingNotesTagName(EnterCreatedNotesTagName);
        System.out.println("Searching Existing NOTES TAG");
        Thread.sleep(2000);
        projectpage.SelectandaddNoteTag();
        System.out.println("Selected Existing NOTES TAG");
        Thread.sleep(1000);
        projectpage.clickonNotesADDbutton();
        System.out.println("Created New NOTES Sucessfully");
        //Thread.sleep(3000);
        projectpage.verifyAddedNotes();
        System.out.println("Verfied Created NOTES");
        Thread.sleep(3000);
          
       }   
       
        //##### PROJECT LEVEL LINKS CREATION @@@@@####      
        // PROJECT LINKS Creation
        
   @DataProvider(name="DPProjectLinkCreation")
   public Object[][] getProjectLinksTestdata(){
          Object data[][] = TestUtil.getTestData(ProjectLink);
          return data;
        } 
        
   @Test(priority=4,dataProvider="DPProjectLinkCreation")  
   public void CreateProjectLinks(String LinkTitleinputfield, String LinkDescription, String LinkText, String LinkTaginputSearchfield, String LinkTagExistingSearchfield) throws InterruptedException, AWTException  {
 		System.out.println("**** PROJECT LINKS Started****");
        projectpage.ClickonProjectLinks();
        System.out.println("Navigated to Project Links Screen");
        Thread.sleep(3000);
        projectpage.ClikconCreateNewLinkbutton();
        System.out.println("Creating Links.....");
        Thread.sleep(1000);
        // New link Details Filling
        projectpage.CreateNewProjectLinkdetails(LinkTitleinputfield, LinkDescription, LinkText);
        System.out.println("Filling Link Details...");
        //Thread.sleep(2000);
        // New Tag Adding Navigation    
        projectpage.ClickonAddNewLinkNewTag();
        Thread.sleep(2000);
        //  Link New Tag Creation Skipping
        
        //projectpage.CreateNewLinkTag(LinkTaginputSearchfield);
        //System.out.println("New Link Tag Creating");
        // Link Tag Existing Tag Selection search
        //Thread.sleep(3000);
        
        projectpage.SearchExistingLinkTagname(LinkTagExistingSearchfield);
        System.out.println("Searching Created Link Tag");
        // Selecting TAg    
        projectpage.SelectandSaveLinkTag();
        System.out.println("Selecting and Saving Link Tag");
        Thread.sleep(1000);
        projectpage.SaveLinkDetails();
        System.out.println("Project Links Created Sucessfully");
        //Thread.sleep(1000);
        projectpage.VerifyCreatedLink();
        System.out.println("Verified Created Project Links");
        Thread.sleep(3000);  
        } 
  
        //##### PROJECT LEVEL TASKCREATION @@@@@####
        // Starting  Project Task 
        
   @DataProvider(name="DPProjectTaskCreation")
   public Object[][] getProjectTaskTestdata(){
          Object data[][] = TestUtil.getTestData(ProjectTask);
          return data;
        }
        
   @Test(priority=2,dataProvider="DPProjectTaskCreation")  
   public void CreateProjectTask(String ProjTaskName, String ProjTaskDesc, String TaskNewTagSearchinputfield, String TaskExistingTagSearchinputfield, String NotesName, String NotesSource,String NotesDetailSource,String NotesUserNote,String EnterNotesTaginSearchfield,String EnterCreatedNotesTagName,String LinkTitleinputfield, String LinkDescription, String LinkText, String LinkTaginputSearchfield, String LinkTagExistingSearchfield) throws InterruptedException, AWTException  {
        System.out.println("*** Task Creation Started***");	
        projectpage.ClickonProjectTaskTab();
        Thread.sleep(2000);
        projectpage.ProvideTaskdetails(ProjTaskName, ProjTaskDesc);
        System.out.println("Filling Task Details..."); 
        projectpage.clickonTaskCalendarStartDate();
        System.out.println("Selected Current Date as Start Date in Task Calendar");
        //Thread.sleep(2000);
        projectpage.clickonTaskCalendarEndDate();
        System.out.println("Selected End of the Year date as Due Date in Task Creation Started***");
        Thread.sleep(1000);
        projectpage.TaskDragandDropSlider();
        System.out.println("Slider moved to 50%");
        Thread.sleep(2000);
        projectpage.SelectTaskPriority();
        //Thread.sleep(2000);
        // Adding Tag 
        projectpage.ClickonAddTaskTagfield();
        Thread.sleep(2000);
        // Creating New  Task Tag Skippin as able to create Tag
        
        //projectpage.EnterNewTaskTagCreationSearchfield(TaskNewTagSearchinputfield);
        //System.out.println("Creating New TASK Tag....");
        //Thread.sleep(3000);
          
        
        // Selecting Existing Task Tag
        projectpage.EnterExistingTaskTagSearcfield(TaskExistingTagSearchinputfield);
        Thread.sleep(1000);
        System.out.println("Searching Task Tag");
        projectpage.SelectDisplayedTaskTag();
        projectpage.VerifySelectedTaskTag();
        System.out.println("Selected Task Tag");
        Thread.sleep(1000);
        projectpage.ClickonTaskTagSavebutton();
        System.out.println("Saved Task TAG");
        Thread.sleep(2000);   
        
        // Member selecting skippin as it has issues 
       
         //projectpage.AddTaskMember();
        //System.out.println("Adding Members in Taks...");
        //Thread.sleep(4000);
        //projectpage.selectandSaveTaskMember();
        //System.out.println("Added Member in Task");
        //Thread.sleep(5000);
        
        
        //FIRFOX TASKFILE UPLOAD WORKING BUT NOT For CHROME
        //projectpage.TaskFileUpload();
        projectpage.TaskFileUpload(prop.getProperty("ProjectTaskFileUpload"));
        System.out.println("File Uploaded Sucessfully in TASK");
        Thread.sleep(2000);
        projectpage.ClickonTaskSavebutton();
        System.out.println("##Task Created Sucessfully##");
        Thread.sleep(3000);
        //#####@@@@@ TASK LINK CREATION @@@@@####
        // Task LINK Creation 
        projectpage.ClickonTaskLinkandCreate();
        System.out.println("Adding TASKLINKS....");
        Thread.sleep(2000);
        projectpage.TaskLinkCreateButton();
        Thread.sleep(1000);
        // New Taks link Details Filling
        projectpage.CreateNewProjectLinkdetails(LinkTitleinputfield, LinkDescription, LinkText);
        //Thread.sleep(2000);
        // New Tag Adding Navigation    
        projectpage.ClickonAddNewLinkNewTag();
        Thread.sleep(1000);
        // New Tag Creation Skippin
        //projectpage.CreateNewLinkTag(LinkTaginputSearchfield);
        Thread.sleep(2000); 
        // Link Tag Existing Tag Selection search
        projectpage.SearchExistingLinkTagname(LinkTagExistingSearchfield);
        // Selecting TAg    
        projectpage.SelectandSaveLinkTag();
        Thread.sleep(1000);
        projectpage.SaveLinkDetails();
        System.out.println("TASKLINKS Added Sucessfully");
        Thread.sleep(1000);
        projectpage.VerifyCreatedLink();
        Thread.sleep(3000);            
        
        //###TASK NOTES Creation SKIPPING ###  
        // TASK NEW NOTES creation after saving TASK or LINK
        projectpage.ClickonTaskNotelink();
        System.out.println("Adding TASKNOTES...");
        Thread.sleep(2000);
        // Notes Data Adding
        projectpage.createNewProjectNotes(NotesName, NotesSource, NotesDetailSource, NotesUserNote);
        Thread.sleep(1000);
          
        // Notes New Tag Adding -- Skipping
         //projectpage.CreateNewNoteTag(EnterNotesTaginSearchfield);
        // Thread.sleep(4000);
        
        
        // Existing Note Tag Adding
        projectpage.EnterExistingNotesTagName(EnterCreatedNotesTagName);
        projectpage.SelectandaddNoteTag();
        Thread.sleep(1000);
        projectpage.clickonNotesADDbutton();
        System.out.println("TASKNOTES Added sucessfully");
        Thread.sleep(3000);
        projectpage.verifyAddedNotes();
        Thread.sleep(4000);
        
        // }         
       //Task Discussion
        projectpage.TaskDiscussionTab();
        System.out.println("Selected Discussion");
        Thread.sleep(2000);
        testUtil.switchToInnerFrame();
        //Thread.sleep(2000);
        projectpage.EnterDiscussionComments();
        System.out.println("Added Comments");
        Thread.sleep(1000);
        testUtil.switchToParentFrame();
        Thread.sleep(1000);
        // *****Task Discussion Attachement not working
        //projectpage.ClickonDiscussionAttachement();
        //Thread.sleep(4000);
        //projectpage.ClickonDiscussionFileBrowseButton();
        //Thread.sleep(5000);
        projectpage.ProjectPostDiscussion();
        System.out.println("Posted  Discussion Comments");
        Thread.sleep(2000);
   }         
        //###Project Level FILES verification afterupload
        // FIREFOX wroks not for CHROME commenting
       
   @Test(priority=5)
   public void verifyandvalidateUploadedfile() throws InterruptedException {
        projectpage.ClickonFilesTab();
        System.out.println("***Navigated to FILES Tab***");
        Thread.sleep(2000);
        projectpage.SearchProjectCreationFile();
        Thread.sleep(2000);
        projectpage.VerifyProjectFile();
        System.out.println("Verified Uploaded Files");
        Thread.sleep(1000);
      }
        
   @Test(priority=6)
   public void VerifyDownloadedFile() throws InterruptedException {
        projectpage.clickonSelectbutton();
        Thread.sleep(1000);
        projectpage.SelectandDownloadFile();
        System.out.println("Downloaded Files");
        Thread.sleep(1000);
       }
   
   @Test(priority=7)
   public void VerifyDeleteFileOption() throws InterruptedException {
        projectpage.SelectandDeleteFile();
        Thread.sleep(1000);
        projectpage.DeleteFileIcon();
        System.out.println("Deleted Uploaded Files");
        }
   
    @Test(priority=8)
    public void ValidateDeletedFile() throws InterruptedException { 
        	//Thread.sleep(3000);
        	projectpage.VerifyDeletedFile();
        	System.out.println("Verified Deleted Files");
        	Thread.sleep(2000);
       }
     
       // Project Discussion Tab
     @Test(priority=9)
     public void ValidateProjectDiscussionTab() throws InterruptedException, AWTException {
	        projectpage.ClickonProjectDiscussionTab();
	        System.out.println("***Navigated to Project Discussion Tab***"); 
	        Thread.sleep(3000);
	        testUtil.switchToInnerFrame();
	        projectpage.EnterDiscussionComments();
	        System.out.println("Enter Commments"); 
	        //Thread.sleep(5000);
	        testUtil.switchToParentFrame();
	        //Thread.sleep(1000);
	        //projectpage.ClickonDiscussionAttachement();
	        // Thread.sleep(4000);
	        // projectpage.ClickonDiscussionFileBrowseButton();
	        //Thread.sleep(5000);
	       // FF JSON ERROr by Dev as syntax error is displaying 
	        projectpage.ProjectPostDiscussion();
	        System.out.println("Project Discussion Comments Posted Sucessfully "); 
	        Thread.sleep(1000);
     	}
     
         
     
    /* @Test(priority=10)
 	public void LogoutfromNotesScreen() {
 		  testUtil.switchToDefaultFrame();
 		  homePage.logout();
 	  }*/
     
   //@AfterMethod    
    @AfterClass   
    public void tearDown(){
    //driver.quit();
    }
 
}