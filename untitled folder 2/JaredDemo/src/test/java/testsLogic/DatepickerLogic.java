package testsLogic;

import org.junit.Assert;
import pageObjects.Datepicker;
import utils.Drivers;


public class DatepickerLogic extends Datepicker{
	
	/**
	 * Boolean to validate the page title
	 */

	public static boolean validateDatepickerPageTitle() {
		try {
			Assert.assertEquals(Drivers.driver.getTitle(),
					"Datepicker | Demoqa");
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	/**
	 * For the Datepicker specifics
	 * tab 1 Default Functionality
	 */
	
	public static void doesDatePickerDisplayTab1(){
		defaultFunctionalityTab1.click();
		datepickerInputTab1.click();
		if(datepickerTab1.isDisplayed()){
			boolean visibleDatePicker = true;
			Assert.assertTrue(visibleDatePicker);
		}
		/*defaultFunctionalityTab1.click();
		if(datepickerTab1.isDisplayed()){
			boolean visibleDatePicker = true;
			Assert.assertFalse(visibleDatePicker);
		}*/
	}
	
	/**
	 * For the Datepicker specifics
	 * tab 2 Animations
	 */
	

	public static boolean isDatePickerFunctional(){
		animations.click();
		datepickerInput2.click();
		sixteenthOfAMonth.click();
		if(datepickerInput2.getText()!= null){
			return true;
		}
		return false;	
	}
	
	/**
	 * For the Datepicker specifics
	 * tab 3 Display Month and Year
	 */
	
	public static boolean isDatePickerFunctionalTab3(){
		displayMonthAndYear.click();
		datepickerTab3.click();
		seventeenthOfAMonth.click();
		if(datepickerTab3.getText()!= null){
			return true;
		}
		return false;	
	}
	
	/**
	 * For the Datepicker specifics
	 * tab 4 Format Date
	 */
	
	public static boolean isDatePickerFunctionalTab4(){
		formatDate.click();
		datepickerTab4.click();
		tenthOfAMonth.click();
		if(datepickerTab4.getText()!= null){
			return true;
		}
		return false;	
	}
	
	public static boolean isFormatCorrect() throws InterruptedException{
		formatDate.click();
		datepickerTab4.click();
		tenthOfAMonth.click();
		formatSelect.click();
		Thread.sleep(2000);
		mediumDate.click();
		Thread.sleep(4000);
		if(datepickerTab4.getText().equalsIgnoreCase("??/10/????")){
			return true;
		}
		return false;	
	}
}