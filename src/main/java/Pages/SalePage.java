package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class SalePage extends BasePage {

    private static By gridViewInput = By.xpath("//div[@id='header-account']//a[@title='Log In']");
    private static By showAsListProducts = By.xpath("//div[@safeclass~'\\bcategory-products\\b']/div[1]/div[@safeclass~'\\bpager\\b']/div[@safeclass~'\\bcount-container\\b']/div[@safeclass~'\\blimiter\\b']/select[@title='Results per page']");
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
