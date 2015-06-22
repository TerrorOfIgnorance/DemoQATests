package testsLogic;

import org.junit.Assert;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import pageObjects.Sortable;
import utils.Drivers;

public class SortableLogic extends Sortable{
	
	/**
	 * Boolean to validate the page title
	 */

	public static boolean validateSortablePageTitle() {
		try {
			Assert.assertEquals(Drivers.driver.getTitle(),
					"Sortable | Demoqa");
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	/**
	 * Mouse interaction logic for 
	 * Default functionality tab1
	 * @throws InterruptedException 
	 */
	
	public static boolean validSortItem1ToItem7() throws InterruptedException  {
		defaultFunctionalityTab.click();
		Point locationOfItem1 =item1.getLocation();
		System.out.println(locationOfItem1);
		Point locationOfItem7 =item7.getLocation();
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDrop = builder
				.clickAndHold(item1)
				.moveByOffset(0,210)
				.moveByOffset(0,15)
				.release(item1)
				.build();
		dragAndDrop.perform();
		Thread.sleep(3000);
		Point OmegalocationOfItem1 = item1.getLocation();
		System.out.println(OmegalocationOfItem1);
		if (locationOfItem7.equals(OmegalocationOfItem1)){
			return true;
		}
		return false;
	}
	
	/**
	 * Mouse interaction logic for 
	 * Display as Grid tab3
	 *
	 */
	
	public static boolean validSortGrid() throws InterruptedException  {
		displayAsGridTab.click();
		Point AlphalocationOfGrid1 = grid1.getLocation();
		Point locationOfGrid1 =grid1.getLocation();
		System.out.println(locationOfGrid1);
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDrop = builder
				.clickAndHold(grid1)
				.moveByOffset(325,200)
				.moveByOffset(50,50)
				.build();
		dragAndDrop.perform();
		Thread.sleep(3000);
		Action release = builder
			.release(grid1).build();
			release.perform();
		Thread.sleep(3000);
		Point OmegalocationOfGrid1 = grid1.getLocation();
		System.out.println(OmegalocationOfGrid1);
		if (!( AlphalocationOfGrid1.equals(OmegalocationOfGrid1))){
			return true;
		}
		return false;
	}
}
