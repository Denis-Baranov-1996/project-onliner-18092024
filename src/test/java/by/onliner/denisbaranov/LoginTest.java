package by.onliner.denisbaranov;

import by.onliner.baranodenis.CookiePage;
import by.onliner.baranodenis.HomePage;
import by.onliner.baranodenis.LoginPage;
import by.onliner.baranodenis.Waiters;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
}
