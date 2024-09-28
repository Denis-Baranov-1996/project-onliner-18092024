package by.onliner.baranodenis;

import java.util.HashMap;
import java.util.Map;

public class LoginRequest {
    public static final String LOGIN_URL = "https://www.onliner.by/sdapi/user.api/login";

    public static String getBody() {
        return "{\"login\":\"\",\"password\":\"\"}";
    }

    public static Map<String, String> getHeaders() {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json;charset=UTF-8");
        return headers;
    }

    public static String getBody(String login, String password) {
        return "{\"login\":\"" + login + "\",\"password\":\"" + password + "\"}";
    }
}
