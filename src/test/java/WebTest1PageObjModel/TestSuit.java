package WebTest1PageObjModel;

import WebTestPageObjModel.*;
import org.testng.annotations.Test;


public class TestSuit extends BaseTest {

    HomePage homepage = new HomePage();
    RegistrationPage registrationPage =  new RegistrationPage();
    RegistrationResultPage registrationResultPage= new RegistrationResultPage();
    BooksCategory booksCategory = new BooksCategory();

    @Test
    public void userShouldbeRegisterSuccessfully(){
        //Click on Register Button
        homepage.clickOnRegisterButton();
        //fill the registration details
       // registrationPage.verifyUserIsOnRegisterPage();
        registrationPage.userEnterRegistrationDetail();
         //verify registration success message
        registrationResultPage.verifyUserShouldBeRegistrationSuccessMessage();
        //Click on Book Category
        BooksCategory.clickOnElement();
        //Click on Fahrenheit 351
        BooksCategory.clickOnElement();





    }
}
