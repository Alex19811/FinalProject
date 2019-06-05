
package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
public class BasePage {
    protected static WebDriver driver;


    public static void setDriver(WebDriver webDriver) {
                driver=webDriver;
    }

    public static WebDriver getDriver() {
        ((JavascriptExecutor)driver).executeScript("document.getElementById('fixedban').style.display = 'none';");
        return driver;
    }
}

//
//public class BasePage {
//   public static void setDriver(WebDriver driver) {
//
//        protected static WebDriver driver;
//   //     private final static ThreadLocal <WebDriver>DRIVER=new ThreadLocal<>();
//
//
//
//        public static WebDriver getDriver() {
//
//            return driver.get();
//        }
//
//        public static void setDriver(WebDriver webDriver) {
//            driver.set(webDriver);
//        }
//
//
//        public static void closeDriver() {
//            if (getDriver() != null)
//                getDriver().close();
//        }
//    }
//
