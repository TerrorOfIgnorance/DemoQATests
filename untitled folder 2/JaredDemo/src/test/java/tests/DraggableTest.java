package tests;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import testsLogic.DraggableLogic;
import utils.Drivers;


public class DraggableTest extends BasePageTest {
	
	pageObjects.Draggable draggable = PageFactory.initElements(Drivers.driver,
			pageObjects.Draggable.class);
	static DesiredCapabilities capability = new DesiredCapabilities();

	@Before
	public void beforeEachTest() {
		Drivers.driver.get("http://demoqa.com/draggable/");
	}

	@Test
	public void testDraggablePageTitle() {
		DraggableLogic.validateDraggablePageTitle();
	}
	
	/**
	 * Draggability tests
	 * tab1
	 *//*
	
	@Test
	public void testValidDragDivTab1() {
		assertTrue(DraggableLogic.validDragDivTab1());
	}
	
	*//**
	 * Draggability tests
	 * tab2
	 *//*
	
	@Test
	public void testDragVerticleDivTab2() {
		assertTrue(DraggableLogic.dragVerticleDivTab2());
	}
	
	@Test
	public void testDragHorizontalDivTab2() {
		assertTrue(DraggableLogic.dragHorizontalDivTab2());
	}
	
	@Test
	public void testDragWithinBoxDivTab2() {
		assertTrue(DraggableLogic.dragWithinBoxDivTab2());
	}
	
	@Test
	public void testDragWithinParentDivTab2() {
		assertTrue(DraggableLogic.dragWithinParentDivTab2());
	}
	
	*//**
	 * Draggability tests
	 * tab3
	 * Can't find a way of determining the cursor type for the following test
	 *//*
	
	@Test
	public void testValidCursorTypeCrosshair() {
		assertTrue(DraggableLogic.validCursorTypeCrosshair());
	}
	
	*//**
	 * Draggability tests
	 * tab4
	 *//*
	
	@Test
	public void testDragEventDivTab4(){
		assertTrue(DraggableLogic.dragEventDivTab4());
	}
	
	@Test
	public void testDragEventDivValidStartCounterTab4(){
		assertTrue(DraggableLogic.dragEventDivValidStartCounterTab4());
	}
	
	@Test
	public void testDragEventDivValidStopCounterTab4(){
		assertTrue(DraggableLogic.dragEventDivValidStopCounterTab4());
	}
	
	@Test
	public void testDragEventDivValidDragCounterTab4(){
		assertTrue(DraggableLogic.dragEventDivValidDragCounterTab4());
	}

	*//**
	 * Draggability tests
	 * tab5
	 * @throws InterruptedException 
	 *//*
	
	@Test
	public void testValidDragMeDownTab5() throws InterruptedException{
		assertTrue(DraggableLogic.validDragMeDownTab5());
	}
	
	@Test
	public void testValidDragItem1ToBottom() throws InterruptedException{
		assertTrue(DraggableLogic.validDragItem1ToBottom());
	}
	
	@Test
	public void testValidDragItem5ToTop() throws InterruptedException{
		assertTrue(DraggableLogic.validDragItem5ToTop());
	}*/

	@AfterClass
	public static void afterClass() {
		Drivers.driver.quit();
	}
}