package WebTestPageObjModel;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utils {

    private By _registerLink = By.xpath("//a[text()=\"Register\"]");

    private By _category = By.linkText("Books");

    private By _loginButton = By.className("ico-login");

    private By _jewelryLink = By.xpath("//ul[contains(@class,'notmobile')]//li//a[contains(text(),'Jewelry')]");

    private By _viewnewsLink = By.xpath("//div[@class='news-items']");

    private By _changeCurrency = By.id("customerCurrency");

    private By _featureProductDollar = By.xpath("//*[@id=\"customerCurrency\"]");

    private By _featureProductEuro = By.xpath(("//*[@id=\"customerCurrency\"]"));

    //Locator for item box
    private By _addToCart = By.cssSelector(".item-box>div input[value='Add to cart']");

    //Locator for featured grid
    private By _listOfItems = By.xpath("//div[@class=\"product-item\"]");

    //Locator for computer
    private By _computer = By.xpath("//ul[contains(@class,'notmobile')]//a[contains(text(),'Computers ')]");

    //Locator for electronics
    private By _electronics = By.xpath("//ul[contains(@class,'notmobile')]//li/a[contains(text(),'Electronics ')]");

    //Locator for login button
    private By _loginbutton = By.className("ico-login");


    //Click on Register Button
    public void clickOnRegisterButton() {

        clickOnElement(_registerLink);
    }

    //Click on Login Button
    public void clickOnLoginButton() {

        clickOnElement((_loginButton));
    }

    //Click on Books Category
    public void clickOnBooks() {

        clickOnElement(_category);
    }
    //Click on FahrenHeit451ray Books Category

    public void clickONFahrenHeit451ray() {

        clickONFahrenHeit451ray();
    }

    //Click on FirstPrizePies Books Category

    public void clickonFirstPrizePies() {

        clickonFirstPrizePies();
    }
    //Click on Jewelery Category

    public void clickOnJewelryCategory() {

        clickOnElement(_jewelryLink);
    }

    //Click on ViewNewsArchive Link

    public void clickOnViewNewsArchive() {

        clickOnElement(_viewnewsLink);
    }

    //Click on Euro Currency
    public void clickCurrencyEuro() {

        scrollClick(_changeCurrency);
        selectTextFromDropDown(_changeCurrency, "Euro");
    }

    //Click on Dollar Currency

    public void clickCurrencyDollar() {

        scrollClick(_changeCurrency);
        selectTextFromDropDown(_changeCurrency, "Dollar");
    }

    //Verify price has Euro Sign

    public void verifyPriceHasEuroSign() {

        getTextFromListAndVerify(_featureProductEuro, "Ђ");
    }

    //Verify price has Dollar Sign

    public void verifyPriceHasDollarSign() {

        getTextFromListAndVerify(_featureProductDollar, "$");
    }

    public void clickOnComputer() {
        clickOnElement(_computer);
    }

    //click on Electronics
    public void clickOnElectronics() {
        clickOnElement(_electronics);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
        //To verify add to cart present
        public void verifyAddToCartPresentOnHomepageFeaturedItems () {
            {
                //List
                List<WebElement> listOfItems = driver.findElements(_listOfItems);
                //To count add to cart count
                int actualAddToCartCount = driver.findElements(_addToCart).size();
                //To print add to cart count
                System.out.println("Add to cart count is -------->>> " + actualAddToCartCount);
                int expectedAddToCartCount = 4;
                //For each loop for all items
                for (WebElement item : listOfItems) {
                    //To check if add to cart text is present or not
                    if (item.getAttribute("innerHTML").contains("Add to cart")) {
                        System.out.println(item.getText() + " : has Add to cart button");
                    } else
                        System.out.println(item.getText() + " : does not have Add to cart button");
                    System.out.println("--------------------------------------------------------------------------");


                }
                //Comparing expected and actual number of add to cart button
                Assert.assertEquals("All product does not have Add to cart button: ", expectedAddToCartCount, actualAddToCartCount);
            }

        }
    }








