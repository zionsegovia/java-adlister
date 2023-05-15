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
        return "jdbc:mysql://localhost:3306/adlister_db?allowPublicKeyRetrieval=true&useSSL=false";
    }

    public static String getUsername() {
        return "test_user";
    }

    public static String getPassword() {
        return "password";
    }

    public static String getUser() {

        return null;
    }
}
