package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ElectonicsPage extends BasePage {

    private static By electronicsPageTitle = By.xpath("//html[@id='top']/body/div[@class='wrapper']/div[@class='page']//h1[.='Electronics']");
    private static By showAsListButton = By.xpath("//a[@title='List']");
    private static By showSelection = By.xpath("//select[@title='Results per page']");
    private static By productContainer = By.cssSelector("#products-list .item");
    private static By countItems = By.xpath("//strong[.='13 Item(s)']");

    private static By showSelectionPrice = By.xpath("//select[@title='Sort By']");
    private static By filter0_999Price = By.xpath("//dl[@id='narrow-by-list']/dd[@class='odd']/ol/li[1]");
    private static By gridViewInputElectronicsPage = By.xpath("//html[@id='top']/body");
    //private static By addToWishlistButton = By.xpath("//html[@id='top']//ol[@id='products-list']/li[1]//ul[@class='add-to-links']//a[@href='http://magento.mainacad.com/lesson_12/wishlist/index/add/product/392/form_key/5CAu0JOqt9lCo6du/']");
    private static By addToWishlistButton = By.xpath("//html[@id='top']//ol[@id='products-list']/li[2]/div[@class='product-shop']/div[@class='f-fix']/div[3]/ul[@class='add-to-links']/li[1]");

    // private static By egualCounter = By.xpath("//p[@class='amount amount--no-pages']/strong[.='13 Item(s)']");


    public ElectonicsPage() {
        Assert.assertEquals(getDriver().findElement(electronicsPageTitle).getText(), "ELECTRONICS");
    }


    public ElectonicsPage clickShowAsListButton() {
        getDriver().findElement(showAsListButton).click();
        return this;
    }

    public ElectonicsPage setNumberOfProducts(int numberOfProducts) {
        Select select = new Select(getDriver().findElement(showSelection));
        select.selectByVisibleText(String.valueOf(numberOfProducts));
        return this;
    }


//    public ElectonicsPage numberPresentProductsOfEegualCounter(String productList) {
//
///*
//            ArrayList<String> products = new ArrayList<String>();
//            getDriver()
//
//
//    List<WebElement> elements = driver.findElements(By.name("elements_name"))
//*/
//        int count = driver.findElements(By.id(productList)).size();
//        System.out.println(count);
//        return this;
//    }


    public int getNumberPresentProducts() {
        int count = driver.findElements(productContainer).size();
        System.out.println(count);
        getCounterValue();

        return count;
    }

    public int getCounterValue() {
        int  getCountItems = Integer.parseInt(driver.findElement(countItems).getText().substring(0,2));
       // System.out.println(" TEST getCounItems = " + getCountItems);

    return getCountItems;

    }


       //3
    public ElectonicsPage selectPriceInSortBy(String priceInSortBy) {
        Select select = new Select(getDriver().findElement(showSelectionPrice));
        select.selectByVisibleText(String.valueOf(priceInSortBy));
        return this;
    }


    //4

    public ElectonicsPage clickFilter0_999Price() {
        getDriver().findElement(filter0_999Price).click();
        return this;
    }

    public ElectonicsPage clickGridViewInputElectronicsPage() {
        getDriver().findElement(gridViewInputElectronicsPage).click();
        return this;
    }

    //5
    public ElectonicsPage clickAddToWishlist() {
        getDriver().findElement(addToWishlistButton).click();
        return this;
    }

}