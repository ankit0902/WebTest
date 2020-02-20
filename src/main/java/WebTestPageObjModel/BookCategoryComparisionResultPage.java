package WebTestPageObjModel;

import org.openqa.selenium.By;

public class BookCategoryComparisionResultPage extends Utils {

    private By _comparisionResults = By.xpath("\"//h1[text()=\\\"Compare products\\\"]\")");
    String expected = "Compare products";

    public void usershouldseeComparasionResult(){

        waitForElementPresent(_comparisionResults,10);
        assertTextMessage("Compare product not successfull",expected,_comparisionResults);
    }
}
