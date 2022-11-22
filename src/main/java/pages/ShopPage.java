package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.SeleniumWrappers;

public class ShopPage extends SeleniumWrappers{
	
	public ShopPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	//locators
	@FindBy(css="a[href*='cookbooks']") public WebElement productCategory_cookBooks;
	@FindBy(css="a[class*='hover_icon_link'][href*='a-hundred-and-one-receipes']>span[class='onsale']") public WebElement book_A_hundred_and_one_recipes_sale;
	@FindBy(css="a[class*='hover_icon_link'][href*='cooking-with-love']>span[class='onsale']") public WebElement book_Cooking_with_love_sale;
	@FindBy(css="a[class*='hover_icon_link'][href*='healthy-lifestyle']>span[class='onsale']") public WebElement book_Healthy_lifestyle_sale;
	@FindBy(css="a[class*='hover_icon_link'][href*='the-vegan-cookery']>span[class='onsale']") public WebElement book_The_vegan_cookery_sale;
	@FindBy(css="a[class*='hover_icon_link'][href*='ultimate-book-of-receipes']>span[class='onsale']") public WebElement book_Ultimate_book_of_recipes_sale;
}
