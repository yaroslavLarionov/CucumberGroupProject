package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.CommonPage;
import utils.WebDriverManager;

import java.util.Map;

public class LoginSteps implements CommonPage {

    @When("User enters following credentials:")
    public void user_enters_following_credentials(Map<String, String> data) {
        for(String key: data.keySet()){
            WebDriverManager.sendKeys(By.xpath(String.format(XPATH_TEMPLATE_INPUT_FIELD, key)), data.get(key));
        }
    }

    @When("User clicks on {string} button")
    public void user_clicks_on_button(String btn) {
        WebDriverManager.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_BUTTON, btn))).click();
    }

    @Then("Verify the title is {string}")
    public void verify_the_title_is(String title) {
        Assert.assertEquals(title, WebDriverManager.getDriver().getTitle());

    }

}
