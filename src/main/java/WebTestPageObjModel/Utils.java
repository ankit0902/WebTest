package WebTestPageObjModel;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Utils extends BasePage{

    public static void clickOnElement(){driver.findElement(By).click();}

    public static String getTextFromElement(By by){

        return driver.findElement(by).getText(); }

     public static void sendText(By by,String text){

        driver.findElement(by).sendKeys(text);
        }

        public static void waitUntilClickable(By by,long time){

            WebDriverWait wait = new WebDriverWait(driver,time);
            wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public static void waitForElementPresent(By by,int time){

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

    public void selectFromDropDownByValue(By by, String value){

        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }



}
