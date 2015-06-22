package tests;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import testsLogic.demoqaLogic;
import utils.Drivers;

public class demoqaTest extends BasePageTest {

	pageObjects.demoqa demoqa = PageFactory.initElements(Drivers.driver, pageObjects.demoqa.class);
	static DesiredCapabilities capability = new DesiredCapabilities();

	@Before
	public void beforeEachTest() {
		Drivers.driver.get("http://demoqa.com/");
	}

	@Test
	public void testHomePageTitle() {
		demoqaLogic.validatedemoqaPageTitle();
	}

	/**
	 * Are the Clickable Elements Clickable Tests
	 */

	@Test
	public void uniqueAndCleanLinkIsClickable() {
		assertTrue(demoqaLogic.uniqueAndCleanLinkIsClickable());
	}

	@Test
	public void customerSupportLinkClickable() {
		assertTrue(demoqaLogic.customerSupportLinkClickable());
	}

	@Test
	public void tveryFlexableLinkClickable() {
		assertTrue(demoqaLogic.veryFlexableLinkClickable());
	}

	@Test
	public void tab1Clickable() {
		assertTrue(demoqaLogic.tab1Clickable());
	}

	@Test
	public void tab2Clickable() {
		assertTrue(demoqaLogic.tab2Clickable());
	}

	@Test
	public void tab3Clickable() {
		assertTrue(demoqaLogic.tab3Clickable());
	}

	@Test
	public void tab4Clickable() {
		assertTrue(demoqaLogic.tab4Clickable());
	}

	@Test
	public void tab5Clickable() {
		assertTrue(demoqaLogic.tab5Clickable());
	}


	/**
	 * Visibility Tests
	 */

	@Test
	public void tabDivIsDisplayed() {
		assertTrue(demoqaLogic.tabDivIsDisplayed());
	}


	/**
	 * Do the links redirect to the correct URL Tests
	 */

	@Test
	public void testRedirectToUniqueAndCleanLink() {
		demoqaLogic.redirectToUniqueAndCleanLink();
	}

	@Test
	public void testRedirectToCustomerSupportLink() {
		demoqaLogic.redirectToCustomerSupportLink();
	}

	@Test
	public void testRedirectToVeryFlexableLink() {
		demoqaLogic.redirectToVeryFlexableLink();
	}


	@AfterClass
	public static void afterClass() {
		Drivers.driver.quit();

	}
}
