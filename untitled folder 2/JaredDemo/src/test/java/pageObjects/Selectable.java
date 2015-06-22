package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * The page object for the Selectable page Implemented locating through xpath
 * only when no other means applied.
 * 
 * @author jPayne
 */

public class Selectable extends BasePage {

	/**
	 * The main selectable menu in center of page (3 tabs)
	 */

	@FindBy(id = "ui-id-1")
	protected static WebElement defaultFunctionalityTab;// tab1

	@FindBy(id = "ui-id-2")
	protected static WebElement displayAsGridTab;// tab2

	@FindBy(id = "ui-id-3")
	protected static WebElement serializeTab;// tab3

	/**
	 * Default functionality tab's selectable list items
	 */
	
	@FindBy(xpath=".//*[@id='selectable']/li[contains(.,'Item 1')]")
	protected static WebElement item1;
	
	@FindBy(xpath=".//*[@id='selectable']/li[contains(.,'Item 2')]")
	protected static WebElement item2;
	
	@FindBy(xpath=".//*[@id='selectable']/li[contains(.,'Item 3')]")
	protected static WebElement item3;
	
	@FindBy(xpath=".//*[@id='selectable']/li[contains(.,'Item 4')]")
	protected static WebElement item4;
	
	@FindBy(xpath=".//*[@id='selectable']/li[contains(.,'Item 5')]")
	protected static WebElement item5;
	
	@FindBy(xpath=".//*[@id='selectable']/li[contains(.,'Item 6')]")
	protected static WebElement item6;
	
	@FindBy(xpath=".//*[@id='selectable']/li[contains(.,'Item 7')]")
	protected static WebElement item7;
	
	/**
	 * Display as grid tab's selectable list items
	 */
	
	@FindBy(xpath = ".//*[@id='selectable_grid']/li[contains(.,'1')]")
	protected static WebElement grid1;
	
	@FindBy(xpath = ".//*[@id='selectable_grid']/li[contains(.,'2')]")
	protected static WebElement grid2;
	
	@FindBy(xpath = ".//*[@id='selectable_grid']/li[contains(.,'3')]")
	protected static WebElement grid3;
	
	@FindBy(xpath = ".//*[@id='selectable_grid']/li[contains(.,'4')]")
	protected static WebElement grid4;
	
	@FindBy(xpath = ".//*[@id='selectable_grid']/li[contains(.,'5')]")
	protected static WebElement grid5;
	
	@FindBy(xpath = ".//*[@id='selectable_grid']/li[contains(.,'6')]")
	protected static WebElement grid6;
	
	@FindBy(xpath = ".//*[@id='selectable_grid']/li[contains(.,'7')]")
	protected static WebElement grid7;
	
	@FindBy(xpath = ".//*[@id='selectable_grid']/li[contains(.,'8')]")
	protected static WebElement grid8;
	
	@FindBy(xpath = ".//*[@id='selectable_grid']/li[contains(.,'9')]")
	protected static WebElement grid9;
	
	@FindBy(xpath = ".//*[@id='selectable_grid']/li[contains(.,'10')]")
	protected static WebElement grid10;
	
	@FindBy(xpath = ".//*[@id='selectable_grid']/li[contains(.,'11')]")
	protected static WebElement grid11;
	
	@FindBy(xpath = ".//*[@id='selectable_grid']/li[contains(.,'12')]")
	protected static WebElement grid12;
	
	/**
	 * Serialize tab's selectable list items
	 */
	
	@FindBy(id="select-result")
	protected static WebElement selectResult;
	
	@FindBy(xpath = ".//*[@id='selectable-serialize']/li[contains(.,'Item 1')]")
	protected static WebElement serializeItem1;
	
	@FindBy(xpath = ".//*[@id='selectable-serialize']/li[contains(.,'Item 2')]")
	protected static WebElement serializeItem2;
	
	@FindBy(xpath = ".//*[@id='selectable-serialize']/li[contains(.,'Item 3')]")
	protected static WebElement serializeItem3;
	
	@FindBy(xpath = ".//*[@id='selectable-serialize']/li[contains(.,'Item 4')]")
	protected static WebElement serializeItem4;
	
	@FindBy(xpath = ".//*[@id='selectable-serialize']/li[contains(.,'Item 5')]")
	protected static WebElement serializeItem5;
	
	@FindBy(xpath = ".//*[@id='selectable-serialize']/li[contains(.,'Item 6')]")
	protected static WebElement serializeItem6;
	
}


