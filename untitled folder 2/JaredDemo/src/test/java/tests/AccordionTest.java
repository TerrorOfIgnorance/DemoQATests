package tests;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import testsLogic.AccordionLogic;
import utils.Drivers;


public class AccordionTest extends BasePageTest {
	
	pageObjects.Accordion accordion = PageFactory.initElements(Drivers.driver,pageObjects.Accordion.class);
	static DesiredCapabilities capability = new DesiredCapabilities();
	 
	@Before
	public void beforeEachTest() {
		Drivers.driver.get("http://demoqa.com/accordion/");
	}

	@Test
	public void testAccordionPageTitle() {
		AccordionLogic.validateAccordionPageTitle();
	}

	/**
	 * Tests for whether paragraphs are displayed when tabs are clicked
	 * tab1
	 */
	
	@Test
	public void section1DisplaysParagraph() {
		assertTrue(AccordionLogic.section1DisplaysParagraph());
	}

	@Test
	public void section2DisplaysParagraph() {
		assertTrue(AccordionLogic.section2DisplaysParagraph());
	}
	
	@Test
	public void section3DisplaysParagraph() {
		assertTrue(AccordionLogic.section3DisplaysParagraph());
	}
	
	@Test
	public void section4DisplaysParagraph() {
		assertTrue(AccordionLogic.section4DisplaysParagraph());
	}
	
	/**
	 * Tests for whether paragraphs are displayed when tabs are clicked
	 * tab2
	 */
	
	@Test
	public void section1DisplaysParagraphTab2() {
		assertTrue(AccordionLogic.section1DisplaysParagraphTab2());
	}

	@Test
	public void section2DisplaysParagraphTab2() {
		assertTrue(AccordionLogic.section2DisplaysParagraphTab2());
	}
	
	@Test
	public void section3DisplaysParagraphTab2() {
		assertTrue(AccordionLogic.section3DisplaysParagraphTab2());
	}
	
	@Test
	public void section4DisplaysParagraphTab2() {
		assertTrue(AccordionLogic.section4DisplaysParagraphTab2());
	}
	
	@Test
	public void toggleButtonDisplaysArrowsTab2() throws InterruptedException {
		assertTrue(AccordionLogic.toggleButtonDisplaysArrowsTab2());
	}
	

	/**
	 * Tests for whether paragraphs are displayed when tabs are clicked
	 * tab3
	 */
	
	@Test
	public void section1DisplaysParagraphTab3() {
		assertTrue(AccordionLogic.section1DisplaysParagraphTab3());
	}

	@Test
	public void section2DisplaysParagraphTab3() {
		assertTrue(AccordionLogic.section2DisplaysParagraphTab3());
	}
	
	@Test
	public void section3DisplaysParagraphTab3() {
		assertTrue(AccordionLogic.section3DisplaysParagraphTab3());
	}
	
	@Test
	public void section4DisplaysParagraphTab3() {
		assertTrue(AccordionLogic.section4DisplaysParagraphTab3());
	}
	

	@AfterClass
	public static void afterClass() {
		Drivers.driver.quit();
	}
}