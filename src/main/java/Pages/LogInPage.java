package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LogInPage extends BasePage {

    private By accountButton = By.xpath("//a[@href='#header-account']/span[@class='label']");
    private By logInButton = By.xpath("//div[@id='header-account']//a[@title='Log In']");
    private By addressMailAddInput = By.id("email");
    private By passwordInput = By.id("pass");
    private By loginInput = By.xpath("//html[@id='top']//button[@id='send2']");

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

