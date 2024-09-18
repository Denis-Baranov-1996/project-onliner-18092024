package by.onliner.baranodenis;

import by.onliner.baranodenis.driver.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    WebDriver driver;
    private final String URL = "https://www.onliner.by/";

    public HomePage() {
        this.driver = DriverSingleton.getDriver();
    }

    public void open() {
        driver.get(URL);
    }
    public void clickButtonLogin() {
        By buttonLoginBy = By.xpath(HomePageXPath.BUTTON_LOGIN_XPATH);
        WebElement buttonLogin = driver.findElement(buttonLoginBy);
        buttonLogin.click();
    }
}
