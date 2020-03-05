package WebTestPageObjModel;

import org.openqa.selenium.By;

public class RegistrationResultPage extends Utils{

    private By _registerSuccessMessage  = By.xpath("//div[@class=\"result\"]");
    String expected = "Your Registration Completed";

    public void verifyUserShouldBeRegistrationSuccessMessage(){
        assertUrl("registerresult");
        assertTextMessage("Yours Registration Completed",expected,_registerSuccessMessage);

    }

}
