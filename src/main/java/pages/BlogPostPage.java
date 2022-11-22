package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.SeleniumWrappers;

public class BlogPostPage extends SeleniumWrappers{

	public BlogPostPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	//locators
	@FindBy(css="div[class='post_info']>span[class*='post_info_tags']") public WebElement postInfoTags;
}
