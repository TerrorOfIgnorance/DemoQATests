package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * The page object for the Slider page Implemented locating through xpath
 * only when no other means applied.
 * 
 * @author jPayne
 */

public class Slider extends BasePage {

	/**
	 * The main droppable menu in center of page (5 tabs)
	 */

	@FindBy(id = "ui-id-1")
	protected static WebElement rangeSliderTab;// tab1
	
	/**
	 * The range slider elements
	 */
	
	@FindBy(id = "amount1")
	protected static WebElement correspondingNumberToSlider;
	
	@FindBy(xpath = ".//*[@id='slider-range-max']/a")
	protected static WebElement slider;
	
	@FindBy(xpath = ".//*[@id='slider-range-max']/div")
	protected static WebElement sliderDiv;
	
}
