package WebTest1PageObjModel;

import WebTestPageObjModel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class TestSuit extends BaseTest {

    HomePage homepage = new HomePage();
    RegistrationPage registrationPage =  new RegistrationPage();
    RegistrationResultPage registrationResultPage= new RegistrationResultPage();
    BooksCategory booksCategory = new BooksCategory();
    BookCategoryComparisionResultPage booksCategoryComparisionResultPage = new BookCategoryComparisionResultPage();
    LoginPage loginPage = new LoginPage();
    ReferProduct  referProduct = new ReferProduct();
    EmailWhistList emailWhistList = new EmailWhistList();
    Fahernheit451ByRayBook fahernheit451ByRayBook = new Fahernheit451ByRayBook();
    JewelryPage jewelryPage = new JewelryPage();
    GuestCheckout guestCheckout = new GuestCheckout();
    ShippingAddress shippingAddress = new ShippingAddress();
    PaymentMethod paymentMethod = new PaymentMethod();
    NewsPage newsPage = new NewsPage();
    ChangeCurrancy changeCurrancy = new ChangeCurrancy();
    CheckoutResult checkoutResult = new CheckoutResult();






    @Test
    public void userShouldbeRegisterSuccessfully(){
        //Click on Register Button
          homepage.clickOnRegisterButton();
        //fill the registration details
         registrationPage.verifyUserIsOnRegisterPage();
        registrationPage.userEnterRegistrationDetail();
         //verify registration success message
        registrationResultPage.verifyUserShouldBeRegistrationSuccessMessage();}

@Test
        public void userShouldbeAbleToCompareTwoDifferentProductSuccessfully() {

            //Click on Books Button and Calling method from bookscateogry
            homepage.clickOnBooks();
            booksCategory.verifyUserOnBookCategoryPage();
            //calling method to compare product from bookscateogry
            booksCategory.selectProductsToCompare();
            //compare result
            booksCategoryComparisionResultPage.usershouldseeComparasionResult();


        }

        @Test

        public void registerUserShouldAbleToReferProductToFriend(){
        //click on register button
        homepage.clickOnLoginButton();
        loginPage.UserEnterLoginDetails();
        loginPage.clickOnLoginButton();

        //click on books button
        homepage.clickOnBooks();
        booksCategory.clickOnFahernheit451RaYBook();
        fahernheit451ByRayBook.userSelectItemToReferFriend();

        referProduct.emailProduct();
        emailWhistList.enterFriendEmailAddress();
        emailWhistList.sendEmailToFriend();
        emailWhistList.verifyUserSeeEmailSentMessage(); }

        @Test

        public void nonregisterUserShouldNotAbleToReferProductToFriend(){

        homepage.clickOnBooks();
        booksCategory.verifyUserOnBookCategoryPage();
        fahernheit451ByRayBook.userSelectItemToReferFriend();
        referProduct.emailProduct();
        emailWhistList.sendEmailToFriend();
        emailWhistList.VerifyNotRegisterUserSeeErrorMessage();
    }


//1. User should be able to checkout successfully

   @Test
   public void verifyGuestUserShouldBeAbleToCheckOutSuccessfully() {
        //click on jewellery
       homepage.clickOnJewelryCategory();
       //verify user is on jewelry page
       jewelryPage.verifyUserIsOnJewelryPage();
       //click on add to cart product
       jewelryPage.addToCartProduct();
       //click on guestcheckout
       guestCheckout.checkoutAsGuest();
       //enter shipping address details
       shippingAddress.userShippingAddress();
       //user enter payment method
       paymentMethod.userChoosePaymentMethod();
       //verify success messege
       checkoutResult.verifyCheckoutSuccessMessage();


   }

  //User should able to add new comment on nope commerce website
    @Test

    public void verifyGuestUserShoulAbleToAddNewComments(){
        //click on view news archive
        homepage.clickOnViewNewsArchive();
        //click on details
        newsPage.userClickOnDetails();
        //verify new comment added
        newsPage.userClickOnDetails();
        //verify new comment added
        newsPage.verifysuccessmessageofcomment();
    }

//   Verify user should able to change currency
    @Test

    public void userShouldAbleToVerifyCurrency(){
        //click on currency euro
        homepage.clickCurrencyEuro();
        //verify price has euro
        homepage.verifyPriceHasEuroSign();
        //verify currency dollar
        homepage.clickCurrencyDollar();
        //verify currency has dollar
        homepage.verifyPriceHasDollarSign();
             }


        @Test
        public void verifyAddToCompareButtonForEachPorduct(){

        List<WebElement>productList = driver.findElements((By.xpath("//div[@class=\"prices\"]")));


        for (WebElement we: productList){
            System.out.println(productList.size());
            System.out.println(we.getText());
            System.out.println("***************");
            String price = "$1200";
            Assert.assertTrue(we.getText().contains("£"),"this product doesnt have correct currancy symbol" +we.getText());

        }
            }
            }















