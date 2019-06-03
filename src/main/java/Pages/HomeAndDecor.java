package Pages;

import org.openqa.selenium.By;
import org.testng.Assert;

public class HomeAndDecor extends BasePage{

    public HomeAndDecor() {
        Assert.assertEquals(getDriver().findElement(pageTitle).getText(),"HOME & DECOR");
    }

    By electronicsContainer = By.xpath("//ul[@class='catblocks']//li//span[text()='Electronics']");
    By pageTitle = By.xpath("//div[contains(@class,'page-title ')]//h1");


    public ElectonicsPage clickOnElectronicsContainer(){
        getDriver().findElement( electronicsContainer).click();
        return new ElectonicsPage();
    }

}
