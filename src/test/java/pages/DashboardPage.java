package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverManager;

public class DashboardPage {
    public DashboardPage() {
        PageFactory.initElements(WebDriverManager.getDriver(), this);

    }

    @FindBy(xpath = "//*[@class='form-control']")
    public WebElement txtInputField;

    @FindBy(xpath = "//*[contains (text(),'Love$$Java@Coding##123')]/parent::a/following-sibling::span//*[@data-icon='edit']")
    public WebElement editMsgBtn;

    @FindBy(xpath = "//*[contains (text(),'Love$$Java@Coding##123')]/parent::a/following-sibling::span//*[@data-icon='trash-alt']")
    public WebElement deleteMsgBtn;

    @FindBy(name = "newQuestion")
    public WebElement newQuestionField;

    @FindBy(xpath = "//*[@data-icon='check']")
    public WebElement confirmNewQuestionBtn;


}
