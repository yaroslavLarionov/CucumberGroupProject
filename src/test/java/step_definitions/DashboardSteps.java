package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;
import pages.CommonPage;
import pages.DashboardPage;
import utils.SeleniumUtils;
import utils.WebDriverManager;

import javax.swing.*;

public class DashboardSteps implements CommonPage {
    DashboardPage dashboardPage;
    public DashboardSteps(){
        dashboardPage = new DashboardPage();

    }
    @Given("User click on {string} app")
    public void user_click_on_app(String btn) {
        WebDriverManager.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_BUTTON, btn))).click();
    }

    @When("User clicks on {string} button in coding question")
    public void user_clicks_on_button_in_coding_question(String btn) {
        WebDriverManager.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_BUTTON, btn))).click();
    }


    @And("User submits a {string} question")
    public void userSubmitsAQuestion(String message) {
        WebDriverManager.sendKeys(dashboardPage.txtInputField, message);
    }

    @Then("User should see {string} question displayed")
    public void userShouldSeeQuestionDisplayed(String question) {
        Assert.assertEquals(question, WebDriverManager.getText(By.xpath(String.format(XPATH_TEMPLATE_TEXT_CONTAINS, question))));
    }

    @And("User clicks on edit message icon")
    public void userClicksOnEditMessageIcon() {
        WebDriverManager.click(dashboardPage.editMsgBtn);
    }

    @And("User enters edited {string} question")
    public void userEntersEditedQuestion(String message) {
        new Actions(WebDriverManager.getDriver()).moveToElement(dashboardPage.newQuestionField).doubleClick().click().sendKeys(message).perform();
    }

    @And("User confirms the changes made")
    public void userConfirmsTheChangesMade() {
        WebDriverManager.click(dashboardPage.confirmNewQuestionBtn);
    }

    @And("User clicks the delete button")
    public void userClicksTheDeleteButton() {
        WebDriverManager.click(dashboardPage.deleteMsgBtn);
    }


    @Then("User will not see the {string} question displayed")
    public void userWillNotSeeTheQuestionDisplayed(String question) {
        Assert.assertThrows(NoSuchElementException.class, ()-> {WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_TEXT_CONTAINS, question)));});

    }
}
