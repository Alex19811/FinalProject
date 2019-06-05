
import Pages.*;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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
                .numberPresentProductsOfEegualCounter();

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
        mainPage.clickLanguageAutomation();

        LogInPage logInPage = new LogInPage();
        logInPage.clickAccountButton()
                .clickLogInButton()
                .doLogin()
                .clickLogInInput();

        MyDashboardPage myDashboardPage = new MyDashboardPage();
        myDashboardPage.clickGoToHomeDecorMyDashboardPage();

        HomeAndDecorPage homeAndDecorPage = new HomeAndDecorPage();
        homeAndDecorPage.clickOnElectronicsContainer()
                .clickShowAsListButton()
                .setNumberOfProducts(25);
        ElectonicsPage electonicsPage = new ElectonicsPage();
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
        mainPage.clickLanguageAutomation();

        LogInPage logInPage = new LogInPage();
        logInPage.clickAccountButton()
                .clickLogInButton()
                .doLogin()
                .clickLogInInput();
        MyDashboardPage myDashboardPage = new MyDashboardPage();
        myDashboardPage.clickGoToHomeDecorMyDashboardPage();

        HomeAndDecorPage homeAndDecorPage = new HomeAndDecorPage();
        homeAndDecorPage.clickOnElectronicsContainer()
                .clickGridViewInputElectronicsPage()
                .setNumberOfProducts(36);

//        ElectonicsPage electonicsPage = new ElectonicsPage();
//        electonicsPage.clickAddToWishlist();


//        MainPage mainPage = new MainPage();
//        mainPage.clickGoToHomeDecor()
//                .clickOnElectronicsContainer()
//                .clickGridViewInputElectronicsPage()
//                .setNumberOfProducts(36);


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