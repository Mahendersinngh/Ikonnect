/**
 * 
 */
package com.konnect.loginpages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.konnect.base.TestBase;
import com.konnect.base.TestBase2;

/**
 * @author mahenderd
 *
 */
public class LoginPage1 extends TestBase2 {
	
	//Page Factory - OR:
			@FindBy(id="txtUsrEmail")
			WebElement username1;
			
			@FindBy(id="txtPwd")
			WebElement password1;
			
		/*	@FindBy(id="txtUsrEmail")
			WebElement username1;
			
			@FindBy(id="txtPwd")
			WebElement password1;*/
			
			//@FindBy(css="body > div.container.page-login > div:nth-child(3) > div:nth-child(1) > div > div.panel-body > form > fieldset > div:nth-child(4) > button")
			@FindBy(id="btnSignin")
			WebElement loginBtn1;
			
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
			public LoginPage1() {
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
			
			public HomePage1 login(String un1, String pwd1){
				username1.sendKeys(un1);
				password1.sendKeys(pwd1);
				/*username1.sendKeys(un);
				password1.sendKeys(pwd);*/
				
				//loginBtn.click();
				    	JavascriptExecutor js = (JavascriptExecutor)driver;
				    	js.executeScript("arguments[0].click();", loginBtn1);
				    	    
				
				return new HomePage1();
				
				}

		/*	public boolean verifyprofileicon() {
				return profileicon.isDisplayed();
			}*/
/*
			public void logout() {
				signout.click();
			}*/
			
	
	

}
