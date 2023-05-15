package dao;

import config.Config;


public class DaoFactory {
    private static Ads adsDao;
    private static final Config config = new Config("jdbc:mysql://localhost:3306/adlister_db?allowPublicKeyRetrieval=true&useSSL=false","test_user","password");

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao(config);
        }
        return adsDao;
    }
}