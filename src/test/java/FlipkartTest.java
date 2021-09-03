import commonLib.Browser;
import locator.Locator;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import url.Url;


public class FlipkartTest {
    Browser browser = new Browser();
    Url url = new Url();
    Locator locator = new Locator();

    @BeforeClass
    public void setUp(){
        browser.openBrowser("Chrome");
        browser.navigate(url.baseUrl);
    }
    @AfterClass
    public void tearDown(){
        browser.driver.quit();
    }

    @Test()
    public void verifyLogoIsDisplayed(){
        boolean isLogoDisplayed = browser.driver.findElement(By.xpath(locator.flipkartIcon)).isDisplayed();
        Assert.assertTrue(isLogoDisplayed);
    }

}