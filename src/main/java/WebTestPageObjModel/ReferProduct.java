package WebTestPageObjModel;

import org.openqa.selenium.By;

public class ReferProduct extends Utils {

    //variable

    private By _clickOnEmaiFriend = By.xpath("//div[@class=\"button\"]");


    // click email button

    public void emailProduct(){

        clickOnElement(_clickOnEmaiFriend);
    }
}
