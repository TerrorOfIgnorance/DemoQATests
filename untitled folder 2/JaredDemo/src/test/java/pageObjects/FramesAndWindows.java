package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FramesAndWindows extends BasePage {

	/**
	 * The main droppable menu in center of page (5 tabs)
	 */

	@FindBy(id = "ui-id-1")
	protected static WebElement openNewWindowTab;// tab1

	@FindBy(id = "ui-id-2")
	protected static WebElement openSeperateNewWindowTab;// tab2

	@FindBy(id = "ui-id-3")
	protected static WebElement framesetTab;// tab3
	
	/**
	 * Open New Window tab's elements
	 */
	
	@FindBy(linkText = "New Browser Tab")
	protected static WebElement newBrowserTabLink;	
	
	/**
	 * Open Seperate New Window tab's elements
	 */
	
	@FindBy(linkText = "Open New Seprate Window")
	protected static WebElement newSeperateBrowserTabLink;	
	
	/**
	 * Open Frameset Window tab's elements
	 */
	
	@FindBy(linkText ="Open Frameset Window")
	protected static WebElement openFramesetWindowLink;	
	
}

