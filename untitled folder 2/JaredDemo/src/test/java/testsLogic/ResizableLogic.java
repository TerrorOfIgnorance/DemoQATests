package testsLogic;

import org.junit.Assert;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import pageObjects.Resizable;
import utils.Drivers;

public class ResizableLogic extends Resizable {
	
	/**
	 * boolean to validate the page title
	 */

	public static boolean validateResizablePageTitle() {
		try {
			Assert.assertEquals(Drivers.driver.getTitle(),
					"Resizable | Demoqa");
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	/**
	 * Logic for mouse interactions
	 * defaultFunctionalityTab (tab1)
	 */

	public static boolean validCornerResizeTab1() {
		defaultFunctionalityTab.click();
		Point location1 = cornerDivClickedToResize.getLocation();
		System.out.println(location1);
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder
				.dragAndDropBy(cornerDivClickedToResize, 300, 200).build();
		dragAndDropby.perform();
		Point location2 = cornerDivClickedToResize.getLocation();
		System.out.println(location2);
		if (location2.equals(location1)) {
			return false;
		}
		return true;
	}
	

	public static boolean validBottomResizeTab1() {
		defaultFunctionalityTab.click();
		Point location1 = bottomDivClickedToResize.getLocation();
		System.out.println(location1);
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder
				.dragAndDropBy(bottomDivClickedToResize, 0, 300).build();
		dragAndDropby.perform();
		Point location2 = bottomDivClickedToResize.getLocation();
		System.out.println(location2);
		if (location2.equals(location1)) {
			return false;
		}
		return true;
	}
	
	public static boolean validRightResizeTab1() {
		defaultFunctionalityTab.click();
		Point location1 = rightDivClickedToResize.getLocation();
		System.out.println(location1);
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder
				.dragAndDropBy(rightDivClickedToResize,300,0).build();
		dragAndDropby.perform();
		Point location2 = rightDivClickedToResize.getLocation();
		System.out.println(location2);
		if (location2.equals(location1)) {
			return false;
		}
		return true;
	}
	
	/**
	 * Logic for mouse interactions
	 * Animate Tab(tab2)
	 */
	
	public static boolean validCornerResizeTab2() {
		animateTab.click();
		Point location1 = cornerAnimateDivClickedToResize.getLocation();
		System.out.println(location1);
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder
				.dragAndDropBy(cornerAnimateDivClickedToResize, 300, 200).build();
		dragAndDropby.perform();
		Point location2 = cornerAnimateDivClickedToResize.getLocation();
		System.out.println(location2);
		if (location2.equals(location1)) {
			return false;
		}
		return true;
	}
	

	public static boolean validBottomResizeTab2() {
		animateTab.click();
		Point location1 = bottomAnimateDivClickedToResize.getLocation();
		System.out.println(location1);
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder
				.dragAndDropBy(bottomAnimateDivClickedToResize, 0, 300).build();
		dragAndDropby.perform();
		Point location2 = bottomAnimateDivClickedToResize.getLocation();
		System.out.println(location2);
		if (location2.equals(location1)) {
			return false;
		}
		return true;
	}
	
	public static boolean validRightResizeTab2() {
		animateTab.click();
		Point location1 = rightAnimateDivClickedToResize.getLocation();
		System.out.println(location1);
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder
				.dragAndDropBy(rightAnimateDivClickedToResize,300,0).build();
		dragAndDropby.perform();
		Point location2 = rightAnimateDivClickedToResize.getLocation();
		System.out.println(location2);
		if (location2.equals(location1)) {
			return false;
		}
		return true;
	}
	
	/**
	 * Logic for mouse interactions
	 * Constrain Resize Tab(tab3)
	 */
	
	public static boolean validRightConstrainResizeTab3() {
		constrainResizeAreaTab.click();
		Point location1 = rightConstrainDivClickedToResize.getLocation();
		System.out.println(location1);
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder
				.dragAndDropBy(rightConstrainDivClickedToResize,-100,0).build();
		dragAndDropby.perform();
		Point location2 = rightConstrainDivClickedToResize.getLocation();
		System.out.println(location2);
		if (location2.equals(location1)) {
			return false;
		}
		return true;
	}
	
	public static boolean validCornerConstrainResizeTab3() {
		constrainResizeAreaTab.click();
		Point location1 = cornerConstrainDivClickedToResize.getLocation();
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder
				.dragAndDropBy(cornerConstrainDivClickedToResize,-100,100).build();
		dragAndDropby.perform();
		Point location2 = cornerConstrainDivClickedToResize.getLocation();
		if (location2.equals(location1)) {
			return false;
		}
		return true;
	}
	
	public static boolean validBottomConstrainResizeTab3() {
		constrainResizeAreaTab.click();
		Point location1 = bottomConstrainDivClickedToResize.getLocation();
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder
				.dragAndDropBy(bottomConstrainDivClickedToResize,-100,100).build();
		dragAndDropby.perform();
		Point location2 = bottomConstrainDivClickedToResize.getLocation();
		if (location2.equals(location1)) {
			return false;
		}
		return true;
	}
	/**
	 * check to see if once moved to outer bound of constraint div can it move further
	 */
	
	public static boolean validResizeStaysWithConstrianTab3() {
		constrainResizeAreaTab.click();
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder
				.dragAndDropBy(cornerConstrainDivClickedToResize,400,400).build();
		dragAndDropby.perform();
		Point location2 = cornerConstrainDivClickedToResize.getLocation();
		Action dragAndDropby2 = builder
				.dragAndDropBy(cornerConstrainDivClickedToResize,400,400).build();
		dragAndDropby2.perform();
		Point location3 = cornerConstrainDivClickedToResize.getLocation();
		if (location2.equals(location3)) {
			return true;
		}
		return false;
	}
	
	/**
	 * Logic for mouse interactions
	 * Helper Tab(tab4)
	 */
	
	public static boolean validRightHelperResizeTab4() {
		helperTab.click();
		Point location1 = rightHelperDivClickedToResize.getLocation();
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder
				.dragAndDropBy(rightHelperDivClickedToResize,200,0).build();
		dragAndDropby.perform();
		Point location2 = rightHelperDivClickedToResize.getLocation();
		if (location2.equals(location1)) {
			return false;
		}
		return true;
	}
	
	public static boolean validCornerHelperResizeTab4() {
		helperTab.click();
		Point location1 = cornerHelperDivClickedToResize.getLocation();
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder
				.dragAndDropBy(cornerHelperDivClickedToResize,200,200).build();
		dragAndDropby.perform();
		Point location2 = cornerHelperDivClickedToResize.getLocation();
		if (location2.equals(location1)) {
			return false;
		}
		return true;
	}
	
	public static boolean validBottomHelperResizeTab4() {
		helperTab.click();
		Point location1 = bottomHelperDivClickedToResize.getLocation();
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder
				.dragAndDropBy(bottomHelperDivClickedToResize,200,200).build();
		dragAndDropby.perform();
		Point location2 = bottomHelperDivClickedToResize.getLocation();
		if (location2.equals(location1)) {
			return false;
		}
		return true;
	}
	
	/**
	 * Logic for mouse interactions
	 * Max/Min size Tab(tab5)
	 */
	
	public static boolean validRightMaxMinResizeTab5() {
		maxMinSizeTab.click();
		Point location1 = rightMaxMinDivClickedToResize.getLocation();
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder
				.dragAndDropBy(rightMaxMinDivClickedToResize,200,0).build();
		dragAndDropby.perform();
		Point location2 = rightMaxMinDivClickedToResize.getLocation();
		if (location2.equals(location1)) {
			return false;
		}
		return true;
	}
	
	public static boolean validCornerMaxMinResizeTab5() {
		maxMinSizeTab.click();
		Point location1 = cornerMaxMinDivClickedToResize.getLocation();
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder
				.dragAndDropBy(cornerMaxMinDivClickedToResize,200,200).build();
		dragAndDropby.perform();
		Point location2 = cornerMaxMinDivClickedToResize.getLocation();
		if (location2.equals(location1)) {
			return false;
		}
		return true;
	}
	
	public static boolean validBottomMaxMinResizeTab5() {
		maxMinSizeTab.click();
		Point location1 = bottomMaxMinDivClickedToResize.getLocation();
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder
				.dragAndDropBy(bottomMaxMinDivClickedToResize,0,200).build();
		dragAndDropby.perform();
		Point location2 = bottomMaxMinDivClickedToResize.getLocation();
		if (location2.equals(location1)) {
			return false;
		}
		return true;
	}
	
	public static boolean validMaxResizeTab5() {
		maxMinSizeTab.click();
		int location1x = cornerMaxMinDivClickedToResize.getLocation().getX();
		int location1y = cornerMaxMinDivClickedToResize.getLocation().getY();
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder
				.dragAndDropBy(cornerMaxMinDivClickedToResize,1000,1000).build();
		dragAndDropby.perform();
		int location2x = cornerMaxMinDivClickedToResize.getLocation().getX();
		int location2y = cornerMaxMinDivClickedToResize.getLocation().getY();
		if ((location1x + 1000)==(location2x)||(location1y + 1000)==(location2y)){
			return false;
		}
		return true;
	}
	
	public static boolean validMinResizeTab5() {
		maxMinSizeTab.click();
		int location1x = cornerMaxMinDivClickedToResize.getLocation().getX();
		int location1y = cornerMaxMinDivClickedToResize.getLocation().getY();
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder
				.dragAndDropBy(cornerMaxMinDivClickedToResize,-1000,-1000).build();
		dragAndDropby.perform();
		int location2x = cornerMaxMinDivClickedToResize.getLocation().getX();
		int location2y = cornerMaxMinDivClickedToResize.getLocation().getY();
		if ((location1x - 1000)==(location2x)||(location1y - 1000)==(location2y)){
			return false;
		}
		return true;
	}
}

