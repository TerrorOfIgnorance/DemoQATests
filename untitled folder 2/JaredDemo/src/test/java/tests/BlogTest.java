package tests;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import testsLogic.BlogLogic;
import utils.Drivers;

public class BlogTest extends BasePageTest{
	
	pageObjects.Blog blog = PageFactory.initElements(Drivers.driver, pageObjects.Blog.class);
	static DesiredCapabilities capability = new DesiredCapabilities();

	@Before
	public void beforeEachTest() {
		Drivers.driver.get("http://demoqa.com/blog/");
	}
	
	@Test
	public void testBlogPageTitle() {
		BlogLogic.validateBlogPageTitle();
	}

	/**
	 * Blog page specific redirect Tests
	 */
	
	@Test
	public void testRedirectToSmallLowerHomeLink() {
		BlogLogic.redirectToSmallLowerHomeLink();
	}
	
	@Test
	public void testRedirectToSamplePost2HeaderLink() {
		BlogLogic.redirectToSamplePost2HeaderLink();
	}
	
	@Test
	public void testRedirectToSamplePost2DateLink() {
		BlogLogic.redirectToSamplePost2DateLink();
	}
	
	@Test
	public void samplePost2ImageIsDisplayed(){
		BlogLogic.samplePost2ImageIsDisplayed();
	}
	
	@Test
	public void testRedirectToSamplePost2ImageLink() {
		BlogLogic.redirectToSamplePost2ImageLink();
	}
	
	@Test
	public void testRedirectToSamplePost2ReadMoreButton() {
		BlogLogic.redirectToSamplePost2ReadMoreButton();
	}
	
	@Test
	public void testRedirectToSamplePostHeaderLink() {
		BlogLogic.redirectToSamplePostHeaderLink();
	}
	
	@Test
	public void testRedirectToSamplePostDateLink() {
		BlogLogic.redirectToSamplePostDateLink();
	}
	
	@Test
	public void testRedirectToSamplePostImageLink() {
		BlogLogic.redirectToSamplePostImageLink();
	}
	
	@Test
	public void testRedirectToSamplePostReadMoreButton() {
		BlogLogic.redirectToSamplePostReadMoreButton();
	}
	
	/** 
	 * Visibility Tests
	 */
	
	@Test
	public void samplePost2ParagraphIsDisplayed() {
		assertTrue(BlogLogic.samplePost2ParagraphIsDisplayed());
	}
	
	@Test
	public void samplePostParagraphIsDisplayed() {
		assertTrue(BlogLogic.samplePostParagraphIsDisplayed());
	}
	@AfterClass
	public static void afterClass() {
		Drivers.driver.quit();
	}
}
