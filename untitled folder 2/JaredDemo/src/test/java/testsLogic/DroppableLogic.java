package testsLogic;

import org.junit.Assert;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import pageObjects.Droppable;
import utils.Drivers;

public class DroppableLogic extends Droppable {

	/**
	 * Boolean to validate the page title
	 */

	public static boolean validateDroppablePageTitle() {
		try {
			Assert.assertEquals(Drivers.driver.getTitle(), "Droppable | Demoqa");
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	/**
	 * Default functionality tab (tab1) Mouse movement's logic to test dropping
	 * ability
	 */

	public static boolean validDragDivTab1() {
		defaultFunctionalityTab.click();
		Point location1 = tab1DraggableBox.getLocation();
		System.out.println(location1);
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder
				.dragAndDropBy(tab1DraggableBox, 300, 100).build();
		dragAndDropby.perform();
		Point location2 = tab1DraggableBox.getLocation();
		System.out.println(location2);
		if (location2.equals(location1)) {
			return false;
		}
		return true;
	}

	public static boolean validDropDivResponseTab1() {
		defaultFunctionalityTab.click();
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDrop = builder.dragAndDrop(tab1DraggableBox,
				tab1DroppableBox).build();
		dragAndDrop.perform();
		if (droppableBoxMessage.getText().equals("Dropped!")) {
			return true;
		}
		return false;
	}

	/**
	 * Accept tab (tab2) Mouse movement's logic to test dropping ability
	 */

	public static boolean validDragNonValidToAccept() {
		acceptTab.click();
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDrop = builder.dragAndDrop(tab2DraggableNonValidBox,
				tab2DroppableAcceptBox).build();
		dragAndDrop.perform();
		if (tab2DroppableAcceptBox.getText().equals(
				"accept: �#draggableaccept�")) {
			return true;
		}
		return false;
	}

	public static boolean validDraggableAcceptBoxToDroppableAccept() {
		acceptTab.click();
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDrop = builder.dragAndDrop(tab2DraggableAcceptBox,
				tab2DroppableAcceptBox).build();
		dragAndDrop.perform();
		if (tab2DroppableAcceptBox.getText().equals("Dropped!")) {
			return true;
		}
		return false;
	}

	/**
	 * Prevent Propagation tab (tab3) Mouse movement's logic to test dropping
	 * ability
	 */

	public static boolean validTab3DraggableBoxToOuterBox1() {
		preventPropagationTab.click();
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDrop = builder.dragAndDrop(tab3DraggableBox,
				tab3OuterDroppableBox1).build();
		dragAndDrop.perform();
		if (tab3OuterDroppableBox1Message.getText().equals("Dropped!")
				&& tab3InnerDroppableBox1Message.getText().equals(
						"Inner droppable (not greedy)")
				&& tab3OuterDroppableBox2Message.getText().equals(
						"Outer droppable")
				&& tab3InnerDroppableBox2Message.getText().equals(
						"Inner droppable (greedy)")) {
			return true;
		}
		return false;
	}

	public static boolean validTab3DraggableBoxToInnerBox1() {
		preventPropagationTab.click();
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDrop = builder.dragAndDrop(tab3DraggableBox,
				tab3InnerDroppableBox1).build();
		dragAndDrop.perform();
		if (tab3OuterDroppableBox1Message.getText().equals("Dropped!")
				&& tab3InnerDroppableBox1Message.getText().equals("Dropped!")
				&& tab3OuterDroppableBox2Message.getText().equals(
						"Outer droppable")
				&& tab3InnerDroppableBox2Message.getText().equals(
						"Inner droppable (greedy)")) {
			return true;
		}
		return false;
	}

	public static boolean validTab3DraggableBoxToOuterBox2() {
		preventPropagationTab.click();
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDrop = builder.dragAndDrop(tab3DraggableBox,
				tab3OuterDroppableBox2).build();
		dragAndDrop.perform();
		if (tab3OuterDroppableBox1Message.getText().equals("Outer droppable")
				&& tab3InnerDroppableBox1Message.getText().equals(
						"Inner droppable (not greedy)")
				&& tab3OuterDroppableBox2Message.getText().equals("Dropped!")
				&& tab3InnerDroppableBox2Message.getText().equals(
						"Inner droppable (greedy)")) {
			return true;
		}
		return false;
	}

	public static boolean validTab3DraggableBoxToInnerBox2() {
		preventPropagationTab.click();
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDrop = builder.dragAndDrop(tab3DraggableBox,
				tab3InnerDroppableBox2).build();
		dragAndDrop.perform();
		if (tab3OuterDroppableBox1Message.getText().equals("Outer droppable")
				&& tab3InnerDroppableBox1Message.getText().equals(
						"Inner droppable (not greedy)")
				&& tab3OuterDroppableBox2Message.getText().equals(
						"Outer droppable")
				&& tab3InnerDroppableBox2Message.getText().equals("Dropped!")) {
			return true;
		}
		return false;
	}

	/**
	 * Revert draggable position tab (tab4) Mouse movement's logic to test
	 * dropping and reverting abilities
	 * 
	 * @throws InterruptedException
	 */

	public static boolean draggableBoxRevertsAndMessageChanges()
			throws InterruptedException {
		revertDraggableTab.click();
		Point location1 = tab4DraggableRevertBox.getLocation();
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDrop = builder.dragAndDrop(tab4DraggableRevertBox,
				tab4DroppableBox).build();
		dragAndDrop.perform();
		Thread.sleep(2000);
		Point location2 = tab4DraggableRevertBox.getLocation();
		if (tab4DroppableBoxMessage.getText().equals("Dropped!")
				&& location1.equals(location2)) {
			return true;
		}
		return false;
	}

	public static boolean draggableBoxRevertsToDroppableBoxAndMessageChanges()
			throws InterruptedException {
		revertDraggableTab.click();
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDrop = builder.dragAndDrop(
				tab4DraggableRevertNotDroppedBox, tab4DroppableBox).build();
		dragAndDrop.perform();
		Thread.sleep(2000);
		Point locationx = tab4DraggableRevertNotDroppedBox.getLocation();
		Action dragAndDrop2 = builder.dragAndDropBy(
				tab4DraggableRevertNotDroppedBox, 200, 200).build();
		dragAndDrop2.perform();
		Thread.sleep(2000);
		Point locationy = tab4DraggableRevertNotDroppedBox.getLocation();
		if (tab4DroppableBoxMessage.getText().equals("Dropped!")
				&& locationy.equals(locationx)) {
			return true;
		}
		return false;
	}

	/**
	 * Shopping Cart demo tab (tab5) Mouse movement's logic to test dropping
	 * abilities
	 * 
	 * @throws InterruptedException
	 * 
	 */

	public static boolean draggingItemsToCart() throws InterruptedException {
		shoppingCartDemoTab.click();
		tShirtsTab.click();
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropItem1 = builder.dragAndDrop(cheezeburgerShirtItem,droppableCartDiv).build();
				dragAndDropItem1.perform();
				Thread.sleep(1000);
				bagsTab.click();
		Action dragAndDropItem2 = builder.dragAndDrop(zebraStripedBagItem,droppableCartDiv).build();
				dragAndDropItem2.perform();
				Thread.sleep(1000);
		Action dragAndDropItem4 = builder.dragAndDrop(alligatorLeatherItem,droppableCartDiv).build();
				dragAndDropItem4.perform();
				Thread.sleep(1000);
				gadgetsTab.click();
		Action dragAndDropItem3 = builder.dragAndDrop(iPodItem,droppableCartDiv).build();
				dragAndDropItem3.perform();
				Thread.sleep(3000);				
		if (firstItemInCart.getText().equals("Zebra Striped")
				&&
				secondItemInCart.getText().equals("Alligator Leather")
				) {
			return true;
		}
		return false;
	}

}