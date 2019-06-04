
import Pages.LogInPage;
import Pages.MainPage;

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
                    .selectPriceInSortBy ("Price");

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
                        .selectPriceInSortBy ("Price")
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
        MainPage mainPage = new MainPage();
        mainPage.clickGoToHomeDecor()
                .clickOnElectronicsContainer()
                .clickShowAsListButton()
                .setNumberOfProducts(25);

        Thread.sleep(3000);


    }
    //6
    @Test
    public void checkSale() throws InterruptedException {
        mainPage.clickLanguageAutomation()
                .clickGoToSale();



//        LogInPage logInPage = new LogInPage();
//        logInPage.clickAccountButton()
//                .clickLogInButton()
//                .doLogin()
//                .clickLogInInput();
//        MainPage mainPage = new MainPage();
//        mainPage.clickGoToHomeDecor()
//                .clickOnElectronicsContainer()
//                .clickShowAsListButton()
//                .setNumberOfProducts(25);

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