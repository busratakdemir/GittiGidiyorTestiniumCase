package Constants;

import org.openqa.selenium.By;

public class Constants {
    public static String WEBLINK = "https://www.gittigidiyor.com/";
    public static String TITLE = "GittiGidiyor - Türkiye'nin Öncü Alışveriş Sitesi";
    public static String USER = "busraesila2@hotmail.com";
    public static String PW = "Deneme2021!";
    public static String PRODUCT = "bilgisayar";
    public static String SECOND_URL = "https://www.gittigidiyor.com/arama/?k=bilgisayar&sf=2";
    public static By USER_MENU = By.cssSelector("[data-cy='header-user-menu']");
    public static final By LOGIN = By.cssSelector("[data-cy='header-login-button']");
    public static final By USER_NAME = By.id("L-UserNameField");
    public static final By PASSWORD = By.id("L-PasswordField");
    public static final By LOGIN_ENTER = By.id("gg-login-enter");
    public static final By SEARCH = By.cssSelector("[data-cy='header-search-input']");
    public static final By FIND = By.cssSelector("[data-cy='search-find-button']");
    public static final By NEXT = By.className("next-link");
    public static final By PRODUCT_LIST = By.className("product-hslider-container");
    public static final By PRICE = By.id("sp-price");
    public static final By ADD_TO_BASKET = By.id("add-to-basket");
    public static final By GOTO_BASKET = By.className("dIB");
    public static final By BASKET_PRICE = By.className("data-salePrice");
    public static final By SELECT_COUNT = By.className("gg-input-select");
    public static final By PRODUCT_COUNT = By.xpath("//*[@class='amount']");
    public static final By DUST_BIN = By.className("gg-icon-bin-medium");
}

