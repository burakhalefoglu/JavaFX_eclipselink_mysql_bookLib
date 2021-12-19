package com.db.eclipslink.repository;

import com.db.eclipslink.models.BookEntity;

public interface IBookDal {
    BookEntity get(int id);
    void create(BookEntity entity);
}
