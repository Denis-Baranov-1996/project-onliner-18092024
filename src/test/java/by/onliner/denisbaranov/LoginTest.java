package by.onliner.denisbaranov;

import by.onliner.baranodenis.HomePage;
import by.onliner.baranodenis.LoginPage;
import by.onliner.baranodenis.driver.DriverSingleton;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest {

    @Test
    public void testLoginWithEmptyData() {

        HomePage homePage = new HomePage();
        homePage.open();
        homePage.clickButtonLogin();

        LoginPage loginPage = new LoginPage();
        loginPage.clickButtonEnter();
    }

    @Test
    public void testLoginWithEmptyTextOfPassword() {

        HomePage homePage = new HomePage();
        homePage.open();
        homePage.clickButtonLogin();

        LoginPage loginPage = new LoginPage();
        loginPage.inputEmail("testik@testov.by");
        loginPage.inputPassword("");
        loginPage.clickButtonEnter();

        String actualTextPassword = loginPage.errorPasswordText();
        String expectedTextPassword = "Укажите пароль";

        Assertions.assertEquals(expectedTextPassword,actualTextPassword);
    }

    @Test
    public void testLoginWithEmptyTextOfEmail() {

        HomePage homePage = new HomePage();
        homePage.open();
        homePage.clickButtonLogin();

        LoginPage loginPage = new LoginPage();
        loginPage.inputEmail("");
        loginPage.inputPassword("123456");
        loginPage.clickButtonEnter();

        String actualTextPassword = loginPage.errorEmailText();
        String expectedTextPassword = "Укажите ник или e-mail";

        Assertions.assertEquals(expectedTextPassword,actualTextPassword);
    }

    @Test
    public void testLoginWithNotExistTextOfEmailAndPassword() {

        HomePage homePage = new HomePage();
        homePage.open();
        homePage.clickButtonLogin();

        LoginPage loginPage = new LoginPage();
        loginPage.inputEmail("tester@tester.com");
        loginPage.inputPassword("Ben_123456");
        loginPage.clickButtonEnter();

        String actualTextPassword = loginPage.errorPasswordOrEmailText();
        String expectedTextPassword = "Неверный логин или пароль";

        Assertions.assertEquals(expectedTextPassword,actualTextPassword);
    }

    @AfterEach
    public void close() {
        DriverSingleton.closeDriver();
    }
}
