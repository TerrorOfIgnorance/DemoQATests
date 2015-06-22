package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class demoqa extends BasePage {

	/**
	 * The options in middle of page
	 */

	@FindBy(xpath = ".//*[@id='post-9']/div/div[1]/div/p[1]/a/img")
	protected static WebElement uniqueAndCleanLink;

	@FindBy(xpath = ".//*[@id='post-9']/div/div[2]/div/p[1]/i/a/img")
	protected static WebElement customerSupportLink;

	@FindBy(xpath = ".//*[@id='post-9']/div/div[3]/div/i/a/img")
	protected static WebElement veryFlexableLink;

	/**
	 * div that holds the tab elements
	 */

	@FindBy(className = "col-md-6 tabcontents")
	protected static WebElement tabDiv;

	/**
	 * tabs under the about div
	 */

	@FindBy(id = "ui-id-1")
	protected static WebElement tab1;

	@FindBy(id = "ui-id-2")
	protected static WebElement tab2;

	@FindBy(id = "ui-id-3")
	protected static WebElement tab3;

	@FindBy(id = "ui-id-4")
	protected static WebElement tab4;

	@FindBy(id = "ui-id-5")
	protected static WebElement tab5;

}