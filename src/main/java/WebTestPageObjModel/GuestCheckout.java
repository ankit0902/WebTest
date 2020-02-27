package WebTestPageObjModel;

import org.openqa.selenium.By;

public class GuestCheckout extends Utils {

    private By _checkoutguest = By.xpath("//input[@value='Checkout as Guest']");

        private By _firstname = By.xpath("//input[@name='BillingNewAddress.FirstName']");
        private String FirstName = "Ratan";
        private By _lastname = By.xpath("//input[@name='BillingNewAddress.LastName']");
        private String LastName = "Tata";
        private By _email = By.id("BillingNewAddress_Email");
        private By _dropdown = By.id("BillingNewAddress_CountryId");
        //private By _dropdown = By.xpath("//select[@name='BillingNewAddress.CountryId']");
        private String _country = "United Kingdom";
        private By _city = By.xpath("//input[@name = 'BillingNewAddress.City']");
        private String city = "London";
        private By _address = By.xpath("//input[@name='BillingNewAddress.Address1']");
        private String address = "19, Winkley Court";
        private By _postcode = By.xpath("//input[@name ='BillingNewAddress.ZipPostalCode']");
        private String postcode = "HA2 8RT";
        private By _phonenum = By.xpath("//input[@name='BillingNewAddress.PhoneNumber']");
        private String phonenum = "07912868533";
        private By _continue = By.xpath("//input[@onclick='Billing.save()']");


        public void checkoutAsGuest(){
            clickOnElement(_checkoutguest);
            sendText(_firstname,FirstName);
            sendText(_lastname,LastName);
            sendText(_email,"premchopda1@gmail.com");
//            try {
//                Thread.sleep(2000);
//            }
//            catch(InterruptedException e){e.printStackTrace();
//            }
            selectTextFromDropDown(_dropdown,"233");
            sendText(_city,city);
            sendText(_address,address);
            sendText(_postcode,postcode);
            sendText(_phonenum,phonenum);
            clickOnElement(_continue);

        }

        public String get_country() {
            return _country;
        }

        public void set_country(String _country) {
            this._country = _country;
        }
    }

