package tests;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import testsLogic.SortableLogic;
import utils.Drivers;

public class SortableTest extends BasePageTest{
	
	pageObjects.Sortable sortable = PageFactory.initElements(Drivers.driver,pageObjects.Sortable.class);
	static DesiredCapabilities capability = new DesiredCapabilities();

	@Before
	public void beforeEachTest() {
		Drivers.driver.get("http://demoqa.com/sortable/");
	}

	@Test
	public void testSortablePageTitle() {
		SortableLogic.validateSortablePageTitle();
	}

	/**
	 * Testing the sortability of list items in tab1
	 * @throws InterruptedException 
	 *//*
	
	@Test
	public void validSortItem1ToItem7() throws InterruptedException {
		assertTrue(SortableLogic.validSortItem1ToItem7());
	}
	
	*//**
	 * Testing the sortability of grid items in tab3
	 *
	 *//*
	
	@Test
	public void validSortGrid() throws InterruptedException {
		assertTrue(SortableLogic.validSortGrid());
	}
*/

	@AfterClass
	public static void afterClass() {
		Drivers.driver.quit();
	}
}