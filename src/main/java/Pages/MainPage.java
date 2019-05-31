package Pages;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class MainPage extends BasePage {

    private By SelectLanguage = By.id("select-language");
    private By GoToHomeDecor = By.cssSelector ("//a[contains(@class,'level0') and text()='Home & Decor']");
    private By GoToElectronics = By.cssSelector("[class='level1 nav-4-3'] .level1");


//public MainPage() {
    //Assert.assertEquals(getDriver().findElement(newSelerText).getText(), "NEW PRODUCTS");


    public MainPage clickLanguageAutomation() {
//        getDriver().findElement(SelectLanguage);
//       Select sel = new Select(clickLanguageAutomation());
//        sel.selectByVisibleText("Automation");
//        return null;

        WebElement elementSpisok = driver.findElement(SelectLanguage);
        Select sel = new Select(elementSpisok);
        sel.selectByVisibleText("Automation");
        return null;
    }


    public MainPage clickGoToHomeDecor() {

//        Actions(driver).moveToElement(GoToHomeDecor).perform();
//        return null;


        //new Actions(driver).moveToElement((WebElement) GoToHomeDecor).perform();

        Actions builder = new Actions(driver);
        builder.moveToElement((WebElement) GoToHomeDecor).click((WebElement) GoToElectronics);
        Action mouseoverAndClick = builder.build();
        mouseoverAndClick.perform();
        return new MainPage();
    }
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

}
















