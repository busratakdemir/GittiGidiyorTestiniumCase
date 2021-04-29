package Page;

import Base.BasePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import static Constants.Constants.*;

public class pages extends BasePage {
    public pages(WebDriver driver) {
        super(driver);

    }

    private static Logger logger = LogManager.getLogger(BasePage.class);

    public pages hoverToUserMenu() {
        logger.info("Giriş yap alanı");
        assertionPage(TITLE);
        hoverElement(USER_MENU);
        return this;
    }

    public pages Login() {
        logger.info("Login işlemi başlıyor.");
        click(LOGIN);
        sendKeys(USER_NAME, USER);
        sendKeys(PASSWORD, PW);
        click(LOGIN_ENTER);
        assertionPage(TITLE);
        logger.info("Login olundu.");
        return this;
    }

    public pages Search() {
        logger.info("Arama işlemi");
        findElement(SEARCH);
        sendKeys(SEARCH, PRODUCT);
        click(FIND);
        logger.info("Arama yapıldı" + PRODUCT + " ürünü aratıldı.");
        return this;

    }

    public pages nextPage() {
        scrollToElement(NEXT);
        click(NEXT);
        assertionUrl(SECOND_URL);
        logger.info("İkinci sayfaya gidildi ve kontrol edildi.");
        return this;
    }

    public pages randomClick() {
        randomItemClick(PRODUCT_LIST);
        logger.info("Rastgele ürün seçildi.");
        return this;
    }

    public pages addBasket() {
        double price = getPrice(PRICE);
        addToBasket(ADD_TO_BASKET);
        click(GOTO_BASKET);
        assertPrices(price, getPrice(BASKET_PRICE));
        logger.info("Sepete Eklendi ve Fiyat Kontrolü Yapıldı.");
        return this;
    }

    public pages productCount() {
        click(SELECT_COUNT);
        countProducts(PRODUCT_COUNT);
        logger.info("Ürün sayısı arttırıldı.");
        return this;
    }

    public pages FinalPart() {
        click(DUST_BIN);
        logger.info("Sepetteki Ürün Silindi.");
        return this;
    }
}