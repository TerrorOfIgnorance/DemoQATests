package tests;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import testsLogic.MenuLogic;
import utils.Drivers;


public class MenuTest extends BasePageTest {
	
	pageObjects.Menu menu = PageFactory.initElements(Drivers.driver,pageObjects.Menu.class);
	static DesiredCapabilities capability = new DesiredCapabilities();

	@Before
	public void beforeEachTest() {
		Drivers.driver.get("http://demoqa.com/menu/");
	}

	@Test
	public void testMenuPageTitle() {
		MenuLogic.validateMenuPageTitle();
	}
	
	/**
	 * Visibility Tests for sub menus
	 *//*
	
	@Test
	public void homeSubMenusAreDisplayed() {
		assertTrue(MenuLogic.homeSubMenusAreDisplayed());
	}
	
	@Test
	public void fAQSubMenusAreDisplayed() throws InterruptedException {
		assertTrue(MenuLogic.fAQSubMenusAreDisplayed());
	}
	
	@Test
	public void newsSubMenusAreDisplayed() {
		assertTrue(MenuLogic.newsSubMenusAreDisplayed());
	}*/

	@AfterClass
	public static void afterClass() {
		Drivers.driver.quit();
	}

}
