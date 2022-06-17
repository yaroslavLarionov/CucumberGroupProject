package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
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

    @When("User presses the add dont button")
    public void userPressesTheAddDontButton() {
        WebDriverManager.click(homePage.addDontBtn);
    }

    @Then("Verify {string} link is displayed")
    public void verifyLinkIsDisplayed(String dashboard) {
        Assert.assertTrue((WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_TEXT_CONTAINS, dashboard)))));

    }

    @Then("User will see {string} displayed in Do section")
    public void userWillSeeDisplayedInDoSection(String message) {
        Assert.assertEquals(message, WebDriverManager.getText(homePage.lastMessageDo));
    }

    @Then("User will see {string} displayed in Don't section")
    public void userWillSeeDisplayedInDonTSection(String message) {
        Assert.assertEquals(message, WebDriverManager.getText(homePage.lastMessageDont));
    }

    @Then("User will see the {string} button displayed")
    public void userWillSeeTheButtonDisplayed(String btn) {
        Assert.assertTrue(WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_TEXT, btn))));
    }

    @Then("User will not see the {string} button displayed")
    public void userWillNotSeeTheButtonDisplayed(String btn) {
        Assert.assertThrows(NoSuchElementException.class, ()-> {WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_BUTTON, btn)));});
    }
}
