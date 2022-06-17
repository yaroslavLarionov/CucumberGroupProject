package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.CommonPage;
import pages.HomePage;
import utils.CucumberLogUtils;
import utils.WebDriverManager;

public class HomeSteps implements CommonPage {
    HomePage homePage;

    public HomeSteps(){
        homePage = new HomePage();
    }

    @When("creates a {string} message")
    public void creates_a_message(String message) {
        WebDriverManager.sendKeys(homePage.inputField, message);
    }

    @Then("User will see {string} displayed in that section")
    public void user_will_see_displayed_in_that_section(String message) {
        Assert.assertEquals(message, WebDriverManager.getText(homePage.lastMessageSent));

    }

}
