package WebTestPageObjModel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


public class Utils extends BasePage{

    public void clickOnElement(By by){

        driver.findElement(by).click();
    }




    public static String getTextFromElement(By by){

        return driver.findElement(by).getText(); }

     public static void sendText(By by,String text){

        driver.findElement(by).sendKeys(text);
        }

        public static void waitUntilClickable(By by,int time){

        WebDriverWait wait  = new WebDriverWait(driver,time);
        }

    public static void waitForElementPresent(By by,int time){

        WebDriverWait wait = new WebDriverWait(driver,time);


    }


        public static void assertTextMessage(String message,String expected,By by){
        String actual = getTextFromElement(by);
        Assert.assertEquals(message,expected,actual);
    }

    public static void assertUrl(String text){

        Assert.assertTrue(driver.getCurrentUrl().contains(text));
    }
        public static String createTimeStamp(){

        return new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
    }

    public void selectFromDropDownByVisibleText(By by, int visText){

        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(String.valueOf(visText));

    }

    public static void urlContains(String text){

        driver.getPageSource().contains(text);
    }

    public static void selectFromDropDownByValue(By by, String value){

        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }
    public static void selectTextFromDropDown(By by,String text){

        Select select = new Select(driver.findElement(by));
        select.selectByValue(text);

    }
    public static void enterText(By by,String text){

        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }

    public static void scrollClick(By by){

        WebElement element = driver.findElement(by);
          ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",element);
          element.click();

    }



    public static void userselectCurrancy(By by, String text){

        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }



    // To get text and verify from list


    public static void getTextFromListAndVerify(By by,String a){
        //Creating object of soft assert class
        SoftAssert softAssert = new SoftAssert();
        //creating list and finding value
        List<WebElement> allProduct = driver.findElements(by);
        //for each loop for product comparision
        for (WebElement product : allProduct){

            System.out.println(product.getText());

            softAssert.assertTrue(product.getText().contains(a),"price doesnt contain " + a);
        }

        softAssert.assertAll();

        }

    //for Time dealy
    public static void timeDelay(int time){
        try {
            Thread.sleep(time *1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //to scroll and click
    public static void scrollAndClick(By by) {
        WebElement element = driver.findElement(by);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();

    }

    //To select from drop down box by value
    public static void selectFromDropdownByValue(By by,String value)
    {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);

    }


    //To check current url
    public static void assertURL(String text)
    {
        org.junit.Assert.assertTrue(driver.getCurrentUrl().contains(text));
    }

    //To select from drop down box by text
    public static void selectFromDropdownByText(By by,String text)
    {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }
    //method to enter text
    public static void sendKeys(By by ,String text)
    {
        driver.findElement(by).sendKeys(text);
    }



}




