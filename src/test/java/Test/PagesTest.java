package Test;

import Base.BaseTest;
import Page.pages;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PagesTest extends BaseTest {
    pages Page;
    private static Logger logger = LogManager.getLogger(PagesTest.class);

    @Before
    public void before() {
        Page = new pages(getWebDriver());
        logger.info("Driver başladı.");
    }

    @Test
    public void testLogin() throws InterruptedException {
        logger.info("Test başladı");
        Page.hoverToUserMenu()
                .Login()
                .Search()
                .nextPage()
                .randomClick()
                .addBasket()
                .productCount()
                .FinalPart();
        logger.info("Test başarıyla bitti");
    }

}
