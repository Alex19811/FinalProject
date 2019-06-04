package Pages;

import org.openqa.selenium.By;

public class SalePage extends BasePage {

    private By gridViewInput = By.xpath("//div[@id='header-account']//a[@title='Log In']");


    public SalePage clickGridViewInput() {
        getDriver().findElement(gridViewInput).click();
        return this;
    }









}
