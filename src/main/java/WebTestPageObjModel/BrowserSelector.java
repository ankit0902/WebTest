package WebTestPageObjModel;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static WebTestPageObjModel.BasePage.driver;

public class BrowserSelector {
    public void setupBrowser() {

        System.setProperty("webdriver.chrome.driver","src\\test\\Resources\\BrowserDriver\\chromedriver.exe");
        //object created from chrome driver
        driver = new ChromeDriver();
        //maximize window
        driver.manage().window().maximize();
        // add implicitly wait
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/");

    }
        public void closeBrowser(){

        driver.close();
        }


    }





