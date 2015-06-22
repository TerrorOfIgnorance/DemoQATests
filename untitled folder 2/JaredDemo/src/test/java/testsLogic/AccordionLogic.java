package testsLogic;

import org.junit.Assert;
import pageObjects.Accordion;
import utils.Drivers;


public class AccordionLogic extends Accordion {

	/**
	 * Boolean to validate the page title
	 */

	public static boolean validateAccordionPageTitle() {
		try {
			Assert.assertEquals(Drivers.driver.getTitle(),
					"Accordion | Demoqa");
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	
	/**
	 * Logic for mouse interactions
	 * defaultFunctionalityTab (tab1)
	 */

	public static boolean section1DisplaysParagraph() {
		defaultFunctionalityTab.click();
		section1headerTab1.click();
		if (section1panelTab1.isDisplayed()) {
			return true;
		}
		return false;
	}		
	
	public static boolean section2DisplaysParagraph() {
		defaultFunctionalityTab.click();
		section2headerTab1.click();
		if (section2panelTab1.isDisplayed()) {
			return true;
		}
		return false;
	}	
	
	public static boolean section3DisplaysParagraph() {
		defaultFunctionalityTab.click();
		section3headerTab1.click();
		if (section3panelTab1.isDisplayed()) {
			return true;
		}
		return false;
	}	

	public static boolean section4DisplaysParagraph() {
		defaultFunctionalityTab.click();
		section4headerTab1.click();
		if (section4panelTab1.isDisplayed()) {
			return true;
		}
		return false;
	}	
	
	/**
	 * Logic for mouse interactions
	 * customize icons Tab (tab2)
	 */

	public static boolean section1DisplaysParagraphTab2() {
		customizeIconsTab.click();
		section1headerTab2.click();
		if (section1panelTab2.isDisplayed()) {
			return true;
		}
		return false;
	}		
	
	public static boolean section2DisplaysParagraphTab2() {
		customizeIconsTab.click();
		section2headerTab2.click();
		if (section2panelTab2.isDisplayed()) {
			return true;
		}
		return false;
	}	
	
	public static boolean section3DisplaysParagraphTab2() {
		customizeIconsTab.click();
		section3headerTab2.click();
		if (section3panelTab2.isDisplayed()) {
			return true;
		}
		return false;
	}	

	public static boolean section4DisplaysParagraphTab2() {
		customizeIconsTab.click();
		section4headerTab2.click();
		if (section4panelTab2.isDisplayed()) {
			return true;
		}
		return false;
	}	
	
	/**
	 * Logic for mouse interactions with Toggle Button
	 * customize icons Tab (tab2)
	 * @throws InterruptedException 
	 */

	public static boolean toggleButtonDisplaysArrowsTab2() throws InterruptedException {
		customizeIconsTab.click();
		toggleButton.click();
		Thread.sleep(2000);
		toggleButton.click();
		if (section1Arrow.isDisplayed()  &&
				section2Arrow.isDisplayed() &&
				section3Arrow.isDisplayed() &&
				section4Arrow.isDisplayed()) {
			return true;
		}
		return false;
	}
	
	/**
	 * Logic for mouse interactions
	 * Fill Space Tab (tab3)
	 */

	public static boolean section1DisplaysParagraphTab3() {
		fillSpaceTab.click();
		section1headerTab3.click();
		if (section1panelTab3.isDisplayed()) {
			return true;
		}
		return false;
	}		
	
	public static boolean section2DisplaysParagraphTab3() {
		fillSpaceTab.click();
		section2headerTab3.click();
		if (section2panelTab3.isDisplayed()) {
			return true;
		}
		return false;
	}	
	
	public static boolean section3DisplaysParagraphTab3() {
		fillSpaceTab.click();
		section3headerTab3.click();
		if (section3panelTab3.isDisplayed()) {
			return true;
		}
		return false;
	}	

	public static boolean section4DisplaysParagraphTab3() {
		fillSpaceTab.click();
		section4headerTab3.click();
		if (section4panelTab3.isDisplayed()) {
			return true;
		}
		return false;
	}	
}