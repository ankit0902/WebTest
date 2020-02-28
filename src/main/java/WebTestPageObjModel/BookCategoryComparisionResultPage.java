package WebTestPageObjModel;

import org.openqa.selenium.By;

public class BookCategoryComparisionResultPage extends Utils {

    private By _BookscomparisionResults = By.xpath("\"//h1[text()=\\\"Compare products\\\"]\")");
    String expected = "Compare products";

    public void usershouldseeComparasionResult(){

        waitForElementPresent(_BookscomparisionResults,10);
        assertTextMessage("Compare product not successfull",expected,_BookscomparisionResults);
    }
}
