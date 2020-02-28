package WebTestPageObjModel;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static WebTestPageObjModel.BasePage.driver;

public class BrowserSelector extends Utils {



    public void setupBrowser() {

        LoadProp loadProp = new LoadProp();
        String browser = "Chrome";
        if(browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src\\test\\Resources\\BrowserDriver\\chromedriver.exe");
            //object created from chrome driver
             driver = new ChromeDriver();}

        else if(browser.equalsIgnoreCase(("Firefox")))
        {
        System.setProperty("webdriver.gecko.driver","src\\test\\Resources\\BrowserDriver\\geckodriver.exe");
        driver = new FirefoxDriver();
        }
       else if(browser.equalsIgnoreCase(("Edge")))
       {
            System.setProperty("webdriver.ie.driver","src\\test\\Resources\\BrowserDriver\\IEDriverServer.exe");
           driver = new EdgeDriver();
       }
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





