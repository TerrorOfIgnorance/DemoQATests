package tests;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import testsLogic.SelectableLogic;
import utils.Drivers;

public class SelectableTest extends BasePageTest {
	
	pageObjects.Selectable selectable = PageFactory.initElements(Drivers.driver,pageObjects.Selectable.class);
	static DesiredCapabilities capability = new DesiredCapabilities();

	@Before
	public void beforeEachTest() {
		Drivers.driver.get("http://demoqa.com/selectable/");
	}

	@Test
	public void testSelectablePageTitle() {
		SelectableLogic.validateSelectablePageTitle();
	}

	/**
	 * Mouse interacations / selectability Tests
	 * @throws InterruptedException 
	 */
	
	@Test
	public void testValidSelectableItem1(){
		assertTrue(SelectableLogic.validSelectableItem1());
	}
	
	@Test
	public void testValidSelectableItems() throws InterruptedException {
		assertTrue(SelectableLogic.validSelectableItems());
	}
	
	@Test
	public void testValidGridSelectableItems() {
		assertTrue(SelectableLogic.validGridSelectableItems());
	}
	
	@Test
	public void testValidSerializeSelectableItems() {
		assertTrue(SelectableLogic.validSerializeSelectableItems());
	}

	@AfterClass
	public static void afterClass() {
		Drivers.driver.quit();
	}
}