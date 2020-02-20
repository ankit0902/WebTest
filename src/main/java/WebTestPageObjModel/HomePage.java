package WebTestPageObjModel;

import org.openqa.selenium.By;

public class HomePage extends Utils {

    private  By _registerLink = By.xpath("//a[text()=\"Register\"]");

    public void clickOnRegisterButton(){

        clickOnElement();
    }





}
