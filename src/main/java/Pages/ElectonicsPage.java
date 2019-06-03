package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ElectonicsPage extends BasePage {

    private static By electronicsPageTitle =By.xpath("//html[@id='top']/body/div[@class='wrapper']/div[@class='page']//h1[.='Electronics']");
    private static By showAsListButton = By.xpath("//a[@title='List']");
    private static By showSelection = By.xpath("//select[@title='Results per page']");
    private static By egualCounter = By.xpath("//p[@class='amount amount--no-pages']/strong[.='13 Item(s)']");


    //html[@id='top']/body/div[@class='wrapper']/div[@class='page']//h1[.='Electronics']
    public ElectonicsPage() {
        Assert.assertEquals(getDriver().findElement(electronicsPageTitle).getText(), "ELECTRONICS");
    }


    public ElectonicsPage clickShowAsListButton () {
        getDriver().findElement(showAsListButton).click();
        return this;
    }
    public ElectonicsPage setNumberOfProducts (int numberOfProducts){
        Select select=new Select(getDriver().findElement(showSelection));
        select.selectByVisibleText(String.valueOf(numberOfProducts));
        return this;
    }
    public ElectonicsPage numberPresentProductsOfEegualCounter (int  )

}
