package by.onliner.denisbaranov;

import by.onliner.baranodenis.CookiePage;
import by.onliner.baranodenis.HomePage;
import by.onliner.baranodenis.LoginPage;
import by.onliner.baranodenis.Waiters;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest {

    @Test
    public void testLoginWithEmptyData() {

        HomePage homePage = new HomePage();
        homePage.open();
        homePage.clickButtonLogin();

        CookiePage cookiePage = new CookiePage();
        cookiePage.clickButtonCloseCookie();

        LoginPage loginPage = new LoginPage();
        loginPage.clickButtonEnter();
    }

    @Test
    public void testLoginWithEmptyTextOfPassword() {

        HomePage homePage = new HomePage();
        homePage.open();
        homePage.clickButtonLogin();

        //CookiePage cookiePage = new CookiePage();
        //cookiePage.clickButtonCloseCookie();

        LoginPage loginPage = new LoginPage();
        loginPage.inputEmail("test@test.by");
        loginPage.inputPassword("");
        loginPage.clickButtonEnter();

        String actualTextPassword = loginPage.errorPasswordText();
        String expectedTextPassword = "Укажите пароль";

        Assertions.assertEquals(expectedTextPassword,actualTextPassword);
    }
}
