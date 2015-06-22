package tests;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import testsLogic.SamplePost2Logic;
import utils.Drivers;

public class SamplePost2Test extends BasePageTest {

	pageObjects.SamplePost2 samplePost2 = PageFactory.initElements(
			Drivers.driver, pageObjects.SamplePost2.class);
	static DesiredCapabilities capability = new DesiredCapabilities();

	@Before
	public void beforeEachTest() {
		Drivers.driver.get("http://demoqa.com/sample-post2/");
	}

	@Test
	public void testSamplePost2PageTitle() {
		SamplePost2Logic.validateSamplePost2PageTitle();
	}

	/**
	 * Do the links redirect to the correct URL Tests
	 */

	

	@Test
	public void testRedirectToUncategorizedLink() {
		SamplePost2Logic.redirectToUncategorizedLink();
	}

	@Test
	public void testRedirectToSamplePost2DateLink() {
		SamplePost2Logic.redirectToSamplePost2DateLink();
	}

	@Test
	public void testRedirectToAdminLink() {
		SamplePost2Logic.redirectToAdminLink();
	}

	@Test
	public void testRedirectToPermalinkLink() {
		SamplePost2Logic.redirectToPermalinkLink();
	}

	@Test
	public void testRedirectToPreviousPostLink() {
		SamplePost2Logic.redirectToPreviousPostLink();
	}

	@Test
	public void testRedirectToAvatarImageLink() {
		SamplePost2Logic.redirectToAvatarImageLink();
	}

	@Test
	public void testRedirectToArticlesWrittenByPosterLink() {
		SamplePost2Logic.redirectToArticlesWrittenByPosterLink();
	}

	/**
	 * Tests for the like it button and its counter
	 */
	@Test
	public void likeItButtonChanged() {
		SamplePost2Logic.likeItButtonChanged();
	}

	/**
	 * Tests for comment validation
	 */

	@Test
	public void errorPageDisplayedWhenEmailNull() {
		SamplePost2Logic.errorPageDisplayedWhenEmailNull();
	}

	@Test
	public void errorPageDisplayedWhenNameNull() {
		SamplePost2Logic.errorPageDisplayedWhenNameNull();
	}

	@Test
	public void errorPageDisplayedWhenNameEmailNull() {
		SamplePost2Logic.errorPageDisplayedWhenNameEmailNull();
	}

	@Test
	public void errorPageDisplayedCommentsNull() {
		SamplePost2Logic.errorPageDisplayedCommentsNull();
	}

	@Test
	public void validCommentPosted() throws Exception {
		SamplePost2Logic.validCommentPosted();
	}

	/**
	 * Visibility Tests
	 */

	@Test
	public void postParagraphIsDisplayed() {
		assertTrue(SamplePost2Logic.postParagraphIsDisplayed());
	}

	@AfterClass
	public static void afterClass() {
		Drivers.driver.quit();
	}

}
