/**
 * 
 */
package com.konnect.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.konnect.base.TestBase;

/**
 * @author mahenderd
 *
 */
public class Cloudpage extends TestBase {

	@FindBy(xpath="//*[@id=\"mstLiKonnectTab\"]/a")
	WebElement Cloudlink;
	
	@FindBy(xpath="/html/body/form/div[3]/aside/section/div[2]/div[2]/ul/li[2]/a")
	WebElement Groups;

	// Initializing the Page Objects:
	public Cloudpage() {
		PageFactory.initElements(driver, this);
	}
	
	public Cloudpage clickoncloudpage() {
		Cloudlink.click();
		return null;
	}
	
	public Cloudpage clickonGroups() {
		Groups.click();
		return null;
	}
	
}
