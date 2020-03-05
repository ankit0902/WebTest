package WebTestPageObjModel;

import org.openqa.selenium.By;

public class ElectronicsPage extends Utils {
  //  variablelocator
    private By _cameraAndPhotos = By.xpath("//h2[@class='title']//a[contains(@title,'Camera')]");
    //click on  item
    public void clickOnCameraAndPhotos()
    {
        clickOnElement(_cameraAndPhotos);
    }


}
