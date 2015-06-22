package testsLogic;

import org.junit.Assert;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import pageObjects.Draggable;
import utils.Drivers;


public class DraggableLogic extends Draggable {

	/**
	 * boolean to validate the page title
	 */

	public static boolean validateDraggablePageTitle() {
		try {
			Assert.assertEquals(Drivers.driver.getTitle(),
					"Draggable | Demoqa");
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	/**
	 * Default functionality tab (tab1)
	 * Mouse movement's logic to test dragging ability
	 */
	
	public static boolean validDragDivTab1() {
		defaultFunctionalityTab.click();
		Point location1 = draggableDivTab1.getLocation();
		System.out.println(location1);
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder.dragAndDropBy(draggableDivTab1,200,100).build();
				dragAndDropby.perform();
				Point location2 = draggableDivTab1.getLocation();
				System.out.println(location2);
		if (location2.equals(location1)) {
			return false;
		} 
			return true;
	}
	
	/**
	 * Constrain movement tab (tab2)
	 * Mouse movement's logic to test dragging abilities
	 */
	
	public static boolean dragVerticleDivTab2() {
		constrainMovementTab.click();
		Point location1 = verticleDraggableDiv.getLocation();
		System.out.println(location1);
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder.dragAndDropBy(verticleDraggableDiv,100,100).build();
				dragAndDropby.perform();
				Point location2 = verticleDraggableDiv.getLocation();
				System.out.println(location2);
		if (location2.equals(location1)) {
			return false;
		} 
        // checks if the div moved horizontally 
		// resulting in a failure of functionality
		if (location2.getX() != (location1.getX())){ 
			return false;
		}
			return true;
	}
	
	public static boolean dragHorizontalDivTab2() {
		constrainMovementTab.click();
		Point location1 = horizontalDraggableDiv.getLocation();
		System.out.println(location1);
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder.dragAndDropBy(horizontalDraggableDiv,100,100).build();
				dragAndDropby.perform();
				Point location2 = horizontalDraggableDiv.getLocation();
				System.out.println(location2);
		if (location2.equals(location1)) {
			return false;
		} 
        // checks if the div moved vertically 
		// resulting in a failure of functionality
		if (location2.getY() != (location1.getY())){ 
			return false;
		}
			return true;
	}
	
	public static boolean dragWithinBoxDivTab2() {
		constrainMovementTab.click();
		Point location1 = withinBoxDraggableDiv.getLocation();
		System.out.println(location1 +"location 1 for stays within box div");
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder.dragAndDropBy(withinBoxDraggableDiv,600,100).build();
				dragAndDropby.perform();
				Point location2 = withinBoxDraggableDiv.getLocation();
				System.out.println(location2 +"location 2 for stays within box div");
		if (location2.equals(location1)) {
			return false;
		}
		//if the location2 is beyond these bounds then 
		//the withinBoxDraggableDiv is being moved beyond the
		//containment box, meaning a failure of functionality
		if (location2.getX()> 815 || location2.getY()> 600){
			System.out.println("The div didn't remain in the box div");
			return false;
		}
			return true;
	}
	
	public static boolean dragWithinParentDivTab2() {
		constrainMovementTab.click();
		Point location1 = withinParentDraggableDiv.getLocation();
		System.out.println(location1 +"location 1 for withinParentDraggableDiv");
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder.dragAndDropBy(withinParentDraggableDiv,100,100).build();
				dragAndDropby.perform();
				Point location2 = withinParentDraggableDiv.getLocation();
				System.out.println(location2 +"location 2 for withinParentDraggableDiv");
		if (location2.equals(location1)) {
			return false;
		}
		//if the location2 is beyond these bounds then 
		//the withinParentDraggableDiv is being moved beyond the
		// parent box, meaning a failure of functionality
		if (location2.getX()> 421 || location2.getY()< 544){
			System.out.println("The div didn't remain in the parent div");
			return false;
		}
			return true;
	}
	
	
	/**
	 * Cursor Style tab (tab3)
	 * Mouse movement's logic and cursor locations to test dragging abilities
	 */
	
	public static boolean validCursorTypeCrosshair(){
		cursorStyleTab.click();
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder.clickAndHold(left5Top5DraggableDiv).build();
				dragAndDropby.perform();
				String cursorType = left5Top5DivCrosshairCursor.getCssValue("cursor");
				System.out.println(cursorType);
				return true;
	}
	
	/**
	 * Events tab (tab4)
	 * Mouse movement's logic to test dragging abilities
	 */
	public static boolean dragEventDivTab4() {
		eventsTab.click();
		Point location1 = eventDraggableDiv.getLocation();
		System.out.println(location1 +"location 1 for eventDraggableDiv");
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder.dragAndDropBy(eventDraggableDiv,200,200).build();
				dragAndDropby.perform();
				Point location2 = eventDraggableDiv.getLocation();
				System.out.println(location2 +"location 2 for eventDraggableDiv");
		if (location2.equals(location1)) {
			return false;
		}
			return true;
	}
	
	public static boolean dragEventDivValidStartCounterTab4() {
		eventsTab.click();
		String startcount1 = startCount.getText();
		System.out.println(startcount1);
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder.dragAndDropBy(eventDraggableDiv,200,200).build();
				dragAndDropby.perform();
				String startcount2 = startCount.getText();
				System.out.println(startcount2);
		if (startcount1.equals(startcount2)) {
			return false;
		}
			return true;
	}
	
	public static boolean dragEventDivValidStopCounterTab4() {
		eventsTab.click();
		String stopcount1 = stopCount.getText();
		System.out.println(stopcount1);
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder.dragAndDropBy(eventDraggableDiv,200,200).build();
				dragAndDropby.perform();
				String stopcount2 = stopCount.getText();
				System.out.println(stopcount2);
		if (stopcount1.equals(stopcount2)) {
			return false;
		}
			return true;
	}
	
	public static boolean dragEventDivValidDragCounterTab4() {
		eventsTab.click();
		String dragCount1 = dragCount.getText();
		System.out.println(dragCount);
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder.dragAndDropBy(eventDraggableDiv,200,200).build();
				dragAndDropby.perform();
				String dragCount2 = dragCount.getText();
				System.out.println(dragCount2);
		if (dragCount1.equals(dragCount2)) {
			return false;
		}
			return true;
	}
	
	/**
	 * Draggable and Sortable tab (tab5)
	 * Mouse movement's logic to test dragging abilities
	 * @throws InterruptedException 
	 */
	
	public static boolean validDragMeDownTab5() throws InterruptedException {
		DraggableAndSortableTab.click();
		Point location1 = draggableBox.getLocation();
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder.dragAndDropBy(draggableBox,200,400).build();
				dragAndDropby.perform();
				Thread.sleep(2000);
				Point location2 = draggableBox.getLocation();
		if (location1.equals(location2)) {
			return true;
		}
			return false;
	}
	
	public static boolean validDragItem1ToBottom() throws InterruptedException  {
		DraggableAndSortableTab.click();
		Point alphaLocationOfItem1 = item1Div.getLocation();
		System.out.println(alphaLocationOfItem1);
		Point alphaLocationOfItem5 = item5Div.getLocation();
		System.out.println(alphaLocationOfItem5);
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDrop = builder.clickAndHold(item1Div)
				.moveByOffset(0,100)
				.release(item1Div)
				.build();
				dragAndDrop.perform();
				Thread.sleep(2000);
				Point locationOfItem1 = item1Div.getLocation();
				System.out.println(locationOfItem1);
		if (alphaLocationOfItem5.equals(locationOfItem1)) {
			return true;
		}
			return false;
	}
	
	public static boolean validDragItem5ToTop() throws InterruptedException  {
		DraggableAndSortableTab.click();
		Point alphaLocationOfItem1 = item1Div.getLocation();
		System.out.println(alphaLocationOfItem1);
		Point alphaLocationOfItem5 = item5Div.getLocation();
		System.out.println(alphaLocationOfItem5);
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDrop = builder.clickAndHold(item5Div)
				.moveByOffset(0,-100)
				.release(item5Div)
				.build();
				dragAndDrop.perform();
				Thread.sleep(2000);
				Point locationOfItem5 = item5Div.getLocation();
				System.out.println(locationOfItem5);
		if (alphaLocationOfItem1.equals(locationOfItem5)) {
			return true;
		}
			return false;
	}
}
