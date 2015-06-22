package tests;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import testsLogic.AboutUsLogic;
import utils.Drivers;

public class AboutUsTest extends BasePageTest {

	pageObjects.AboutUs aboutUs = PageFactory.initElements(Drivers.driver, pageObjects.AboutUs.class);
	static DesiredCapabilities capability = new DesiredCapabilities();
	
	@Before
	public void getSite(){
		Drivers.driver.get("http://demoqa.com/about-us/");
	}
    
	@Test
	public void testAboutUsPageTitle() {
		AboutUsLogic.validateAboutUsPageTitle();
	}
	
	@Test
	public void aboutUsHeadingIsDisplayed() {
		assertTrue(AboutUsLogic.aboutUsHeadingIsDisplayed());
	}
	@Test
	public void aboutUsParagraphIsDisplayed() {
		assertTrue(AboutUsLogic.aboutUsParagraphIsDisplayed());
	}
	
	
	@AfterClass
	public static void afterClass() {
		Drivers.driver.quit();
	}
}
