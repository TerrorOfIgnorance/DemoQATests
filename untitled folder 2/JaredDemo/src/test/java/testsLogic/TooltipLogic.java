package testsLogic;

import org.junit.Assert;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import pageObjects.Tooltip;
import utils.Drivers;


public class TooltipLogic extends Tooltip {

	/**
	 * Boolean to validate the page title
	 */

	public static boolean validateTooltipPageTitle() {
		try {
			Assert.assertEquals(Drivers.driver.getTitle(), "Tooltip | Demoqa");
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	/**
	 * Tooltip specific redirects
	 */

	public static void redirectToThemeRollerLink() {
		themeRoller.click();
		if (Drivers.driver.getCurrentUrl() == "http://jqueryui.com/themeroller/") {
			boolean toThemeRoller = true;
			Assert.assertTrue(toThemeRoller);
		}
	}

	/**
	 * Tooltip input and widget functionality logic
	 */

	public static boolean inputAgeValid() {
		defaultFunctionalityTab.click();
		ageInput.clear();
		ageInput.click();
		ageInput.sendKeys("4000");
		if (ageInput.getText() != null) {
			return true;
		}
		return false;
	}
	
	public static boolean tooltipMessageDisplayed() {
		defaultFunctionalityTab.click();
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDrop = builder
				.moveToElement(tooltipsWidget)
				.build();
		dragAndDrop.perform();
		if (tooltipsWidgetMessage.isDisplayed()) {
			return true;
		}
		return false;
	}
	
	public static boolean ageInputMessageDisplayed() {
		defaultFunctionalityTab.click();
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDrop = builder
				.moveToElement(ageInput)
				.build();
		dragAndDrop.perform();
		if (ageInputMessage.isDisplayed()) {
			return true;
		}
		return false;
	}
	
	public static boolean themeRollerMessageDisplayed() {
		defaultFunctionalityTab.click();
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDrop = builder
				.moveToElement(themeRoller)
				.build();
		dragAndDrop.perform();
		if (themeRollerMessage.isDisplayed()) {
			return true;
		}
		return false;
	}
	
	/**
	 * Custom animation demo tab's logic
	 */
	
	public static boolean showOptionMessageDisplayed() {
		customAnimationDemoTab.click();
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDrop = builder
				.moveToElement(showOption)
				.build();
		dragAndDrop.perform();
		if (showOptionMessage.isDisplayed()) {
			return true;
		}
		return false;
	}
	
	public static boolean hideOptionMessageDisplayed() {
		customAnimationDemoTab.click();
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDrop = builder
				.moveToElement(hideOption)
				.build();
		dragAndDrop.perform();
		if (hideOptionMessage.isDisplayed()) {
			return true;
		}
		return false;
	}
	
	public static boolean openEventOptionMessageDisplayed() {
		customAnimationDemoTab.click();
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDrop = builder
				.moveToElement(openEvent)
				.build();
		dragAndDrop.perform();
		if (openEvent.isDisplayed()) {
			return true;
		}
		return false;
	}
}