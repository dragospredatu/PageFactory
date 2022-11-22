package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.BlogClassicPage;
import pages.BlogPostPage;
import pages.NavMenuPage;
import pages.ShopPage;
import utils.BaseTest;
import utils.TestNgListener;

@Listeners(TestNgListener.class)
public class HomeworkCurs23 extends BaseTest{
	
	@Test(priority = 1)
	public void testHomework1() {
		
		NavMenuPage navMenu= new NavMenuPage(driver);
		navMenu.navigateTo(navMenu.blogLink);
		navMenu.navigateTo(navMenu.blogClassicLink);
		
		BlogClassicPage blogClassic = new BlogClassicPage(driver);
		blogClassic.sendKeys(blogClassic.searchField, "Why I");
		blogClassic.click(blogClassic.searchButton);
		blogClassic.waitForElementToBeClickable(blogClassic.wontStopBuyingBooksPost);
		blogClassic.wontStopBuyingBooksPost.click();
		
		BlogPostPage blogPost = new BlogPostPage(driver);
		blogPost.waitForElementToBeVisible(blogPost.postInfoTags);
		assertTrue(blogPost.postInfoTags.getText().contains("Classic"));
		assertTrue(blogPost.postInfoTags.getText().contains("News"));
		assertTrue(blogPost.postInfoTags.getText().contains("Recommend"));
	}
	
	@Test(priority = 2)
	public void testHomework2() throws InterruptedException {
		
		NavMenuPage navMenu= new NavMenuPage(driver);
		navMenu.navigateTo(navMenu.shopLink);
		
		ShopPage shopPage = new ShopPage(driver);
		shopPage.click(shopPage.productCategory_cookBooks);
		shopPage.waitForElementToBeVisible(shopPage.book_A_hundred_and_one_recipes_sale);
		assertTrue(shopPage.book_A_hundred_and_one_recipes_sale.getText().contains("SALE!"));
		shopPage.waitForElementToBeVisible(shopPage.book_Cooking_with_love_sale);
		assertTrue(shopPage.book_Cooking_with_love_sale.getText().contains("SALE!"));
		shopPage.waitForElementToBeVisible(shopPage.book_Healthy_lifestyle_sale);
		assertTrue(shopPage.book_Healthy_lifestyle_sale.getText().contains("SALE!"));
		shopPage.waitForElementToBeVisible(shopPage.book_The_vegan_cookery_sale);
		assertTrue(shopPage.book_The_vegan_cookery_sale.getText().contains("SALE!"));
		shopPage.waitForElementToBeVisible(shopPage.book_Ultimate_book_of_recipes_sale);
		assertTrue(shopPage.book_Ultimate_book_of_recipes_sale.getText().contains("SALE!"));
	}
}