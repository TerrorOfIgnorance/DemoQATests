package testsLogic;

import org.junit.Assert;
import org.openqa.selenium.Point;
import pageObjects.Slider;
import utils.Drivers;

public class SliderLogic extends Slider {

	/**
	 * Boolean to validate the page title
	 */

	public static boolean validateSliderPageTitle() {
		try {
			Assert.assertEquals(Drivers.driver.getTitle(), "Slider | Demoqa");
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	/**
	 * Mouse actions and movements
	 */

	public static boolean moveTheSlider() {
		Point location1 = slider.getLocation();
		System.out.println(location1);
		sliderDiv.click();
				Point location2 = slider.getLocation();
				System.out.println(location2);
				if (location2.equals(location1)) {
					return false;
				} 
					return true;
			}
	}
