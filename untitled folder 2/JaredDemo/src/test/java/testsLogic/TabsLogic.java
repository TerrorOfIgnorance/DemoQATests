package testsLogic;

import org.junit.Assert;
import pageObjects.Tabs;
import utils.Drivers;


public class TabsLogic extends Tabs{
	
	/**
	 * Boolean to validate the page title
	 */

	public static boolean validateTabsPageTitle() {
		try {
			Assert.assertEquals(Drivers.driver.getTitle(),
					"Tabs | Demoqa");
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	/**
	 * Logic for interactions with the tabs
	 */
	
	public static boolean validTab1(){
		tab1.click();
		if(tab1ParagraphDiv.isDisplayed()){
			return true;
		}else {
			return false;
		}	
	}
	
	public static boolean validTab2(){
		tab2.click();
		if(tab2ParagraphDiv.isDisplayed()){
			return true;
		}else {
			return false;
		}	
	}
	
	public static boolean validTab3(){
		tab3.click();
		if(tab3ParagraphDiv.isDisplayed()){
			return true;
		}else {
			return false;
		}	
	}
}