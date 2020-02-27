package WebTestPageObjModel;

import org.openqa.selenium.By;



    public class PaymentMethod extends Utils {
        private By _checkbox = By.xpath("//input[@id='paymentmethod_1']");
        private By _continue = By.xpath("//input[@onclick='PaymentMethod.save()']");
        private By _dropdown = By.xpath("//select[@class='dropdownlists']");
        private String card = "MasterCard";
        private By _cardHolderName = By.xpath("//input[@id='CardholderName']");
        private String cardHolderName ="J Patel";
        private By _cardNum = By.xpath("//input[@name='CardNumber']");
        private String cardNum = "5555555555554444";
        private By _expireMonth = By.xpath("//select[@name='ExpireMonth']");
        private String expireMonth = "2";
        private By _expireYear = By.xpath("//select[@name='ExpireYear']");
        private String expireyear = "2022";
        private By _cardcode = By.xpath("//input[@name='CardCode']");
        private String cardcode = "123";
        private By _contine1 = By.xpath("//input[@onclick='PaymentInfo.save()']");



        public void userChoosePaymentMethod(){
            try {

                Thread.sleep(2000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
            clickOnElement(_checkbox);
            try {

                Thread.sleep(2000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
            clickOnElement(_continue);
            selectTextFromDropDown(_dropdown,"MasterCard");
            try {

                Thread.sleep(2000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
            enterText(_cardHolderName,cardHolderName);
            try {

                Thread.sleep(2000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
            enterText(_cardNum,cardNum);
            try {

                Thread.sleep(2000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
            selectTextFromDropDown(_expireMonth,expireMonth);
            try {

                Thread.sleep(2000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
            selectTextFromDropDown(_expireYear,expireyear);
            try {

                Thread.sleep(2000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
            enterText(_cardcode,cardcode);
            try {

                Thread.sleep(2000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
            clickOnElement(_contine1);

        }
    }




