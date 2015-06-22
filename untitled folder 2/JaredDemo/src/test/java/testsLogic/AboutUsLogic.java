package testsLogic;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageObjects.AboutUs;
import utils.Drivers;
import utils.commUtil;

public class AboutUsLogic extends AboutUs  {

	/**
	 * boolean to validate the page title
	 */

	public static boolean validateAboutUsPageTitle() {
		try {
			Assert.assertEquals(Drivers.driver.getTitle(),
					"About us | Demoqa");
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	public static boolean aboutUsHeadingIsDisplayed() {
		try {
			ExpectedConditions.visibilityOf(aboutUsHeading);
			commUtil.implicitWait(10);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	public static boolean aboutUsParagraphIsDisplayed() {
		try {
			ExpectedConditions.visibilityOf(aboutUsParagraph);
			commUtil.implicitWait(10);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

}
