/**
 * 
 */
package com.konnect.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.konnect.util.TestUtil;
import com.konnect.util.WebEventListener;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;


/**
 * @author mahenderd
 *
 */
	public class TestBase2 {
	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static WebDriverEventListener eventListener;
	
	@Test
	public TestBase2()
	{
		try {
			prop = new Properties();
			//FileInputStream ip = new FileInputStream(System.getProperty("C:\\Users\\mahenderd\\eclipse-workspace\\automationGT\\MavenGTKonnect\\src\\main\\java\\com\\gtkonnect\\config"));
			//prop.load(ip);
			//FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\gtkonnect\\config\\config.properties");
			// From GT
			//FileInputStream ip = new FileInputStream("C:\\Users\\mahenderd\\eclipse-workspace\\automationGT\\MavenGTKonnect\\src\\main\\java\\com\\gtkonnect\\config\\config.properties");
			//prop.load(ip);
			
			FileInputStream ip = new FileInputStream("E:\\MavenprojectGTK\\KonnectPortal\\src\\main\\java\\com\\konnect\\config\\config.properties");
			prop.load(ip);
			
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialization()
	{
		//prop.getProperty("browser");
		String browserName = prop.getProperty("browser");
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
		  }
		
		e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(TestUtil.SCRIPT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}	
	
}
