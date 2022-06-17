package pages;

public interface CommonPage {

    String XPATH_TEMPLATE_BUTTON = "//button[text()='%s']";
    String XPATH_TEMPLATE_LINKTEXT = "//a[text()='%s']";
    String XPATH_TEMPLATE_TEXT = "//*[text()='%s']";
    String XPATH_TEMPLATE_TEXT_CONTAINS = "//*[contains(text(), '%s')]";
    String XPATH_TEMPLATE_INPUT_FIELD = "//input[@placeholder='%s']";


    String XPATH_TEMPLATE_DASHBOARDS ="//button[@type='submit']";
    String XPATH_TEMPLATE_BUTTONINDASHBOARD ="//button[contains(text(),'%s')]";
    String XPATH_TEMPLATE_YOURQUESTION_CODING ="//div/form/div/textarea";
    String XPATH_TEMPLATE_YOURQUESTION_SOFTKILLS ="//div/form/div/input";
    String XPATH_TEMPLATE_ENTERBTN = "//button[@type='submit'][text()='Enter']";


}
