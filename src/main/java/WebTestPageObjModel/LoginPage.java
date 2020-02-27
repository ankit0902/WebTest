package WebTestPageObjModel;

import org.openqa.selenium.By;

public class LoginPage extends Utils{




    private By _loginPage = By.className("ico-login");
    private By _enterEmail = By.xpath("//input[@class=\"email\"]");
    String emailAddress = "rajeshpatel01@gmail.com" + createTimeStamp();
    private By _enterPassword = By.xpath("//input[@class=\"password\"]");
    String password = "patel1234";
    private By _loginButton = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/input");

    public void UserEnterLoginDetails() {

        try {
            Thread.sleep(2000);

        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        sendText(_enterEmail, emailAddress);

        try {

            Thread.sleep(200);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        sendText(_enterPassword, password);

    }

        public void clickOnLoginButton() {

            clickOnElement(_loginButton);
            try {
                Thread.sleep(2000);

            } catch (InterruptedException e) {

                e.printStackTrace();


            }

        }
}
