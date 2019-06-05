package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LogInPage extends BasePage {

    private static By accountButton = By.xpath("//a[@href='#header-account']/span[@class='label']");
    private static By logInButton = By.xpath("//div[@id='header-account']//a[@title='Log In']");
    private static By addressMailAddInput = By.id("email");
    private static By passwordInput = By.id("pass");
    private static By loginInput = By.xpath("//html[@id='top']//button[@id='send2']");


    public LogInPage clickAccountButton() {
        getDriver().findElement(accountButton).click();
        return this;
    }

    public LogInPage clickLogInButton() {
        getDriver().findElement(logInButton).click();
        return this;
    }

    public LogInPage doLogin() {

        WebElement elementAddressmailAdd = getDriver().findElement(addressMailAddInput);
        elementAddressmailAdd.sendKeys("Aleksandrburlutskiy@gmail.com");

        WebElement elementPassword = getDriver().findElement(passwordInput);
        elementPassword.sendKeys("Aleks123456");
        return this;
    }

    public LogInPage clickLogInInput() {
        getDriver().findElement(loginInput).click();
        return this;
    }


}

