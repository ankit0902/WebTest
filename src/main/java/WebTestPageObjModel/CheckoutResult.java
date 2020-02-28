package WebTestPageObjModel;

import org.openqa.selenium.By;

public class CheckoutResult extends Utils{

    //locator for success messeage

    private By  _checkoutsuccessmessage = By.xpath("//div[@class='section order-completed']/div[1]/strong");

    String accepted = "Your order has been successfully processed!";

    public void verifyCheckoutSuccessMessage()
    {

        assertUrl("checkout completed");
        //String accepted = "Your order has been successfully processed!";
        //assertTextMessage("checkout is not successful",accepted,_checkoutsuccessmessage);
    }
}

