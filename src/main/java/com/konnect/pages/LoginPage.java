/**
 * 
 */
package com.konnect.pages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.konnect.base.TestBase;
import com.konnect.base.TestBase2;
import com.konnect.util.TestUtil;
import com.konnect.util.WebEventListener;

/**
 * @author mahenderd
 *
 */
public class LoginPage extends TestBase {
	
	 	/*public static WebDriver driver;
		public static Properties prop;
		public static EventFiringWebDriver e_driver;
		public static WebDriverEventListener eventListener;
		public static TestUtil testUtil;
		String Konnections = "Logins";*/
	//Page Factory - OR:
			@FindBy(id="txtUsrEmail")
			WebElement username;
			
			
			@FindBy(id="txtPwd")
			WebElement password;
			
			@FindBy(id="txtUsrEmail")
			WebElement username1;
			
			@FindBy(id="txtPwd")
			WebElement password1;
			
			//@FindBy(css="body > div.container.page-login > div:nth-child(3) > div:nth-child(1) > div > div.panel-body > form > fieldset > div:nth-child(4) > button")
			@FindBy(id="btnSignin")
			WebElement loginBtn;
			
			@FindBy(xpath="/html/body/form/div[3]/div/div/a/img")
			WebElement GtkLogo;
			
			@FindBy(xpath="//img[@id='imgusrProfileDP']")
			WebElement profileicon;
			@FindBy(id="lnk")
			WebElement signout;
			
			//@FindBy(xpath="//button[contains(text(),'Sign Up')]")
			//WebElement signUpBtn;
			//@FindBy(xpath="/html/body/div[1]/div/a/span")
			//@FindBy(xpath="//img[contains(@class,'img-responsive')]")
			//WebElement idnty;
			
			//Initializing the Page Objects:
			public LoginPage() {
				//PageFactory pf = new PageFactory();
				PageFactory.initElements(driver, this);
			}
			
			//Actions:
			public String validateLoginPageTitle(){
				return driver.getTitle();
			}
			
			public boolean validateGTKimage(){
				return GtkLogo.isDisplayed();
			}
			
			public HomePage login(String un, String pwd){
				username.sendKeys(un);
				password.sendKeys(pwd);
				/*username1.sendKeys(un);
				password1.sendKeys(pwd);*/
				
				//loginBtn.click();
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("arguments[0].click();", loginBtn);
				    	    
				
				return new HomePage();
				
				
				
				
				}
			 
			
			public String SecondUserLogin(String un1,String pwd1) throws InterruptedException{ 
				
				/*String browserName = prop.getProperty("browser");
				if(browserName.equals("chrome")){
					System.out.println("Launching CHROME browser......");
					System.setProperty("webdriver.chrome.driver", "C:\\Seleniumdrivers\\chromedriver32v26march18.exe");	
					driver  = new ChromeDriver();
				  }
				
				else if(browserName.equals("FF")){
					System.out.println("Launching FIREFOX browser......");
					System.setProperty("webdriver.gecko.driver", "C:\\Seleniumdrivers\\geckodriverx64.exe");	
					driver = new FirefoxDriver();
				  }
				
				else if(browserName.equals("IEbrowser")){
					System.out.println("Launching INTERNET EXPLORER browser.....");
					System.setProperty("webdriver.ie.driver", "C:\\Seleniumdrivers\\IEDriverServerx32bit.exe");
					driver= new InternetExplorerDriver();
				  }
				
				else if(browserName.equals("Edge")){
					System.out.println("Launching MICROSOFT EDGE browser.....");
					System.setProperty("webdriver.edge.driver", "C:\\Seleniumdrivers\\MicrosoftWebDriver.exe");
					driver = new EdgeDriver();
				  }*/
				
				
				/*e_driver = new EventFiringWebDriver(driver);
				// Now create object of EventListerHandler to register it with EventFiringWebDriver
				eventListener = new WebEventListener();
				e_driver.register(eventListener);
				driver = e_driver;*/
				/*driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
				driver.manage().timeouts().setScriptTimeout(TestUtil.SCRIPT_WAIT, TimeUnit.SECONDS);
				driver.get(prop.getProperty("url"));*/
				//driver.get("https://gtdataqa.ikonnectplus.com/Login");
				username1.sendKeys(un1);
				password1.sendKeys(pwd1);
				loginBtn.click();
				/*JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("arguments[0].click();", loginBtn);
			*/
				Thread.sleep(2000);
				return un1;
				   
			   }		
			

		/*	public boolean verifyprofileicon() {
				return profileicon.isDisplayed();
			}*/
/*
			public void logout() {
				signout.click();
			}*/
			
	
	

}
