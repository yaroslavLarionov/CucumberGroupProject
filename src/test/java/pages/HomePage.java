package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverManager;

public class HomePage {

    public HomePage() {

        PageFactory.initElements(WebDriverManager.getDriver(), this);
    }

    @FindBy(xpath = "//textarea[@placeholder='Your Input...']")
    public WebElement inputField;

    @FindBy(xpath = "(//div[@class='anyClass'])[1]/div[last()]/div[contains(@class, 'col-md-7')]")
    public WebElement lastMessageSent;

    @FindBy(xpath = "//button[text()=\"Add don't \"]")
    public WebElement addDontBtn;

}
