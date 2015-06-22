package tests;

import static org.junit.Assert.*;
import java.net.MalformedURLException;
import org.junit.BeforeClass;
import org.junit.Test;
import testsLogic.BasePageLogic;
import utils.Drivers;

public class BasePageTest {
	
	@BeforeClass
	public static void beforeClass() throws MalformedURLException {
	//	Drivers.driver = Drivers.browser("androidDevice");
		Drivers.driver = Drivers.browser("iPhoneSim");
	//	Drivers.driver = Drivers.browser("iPhoneDevice");
	//	Drivers.driver = Drivers.browser("androidEmulator");
	}
	
	/**
	 * Are the Clickable Elements Clickable Tests
	 * 
	 */
	
	@Test
	public void upperMenuButtonIsClickable() {
		assertTrue(BasePageLogic.upperMenuButtonIsClickable() );
	}

	@Test
	public void demoqaLinkIsClickable() {
		assertTrue(BasePageLogic.demoqaLinkIsClickable());
	}

	@Test
	public void HomeLinkIsClickable() {
		assertTrue(BasePageLogic.HomeLinkIsClickable());
	}

	@Test
	public void aboutUsLinkIsClickable() {
		assertTrue(BasePageLogic.aboutUsLinkIsClickable());
	}

	@Test
	public void servicesLinkIsClickable() {
		assertTrue(BasePageLogic.servicesLinkIsClickable());
	}

	@Test
	public void demoTabIsClickable() {
		assertTrue(BasePageLogic.demoTabIsClickable());
	}

	@Test
	public void blogLinkIsClickable() {
		assertTrue(BasePageLogic.blogLinkIsClickable());
	}

	@Test
	public void contactTabIsClickable() {
		assertTrue(BasePageLogic.contactTabIsClickable());
	}

	@Test
	public void draggableLinkFromDemoTabIsClickable() {
		assertTrue(BasePageLogic.draggableLinkFromDemoTabIsClickable());
	}

	@Test
	public void registrationLinkIsClickable() {
		assertTrue(BasePageLogic.registrationLinkIsClickable());
	}

	@Test
	public void draggableLinkIsClickable() {
		assertTrue(BasePageLogic.draggableLinkIsClickable());
	}

	@Test
	public void droppableLinkIsClickable() {
		assertTrue(BasePageLogic.droppableLinkIsClickable());
	}

	@Test
	public void resizableLinkIsClickable() {
		assertTrue(BasePageLogic.resizableLinkIsClickable());
	}

	@Test
	public void selectableLinkIsClickable() {
		assertTrue(BasePageLogic.selectableLinkIsClickable());
	}

	@Test
	public void sortableLinkIsClickable() {
		assertTrue(BasePageLogic.sortableLinkIsClickable());
	}

	@Test
	public void accordionWidgetLinkIsClickable() {
		assertTrue(BasePageLogic.accordionWidgetLinkIsClickable());
	}

	@Test
	public void autoCompleteWidgetLinkIsClickable() {
		assertTrue(BasePageLogic.autoCompleteWidgetLinkIsClickable());
	}

	@Test
	public void datepickerWidgetLinkIsClickable() {
		assertTrue(BasePageLogic.datepickerWidgetLinkIsClickable());
	}

	@Test
	public void menuWidgetLinkIsClickable() {
		assertTrue(BasePageLogic.menuWidgetLinkIsClickable());
	}

	@Test
	public void sliderWidgetLinkIsClickable() {
		assertTrue(BasePageLogic.sliderWidgetLinkIsClickable());
	}

	@Test
	public void tabsWidgetLinkIsClickable() {
		assertTrue(BasePageLogic.tabsWidgetLinkIsClickable());
	}

	@Test
	public void tooltipWidgetLinkIsClickable() {
		assertTrue(BasePageLogic.tooltipWidgetLinkIsClickable());
	}

	@Test
	public void framesAndWindowsLinkIsClickable() {
		assertTrue(BasePageLogic.framesAndWindowsLinkIsClickable());
	}

	@Test
	public void facebookLinkIsClickable() {
		assertTrue(BasePageLogic.facebookLinkIsClickable());
	}

	@Test
	public void twitterLinkIsClickable() {
		assertTrue(BasePageLogic.twitterLinkIsClickable());
	}

	@Test
	public void gplusLinkIsClickable() {
		assertTrue(BasePageLogic.gplusLinkIsClickable());
	}
	
	/**
	 * Do the links redirect to the correct URL Tests
	 */

	@Test
	public void testRedirectToAboutUs() {
		BasePageLogic.redirectToAboutUs();
	}

	@Test
	public void testRedirectToServices() {
		BasePageLogic.redirectToServices();
	}

	@Test
	public void testRedirectToBlog() {
		BasePageLogic.redirectToBlog();
	}

	@Test
	public void testRedirectToContactTab() {
		BasePageLogic.redirectToContactTab();
	}

	@Test
	public void testRedirectToDraggableFromDemoTab() throws InterruptedException {
		BasePageLogic.redirectToDraggableFromDemoTab();
	}

	@Test
	public void testRedirectToTabsLinkFromDemoTab() throws InterruptedException {
		BasePageLogic.redirectToTabsLinkFromDemoTab();
	}

	@Test
	public void testRedirectToRegistration() {
		BasePageLogic.redirectToRegistration();
	}

	@Test
	public void testRedirectToDraggableLink() {
		BasePageLogic.redirectToDraggableLink();
	}

	@Test
	public void testRedirectToDroppableLink() {
		BasePageLogic.redirectToDroppableLink();
	}

	@Test
	public void testRedirectToResizableLink() {
		BasePageLogic.redirectToResizableLink();
	}

	@Test
	public void testRedirectToSelectableLink() {
		BasePageLogic.redirectToSelectableLink();
	}

	@Test
	public void testRedirectToSortableLink() {
		BasePageLogic.redirectToSortableLink();
	}

	@Test
	public void testRedirectToAccordionWidgetLink() {
		BasePageLogic.redirectToAccordionWidgetLink();
	}

	@Test
	public void testRedirectToAutoCompleteWidgetLink() {
		BasePageLogic.redirectToAutoCompleteWidgetLink();
	}

	@Test
	public void testRedirectToDatepickerWidgetLink() {
		BasePageLogic.redirectToDatepickerWidgetLink();
	}

	@Test
	public void testRedirectToMenuWidgetLink() {
		BasePageLogic.redirectToMenuWidgetLink();
	}

	@Test
	public void testRedirectToSliderWidgetLink() {
		BasePageLogic.redirectToSliderWidgetLink();
	}

	@Test
	public void testRedirectToTabsWidgetLink() {
		BasePageLogic.redirectToTabsWidgetLink();
	}

	@Test
	public void testRedirectToTooltipWidgetLink() {
		BasePageLogic.redirectToTooltipWidgetLink();
	}

	@Test
	public void testRedirectToFramesAndWindowsLink() {
		BasePageLogic.redirectToFramesAndWindowsLink();
	}
	@Test
	public void testRedirectToDesignerLink() {
		BasePageLogic.redirectToDesignerLink();
	}

	@Test
	public void testRedirectToGeneratorLink() {
		BasePageLogic.redirectToGeneratorLink();
	}
	
	/** 
	 * Visibility Tests
	 */

	@Test
	public void aboutUsFooterIsDisplayed() {
		assertTrue(BasePageLogic.aboutUsFooterIsDisplayed());
	}
}


