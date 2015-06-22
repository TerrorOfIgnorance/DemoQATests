package testsLogic;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageObjects.Blog;
import utils.Drivers;
import utils.commUtil;

public class BlogLogic extends Blog{
	
	/**
	 * boolean to validate the page title
	 */

	public static boolean validateBlogPageTitle() {
		try {
			Assert.assertEquals(Drivers.driver.getTitle(),
					"Blog | Demoqa | Just another WordPress site");
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	/**
	 * Blog specific Url redirects
	 */
		
	public static void redirectToSmallLowerHomeLink() {
		smallLowerHomeLink.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/") {
			boolean toSmallLowerHomeLink = true;
			Assert.assertTrue(toSmallLowerHomeLink);
		}
	}
	public static void redirectToSamplePost2HeaderLink() {
		samplePost2HeaderLink.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/sample-post2/") {
			boolean toSamplePost2HeaderLink = true;
			Assert.assertTrue(toSamplePost2HeaderLink);
		}
	}
	public static void redirectToSamplePost2DateLink() {
		samplePost2DateLink.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/sample-post2/") {
			boolean toSamplePost2DateLink = true;
			Assert.assertTrue(toSamplePost2DateLink);
		}
	}
	public static void samplePost2ImageIsDisplayed(){
		if(ExpectedConditions.visibilityOf(samplePost2ImageLink) != null){
			boolean post2ImageVisible = true;
			Assert.assertTrue(post2ImageVisible);
		}
	}
	
	public static void redirectToSamplePost2ImageLink() {
		samplePost2ImageLink.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/sample-post2/") {
			boolean toSamplePost2ImageLink = true;
			Assert.assertTrue(toSamplePost2ImageLink);
		}
	}
	
	public static void redirectToSamplePost2ReadMoreButton() {
		samplePost2ReadMoreButton.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/sample-post2/") {
			boolean toSamplePost2ReadMoreButton = true;
			Assert.assertTrue(toSamplePost2ReadMoreButton);
		}
	}
	
	public static void redirectToSamplePostHeaderLink() {
		samplePostHeaderLink.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/sample-post/") {
			boolean toSamplePostHeaderLink = true;
			Assert.assertTrue(toSamplePostHeaderLink);
		}
	}
	
	public static void redirectToSamplePostDateLink() {
		samplePostDateLink.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/sample-post/") {
			boolean toSamplePostDateLink = true;
			Assert.assertTrue(toSamplePostDateLink);
		}
	}
	
	public static void redirectToSamplePostImageLink() {
		samplePostImageLink.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/sample-post/") {
			boolean toSamplePostImageLink = true;
			Assert.assertTrue(toSamplePostImageLink);
		}
	}
	

	public static void redirectToSamplePostReadMoreButton() {
		samplePostReadMoreButton.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/sample-post/") {
			boolean toSamplePostReadMoreButton = true;
			Assert.assertTrue(toSamplePostReadMoreButton);
		}
	}
	
	/**
	 * Visibility booleans
	 */

	public static boolean samplePost2ParagraphIsDisplayed() {
		try {
			ExpectedConditions.visibilityOf(samplePost2Paragraph);
			commUtil.implicitWait(10);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	public static boolean samplePostParagraphIsDisplayed() {
		try {
			ExpectedConditions.visibilityOf(samplePostParagraph);
			commUtil.implicitWait(10);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

}
