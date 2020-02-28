package WebTestPageObjModel;

import org.openqa.selenium.By;

public class GuestCheckout extends Utils {

    //object of loadprop class

    LoadProp loadProp = new LoadProp();
    //locator for checkout guest
    private By _checkoutguest = By.xpath("//input[@value='Checkout as Guest']");
    //locator for first name
    private By _firstname = By.xpath("//input[@name='BillingNewAddress.FirstName']");
    //locator for lastname
    //  private String FirstName = "Ratan";
    private By _lastname = By.xpath("//input[@name='BillingNewAddress.LastName']");
    //  private String LastName = "Tata";
    private By _email = By.id("BillingNewAddress_Email");
    private By _country = By.id("BillingNewAddress_CountryId");
    // private By _dropdown = By.xpath("//select[@name='BillingNewAddress.CountryId']");
   //   private String _ = "United Kingdom";
    private By _city = By.xpath("//input[@name = 'BillingNewAddress.City']");
    //      private String city = "London";
    private By _address = By.xpath("//input[@name='BillingNewAddress.Address1']");
    //     private String address = "19, Winkley Court";
    private By _zip= By.xpath("//input[@name ='BillingNewAddress.ZipPostalCode']");
    //      private String postcode = "HA2 8RT";
    private By _phonenum = By.xpath("//input[@name='BillingNewAddress.PhoneNumber']");
    //   private String phonenum = "07912868533";
    private By _continue = By.xpath("//input[@onclick='Billing.save()']");


    public void checkoutAsGuest() {
        clickOnElement(_checkoutguest);
        //reading first name from testconfig file
        String firstName = loadProp.getProperty("firstname");
        sendText(_firstname, firstName);
        //reading last name from testconfig file
        String lastName = loadProp.getProperty("lastname");
        sendText(_lastname, lastName);
        //reading email from testconfig file
        String email = loadProp.getProperty("email");
        sendText(_email, email);
        //select value of country
        selectTextFromDropDown(_country, "233");
        //enter city name
        String city = loadProp.getProperty("city");
        sendText(_city, city);
        //enter address
        String address = loadProp.getProperty(("address"));
        sendText(_address, address);
        //enter postcode
        String zip = loadProp.getProperty(("zip"));
        sendText(_zip, zip);
        //enter phone number
        String phonenum = loadProp.getProperty(("phonenum"));
        sendText(_phonenum, phonenum);
        //click on continue
        clickOnElement(_continue);

    }



    }


