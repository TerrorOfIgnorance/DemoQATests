package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * The page object for the Blog page
 * Implemented locating through xpath only when no other means applied.
 * @author jPayne
 */

public class Blog extends BasePage {

	/**
	 * Blog page specific headers links and paragraphs
	 */
	
	@FindBy(xpath = ".//*[@id='breadcrumbs']/li[1]/a")
	protected static WebElement smallLowerHomeLink;
	
	@FindBy(xpath = ".//*[@id='post-379']/header/h2/a")
	protected static WebElement samplePost2HeaderLink;
	
	@FindBy(xpath = ".//*[@id='post-379']/header/div/span[1]/a/time")
	protected static WebElement samplePost2DateLink;
	
	@FindBy(xpath = "/html/body/div/div/div[1]/main/article[1]/div[2]/a/img")
	protected static WebElement samplePost2ImageLink;
	
	@FindBy(xpath = ".//*[@id='post-379']/div[4]/p")
	protected static WebElement samplePost2Paragraph;
	
	@FindBy(xpath = ".//*[@id='post-379']/footer/p[2]/a")
	protected static WebElement samplePost2ReadMoreButton;
	
	@FindBy(xpath = ".//*[@id='post-377']/header/h2/a")
	protected static WebElement samplePostHeaderLink;
	
	@FindBy(xpath = ".//*[@id='post-377']/header/div/span[1]/a/time")
	protected static WebElement samplePostDateLink;
	
	@FindBy(xpath = ".//*[@id='post-377']/div[2]/a/img")
	protected static WebElement samplePostImageLink;
	
	@FindBy(xpath = ".//*[@id='post-377']/div[4]/p")
	protected static WebElement samplePostParagraph;
	
	@FindBy(xpath = ".//*[@id='post-377']/footer/p[2]/a")
	protected static WebElement samplePostReadMoreButton;
	
	
}
