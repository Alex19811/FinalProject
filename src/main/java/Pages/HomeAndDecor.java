package Pages;

import org.openqa.selenium.By;
import org.testng.Assert;

public class HomeAndDecor extends BasePage{

    private static By electronicsContainer = By.xpath("//ul[@class='catblocks']//li//span[text()='Electronics']");
    private static By pageTitle = By.xpath("//div[contains(@class,'page-title ')]//h1");

    public HomeAndDecor() {
        Assert.assertEquals(getDriver().findElement(pageTitle).getText(),"HOME & DECOR");
    }





    public ElectonicsPage clickOnElectronicsContainer(){
        getDriver().findElement( electronicsContainer).click();
        return new ElectonicsPage();
    }


}
