package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * The page object for the Sample Post 2 page
 * Implemented locating through xpath only when no other means applied.
 * @author jPayne
 */
public class SamplePost2 extends BasePage {

	/**
	 * Sample Post 2 page specific headers links and paragraphs
	 */
	@FindBy(css = "a[href*='http://demoqa.com/category/uncategorized/']")
	protected static WebElement uncategorizedLink;
	
	@FindBy(xpath = ".//*[@id='breadcrumbs']/li[1]/a")
	protected static WebElement smallHomeLink;
	
	@FindBy(xpath = ".//*[@id='post-379']/header/div/span[1]/a/time")
	protected static WebElement samplePost2DateLink;
	
	@FindBy(xpath = ".//*[@id='post-379']/header/div/span[2]/span/a")
	protected static WebElement adminLink;
	
	@FindBy(className = "entry-content")
	protected static WebElement postParagraph;
	
	@FindBy(css = "a[rel='bookmark']")
	protected static WebElement permalinkLink;
	
	@FindBy(xpath = ".//*[@id='main']/p[1]")
	protected static WebElement likeTheArticleButton;
	
	@FindBy(className = "ipt_kb_like_article_info pull-right text-info")
	protected static WebElement numberOfPeopleWhoLiked;
	
	@FindBy(css = "a[rel='prev']")
	protected static WebElement toPreviousPostLink;
	
	@FindBy(xpath = ".//*[@id='main']/div[1]/div[1]/a/img")
	protected static WebElement avatarImageLink;
	
	@FindBy(xpath = ".//*[@id='main']/div[1]/h4/a")
	protected static WebElement toArticlesWrittenByPosterLink;
	
	@FindBy(id = "author")
	protected static WebElement nameInputField;
	
	@FindBy(id = "email")
	protected static WebElement emailInputField;
	
	@FindBy(id = "url")
	protected static WebElement urlInputField;
	
	@FindBy(id = "comment")
	protected static WebElement commentInputField;
	
	@FindBy(id = "submit")
	protected static WebElement postCommentButton;
	
}
