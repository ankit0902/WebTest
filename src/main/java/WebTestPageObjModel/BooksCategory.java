package WebTestPageObjModel;

import org.openqa.selenium.By;

public class BooksCategory extends Utils {

        private  By _category= By.linkText("Books ");
        private By _fahernheit451ByRay = By.className("product-title");
        private By _firstprizepies = By.xpath("\"//input[@onclick='return AjaxCart.addproducttocomparelist(\\\"/compareproducts/add/38\\\"),!1']\")");
        private By _compare = By.linkText("product comparision");
        private By _itemtoRefer = By.xpath("//div[@class=\"email-a-friend\"]");
        private By _comparisionButton = By.linkText("product comparison");



        public void verifyUserOnBookCategoryPage(){

            assertUrl("Books");
        }

        public void selectProductsToCompare() {

            {
                try {

                    Thread.sleep(5000);
                } catch (InterruptedException e) {

                    e.printStackTrace();

                }

                //Click first product to comppare
                clickOnElement(_fahernheit451ByRay);

                try {

                    Thread.sleep(5000);
                } catch (InterruptedException e) {

                    e.printStackTrace();

                }
                // Compare Second Product
                clickOnElement(_firstprizepies);

                try {

                    Thread.sleep(5000);
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }

                //click on comparision button from green navigation bar

                clickOnElement(_comparisionButton);

            }
        }
            public void clickOnFahernheit451RaYBook() {


                {
                    try {

                        Thread.sleep(5000);
                    } catch (InterruptedException e) {

                        e.printStackTrace();

                    }
                    clickOnElement(_fahernheit451ByRay);
                }

            }

}

