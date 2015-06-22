package testsLogic;

import java.util.ArrayList;

import org.junit.Assert;
import pageObjects.FramesAndWindows;
import utils.Drivers;


public class FramesAndWindowsLogic extends FramesAndWindows {

	/**
	 * Boolean to validate the page title
	 */

	public static boolean validateFramesAndWindowsPageTitle() {
		try {
			Assert.assertEquals(Drivers.driver.getTitle(),
					"Frames and windows | Demoqa");
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	/**
	 * Logic for the opening of new tab
	 * tab1
	 */
	
	public static void validNewTabOpened(){
		openNewWindowTab.click();
		newBrowserTabLink.click();
		ArrayList<String> tabs2 = new ArrayList<String> (Drivers.driver.getWindowHandles());
	    Drivers.driver.switchTo().window(tabs2.get(1));
	    if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/frames-and-windows/#") {
			boolean toNewTab = true;
			Assert.assertTrue(toNewTab);
		}	
	}
	
	/**
	 * Logic for the opening of new window
	 * tab2
	 */
	
	public static void validNewWindowOpened(){
		openSeperateNewWindowTab.click();
		newSeperateBrowserTabLink.click();
		ArrayList<String> tabs2 = new ArrayList<String> (Drivers.driver.getWindowHandles());
	    Drivers.driver.switchTo().window(tabs2.get(1));
	    if (Drivers.driver.getCurrentUrl() == "http://www.toolsqa.com/registration") {
			boolean toNewWindow = true;
			Assert.assertTrue(toNewWindow);
		}	
	}
	
	/**
	 * Logic for the opening of new window
	 * tab2
	 */
	
	public static void validNewFramesetOpened(){
		framesetTab.click();
		openFramesetWindowLink.click();
		ArrayList<String> tabs2 = new ArrayList<String> (Drivers.driver.getWindowHandles());
	    Drivers.driver.switchTo().window(tabs2.get(1));
	    if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/wp-content/themes/wp-knowledge-base/frame1.html") {
			boolean toFrameset = true;
			Assert.assertTrue(toFrameset);
		}	
	}
}
