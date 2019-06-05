package Pages;

import org.openqa.selenium.By;

public class MyDashboardPage extends BasePage {

    private static By homeDecor = By.xpath("//html[@id='top']//nav[@id='nav']//li[@class='level0 nav-4 parent']/a[@href='http://magento.mainacad.com/lesson_12/home-decor.html']");

    public HomeAndDecorPage clickToHomeDecor() {
        getDriver().findElement(homeDecor).click();
        return new HomeAndDecorPage();
    }

}
