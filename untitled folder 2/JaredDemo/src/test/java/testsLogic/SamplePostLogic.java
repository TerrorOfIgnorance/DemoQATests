package testsLogic;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageObjects.SamplePost;
import utils.Drivers;
import utils.RandomStringGenerator;
import utils.commUtil;

public class SamplePostLogic extends SamplePost{
	
	/**
	 * boolean to validate the page title
	 */

	public static boolean validateSamplePostPageTitle() {
		try {
			Assert.assertEquals(Drivers.driver.getTitle(),
					"Sample Post | Demoqa");
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	/**
	 * SamplePost specific redirects
	 */
	
	public static void redirectToUncategorizedLink() {
		uncategorizedLink.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/category/uncategorized/") {
			boolean toUncategorizedLink = true;
			Assert.assertTrue(toUncategorizedLink);
		}
	}
	
	public static void redirectToSmallHomeLink() {
		smallHomeLink.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/") {
			boolean toSmallHomeLink = true;
			Assert.assertTrue(toSmallHomeLink);
		}
	}
	
	public static void redirectToSamplePostDateLink() {
		samplePostDateLink.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/sample-post/") {
			boolean toSamplePost2DateLink = true;
			Assert.assertTrue(toSamplePost2DateLink);
		}
	}
	
	public static void redirectToAdminLink() {
		adminLink.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/author/admin/") {
			boolean toAdminLink = true;
			Assert.assertTrue(toAdminLink);
		}
	}
	
	public static void redirectToPermalinkLink() {
		permalinkLink.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/sample-post/") {
			boolean toPermalinkLink = true;
			Assert.assertTrue(toPermalinkLink);
		}
	}
	
	public static void redirectToNextPostLink() {
		toNextPostLink.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/sample-post2/") {
			boolean toNextPostLink = true;
			Assert.assertTrue(toNextPostLink);
		}
	}
	
	public static void redirectToAvatarImageLink() {
		avatarImageLink.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/author/admin/") {
			boolean toAvatarImageLink = true;
			Assert.assertTrue(toAvatarImageLink);
		}
	}
	
	public static void redirectToArticlesWrittenByPosterLink() {
		toArticlesWrittenByPosterLink.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/author/admin/") {
			boolean toArticlesWrittenByPosterLink = true;
			Assert.assertTrue(toArticlesWrittenByPosterLink);
		}
	}

	/**
	 * Visibility booleans
	 */

	public static boolean postParagraphIsDisplayed() {
		try {
			ExpectedConditions.visibilityOf(postParagraph);
			commUtil.implicitWait(10);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	/**
	 * Logic for the tests associated with the like it button and its counter
	 */
	
	public static void likeItButtonChanged(){
		try{
		likeTheArticleButton.click();
		} catch (Exception buttonDisabled){
			System.out.println("The button is not functional...test failed");
		}
		if(likeTheArticleButton.getText().equalsIgnoreCase("you like it already")){
			boolean buttonChanged = true;
			Assert.assertTrue(buttonChanged);
		}	
	}
	/**
	 * For tests regarding comment validation
	 */
	
	public static void errorPageDisplayedWhenEmailNull(){
		nameInputField.clear();
		emailInputField.clear();
		nameInputField.sendKeys("tester");
		postCommentButton.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/wp-comments-post.php") {
			boolean toErrorPage = true;
			Assert.assertTrue(toErrorPage);
		}
	}	
	
	public static void errorPageDisplayedWhenNameNull(){
		nameInputField.clear();
		emailInputField.clear();
		emailInputField.sendKeys("tester@test.com");
		postCommentButton.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/wp-comments-post.php") {
			boolean toErrorPage = true;
			Assert.assertTrue(toErrorPage);
		}
	}	
	
	public static void errorPageDisplayedWhenNameEmailNull(){
		nameInputField.clear();
		emailInputField.clear();
		postCommentButton.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/wp-comments-post.php") {
			boolean toErrorPage = true;
			Assert.assertTrue(toErrorPage);
		}
	}	
	
	public static void errorPageDisplayedCommentsNull(){
		nameInputField.clear();
		emailInputField.clear();
		commentInputField.clear();
		emailInputField.sendKeys("tester@test.com");
		nameInputField.sendKeys("tester");
		postCommentButton.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/wp-comments-post.php") {
			boolean toErrorPage = true;
			Assert.assertTrue(toErrorPage);
		}
	}
	
	public static void validCommentPosted() throws Exception{
		emailInputField.sendKeys(RandomStringGenerator.generateRandomString(10,
				RandomStringGenerator.Mode.ALPHANUMERIC)
				+ "@"+ RandomStringGenerator.generateRandomString(5,
						RandomStringGenerator.Mode.ALPHA) + ".com");
		nameInputField.sendKeys(RandomStringGenerator.generateRandomString(20,
				RandomStringGenerator.Mode.ALPHA));
		commentInputField.sendKeys(RandomStringGenerator.generateRandomString(20,
				RandomStringGenerator.Mode.ALPHANUMERIC));
		postCommentButton.click();
		int i = 41;
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/sample-post/#comment-" + i++) {
			boolean toErrorPage = true;
			Assert.assertTrue(toErrorPage);
		}
	}	
}
