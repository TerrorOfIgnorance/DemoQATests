package testsLogic;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageObjects.Services;
import utils.Drivers;
import utils.commUtil;

public class ServicesLogic extends Services {

	/**
	 * boolean to validate the page title
	 */

	public static boolean validateServicesPageTitle() {
		try {
			Assert.assertEquals(Drivers.driver.getTitle(),
					"Services | Demoqa");
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	/**
	 * Visibility booleans
	 */

	public static boolean servicesHeadingIsDisplayed() {
		try {
			ExpectedConditions.visibilityOf(servicesHeading);
			commUtil.implicitWait(10);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	public static boolean servicesParagraphIsDisplayed() {
		try {
			ExpectedConditions.visibilityOf(servicesParagraph);
			commUtil.implicitWait(10);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

}
