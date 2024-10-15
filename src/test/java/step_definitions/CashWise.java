package step_definitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.CashWiseLocators;
import utilities.Config;
import utilities.Driver;
import utilities.Methods;

public class CashWise {

    WebDriver driver = Driver.getDriver();
    CashWiseLocators cashWiseLocators = new CashWiseLocators();
   Methods methods = new Methods();
   Faker faker = new Faker();





    @Given("user is on CashWiseHomePage")
    public void user_is_on_cash_wise_home_page() {
        driver.get(Config.getProperties("baseUrl"));
    }

    @When("user click on singup button")
    public void user_click_on_singup_button() {
        cashWiseLocators.signInButton.click();
    }
    @When("user click enters his {string}")
    public void user_click_enters_his(String email) {
    cashWiseLocators.emailField.sendKeys(faker.internet().emailAddress());



    }
    @When("user enters hiw {string}")
    public void user_enters_hiw(String password) {
     cashWiseLocators.passwordField.sendKeys(password);


    }
    @When("confirms his {string}")
    public void confirms_his(String confirmPassword) {
    cashWiseLocators.confirmPasswordField.sendKeys(confirmPassword);
    }



 @When("user click on continue button")
 public void user_click_on_continue_button() {
     cashWiseLocators.continueButton.click();

 }
    @When("user enters his {string}")
    public void user_enters_his(String string) {
     cashWiseLocators.nameField.sendKeys(faker.name().firstName());

    }


   @When("user enters his lastname {string}")
   public void user_enters_his_lastname(String string) {
    cashWiseLocators.lastNameField.sendKeys(faker.name().lastName());
   }


 @When("user enters his name of business {string}")
 public void user_enters_his_name_of_business(String string) {
 cashWiseLocators.nameOfBusinessField.sendKeys(faker.name().fullName());
 }
    @When("user selects area of business from dropDown")
    public void user_selects_area_of_business_from_drop_down() {
   // cashWiseLocators.bisunessArea.click();

    methods.clickButton(cashWiseLocators.bisunessArea);
    }


 @When("user select retail business")
 public void user_select_retail_business() {
 cashWiseLocators.retailTrade.click();
 methods.clickButton(cashWiseLocators.retailTrade);

 }


 @When("user enters his address {string}")
 public void user_enters_his_address(String address) {
  cashWiseLocators.addressField.sendKeys(faker.address().fullAddress());
 }
    @When("user selects currency from dropdown")
    public void user_selects_currency_from_dropdown() {
    cashWiseLocators.currencyField.click();
    }

 @When("user cliks on UDS")
 public void user_cliks_on_uds() {
 cashWiseLocators.usdField.click();


 }

    @When("user clicks on signIn")
    public void user_clicks_on_sign_in() {
    cashWiseLocators.signUpButton1.click();
    }
    @Then("verify that user is siged in")
    public void verify_that_user_is_siged_in() {

    //    Assert.assertEquals(Config.getProperties("expectedUrl"), driver.getCurrentUrl());
       // Assert.assertEquals(Config.getProperties("expectedUrl"), driver.getCurrentUrl());

        System.out.println(driver.getCurrentUrl());





    }







}