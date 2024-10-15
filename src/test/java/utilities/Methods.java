package utilities;

import org.openqa.selenium.WebElement;

public class Methods {


    public  void enterText(WebElement element, String text){
        element.clear();
        element.sendKeys(text);
    }

    public  void clickButton(WebElement button){
        button.click();
    }

}
