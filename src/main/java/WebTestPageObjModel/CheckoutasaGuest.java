package WebTestPageObjModel;

import org.openqa.selenium.By;

public class CheckoutasaGuest extends Utils {

        //locator for checkout as guest
        private By _checkoutAsGuest=By.xpath("//*[@class=\"button-1 checkout-as-guest-button\"]");

        //to click on checkout as guest
        public void clickOnCheckoutAsGuest()
        {
            timeDelay(2);
            scrollAndClick(_checkoutAsGuest);
        }



    }


