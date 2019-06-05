package Pages;

import org.openqa.selenium.By;
import org.testng.Assert;

public class MyWhishlistPage extends BasePage {

    public static By newSelectTextMyWishlist = By.xpath("//html[@id='top']/body/div[@class='wrapper']/div[@class='page']/div[2]//h1[.='My Wishlist']");

    public MyWhishlistPage() {
        Assert.assertEquals(getDriver().findElement(newSelectTextMyWishlist).getText(), "MY WISHLIST");
    }
}


