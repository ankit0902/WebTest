package WebTestPageObjModel;

import org.openqa.selenium.By;

public class NewsPage extends Utils {

    private By _news = By.xpath("//a[contains(@href,'about')and(@class='read-more')]");
   // private By _news= By.linkText("About nopCommerce");
    private By _title = By.xpath("//input[@class='enter-comment-title']");
    private String title = "about nopcommerce website";
    private By _comment = By.xpath("//textarea[@class='enter-comment-text']");
    private String comment = "very user friendly and helpful ";
    private By _newcomment = By.xpath("//input[@name = 'add-comment']");
    private By _successmessege  = By.xpath("//div[contains(text(),'successfully ')]");

    public void userClickOnDetails() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickOnElement(_news);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        enterText(_title, title);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        enterText(_comment, comment);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickOnElement(_newcomment);
    }
        public void verifysuccessmessageofcomment(){
            String expected = "new comment is successfully added.";
            assertTextMessage("New comment is not added successfully",expected,_successmessege);
        }

    }

