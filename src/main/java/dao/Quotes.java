package dao;

import models.Quote;

import java.util.List;

public interface Quotes {

    List<Quote> all();
    void insert (Quote quote);

}
