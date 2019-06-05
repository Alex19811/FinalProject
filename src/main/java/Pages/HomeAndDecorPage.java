package Pages;

import org.openqa.selenium.By;
import org.testng.Assert;

public class HomeAndDecorPage extends BasePage{

    private static By electronicsContainer = By.xpath("//img[@alt='Electronics']");
    private static By pageTitle = By.xpath("//div[contains(@class,'page-title ')]//h1");

    public HomeAndDecorPage() {
        Assert.assertEquals(getDriver().findElement(pageTitle).getText(),"HOME & DECOR");
    }


    public ElectonicsPage clickOnElectronicsContainer(){
        getDriver().findElement( electronicsContainer).click();
        return new ElectonicsPage();
    }


}
