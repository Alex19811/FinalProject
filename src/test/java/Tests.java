
import Pages.MainPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tests extends BaseTest {

    MainPage mainPage;

    @BeforeMethod (alwaysRun = true)
    public void xmsinUnit() {

        mainPage = new MainPage();
    }


    @Test
    public void checkItemsCounter() throws InterruptedException
    {
        mainPage.clickLanguageAutomation()
                .clickGoToHomeDecor()
                .clickOnElectronicsContainer()
                .clickShowAsListButton()
                .setNumberOfProducts(25);


                Thread.sleep(3000);

//        RegisterPage registerPage = new RegisterPage();
//        Assert.assertTrue(registerPage.isUserNamePresent());
//        Assert.assertTrue(registerPage.isLastNamePresent());
//        Assert.assertTrue(registerPage.isAddessMailAddPresent());
//        Assert.assertTrue(registerPage.isPassworPresent());
//        Assert.assertTrue(registerPage.isConfirmPasswordPresent());
//        // SoftAssert.
    }
}
