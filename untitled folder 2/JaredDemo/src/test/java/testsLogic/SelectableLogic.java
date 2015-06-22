package testsLogic;

import org.junit.Assert;
import pageObjects.Selectable;
import utils.Drivers;

public class SelectableLogic extends Selectable{
	
	/**
	 * Boolean to validate the page title
	 */

	public static boolean validateSelectablePageTitle() {
		try {
			Assert.assertEquals(Drivers.driver.getTitle(),
					"Selectable | Demoqa");
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	/**
	 * mouse interactions 
	 * Default functionality tab1
	 * @throws InterruptedException 
	 */
	
	public static boolean validSelectableItem1()  {
		defaultFunctionalityTab.click();
		String AlphaColorOfItem1 =item1.getCssValue("color");
		System.out.println(AlphaColorOfItem1);
		item1.click();
		String OmegaColorOfItem1 =item1.getCssValue("color");
		System.out.println(OmegaColorOfItem1);
		if (AlphaColorOfItem1.equals(OmegaColorOfItem1)){
			return false;
		}
		return true;
	}
	
	public static boolean validSelectableItems() throws InterruptedException {
		defaultFunctionalityTab.click();
		String AlphaColorOfItem1 =item1.getCssValue("color");
	
		item1.click();
		Thread.sleep(2000);
		String OmegaColorOfItem1 =item1.getCssValue("color");
	
		if (AlphaColorOfItem1.equals(OmegaColorOfItem1)
				 ) {
			return false;
		}
		return true;
	}
	
	/**
	 * mouse interactions 
	 * Display as grid tab2
	 */
	
	public static boolean validGridSelectableItems() {
		displayAsGridTab.click();
		String AlphaColorOfGrid1 =grid1.getCssValue("color");
		grid1.click();
		String OmegaColorOfGrid1 =grid1.getCssValue("color");
		if (AlphaColorOfGrid1.equals(OmegaColorOfGrid1)
				) {
			return false;
		}
		return true;
	}
	
	/**
	 * mouse interactions 
	 * Serialize tab3
	 */

	public static boolean validSerializeSelectableItems() {
		serializeTab.click();
		serializeItem1.click();
		if(!(selectResult.getText().equals("#1"))){
			return false; 
		}
		return true;	
	}	
}