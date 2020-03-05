package WebTest1PageObjModel;

import WebTestPageObjModel.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {


    HomePage homePage = new HomePage();
    NewOnlineStoreIsOpenPage newOnlineStoreIsOpenPage= new NewOnlineStoreIsOpenPage();
    BookPage bookPage = new BookPage();
    //To create object of cart page
    CartPage cartPage = new CartPage();
    //To create object of checkout as guest
    CheckoutasaGuest checkoutAsGuest = new CheckoutasaGuest();
    //To create object of fill checkout details
    FillCheckoutDetails fillCheckoutDetails = new FillCheckoutDetails();
    //To create object of checkout result
    CheckoutResult checkoutResult = new CheckoutResult();
    //To create object of news page
    NewsPage newsPage = new NewsPage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    JewleryComparisionPage jewleryComparisonPage = new JewleryComparisionPage();
    WishListPage wishListPage = new WishListPage();
    ComputerPage computerPage = new ComputerPage();
    DesktopPage desktopPage = new DesktopPage();
    WishListPage whishlistpage = new WishListPage();
    LoginPage loginPage = new LoginPage();
    ReferProduct referProduct = new ReferProduct();
    CameraPhotoPage cameraPhotoPage = new CameraPhotoPage();
    ElectronicsPage electronicsPage = new ElectronicsPage();
    EmailWishListPage emailWishListPage = new EmailWishListPage();
    JewelryPage jewelryPage = new JewelryPage();


//*******************************************************************************************************************//
    //1. User should able to register page successfully
    @Given("User is on register page")
    public void userIsOnRegisterPage() {

        //click on Register Button
        homePage.clickOnRegisterButton();
    }

    @When("User enters all registration details")
    public void userEntersAllRegistrationDetails() {
        //fill up registration details
        registrationPage.userEnterRegistrationDetail();

    }

    @And("User clicks on registration button")
    public void userClicksOnRegistrationButton() {
    }

    @Then("User should able to register successfully")
    public void userShouldAbleToRegisterSuccessfully() {
        //verify registration success message
        registrationResultPage.verifyUserShouldBeRegistrationSuccessMessage();

    }
//***************************************************************************************************************************
   //2.User should be able to see add to cart button on homepage
    @Given("user is already on  homepage of https:\\/\\/demo.nopcommerce.com\\/")
    public void userIsAlreadyOnHomepageOfHttpsDemoNopcommerceCom() {
    }

    @When("user Checks Add to cart button is present on all homepage products.")
    public void userChecksAddToCartButtonIsPresentOnAllHomepageProducts() {

        //To verify add to cart is present in all featured products
        homePage.verifyAddToCartPresentOnHomepageFeaturedItems();
    }

    @Then("user should able to see Add to cart button on all homepage products.")
    public void userShouldAbleToSeeAddToCartButtonOnAllHomepageProducts() {
    }
//*******************************************************************************************************************
    //3. User should be able to compare product

    @Given("User should be on HomePage")
    public void userShouldBeOnHomePage() {
    }

    @When("click on Jwelery Button")
    public void clickOnJweleryButton() {
    }

    @And("click on add to compare list on first item")
    public void clickOnAddToCompareListOnFirstItem() {
    }

    @And("click on add to compare list on second item")
    public void clickOnAddToCompareListOnSecondItem() {
    }

    @And("click on product comparision from green navigational Bar")
    public void clickOnProductComparisionFromGreenNavigationalBar() {
    }

    @Then("user should able to navigate compare product page")
    public void userShouldAbleToNavigateCompareProductPage() {
    }
//*********************************************************************************************************************//
//4. User should able to change currancy
    @Given("user is on  homepage")
    public void userIsOnHomepage() {
    }

    @When("user selects Euro from currency drop down box.")
    public void userSelectsEuroFromCurrencyDropDownBox() {

        //To click on currency euro
        homePage.clickCurrencyEuro();
    }

    @Then("user should able to see product prices  with Euro symbol.")
    public void userShouldAbleToSeeProductPricesWithEuroSymbol() {

        //To verify Euro sign
        homePage.verifyPriceHasEuroSign();

    }

    @When("user selects US Dollar from currency drop down box.")
    public void userSelectsUSDollarFromCurrencyDropDownBox() {

        //To click on currency dollar
        homePage.clickCurrencyDollar();
    }

    @Then("user should able to see product prices  with US Dollar  symbol.")
    public void userShouldAbleToSeeProductPricesWithUSDollarSymbol() {

        //To verify Dollar sign
        homePage.verifyPriceHasDollarSign();
    }
//******************************************************************************************************************//
    //5.User should able to checkout master card successfully

    @Given("user is already on  homepage")
    public void userIsAlreadyOnHomepage() {
    }

    @When("user clicks on Book link")
    public void userClicksOnBookLink() {


        //Click on book link
        homePage.clickOnBooks();
    }

    @And("user clicks on ADD TO CART button.")
    public void userClicksOnADDTOCARTButton() {

        //Click on add to cart
        bookPage.clickOnAddToCart();
    }

    @And("user clicks on Shopping cart.")
    public void userClicksOnShoppingCart() {
        //Click on shopping cart
        bookPage.clickOnShoppingCart();
    }



    @And("user clicks on I agree terms and conditions checkbox.")
    public void userClicksOnIAgreeTermsAndConditionsCheckbox() {
        //To accept on terms and condition
        cartPage.checkTermsAndCondition();

    }

    @And("user clicks on Checkout.")
    public void userClicksOnCheckout() {

        //Click on checkout
        cartPage.clickOnCheckout();
    }

    @And("user clicks Checkout as guest button.")
    public void userClicksCheckoutAsGuestButton() {

        //Click on checkout as guest
        checkoutAsGuest.clickOnCheckoutAsGuest();
    }


    @And("user enters Checkout Details")
    public void userEntersCheckoutDetails() {
        //To fill checkout details
        fillCheckoutDetails.fillCheckoutDetails();

    }

    @Then("user should able to see successful message")
    public void userShouldAbleToSeeSuccessfulMessage() {
        //To verify success message
        checkoutResult.verifyCheckoutSuccessMessage();

    }
//*****************************************************************************************************************//
   //6.user should be able to add comments successfully

    @Given("user is on  homepage of https:\\/\\/demo.nopcommerce.com\\/")
    public void userIsOnHomepageOfHttpsDemoNopcommerceCom() {
    }

    @When("user clicks on View News Archive link.")
    public void userClicksOnViewNewsArchiveLink() {
    }

    @And("user clicks on first Details button.")
    public void userClicksOnFirstDetailsButton() {

        //To click on details
        newsPage.userClickOnDetails();
    }

    @And("user enters Title.")
    public void userEntersTitle() {
    }

    @And("user enters Comment.")
    public void userEntersComment() {
    }

    @And("user clicks on New comment button.")
    public void userClicksOnNewCommentButton() {
        //To add new comment
        newOnlineStoreIsOpenPage.addNewComment();

    }

    @Then("user should able to see new comment successful message")
    public void userShouldAbleToSeeNewCommentSuccessfulMessage() {
        //To verify New comment added
        newOnlineStoreIsOpenPage.verifySuccessMessageOfComment();


    }
//********************************************************************************************************************//
   //7. NOn Register user should not able to refer a product to friend
    @When("User on HomePage")
    public void userOnHomePage() {
    }

    @And("click on computer category")
    public void clickOnComputerCategory() {
        homePage.clickOnComputer();

    }

    @And("click on desktop from categories")
    public void clickOnDesktopFromCategories() {

        computerPage.clickOnDesktop();
    }

    @And("click on item")
    public void clickOnItem() {
        desktopPage.userSelectItemToReferFriend();

    }

    @And("click on email a friend button")
    public void clickOnEmailAFriendButton() {

        referProduct.emailProduct();
    }

    @And("enter friend's email address details")
    public void enterFriendSEmailAddressDetails() {

        emailWishListPage.enterEmailAddressOfFriend();
    }

    @And("click on send email button")
    public void clickOnSendEmailButton() {

        //calling method to click on send email
        emailWishListPage.sendEmailToFriend();
    }

    @Then("user able to see error message")
    public void userAbleToSeeErrorMessage() {

        // verify user see error message
        emailWishListPage.verifyNotRegisterUserSeeErrorMessage();
    }
//*******************************************************************************************************************//
  //8.User should able to see high to low price

    @Given("user is on HomePage")
    public void userIsOnHomePage() {
    }

    @And("click on electronics button")
    public void clickOnElectronicsButton() {
        homePage.clickOnElectronics();

    }

    @And("click on Cameras&photos from categories")
    public void clickOnCamerasPhotosFromCategories() {

        electronicsPage.clickOnCameraAndPhotos();
    }

    @And("select from position dropdown button High to low")
    public void selectFromPositionDropdownButtonHighToLow() {

        cameraPhotoPage.useSelectFromPositionPriceHighToLow();
    }

    @Then("products are arraged in descending order")
    public void productsAreArragedInDescendingOrder() {

        cameraPhotoPage.pricesFromElement();
    }
//********************************************************************************************************//
  //9. Register user should able to refer a product to friend

    @Given("Register user should be on  Home page")
    public void registerUserShouldBeOnHomePage() {
    }

    @When("click on Login Page")
    public void clickOnLoginPage() {


    }

    @And("user Enter Login page")
    public void userEnterLoginPage() {

        loginPage.clickOnLoginButton();
    }

    @And("click on computers")
    public void clickOnComputers() {

        homePage.clickOnComputer();
    }

    @And("click on desktop from categorie")
    public void clickOnDesktopFromCategorie() {

        computerPage.clickOnDesktop();
    }

    @And("click on items")
    public void clickOnItems() {

    }

    @And("click on email friend button")
    public void clickOnEmailFriendButton() {
        //calling method to click on email to friend
        referProduct.emailProduct();

    }

    @And("enter friend's email address")
    public void enterFriendSEmailAddress() {

        emailWishListPage.enterEmailAddressOfFriend();
    }

    @Then("user able to see Success messege")
    public void userAbleToSeeSuccessMessege() {


    }


  //  *************************************************************************************************************
}
