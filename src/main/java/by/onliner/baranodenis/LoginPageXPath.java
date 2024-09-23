package by.onliner.baranodenis;

public class LoginPageXPath {
    public static final String INPUT_EMAIL_XPATH = "//input[@placeholder='Ник или e-mail']";
    public static final String INPUT_PASSWORD_XPATH = "//input[@placeholder='Пароль']";
    public static final String BUTTON_ENTER_XPATH = "//button[@class='auth-button auth-button_primary auth-button_middle auth-form__button auth-form__button_width_full']";
    public static final String ERROR_EMAIL_XPATH = "//div[contains(text(),'или через ник, e-mail')]";
    public static final String ERROR_PASSWORD_XPATH = "//div[contains(text(),'Укажите пароль')]";
}
