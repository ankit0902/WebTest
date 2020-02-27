package WebTestPageObjModel;

import org.openqa.selenium.By;

public class EmailWhistList extends Utils{

    private By _friendEmail = By.xpath("//input[@class=\"friend-email\"]");
    private By _sendEmail = By.className("button-1 send-email-a-friend-button");
    String expected = "Your message has been sent";
    private By _actual = By.xpath("//div[@class=\"result\"]");
    String _nonRegisterActual = "Enter your email";
    private By _notRegisterActual = By.xpath("//div[@class=\"message-error validation-summary-errors\"]");




    public void enterFriendEmailAddress() {

        //enter friend email address

        sendText(_friendEmail, "darshanshah@gmail.com");
        // click on send email
    }

    public void sendEmailToFriend(){



        clickOnElement(_sendEmail);}

        //Assert to verify registered user see email sent messege

      public void verifyUserSeeEmailSentMessage() {


     assertTextMessage("Email not send", expected, _actual);

        }
        public void VerifyNotRegisterUserSeeErrorMessage(){

            assertTextMessage("fail",expected, _notRegisterActual);
        }



        }






