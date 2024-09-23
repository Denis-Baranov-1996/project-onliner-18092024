package by.onliner.baranodenis;

import by.onliner.baranodenis.driver.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;

    public LoginPage() {
        this.driver = DriverSingleton.getDriver();
    }

    public void clickButtonEnter() {
        By buttonEnterBy = By.xpath(LoginPageXPath.BUTTON_ENTER_XPATH);
        Waiters.waitFor(3);
        WebElement buttonEnter = driver.findElement(buttonEnterBy);
        buttonEnter.click();
    }

    public void inputEmail(String email) {
        By inputEmailBy = By.xpath(LoginPageXPath.INPUT_EMAIL_XPATH);
        WebElement inputEmail = driver.findElement(inputEmailBy);
        inputEmail.sendKeys(email);
    }

    public void inputPassword(String password) {
        By inputPasswordBy = By.xpath(LoginPageXPath.INPUT_PASSWORD_XPATH);
        WebElement inputPassword = driver.findElement(inputPasswordBy);
        inputPassword.sendKeys(password);
    }

    public String errorEmailText() {
        Waiters.waitFor(4);
        By errorEmailBy = By.xpath(LoginPageXPath.ERROR_EMAIL_XPATH);
        WebElement getErrorEmail = driver.findElement(errorEmailBy);
        return getErrorEmail.getText();
    }

    public String errorPasswordText() {
        Waiters.waitFor(4);
        By errorPasswordBy = By.xpath(LoginPageXPath.ERROR_PASSWORD_XPATH);
        WebElement getErrorPassword = driver.findElement(errorPasswordBy);
        return getErrorPassword.getText();
    }
}
