package dao;

import models.Author;

import java.util.List;

public interface Authors {
    List<Author> all();
    void insert(Author author);


}
