package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class SalePage extends BasePage {

    private static By gridViewInput = By.xpath("//div[@id='header-account']//a[@title='Log In']");
    private static By showAsListProducts = By.xpath("//html[@id='top']/body/div[@class='wrapper']/div[@class='page']/div[2]/div[@class='main']//div[@class='category-products']/div[@class='toolbar']/div[@class='sorter']/p[@class='view-mode']/strong[@title='Grid']");
    private static By showSelectionProducts = By.xpath("//select[@title='Results per page']");

    public SalePage clickGridViewInput() {
        getDriver().findElement(gridViewInput).click();
        return this;
    }
    public SalePage clickShowAsListProducts() {
        getDriver().findElement(showAsListProducts).click();
        return this;
    }

    public SalePage setNumberOfProductsSale(int numberOfProducts) {
        Select select = new Select(getDriver().findElement(showSelectionProducts));
        select.selectByVisibleText(String.valueOf(numberOfProducts));
        return this;
    }









}
