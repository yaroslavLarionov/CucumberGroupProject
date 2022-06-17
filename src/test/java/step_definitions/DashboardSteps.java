package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import pages.CommonPage;
import pages.DashboardPage;
import utils.WebDriverManager;

import javax.swing.*;

public class DashboardSteps implements CommonPage {
    String str = "Love2$h00tThatQuestion555";
    DashboardPage dashboardPage;
    Actions actions;
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

    @Then("User should be able to add question with letter, number and special characters.")
    public void user_should_be_able_to_add_question_with_letter_number_and_special_characters() {
        WebDriverManager.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_YOURQUESTION))).click();
        WebDriverManager.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_YOURQUESTION))).sendKeys(str);

    }


    @Then("User {string} button")
    public void user_button(String btn) {
        WebDriverManager.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_ENTERBTN, btn))).click();
    }



}
