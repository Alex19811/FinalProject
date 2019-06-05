
import Pages.*;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static Pages.BasePage.getDriver;

public class Tests extends BaseTest {

    MainPage mainPage;

    @BeforeMethod(alwaysRun = true)
    public void xmsinUnit() {

        mainPage = new MainPage();
    }


    @Test
    public void checkItemsCounter() throws InterruptedException {
        mainPage.clickLanguageAutomation()
                .clickGoToHomeDecor()
                .clickOnElectronicsContainer()
                .clickShowAsListButton()
                .setNumberOfProducts(25)
                .getNumberPresentProducts();

        Assert.assertEquals(getDriver().findElement(productContainer).getSize(), getCountItems);
        Thread.sleep(3000);
    }

    //2
    @Test
    public void checkShowSelect() throws InterruptedException {
        mainPage.clickLanguageAutomation()
                .clickGoToHomeDecor()
                .clickOnElectronicsContainer()
                .clickShowAsListButton()
                .setNumberOfProducts(5);

        Thread.sleep(3000);
    }

    //3
    @Test
    public void checkSortBy() throws InterruptedException {
        mainPage.clickLanguageAutomation()
                .clickGoToHomeDecor()
                .clickOnElectronicsContainer()
                .clickShowAsListButton()
                .setNumberOfProducts(25)
                .selectPriceInSortBy("Price");

        Thread.sleep(3000);
    }

    //4
    @Test
    public void checkPriceFilter() throws InterruptedException {
        mainPage.clickLanguageAutomation()
                .clickGoToHomeDecor()
                .clickOnElectronicsContainer()
                .clickShowAsListButton()
                .setNumberOfProducts(25)
                .selectPriceInSortBy("Price")
                .clickFilter0_999Price();

        Thread.sleep(3000);


    }

    //5
    @Test
    public void checkAddToWishlist() throws InterruptedException {
        ElectonicsPage electonicsPage =
                mainPage.clickLanguageAutomation()
                        .clickAccountButton()
                        .clickLogIn()
                        .fillOutUserNameAndPassword()
                        .clickLogInButton()
                        .clickToHomeDecor()
                        .clickOnElectronicsContainer()
                        .clickShowAsListButton()
                        .setNumberOfProducts(25);
        electonicsPage.clickAddToWishlist();


        Thread.sleep(3000);

    }

    //6
    @Test
    public void checkSale() throws InterruptedException {
        mainPage.clickLanguageAutomation()
                .clickGoToSale()
                .clickGridViewInput()
                .clickShowAsListProducts()
                .setNumberOfProductsSale(36);

        Thread.sleep(3000);
    }

//7

    @Test
    public void checkShopingCart() throws InterruptedException {
        mainPage.clickLanguageAutomation()
                .clickAccountButton()
                .clickLogIn()
                .fillOutUserNameAndPassword()
                .clickLogInButton()
                .clickToHomeDecor()
                .clickOnElectronicsContainer()
                .clickGridViewInputElectronicsPage()
                .setNumberOfProducts(36);


        Thread.sleep(3000);
    }

}


// RegisterPage registerPage = new RegisterPage();
//        Assert.assertTrue(registerPage.isUserNamePresent());
//        Assert.assertTrue(registerPage.isLastNamePresent());
//        Assert.assertTrue(registerPage.isAddessMailAddPresent());
//        Assert.assertTrue(registerPage.isPassworPresent());
//        Assert.assertTrue(registerPage.isConfirmPasswordPresent());
//        // SoftAssert.