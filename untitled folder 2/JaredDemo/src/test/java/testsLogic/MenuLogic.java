package testsLogic;

import org.junit.Assert;
import pageObjects.Menu;
import utils.Drivers;

public class MenuLogic extends Menu {
	
	/**
	 * Boolean to validate the page title
	 */

	public static boolean validateMenuPageTitle() {
		try {
			Assert.assertEquals(Drivers.driver.getTitle(),
					"Menu | Demoqa");
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	
	/**
	 * Logic for testing the central menu's functionality
	 * tab 1
	 */
	
	/**
	 * Logic for testing the central menu's functionality
	 * tab 2
	 */
	
	public static boolean homeSubMenusAreDisplayed() {
		menusWithSubMenus.click();
		subHomeMenuTab.click();
			if(homeSubMenuItem1.isDisplayed()&&
					homeSubMenuItem2.isDisplayed()&&
					homeSubMenuItem3.isDisplayed()&&
					homeSubMenuItem4NamedItem3.isDisplayed()){
			return true;
	}
		return false;
}
	
	public static boolean fAQSubMenusAreDisplayed() throws InterruptedException {
		menusWithSubMenus.click();
		Thread.sleep(4000);
		subFAQMenuTab.click();
		Thread.sleep(4000);
			if(fAQSubMenuItem1.isDisplayed()&&
					fAQSubMenuItem3.isDisplayed()){
			return true;
	}
		return false;
}
	
	public static boolean newsSubMenusAreDisplayed() {
		menusWithSubMenus.click();
		subNewsMenuTab.click();
			if(newsSubMenuItem1.isDisplayed()&&
					newsSubMenuItem2.isDisplayed()&&
					newsSubMenuItem3.isDisplayed()){
			return true;
	}
		return false;
	}
}
