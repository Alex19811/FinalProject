package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;


public class MainPage extends BasePage {

    private By SelectLanguage = By.id("select-language");
    private By GoToHomeDecor = By.xpath("//html[@id='top']//nav[@id='nav']//li[@class='level0 nav-4 parent']/a[@href='http://magento.mainacad.com/lesson_12/home-decor.html']");

    //public MainPage() {
    //Assert.assertEquals(getDriver().findElement(newSelerText).getText(), "NEW PRODUCTS");

    public MainPage clickGoToHomeDecor() {
        getDriver().findElement(GoToHomeDecor).click();
        return new MainPage();
    }

    public MainPage clickLanguageAutomation() {
        getDriver().findElement(SelectLanguage);
        Select sel = new Select(SelectLanguage);
        sel.selectByVisibleText("Automation");
    }



}









