package tests;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import testsLogic.FramesAndWindowsLogic;
import utils.Drivers;


public class FramesAndWindowsTest extends BasePageTest{
	
	pageObjects.FramesAndWindows framesAndWindows = PageFactory.initElements(Drivers.driver,pageObjects.FramesAndWindows.class);
	static DesiredCapabilities capability = new DesiredCapabilities();

	@Before
	public void beforeEachTest() {
		Drivers.driver.get("http://demoqa.com/frames-and-windows/");
	}

	@Test
	public void testFramesAndWindowsPageTitle() {
		FramesAndWindowsLogic.validateFramesAndWindowsPageTitle();
	}
	
	/**
	 * Testing if the links open new Windows or tabs
	 * For Tab 1, Tab2, and Tab3
	 */
	
	@Test
	public void testValidNewTabOpened() {
		FramesAndWindowsLogic.validNewTabOpened();
	}
	
	@Test
	public void testValidNewWindowOpened() {
		FramesAndWindowsLogic.validNewWindowOpened();
	}
	
	@Test
	public void testValidNewFramesetOpened() {
		FramesAndWindowsLogic.validNewFramesetOpened();
	}
	

	@AfterClass
	public static void afterClass() {
		Drivers.driver.quit();
	}
}
