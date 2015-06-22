package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * The page object for the Draggable page
 * Implemented locating through xpath only when no other means applied.
 * @author jPayne
 */

public class Draggable extends BasePage {

	/**
	 * The main draggable menu in center of page (5 tabs)
	 */
	
    @FindBy(id="ui-id-1")
    protected static WebElement defaultFunctionalityTab;//tab1

    @FindBy(id="ui-id-2")
    protected static WebElement constrainMovementTab;//tab2
    
    @FindBy(id="ui-id-3")
    protected static WebElement cursorStyleTab;//tab3
    
    @FindBy(id="ui-id-4")
    protected static WebElement eventsTab;//tab4
   
    @FindBy(id="ui-id-5")
    protected static WebElement DraggableAndSortableTab;//tab5
    
    /**
     * Default functionality tab's element
     */
    
    @FindBy(id="draggable")
    protected static WebElement draggableDivTab1;
    
    /**
     * Constraint Movement tab's movable divs along axis
     */
    
    @FindBy(xpath=".//*[@id='draggabl']/p")
    protected static WebElement verticleDraggableDiv;
    
    @FindBy(xpath=".//*[@id='draggabl2']/p")
    protected static WebElement horizontalDraggableDiv;
    
    /**
     * Constraint Movement tab's within another DOM element
     */
    
    @FindBy(id="draggabl3")
    protected static WebElement withinBoxDraggableDiv;
    
    @FindBy(id="draggabl5")
    protected static WebElement withinParentDraggableDiv;
    
    @FindBy(xpath=".//*[@id='containment-wrapper']/div[2]")
    protected static WebElement parentDiv;
    
    @FindBy(id="containment-wrapper")
    protected static WebElement withDOMBoxDiv;
    
    /**
     * Cursor style tab's divs
     */

    @FindBy(id="drag")
    protected static WebElement stickToCenterDraggableDiv;
    
    @FindBy(id="drag2")
    protected static WebElement left5Top5DraggableDiv;
    
    @FindBy(xpath = ".//*[@id='ui-id-3']/li[2]")
    protected static WebElement left5Top5DivCrosshairCursor;
    
    @FindBy(id="drag3")
    protected static WebElement bottomValueDraggableDiv;
    
    /**
     * Events tab's divs
     */
    
    @FindBy(xpath=".//*[@id='tabs-5']/div/div")
    protected static WebElement eventsDiv;
    
    @FindBy(id="dragevent")
    protected static WebElement eventDraggableDiv;
    
    @FindBy(xpath=".//*[@id='event-start']/span[2]")
    protected static WebElement startCount;
    
    @FindBy(xpath=".//*[@id='event-drag']/span[2]")
    protected static WebElement dragCount;
    
    @FindBy(xpath=".//*[@id='event-stop']/span[2]")
    protected static WebElement stopCount;
    
    /**
     * Draggable and Sortable tab's divs
     *
     */
    
    @FindBy(xpath=".//*[@id='tabs-7']/div")
    protected static WebElement draggableAndSortableDiv;
    
    @FindBy(id="draggablebox")
    protected static WebElement draggableBox;
    
    @FindBy(id="sortablebox")
    protected static WebElement sortableBox;
    
    @FindBy(xpath=".//*[@id='sortablebox']/li[contains(.,'Item 1')]")
    protected static WebElement item1Div;
    
    @FindBy(xpath=".//*[@id='sortablebox']/li[contains(.,'Item 2')]")
    protected static WebElement item2Div;
    
    @FindBy(xpath=".//*[@id='sortablebox']/li[contains(.,'Item 3')]")
    protected static WebElement item3Div;
    
    @FindBy(xpath=".//*[@id='sortablebox']/li[contains(.,'Item 4')]")
    protected static WebElement item4Div;
    
    @FindBy(xpath=".//*[@id='sortablebox']/li[contains(.,'Item 5')]")
    protected static WebElement item5Div;
    
}
    
