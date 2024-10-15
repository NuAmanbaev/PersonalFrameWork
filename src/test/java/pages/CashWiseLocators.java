package pages;

import org.checkerframework.checker.signature.qual.FieldDescriptor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CashWiseLocators {

    WebDriver driver;
    public CashWiseLocators(){
        this.driver = Driver.getDriver();
        PageFactory.initElements(driver, this);

    }


    @FindBy(xpath = "//button[@class=\"MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeMedium MuiButton-outlinedSizeMedium MuiButtonBase-root css-k6k41x\"]")
    public WebElement signInButton;
    @FindBy(xpath = "//input[@id=\"email_input_text\"]")
    public WebElement emailField;
    @FindBy(xpath = "//input[@id=\"password_input_text\"]")
    public WebElement passwordField;
    @FindBy(xpath = "//input[@id=\"repeat_password_input_text\"]")
    public WebElement confirmPasswordField;

    @FindBy(xpath = "//button[@class='MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-fullWidth MuiButtonBase-root css-1hz3hle']")
    public WebElement continueButton;

    @FindBy(xpath = "//input[@id=\"first_name_input_text\"]")
    public WebElement nameField;

    @FindBy(xpath = "//input[@id=\"last_name_input_text\"]")
    public WebElement lastNameField;

    @FindBy(xpath = "//input[@id=\"company_name_input_text\"]")
    public WebElement nameOfBusinessField;

    @FindBy(xpath = "//div[@id=\"mui-component-select-business_area_id\"]")
    public WebElement bisunessArea;


    @FindBy(xpath = "//li[@data-value='1']")
    public WebElement retailTrade;


    @FindBy(xpath = "//input[@id=\"address_input_text\"]")
    public WebElement addressField;

    @FindBy(xpath = "//div[@id='mui-component-select-currency']")
    public WebElement currencyField;

    @FindBy(xpath = "//li[@data-value=\"USD\"]")
    public WebElement usdField;

    @FindBy(xpath = "//button[@form='register-form-2']")
    public WebElement signUpButton1;











}
