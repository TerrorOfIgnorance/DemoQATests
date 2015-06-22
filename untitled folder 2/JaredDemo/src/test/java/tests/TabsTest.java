package tests;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import testsLogic.TabsLogic;
import utils.Drivers;

public class TabsTest extends BasePageTest {
	
	pageObjects.Tabs tabs = PageFactory.initElements(Drivers.driver,pageObjects.Tabs.class);
	static DesiredCapabilities capability = new DesiredCapabilities();

	@Before
	public void beforeEachTest() {
		Drivers.driver.get("http://demoqa.com/tabs/");
	}

	@Test
	public void testTabsPageTitle() {
		TabsLogic.validateTabsPageTitle();
	}

	/**
	 * Tests for the validity of tabs and their corresponding paragraphs
	 * (when clicked do their paragraphs show)
	 */
	
	@Test
	public void validTab1() {
		assertTrue(TabsLogic.validTab1());
	}
	
	@Test
	public void validTab2() {
		assertTrue(TabsLogic.validTab2());
	}
	
	@Test
	public void validTab3() {
		assertTrue(TabsLogic.validTab3());
	}

	@AfterClass
	public static void afterClass() {
		Drivers.driver.quit();
	}
}
