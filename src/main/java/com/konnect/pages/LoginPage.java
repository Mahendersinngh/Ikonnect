/**
 * 
 */
package com.konnect.pages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.konnect.base.TestBase;

/**
 * @author mahenderd
 *
 */
public class LoginPage extends TestBase {
	
	//Page Factory - OR:
			@FindBy(id="txtUsrEmail")
			WebElement username;
			
			@FindBy(id="txtPwd")
			WebElement password;
			
			//@FindBy(css="body > div.container.page-login > div:nth-child(3) > div:nth-child(1) > div > div.panel-body > form > fieldset > div:nth-child(4) > button")
			@FindBy(id="btnSignin")
			WebElement loginBtn;
			
			@FindBy(xpath="/html/body/form/div[3]/div/div/a/img")
			WebElement GtkLogo;
			
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
				
				//loginBtn.click();
				    	JavascriptExecutor js = (JavascriptExecutor)driver;
				    	js.executeScript("arguments[0].click();", loginBtn);
				    	    
				
				return new HomePage();
			}
			
	
	

}
