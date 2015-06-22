package testsLogic;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageObjects.demoqa;
import utils.Drivers;
import utils.commUtil;

public class demoqaLogic extends demoqa {

	public static boolean validatedemoqaPageTitle() {
		try {
			Assert.assertEquals(Drivers.driver.getTitle(),
					"Demoqa | Just another WordPress site");
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static boolean uniqueAndCleanLinkIsClickable() {
		try {
			ExpectedConditions.elementToBeClickable(uniqueAndCleanLink);
			commUtil.implicitWait(5);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static boolean customerSupportLinkClickable() {
		try {
			ExpectedConditions.elementToBeClickable(customerSupportLink);
			commUtil.implicitWait(5);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static boolean veryFlexableLinkClickable() {
		try {
			ExpectedConditions.elementToBeClickable(veryFlexableLink);
			commUtil.implicitWait(5);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static boolean tab1Clickable() {
		try {
			ExpectedConditions.elementToBeClickable(tab1);
			commUtil.implicitWait(5);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static boolean tab2Clickable() {
		try {
			ExpectedConditions.elementToBeClickable(tab2);
			commUtil.implicitWait(5);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static boolean tab3Clickable() {
		try {
			ExpectedConditions.elementToBeClickable(tab3);
			commUtil.implicitWait(5);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static boolean tab4Clickable() {
		try {
			ExpectedConditions.elementToBeClickable(tab4);
			commUtil.implicitWait(5);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static boolean tab5Clickable() {
		try {
			ExpectedConditions.elementToBeClickable(tab5);
			commUtil.implicitWait(5);
		} catch (Exception e) {
			return false;
		}
		return true;
	}


	/**
	 * Visibility booleans
	 */
	public static boolean tabDivIsDisplayed() {
		try {
			ExpectedConditions.visibilityOf(tabDiv);
			commUtil.implicitWait(10);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	/**
	 * Methods for redirecting to new urls
	 */

	public static void redirectToUniqueAndCleanLink() {
		uniqueAndCleanLink.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/wp-content/uploads/2014/08/pattern-14.png") {
			boolean toUniqueAndCleanLink = true;
			Assert.assertTrue(toUniqueAndCleanLink);
		}
	}

	public static void redirectToCustomerSupportLink() {
		customerSupportLink.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/wp-content/uploads/2014/08/pattern-14.png") {
			boolean toCustomerSupportLink = true;
			Assert.assertTrue(toCustomerSupportLink);
		}
	}

	public static void redirectToVeryFlexableLink() {
		veryFlexableLink.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/wp-content/uploads/2014/08/pattern-14.png") {
			boolean toVeryFlexableLink = true;
			Assert.assertTrue(toVeryFlexableLink);
		}
	}
}
