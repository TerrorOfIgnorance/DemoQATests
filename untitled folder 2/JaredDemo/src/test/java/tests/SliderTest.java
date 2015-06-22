package tests;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import testsLogic.SliderLogic;
import utils.Drivers;

public class SliderTest extends BasePageTest {
	
	pageObjects.Slider slider = PageFactory.initElements(Drivers.driver,pageObjects.Slider.class);
	static DesiredCapabilities capability = new DesiredCapabilities();

	@Before
	public void beforeEachTest() {
		
		Drivers.driver.get("http://demoqa.com/slider/");
	}

	@Test
	public void testSliderPageTitle() {
		SliderLogic.validateSliderPageTitle();
	}

	/**
	 * Mouse movement functionality to test slider
	 * 
	 */
	
	@Test
	public void testMoveTheSlider() {
		assertTrue(SliderLogic.moveTheSlider());
	}

	@AfterClass
	public static void afterClass() {
		Drivers.driver.quit();
	}
}