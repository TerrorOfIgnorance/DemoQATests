package testsLogic;

import org.junit.Assert;
import pageObjects.Autocomplete;
import utils.Drivers;

public class AutocompleteLogic extends Autocomplete{

	/**
	 * Boolean to validate the page title
	 */

	public static boolean validateAutocompletePageTitle() {
		try {
			Assert.assertEquals(Drivers.driver.getTitle(),
					"Autocomplete | Demoqa");
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	/**
	 * Logic for autocomplete interactions
	 * defaultFunctionalityTab (tab1)
	 * @throws InterruptedException 
	 */

	public static boolean validAutoCompleteDropDown() throws InterruptedException {
		defaultFunctionalityTab.click();
		tagsInput.sendKeys("a");
		Thread.sleep(3000);
		if (dropDownActionScript.isDisplayed()
				&& dropDownAppleScript.isDisplayed() ) {
			return true;
		}
		return false;
	}
	
	/**
	 * Logic for autocomplete interactions
	 * Multiple Values Tab (tab2)
	 * @throws InterruptedException 
	 */

	public static boolean validAutoCompleteColdFusionDropDown() throws InterruptedException {
		multipleValuesTab.click();
		tagProgrammingLanguagesInput.sendKeys("Cold");
		Thread.sleep(3000);
		if (dropDownColdFusion.isDisplayed()) {
			return true;
		}
		return false;
	}
	
	public static boolean validAutoCompleteHaskellDropDown() throws InterruptedException {
		multipleValuesTab.click();
		tagProgrammingLanguagesInput.sendKeys("Has");
		Thread.sleep(3000);
		if (dropDownHaskell.isDisplayed()) {
			return true;
		}
		return false;
	}

	/**
	 * Categories tab specific logic
	 * @return
	 * @throws InterruptedException
	 */
	
	public static boolean validAutoCompleteCategoriesTab() throws InterruptedException {
		categoriesTab.click();
		categoriesSearchInput.sendKeys("x");
		Thread.sleep(3000);
		if (dropDownAnnhhx10.isDisplayed()) {
			return true;
		}
		return false;
	}
	
}
