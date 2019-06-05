package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LogInPage extends BasePage {

    private static By goToHomeDecorMyDashboardPage = By.xpath("//html[@id='top']//nav[@id='nav']//li[@class='level0 nav-4 parent']/a[@href='http://magento.mainacad.com/lesson_12/home-decor.html']");
    private static By logInButton = By.xpath("//div[@id='header-account']//a[@title='Log In']");
    private static By addressMailAddInput = By.id("email");
    private static By passwordInput = By.id("pass");
    private static By loginInput = By.xpath("//html[@id='top']//button[@id='send2']");

    public MyDashboardPage clickGoToHomeDecorMyDashboardPage() {
        getDriver().findElement(goToHomeDecorMyDashboardPage).click();
        return new MyDashboardPage();
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

