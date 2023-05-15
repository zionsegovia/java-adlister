package dao;

import com.mysql.cj.jdbc.Driver;
import config.Config;
import models.Author;

import java.sql.*;
import java.util.List;

public class AuthorsDao implements Authors {

    private Connection connection;

    public AuthorsDao(){
        try {
            DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bigfoot_test_db?allowPublicKeyRetrieval=true&useSSL=false",
                    Config.getUrl(),
                    Config.getUser()
            );
        } catch (SQLException sqlx){
            throw new RuntimeException("Error Connecting to the Database.");
        }
    }

    @Override
    public List<Author> all() {
        try {
            Statement statement = connection.createStatement();
            // execute statement
            ResultSet resultSet = statement.executeQuery("SELECT name FROM bigfoot_test_db.authors");
            while (resultSet.next()) {
                Author author = new Author(resultSet.getLong("id"),
                        resultSet.getString("name"));
            }
            }  catch (SQLException sqlx){
            throw new RuntimeException("Error Connecting to Database");
        }
        return null;
    }

    @Override
    public void insert(Author author) {

    }
}
