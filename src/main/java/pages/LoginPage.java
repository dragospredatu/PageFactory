package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.SeleniumWrappers;

public class LoginPage extends SeleniumWrappers{
	
	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="ul input[id='log']") public WebElement usernameField;
	@FindBy(css="ul input[id='password']") public WebElement passwordField;
	@FindBy(css="ul input[class='submit_button']") public WebElement submitButton;
	@FindBy(css="div[class*='sc_infobox_style_error']")	public WebElement loginErrorMessage;
	@FindBy(css="div[class*='sc_infobox_style_success']") public WebElement loginSuccessMessage;
	@FindBy(css="li[class='menu_user_logout']")	public WebElement logoutButton;
	@FindBy(css="a[class='popup_close']") public WebElement closePopUpButton;

	public void loginInApp(String username, String password) {
		
		sendKeys(usernameField, username);
		sendKeys(passwordField, password);
		click(submitButton);
	}

	public void logoutFromApp() {

		click(logoutButton);
	}


	public boolean loginSuccessMessageIsDisplayed() {

		return loginSuccessMessage.isDisplayed();
	}

	public boolean loginErrorMessageIsDisplayed() {

		return loginErrorMessage.isDisplayed(); 
	}

	public boolean loginMessageIsDisplayed(WebElement element) {

		return element.isDisplayed();
	}
	
	public void closeLoginPopUp() {
		
		click(closePopUpButton);
	}

}
