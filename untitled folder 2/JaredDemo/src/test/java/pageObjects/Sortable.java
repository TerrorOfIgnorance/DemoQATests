package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * The page object for the Sortable page Implemented locating through xpath
 * only when no other means applied.
 * @author jPayne
 */
public class Sortable extends BasePage {

	/**
	 * The main sortable menu in center of page (4 tabs)
	 */

	@FindBy(id = "ui-id-1")
	protected static WebElement defaultFunctionalityTab;// tab1

	@FindBy(id = "ui-id-2")
	protected static WebElement connectListsTab;// tab2

	@FindBy(id = "ui-id-3")
	protected static WebElement displayAsGridTab;// tab3

	@FindBy(id = "ui-id-4")
	protected static WebElement portletsTab;// tab4

	/**
	 * Default functionality tab's sortable list elements
	 */
	
	@FindBy(id ="sortable")
	protected static WebElement sortableUnorderedList;
	
	@FindBy(xpath = ".//*[@id='sortable']/li[contains(.,'Item 1')]")
	protected static WebElement item1;
	
	@FindBy(xpath = ".//*[@id='sortable']/li[contains(.,'Item 2')]")
	protected static WebElement item2;
	
	@FindBy(xpath = ".//*[@id='sortable']/li[contains(.,'Item 3')]")
	protected static WebElement item3;
	
	@FindBy(xpath = ".//*[@id='sortable']/li[contains(.,'Item 4')]")
	protected static WebElement item4;
	
	@FindBy(xpath = ".//*[@id='sortable']/li[contains(.,'Item 5')]")
	protected static WebElement item5;
	
	@FindBy(xpath = ".//*[@id='sortable']/li[contains(.,'Item 6')]")
	protected static WebElement item6;
	
	@FindBy(xpath = ".//*[@id='sortable']/li[contains(.,'Item 7')]")
	protected static WebElement item7;
	
	/**
	 * Connect Lists tab's elements
	 */
	
	@FindBy(id ="sortable1")
	protected static WebElement sortableConnectedList1;
	
	@FindBy(id ="sortable2")
	protected static WebElement sortableConnectedList2;
	
	@FindBy(xpath = ".//*[@id='sortable1']/li[1]")
	protected static WebElement item1List1;
	
	@FindBy(xpath = ".//*[@id='sortable1']/li[2]")
	protected static WebElement item2List1;
	
	@FindBy(xpath = ".//*[@id='sortable1']/li[3]")
	protected static WebElement item3List1;
	
	@FindBy(xpath = ".//*[@id='sortable1']/li[4]")
	protected static WebElement item4List1;
	
	@FindBy(xpath = ".//*[@id='sortable1']/li[5]")
	protected static WebElement item5List1;
	
	@FindBy(xpath = ".//*[@id='sortable1']/li[6]")
	protected static WebElement item6List1;
	
	@FindBy(xpath = ".//*[@id='sortable1']/li[7]")
	protected static WebElement item7List1;
	
	@FindBy(xpath = ".//*[@id='sortable1']/li[8]")
	protected static WebElement item8List1;
	
	@FindBy(xpath = ".//*[@id='sortable1']/li[9]")
	protected static WebElement item9List1;
	
	@FindBy(xpath = ".//*[@id='sortable1']/li[10]")
	protected static WebElement item10List1;
	
	@FindBy(xpath = ".//*[@id='sortable2']/li[1]")
	protected static WebElement item1List2;
	
	@FindBy(xpath = ".//*[@id='sortable2']/li[2]")
	protected static WebElement item2List2;
	
	@FindBy(xpath = ".//*[@id='sortable2']/li[3]")
	protected static WebElement item3List2;
	
	@FindBy(xpath = ".//*[@id='sortable2']/li[4]")
	protected static WebElement item4List2;
	
	@FindBy(xpath = ".//*[@id='sortable2']/li[5]")
	protected static WebElement item5List2;
	
	@FindBy(xpath = ".//*[@id='sortable2']/li[6]")
	protected static WebElement item6List2;
	
	@FindBy(xpath = ".//*[@id='sortable2']/li[7]")
	protected static WebElement item7List2;
	
	@FindBy(xpath = ".//*[@id='sortable2']/li[8]")
	protected static WebElement item8List2;
	
	@FindBy(xpath = ".//*[@id='sortable2']/li[9]")
	protected static WebElement item9List2;
	
	@FindBy(xpath = ".//*[@id='sortable2']/li[10]")
	protected static WebElement item10List2;
	
	/**
	 * Display as Grid tab's elements
	 */
	
	@FindBy(xpath = ".//*[@id='sortable_grid']/li[contains(.,'1')]")
	protected static WebElement grid1;
	
	@FindBy(xpath = ".//*[@id='sortable_grid']/li[contains(.,'2')]")
	protected static WebElement grid2;
	
	@FindBy(xpath = ".//*[@id='sortable_grid']/li[contains(.,'3')]")
	protected static WebElement grid3;
	
	@FindBy(xpath = ".//*[@id='sortable_grid']/li[contains(.,'4')]")
	protected static WebElement grid4;
	
	@FindBy(xpath = ".//*[@id='sortable_grid']/li[contains(.,'5')]")
	protected static WebElement grid5;
	
	@FindBy(xpath = ".//*[@id='sortable_grid']/li[contains(.,'6')]")
	protected static WebElement grid6;
	
	@FindBy(xpath = ".//*[@id='sortable_grid']/li[contains(.,'7')]")
	protected static WebElement grid7;
	
	@FindBy(xpath = ".//*[@id='sortable_grid']/li[contains(.,'8')]")
	protected static WebElement grid8;
	
	@FindBy(xpath = ".//*[@id='sortable_grid']/li[contains(.,'9')]")
	protected static WebElement grid9;
	
	@FindBy(xpath = ".//*[@id='sortable_grid']/li[contains(.,'10')]")
	protected static WebElement grid10;
	
	@FindBy(xpath = ".//*[@id='sortable_grid']/li[contains(.,'11')]")
	protected static WebElement grid11;
	
	@FindBy(xpath = ".//*[@id='sortable_grid']/li[contains(.,'12')]")
	protected static WebElement grid12;
	
	/**
	 * Portlets tab's elements
	 */
	
	@FindBy(xpath = ".//*[@id='tabs-4']/div/div[1]")
	protected static WebElement sortableColumn1;
	
	@FindBy(xpath = ".//*[@id='tabs-4']/div/div[2]")
	protected static WebElement sortableColumn2;
	
	@FindBy(xpath = ".//*[@id='tabs-4']/div/div[3]")
	protected static WebElement sortableColumn3;
	
	@FindBy(xpath = ".//*[@id='tabs-4']/div/div[1]/div[1]")
	protected static WebElement shoppingBoxDiv;
	
	@FindBy(xpath = ".//*[@id='tabs-4']/div/div[2]/div[1]")
	protected static WebElement linksBoxDiv;
	
	@FindBy(xpath = ".//*[@id='tabs-4']/div/div[3]/div")
	protected static WebElement imagesBoxDiv;
	
	@FindBy(xpath = ".//*[@id='tabs-4']/div/div[1]/div[2]")
	protected static WebElement newsBoxDiv;
	
	@FindBy(xpath = ".//*[@id='tabs-4']/div/div[2]/div[2]")
	protected static WebElement feedsBoxDiv;
	
}
