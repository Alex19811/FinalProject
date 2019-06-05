package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LogInPage extends BasePage {


    private static By logInButton = By.xpath("//html[@id='top']//button[@id='send2']");
    private static By addressMailAddInput = By.id("email");
    private static By passwordInput = By.id("pass");







    public LogInPage fillOutUserNameAndPassword() {

        WebElement elementAddressmailAdd = getDriver().findElement(addressMailAddInput);
        elementAddressmailAdd.sendKeys("Aleksandrburlutskiy@gmail.com");

        WebElement elementPassword = getDriver().findElement(passwordInput);
        elementPassword.sendKeys("Aleks123456");
        return this;
    }
    public MyDashboardPage clickLogInButton() {
        getDriver().findElement(logInButton).click();
        return new MyDashboardPage();
    }



}

