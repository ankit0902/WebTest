package WebTestPageObjModel;

import org.openqa.selenium.By;

public class BooksCategory extends Utils {

        private  By _category= By.linkText("Books ");
        private By _fahernheit451ByRay = By.className("product-title");
        private By _firstprizepies = By.xpath("\"//input[@onclick='return AjaxCart.addproducttocomparelist(\\\"/compareproducts/add/38\\\"),!1']\")");
        private By _compare = By.linkText("product comparision");


        public void selectProductsToCompare(){


            clickOnElement();
            clickOnElement();
            waitUntilClickable(_fahernheit451ByRay,10);
            clickOnElement();
            clickOnElement();
            waitUntilClickable(_firstprizepies,10);



       }

}

