package tests;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import testsLogic.TooltipLogic;
import utils.Drivers;

public class TooltipTest extends BasePageTest {
	
	pageObjects.Tooltip tooltip = PageFactory.initElements(Drivers.driver,pageObjects.Tooltip.class);
	static DesiredCapabilities capability = new DesiredCapabilities();

	@Before
	public void beforeEachTest() {
		Drivers.driver.get("http://demoqa.com/tooltip/");
	}

	@Test
	public void testTooltipPageTitle() {
		TooltipLogic.validateTooltipPageTitle();
	}

	/**
	 * Tooltip specific redirect Tests
	 */
	
	@Test
	public void testRedirectToThemeRollerLink() {
		TooltipLogic.redirectToThemeRollerLink();
	}
	
	/**
	 * Tooltip input and widget functionality
	 * tab1 
	 */
	
	
	@Test
	public void inputAgeValid() {
		assertTrue(TooltipLogic.inputAgeValid());
	}
	
	/**
	 * I would like to implement the following test once I learn how to test
	 * the widgets' elements
	 */
	
	/*@Test
	public void tooltipMessageDisplayed() {
		assertTrue(TooltipLogic.tooltipMessageDisplayed());
	}
	
	@Test
	public void ageInputMessageDisplayed() {
		assertTrue(TooltipLogic.ageInputMessageDisplayed());
	}
	
	@Test
	public void themeRollerMessageDisplayed() {
		assertTrue(TooltipLogic.themeRollerMessageDisplayed());
	}
	
	*//**
	 * Tooltip input and widget functionality
	 * tab2 
	 *//*
	
	@Test
	public void showOptionMessageDisplayed() {
		assertTrue(TooltipLogic.showOptionMessageDisplayed());
	}
	
	@Test
	public void hideOptionMessageDisplayed() {
		assertTrue(TooltipLogic.hideOptionMessageDisplayed());
	}
	
	@Test
	public void openEventOptionMessageDisplayed() {
		assertTrue(TooltipLogic.openEventOptionMessageDisplayed());
	}*/

	@AfterClass
	public static void afterClass() {
		Drivers.driver.quit();
	}
}