package WebTestPageObjModel;

import org.openqa.selenium.By;

public class Fahernheit451ByRayBook extends Utils{

    private By _itemtoRefer = By.xpath("//div[@class=\"email-a-friend\"]");

    public void verifyUserIsOnfaherheit451ByRayBookPage(){

        assertUrl("fahrenheit-451-by-ray-bradbury");
    }

    public void userSelectItemToReferFriend(){

        clickOnElement(_itemtoRefer);


    }








}

