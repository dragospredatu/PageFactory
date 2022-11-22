package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.SeleniumWrappers;

public class BlogClassicPage extends SeleniumWrappers{
	
	public BlogClassicPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	//locators
	@FindBy(css="input[title='Search for:']") public WebElement searchField;
	@FindBy(css="button[type='submit'][class='search_button icon-search']") public WebElement searchButton;
	@FindBy(css="h4[class='post_title']>a[href*='wont-stop-buying-books']") public WebElement wontStopBuyingBooksPost;

}