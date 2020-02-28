package WebTestPageObjModel;

import org.openqa.selenium.By;

public class HomePage extends Utils {

    private By _registerLink= By.xpath("//a[text()=\"Register\"]");

    private By _category = By.linkText("Books");

    private By _loginButton = By.className("ico-login");

    private By _jewelryLink = By.xpath("//ul[contains(@class,'notmobile')]//li//a[contains(text(),'Jewelry')]");

    private By _viewnewsLink = By.xpath("//div[@class='news-items']");

    private By _changeCurrency = By.id("customerCurrency");

    private By _featureProductDollar = By.xpath("//*[@id=\"customerCurrency\"]");

    private By _featureProductEuro = By.xpath(("//*[@id=\"customerCurrency\"]"));


    //Click on Register Button
        public void clickOnRegisterButton() {

        clickOnElement(_registerLink);
    }
    //Click on Login Button
        public void clickOnLoginButton(){

        clickOnElement((_loginButton));
    }

    //Click on Books Category
        public void clickOnBooks(){

        clickOnElement(_category);
    }
    //Click on FahrenHeit451ray Books Category

         public void clickONFahrenHeit451ray(){

        clickONFahrenHeit451ray() ;
    }

    //Click on FirstPrizePies Books Category

        public void clickonFirstPrizePies(){

        clickonFirstPrizePies();
    }
    //Click on Jewelery Category

        public void clickOnJewelryCategory(){

            clickOnElement(_jewelryLink);
        }

    //Click on ViewNewsArchive Link

        public void clickOnViewNewsArchive() {

        clickOnElement(_viewnewsLink);
    }

    //Click on Euro Currency
        public void clickCurrencyEuro(){

        scrollClick(_changeCurrency);
        selectTextFromDropDown(_changeCurrency,"Euro");
        }

     //Click on Dollar Currency

        public void clickCurrencyDollar() {

            scrollClick(_changeCurrency);
            selectTextFromDropDown(_changeCurrency, "Dollar");
        }

     //Verify price has Euro Sign

        public void verifyPriceHasEuroSign(){

        getTextFromListAndVerify(_featureProductEuro,"Ђ");
        }

     //Verify price has Dollar Sign

        public void verifyPriceHasDollarSign(){

            getTextFromListAndVerify(_featureProductDollar,"$");
        }




}




