package tests;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import testsLogic.AutocompleteLogic;
import utils.Drivers;


public class AutocompleteTest extends BasePageTest {

	pageObjects.Autocomplete autocomplete = PageFactory.initElements(
			Drivers.driver, pageObjects.Autocomplete.class);
	static DesiredCapabilities capability = new DesiredCapabilities();

	@Before
	public void beforeEachTest() {
		Drivers.driver.get("http://demoqa.com/autocomplete/");
	}

	@Test
	public void testAutocompletePageTitle() {
		AutocompleteLogic.validateAutocompletePageTitle();
	}

	

	/**
	 * Tests for the autocomplete functionality tab1
	 * 
	 * @throws InterruptedException
	 */

	@Test
	public void validAutoCompleteDropDown() throws InterruptedException {
		assertTrue(AutocompleteLogic.validAutoCompleteDropDown());
	}

	/**
	 * Tests for the autocomplete functionality tab2
	 * 
	 * @throws InterruptedException
	 */

	@Test
	public void validAutoCompleteColdFusionDropDown()
			throws InterruptedException {
		assertTrue(AutocompleteLogic.validAutoCompleteColdFusionDropDown());
	}

	@Test
	public void validAutoCompleteHaskellDropDown() throws InterruptedException {
		assertTrue(AutocompleteLogic.validAutoCompleteHaskellDropDown());
	}

	/**
	 * Tests for the autocomplete functionality tab3
	 * 
	 * @throws InterruptedException
	 */

	@Test
	public void validAutoCompleteCategoriesTab() throws InterruptedException {
		assertTrue(AutocompleteLogic.validAutoCompleteCategoriesTab());
	}


	@AfterClass
	public static void afterClass() {
		Drivers.driver.quit();
	}
}
