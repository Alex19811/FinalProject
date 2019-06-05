package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class MainPage extends BasePage {

    private static By newSelerText = By.xpath("//h2[@class='subtitle']");
    private static By SelectLanguage = By.id("select-language");
    private static By goToHomeDecor = By.xpath("//a[contains(@class,'level0') and text()='Home & Decor']");
    //private static By goToHomeDecor = By.xpath("//html[@id='top']//nav[@id='nav']//li[@class='level0 nav-4 parent']/a[@href='http://magento.mainacad.com/lesson_12/home-decor.html']");
    private static By accountButton = By.xpath("//a[@href='#header-account']/span[@class='label']");
    private static By loginInput = By.xpath("//div[@id='header-account']//a[@title='Log In']");
    private static By goToSale = By.xpath("//a[@href='http://magento.mainacad.com/lesson_12/sale.html']");


    public MainPage() {

        Assert.assertEquals(getDriver().findElement(newSelerText).getText(), "NEW PRODUCTS");
    }


    public MainPage clickLanguageAutomation() {
//        getDriver().findElement(SelectLanguage);
////       Select sel = new Select(clickLanguageAutomation());
////        sel.selectByVisibleText("Automation");
////        return null;

        WebElement elementSpisok = driver.findElement(SelectLanguage);
        Select sel = new Select(elementSpisok);
        sel.selectByVisibleText("Automation");

        return this;
    }

    public HomeAndDecorPage clickGoToHomeDecor() {
        getDriver().findElement(goToHomeDecor).click();
        return new HomeAndDecorPage();
    }

    public MainPage clickAccountButton() {
        getDriver().findElement(accountButton).click();
        return this;
    }
    public LogInPage clickLogIn() {
        getDriver().findElement(loginInput).click();
        return new LogInPage();
    }

    public SalePage clickGoToSale() {
        getDriver().findElement(goToSale).click();
        return new SalePage();
    }


}
//
//    public MainPage clickGoToElectronics() {
//        getDriver().findElement(goToElectronics).click();
//        return new MainPage();
//    }

//        Actions builder = new Actions(driver);
//        final Actions = builder.moveToElement(goToHomeDecor.findElement()).click(goToElectronics);
//        Action mouseoverAndClick = builder.build();
//        mouseoverAndClick.perform();
//        return new MainPage();

//        public ElectronicsPage goToElectronicsPage() {
//            Actions actions = new Actions(getDriver());
//            actions.moveToElement(find(goToHomeDecor)).build().perform();
//            waitVisibility(goToElectronics, 5).click();
//            return new ElectronicsPage();
//        }


//        Actions(driver).moveToElement(goToHomeDecor).perform();
//        return null


//new Actions(driver).moveToElement((WebElement) GoToHomeDecor).perform();

//        Actions builder = new Actions(driver);
//        builder.moveToElement((WebElement) goToHomeDecor).click((WebElement) GoToElectronics);
//        Action mouseoverAndClick = builder.build();
//        mouseoverAndClick.perform();
//        return new MainPage();
//    }
//
//        getDriver().findElement(GoToHomeDecor).click();
//        return new MainPage();
//    }

//        WebElement elementButton = driver.findElement(GoToHomeDecor);
//        elementButton.click();
//        return null;
//}
//    public MainPage clickGoToElectronics() {
//
//            WebElement elementElectronics = driver.findElement(GoToHomeDecor);
//            Select sel = new Select(elementElectronics);
//            sel.selectByVisibleText("ELECTRONICS");
//            return null;
//    }


















