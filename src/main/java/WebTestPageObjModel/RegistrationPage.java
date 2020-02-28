package WebTestPageObjModel;

import org.openqa.selenium.By;


public class RegistrationPage extends Utils{

    private By _firstName = By.id("FirstName");
    private By _lastName = By.name("LastName");
    private By _email = By.xpath("//div[@class = \"inputs\"]//input[@type = \"email\"]");
    private By _password = By.id("Password");
    private By _confirmPassword = By.id("ConfirmPassword");
    private By _registerButton = By.id("register-button");
    private String firstName = "Raju"+ timestamp ;
    private String lastName = "Patel" + timestamp;
    private static String timestamp = createTimeStamp();

   public void verifyUserIsOnRegisterPage(){

    assertUrl("Register");
    }

   public void userEnterRegistrationDetail(){

        sendText(_firstName,firstName);
        sendText(_lastName,lastName);
        sendText(_email,"testtest" + timestamp + "@test.com");
        sendText(_password,"testtest");
        sendText(_confirmPassword,"testtest");
        clickOnElement(_registerButton);
   }


   }








