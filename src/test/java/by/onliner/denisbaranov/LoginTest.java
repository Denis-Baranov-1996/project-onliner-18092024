package by.onliner.denisbaranov;

import by.onliner.baranodenis.LoginRequest;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.given;

public class LoginTest {
    @Test
    public void testLoginApi1() {
        given().headers(LoginRequest.getHeaders()).body(LoginRequest.getBody()).
                when().post(LoginRequest.LOGIN_URL).
                then().statusCode(422);
    }

    @Test
    public void testLoginApi2() {
        given().headers(LoginRequest.getHeaders()).body(LoginRequest.getBody("test@test.by","123456")).
                when().post(LoginRequest.LOGIN_URL).
                then().statusCode(400).body("errors[0].message", equalTo("Неверный логин или пароль"))
                .body("errors[0].key", equalTo("invalid_login_or_password"))
                .header("Content-Type", equalTo("application/json"));
    }

    @Test
    public void testLoginApi3() {
        given().headers(LoginRequest.getHeaders()).body(LoginRequest.getBody("test","123456")).
                when().post(LoginRequest.LOGIN_URL).
                then().statusCode(428).body("detail", equalTo("Пройдите проверку captcha"))
                .header("Content-Type", equalTo("application/json"));
    }
}
