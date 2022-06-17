package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverManager;

public class DashboardPage {
    public DashboardPage() {
        PageFactory.initElements(WebDriverManager.getDriver(), this);

    }

   @FindBy(className = "col-md-9")
           public WebElement enterQuestion;
}
