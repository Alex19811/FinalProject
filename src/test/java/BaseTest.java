import Pages.BasePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    @BeforeMethod(alwaysRun = true)
    public void webDriverManager() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        driver.get("http://magento.mainacad.com/");
        BasePage.setDriver(driver);
    }
//    @AfterMethod
//    public void closeDriver(){
//        BasePage.getDriver().close();
//    }
}
