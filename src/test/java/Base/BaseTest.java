package Base;

import Test.PagesTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import Constants.Constants;

import java.util.concurrent.TimeUnit;

public class BaseTest {



    static WebDriver webDriver=null;
    private static Logger logger = LogManager.getLogger(PagesTest.class);

    @Before
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("disable-notifications");
        chromeOptions.addArguments("disable-popup-blocking");
        setWebDriver(new ChromeDriver(chromeOptions));
        getWebDriver().navigate().to(Constants.WEBLINK);
        getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    public static WebDriver getWebDriver() {

        return webDriver;
    }

    public static void setWebDriver(WebDriver webDriver) {
        BaseTest.webDriver = webDriver;
    }

    public void tearDown(){
        getWebDriver().quit();
    }

    @After
    public void after() throws InterruptedException {
        logger.info("Driver kapatılıyor");
        tearDown();
    }
}
