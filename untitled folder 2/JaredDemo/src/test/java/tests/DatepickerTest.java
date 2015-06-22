package tests;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import testsLogic.DatepickerLogic;
import utils.Drivers;

public class DatepickerTest extends BasePageTest {
	
	pageObjects.Datepicker datepicker = PageFactory.initElements(Drivers.driver,pageObjects.Datepicker.class);
	static DesiredCapabilities capability = new DesiredCapabilities();

	@Before
	public void beforeEachTest() {
		Drivers.driver.get("http://demoqa.com/datepicker/");
	}

	@Test
	public void testDatepickerPageTitle() {
		DatepickerLogic.validateDatepickerPageTitle();
	}

	/**
	 * Tab 1 Tests, Datepicker display
	 */

	@Test
	public void testDoesDatePickerDisplayTab1() {
		DatepickerLogic.doesDatePickerDisplayTab1();
	}
	
	/**
	 * Tab 2 Tests, Datepicker display and function
	 */
	
	@Test
	public void testIsDatePickerFunctional(){
		assertTrue(DatepickerLogic.isDatePickerFunctional());
	}
	
	/**
	 * Tab 3 Tests, Datepicker display and function 
	 */
	
	@Test
	public void testIsDatePickerFunctinalTab3() {
		assertTrue(DatepickerLogic.isDatePickerFunctionalTab3());
	}
	
	/**
	 * Tab 4 Tests, Datepicker display and function 
	 */
	
	@Test
	public void testIsDatePickerFunctinalTab4() {
		assertTrue(DatepickerLogic.isDatePickerFunctionalTab4());
	}
	
	/*@Test
	public void testIsFormatCorrect() throws InterruptedException {
		assertTrue(DatepickerLogic.isFormatCorrect());
	}*/

	@AfterClass
	public static void afterClass() {
		Drivers.driver.quit();
	}
}
