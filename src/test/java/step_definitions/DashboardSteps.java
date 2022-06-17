package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import pages.CommonPage;
import pages.DashboardPage;
import utils.SeleniumUtils;
import utils.WebDriverManager;

import javax.swing.*;

public class DashboardSteps implements CommonPage {
    String str = "Love2$h00tThatQuestion555";
    DashboardPage dashboardPage;
    public DashboardSteps(){
        dashboardPage = new DashboardPage();

    }
    @Given("User click on {string} app")
    public void user_click_on_app(String btn) {
        WebDriverManager.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_BUTTONINDASHBOARD, btn))).click();
    }

    @When("User clicks on {string} button in coding question")
    public void user_clicks_on_button_in_coding_question(String btn) {
        WebDriverManager.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_BUTTONINDASHBOARD, btn))).click();
    }

    @Then("User should be able to add question with letter, number and special characters in coding.")
    public void userShouldBeAbleToAddQuestionWithLetterNumberAndSpecialCharactersInCoding() {
        WebDriverManager.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_YOURQUESTION_CODING))).click();
        WebDriverManager.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_YOURQUESTION_CODING))).sendKeys(str);
    }

    @Then("User should be able to add question with letter, number and special characters in Soft skills.")
    public void userShouldBeAbleToAddQuestionWithLetterNumberAndSpecialCharactersInSoftSkills() {
        WebDriverManager.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_YOURQUESTION_SOFTKILLS))).click();
        WebDriverManager.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_YOURQUESTION_SOFTKILLS))).sendKeys(str);
    }

    @Then("User {string} button")
    public void user_button(String btn) {
        WebDriverManager.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_ENTERBTN, btn))).click();
    }



}
