package config;

public class Config {
    private final String url;
    private final String username;
    private final String password;

    public Config(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public static String getUrl() {
        return "jdbc:mysql://localhost:3306/bigfoot_test_db?allowPublicKeyRetrieval=true&useSSL=false";
    }

    public String getUsername() {
        return "codeup_test_user";
    }

    public static String getPassword() {
        return "codeup";
    }

    public static String getUser() {

        return null;
    }
}
