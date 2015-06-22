package tests;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import testsLogic.DroppableLogic;
import utils.Drivers;

public class DroppableTest extends BasePageTest {

	pageObjects.Droppable droppable = PageFactory.initElements(Drivers.driver,
			pageObjects.Droppable.class);
	static DesiredCapabilities capability = new DesiredCapabilities();

	@Before
	public void beforeEachTest() {
		Drivers.driver.get("http://demoqa.com/droppable/");
	}

	@Test
	public void testDroppablePageTitle() {
		DroppableLogic.validateDroppablePageTitle();
	}

	/**
	 * Test for mouse movements and drops of elements tab1
	 *//*

	@Test
	public void validDragDivTab1() {
		assertTrue(DroppableLogic.validDragDivTab1());
	}

	@Test
	public void validDropDivResponseTab1() {
		assertTrue(DroppableLogic.validDropDivResponseTab1());
	}

	*//**
	 * Test for mouse movements and drops of elements Accept tab (tab2)
	 *//*

	@Test
	public void validDragNonValidToAccept() {
		assertTrue(DroppableLogic.validDragNonValidToAccept());
	}

	@Test
	public void validDraggableAcceptBoxToDroppableAccept() {
		assertTrue(DroppableLogic.validDraggableAcceptBoxToDroppableAccept());
	}

	*//**
	 * Test for mouse movements and drops of elements Greedy inner box on Box2
	 * Prevent propagation tab (tab3)
	 *//*

	@Test
	public void validTab3DraggableBoxToOuterBox1() {
		assertTrue(DroppableLogic.validTab3DraggableBoxToOuterBox1());
	}

	@Test
	public void validTab3DraggableBoxToInnerBox1() {
		assertTrue(DroppableLogic.validTab3DraggableBoxToInnerBox1());
	}

	@Test
	public void validTab3DraggableBoxToOuterBox2() {
		assertTrue(DroppableLogic.validTab3DraggableBoxToOuterBox2());
	}

	@Test
	public void validTab3DraggableBoxToInnerBox2() {
		assertTrue(DroppableLogic.validTab3DraggableBoxToInnerBox2());
	}

	*//**
	 * Mouse movement draggablity and reverting tests
	 * Revert Draggable Position tab (tab4)
	 * @throws InterruptedException 
	 *//*

	@Test
	public void draggableBoxRevertsAndMessageChanges() throws InterruptedException {
		assertTrue(DroppableLogic.draggableBoxRevertsAndMessageChanges());
	}
	
	@Test
	public void draggableBoxRevertsToDroppableBoxAndMessageChanges() throws InterruptedException {
		assertTrue(DroppableLogic.draggableBoxRevertsToDroppableBoxAndMessageChanges());
	}
	
	*//**
	 * Mouse movement draggablity tests
	 * Shopping cart demo tab (tab5)
	 * @throws InterruptedException 
	 *//*
	
	@Test
	public void draggingItemsToCart() throws InterruptedException  {
		assertTrue(DroppableLogic.draggingItemsToCart());
	}
*/

	@AfterClass
	public static void afterClass() {
		Drivers.driver.quit();
	}
}