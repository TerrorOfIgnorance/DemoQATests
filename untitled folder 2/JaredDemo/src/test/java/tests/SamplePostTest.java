package tests;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import testsLogic.SamplePostLogic;
import utils.Drivers;

public class SamplePostTest extends BasePageTest {
	
	pageObjects.SamplePost samplePost = PageFactory.initElements(
			Drivers.driver, pageObjects.SamplePost.class);
	static DesiredCapabilities capability = new DesiredCapabilities();



	@Before
	public void beforeEachTest() {
		Drivers.driver.get("http://demoqa.com/sample-post/");
	}

	@Test
	public void testSamplePostPageTitle() {
		SamplePostLogic.validateSamplePostPageTitle();
	}


	@Test
	public void testRedirectToUncategorizedLink() {
		SamplePostLogic.redirectToUncategorizedLink();
	}

	@Test
	public void testRedirectToSmallHomeLink() {
		SamplePostLogic.redirectToSmallHomeLink();
	}

	@Test
	public void testRedirectToSamplePostDateLink() {
		SamplePostLogic.redirectToSamplePostDateLink();
	}

	@Test
	public void testRedirectToAdminLink() {
		SamplePostLogic.redirectToAdminLink();
	}

	@Test
	public void testRedirectToPermalinkLink() {
		SamplePostLogic.redirectToPermalinkLink();
	}

	@Test
	public void testRedirectToNextPostLink() {
		SamplePostLogic.redirectToNextPostLink();
	}

	@Test
	public void testRedirectToAvatarImageLink() {
		SamplePostLogic.redirectToAvatarImageLink();
	}

	@Test
	public void testRedirectToArticlesWrittenByPosterLink() {
		SamplePostLogic.redirectToArticlesWrittenByPosterLink();
	}

	/**
	 * Tests for the like it button and its counter
	 */
	
	@Test
	public void likeItButtonChanged() {
		SamplePostLogic.likeItButtonChanged();
	}

	/**
	 * Tests for comment validation
	 */

	@Test
	public void errorPageDisplayedWhenEmailNull() {
		SamplePostLogic.errorPageDisplayedWhenEmailNull();
	}

	@Test
	public void errorPageDisplayedWhenNameNull() {
		SamplePostLogic.errorPageDisplayedWhenNameNull();
	}

	@Test
	public void errorPageDisplayedWhenNameEmailNull() {
		SamplePostLogic.errorPageDisplayedWhenNameEmailNull();
	}

	@Test
	public void errorPageDisplayedCommentsNull() {
		SamplePostLogic.errorPageDisplayedCommentsNull();
	}

	@Test
	public void validCommentPosted() throws Exception {
		SamplePostLogic.validCommentPosted();
	}

	/**
	 * Visibility Tests
	 */
	
	@Test
	public void postParagraphIsDisplayed() {
		assertTrue(SamplePostLogic.postParagraphIsDisplayed());
	}

	@AfterClass
	public static void afterClass() {
		Drivers.driver.quit();
	}

}
