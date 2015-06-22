package tests;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import testsLogic.ResizableLogic;
import utils.Drivers;

public class ResizableTest extends BasePageTest {

	pageObjects.Resizable resizable = PageFactory.initElements(Drivers.driver,
			pageObjects.Resizable.class);
	static DesiredCapabilities capability = new DesiredCapabilities();

	@Before
	public void beforeEachTest() {
		Drivers.driver.get("http://demoqa.com/resizable/");
	}

	@Test
	public void testDroppablePageTitle() {
		ResizableLogic.validateResizablePageTitle();
	}
	
	/**
	 * Tests for the divs abilities to resize
	 * tab 1
	 *//*
	
	@Test
	public void validCornerResizeTab1() {
		assertTrue(ResizableLogic.validCornerResizeTab1());
	}
	
	@Test
	public void validBottomResizeTab1() {
		assertTrue(ResizableLogic.validBottomResizeTab1());
	}
	
	@Test
	public void validRightResizeTab1() {
		assertTrue(ResizableLogic.validRightResizeTab1());
	}
	
	*//**
	 * Tests for the divs abilities to resize
	 * tab 2
	 *//*
	
	@Test
	public void validCornerResizeTab2() {
		assertTrue(ResizableLogic.validCornerResizeTab1());
	}
	
	@Test
	public void validBottomResizeTab2() {
		assertTrue(ResizableLogic.validBottomResizeTab1());
	}
	
	@Test
	public void validRightResizeTab2() {
		assertTrue(ResizableLogic.validRightResizeTab2());
	}
	
	*//**
	 * Tests for the divs abilities to resize
	 * tab 3
	 *//*
	
	@Test
	public void validRightConstrainResizeTab3() {
		assertTrue(ResizableLogic.validRightConstrainResizeTab3());
	}
	
	@Test
	public void validCornerConstrainResizeTab3() {
		assertTrue(ResizableLogic.validCornerConstrainResizeTab3());
	}
	
	@Test
	public void validBottomConstrainResizeTab3() {
		assertTrue(ResizableLogic.validBottomConstrainResizeTab3());
	}
	
	@Test
	public void validResizeStaysWithConstrianTab3() {
		assertTrue(ResizableLogic.validResizeStaysWithConstrianTab3());
	}
	
	*//**
	 * Tests for the divs abilities to resize
	 * tab 4
	 *//*
	
	@Test
	public void validRightHelperResizeTab4() {
		assertTrue(ResizableLogic.validRightHelperResizeTab4());
	}
	
	@Test
	public void validCornerHelperResizeTab4() {
		assertTrue(ResizableLogic.validCornerHelperResizeTab4());
	}
	
	@Test
	public void validBottomHelperResizeTab4() {
		assertTrue(ResizableLogic.validBottomHelperResizeTab4());
	}
	
	*//**
	 * Tests for the divs abilities to resize
	 * tab 5
	 *//*
	
	@Test
	public void validRightMaxMinResizeTab5() {
		assertTrue(ResizableLogic.validRightMaxMinResizeTab5());
	}
	
	@Test
	public void validCornerMaxMinResizeTab5() {
		assertTrue(ResizableLogic.validCornerMaxMinResizeTab5());
	}
	
	@Test
	public void validBottomMaxMinResizeTab5() {
		assertTrue(ResizableLogic.validBottomMaxMinResizeTab5());
	}
	
	@Test
	public void validMaxResizeTab5() {
		assertTrue(ResizableLogic.validMaxResizeTab5());
	}
	
	@Test
	public void validMinResizeTab5() {
		assertTrue(ResizableLogic.validMinResizeTab5());
	}*/

	@AfterClass
	public static void afterClass() {
		Drivers.driver.quit();
	}
}
