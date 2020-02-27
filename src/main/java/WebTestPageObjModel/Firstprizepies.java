package WebTestPageObjModel;

import org.openqa.selenium.By;

public class Firstprizepies extends Utils{

    private By _itemtoRefer = By.xpath("//div[@class=\"email-a-friend\"]");


    public void verifyUserIsOnFirstPrizepiesPage(){

        assertUrl("first-prize-pies");
    }

    public void userSelectItemToReferFriend(){

        clickOnElement(_itemtoRefer);
    }
}


