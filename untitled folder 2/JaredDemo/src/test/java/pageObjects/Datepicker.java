package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * The page object for the Datepicker page Implemented locating through xpath
 * only when no other means applied.
 * 
 * @author jPayne
 */

public class Datepicker extends BasePage {

	/**
	 * The main droppable menu in center of page (4 tabs)
	 */

	@FindBy(id = "ui-id-1")
	protected static WebElement defaultFunctionalityTab1;// tab1

	@FindBy(id = "ui-id-2")
	protected static WebElement animations;// tab2

	@FindBy(id = "ui-id-3")
	protected static WebElement displayMonthAndYear;// tab3

	@FindBy(id = "ui-id-4")
	protected static WebElement formatDate;// tab4

	/**
	 * Default Functionality tab's elements
	 */

	@FindBy(id = "datepicker1")
	protected static WebElement datepickerInputTab1;

	@FindBy(id = "ui-datepicker-div")
	protected static WebElement datepickerTab1;
	
	/**
	 * Animations tab's elements
	 */

	@FindBy(id = "datepicker2")
	protected static WebElement datepickerInput2;

	@FindBy(id = "anim")
	protected static WebElement animationsSelect;

	@FindBy(xpath = ".//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[3]/a")
	protected static WebElement sixteenthOfAMonth;

	/**
	 * Display month and year tab's elements
	 */

	@FindBy(id = "datepicker3")
	protected static WebElement datepickerTab3;
	
	@FindBy(xpath = ".//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[4]/a")
	protected static WebElement seventeenthOfAMonth;

	/**
	 * Format date tab's elements
	 */

	@FindBy(id = "datepicker4")
	protected static WebElement datepickerTab4;

	@FindBy(id = "format")
	protected static WebElement formatSelect;
	
	@FindBy(xpath =".//*[@id='format']/option[6]")
	protected static WebElement fullTextDate;
	
	@FindBy(xpath =".//*[@id='format']/option[4]")
	protected static WebElement mediumDate;
	
	@FindBy(xpath = ".//*[@id='ui-datepicker-div']/table/tbody/tr[2]/td[4]/a")
	protected static WebElement tenthOfAMonth;

}
