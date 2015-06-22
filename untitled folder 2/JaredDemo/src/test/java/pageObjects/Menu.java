package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Menu extends BasePage {

	/**
	 * The main menu menu in center of page (2 tabs)
	 */

	@FindBy(id = "ui-id-1")
	protected static WebElement simpleMenu;// tab1

	@FindBy(id = "ui-id-2")
	protected static WebElement menusWithSubMenus;// tab2
	
	/**
	 * Simple Menu and Menu with Sub Menu tab's elements
	 */
	
	@FindBy(xpath =".//*[@id='navigate']/ul/li[1]/a")
	protected static WebElement homeMenuTab;	
	
	@FindBy(xpath =".//*[@id='navigate']/ul/li[2]/a")
	protected static WebElement aboutMenuTab;

	@FindBy(xpath =".//*[@id='navigate']/ul/li[3]/a")
	protected static WebElement contactMenuTab;

	@FindBy(xpath =".//*[@id='navigate']/ul/li[4]/a")
	protected static WebElement fAQMenuTab;

	@FindBy(xpath =".//*[@id='navigate']/ul/li[5]/a")
	protected static WebElement newsMenuTab;
	
	/**
	 *  Menu with Sub Menu's sub menus tab's elements
	 */
	
	@FindBy(xpath ="/html/body/div/div/div[1]/main/article/div/div/div[2]/div/div/ul/li[1]/a")
	protected static WebElement subHomeMenuTab;	
	
	@FindBy(xpath ="/html/body/div/div/div[1]/main/article/div/div/div[2]/div/div/ul/li[2]/a")
	protected static WebElement subAboutMenuTab;

	@FindBy(xpath ="/html/body/div/div/div[1]/main/article/div/div/div[2]/div/div/ul/li[3]/a")
	protected static WebElement subContactMenuTab;

	@FindBy(xpath ="/html/body/div/div/div[1]/main/article/div/div/div[2]/div/div/ul/li[4]/a")
	protected static WebElement subFAQMenuTab;

	@FindBy(xpath ="/html/body/div/div/div[1]/main/article/div/div/div[2]/div/div/ul/li[5]/a")
	protected static WebElement subNewsMenuTab;
	
	@FindBy(xpath =".//*[@id='navigate']/ul/li[1]/ul/li[1]/a")
	protected static WebElement homeSubMenuItem1;	
	
	@FindBy(xpath =".//*[@id='navigate']/ul/li[1]/ul/li[2]/a")
	protected static WebElement homeSubMenuItem2;

	@FindBy(xpath =".//*[@id='navigate']/ul/li[1]/ul/li[3]/a")
	protected static WebElement homeSubMenuItem3;

	@FindBy(xpath =".//*[@id='navigate']/ul/li[1]/ul/li[4]/a")
	protected static WebElement homeSubMenuItem4NamedItem3;

	@FindBy(xpath =".//*[@id='navigate']/ul/li[4]/ul/li[1]/a")
	protected static WebElement fAQSubMenuItem1;
	
	@FindBy(xpath =".//*[@id='navigate']/ul/li[4]/ul/li[2]/a")
	protected static WebElement fAQSubMenuItem3;
	
	@FindBy(xpath =".//*[@id='navigate']/ul/li[5]/ul/li[1]/a")
	protected static WebElement newsSubMenuItem1;
	
	@FindBy(xpath =".//*[@id='navigate']/ul/li[5]/ul/li[2]/a")
	protected static WebElement newsSubMenuItem2;
	
	@FindBy(xpath =".//*[@id='navigate']/ul/li[5]/ul/li[3]/a")
	protected static WebElement newsSubMenuItem3;
	
}
