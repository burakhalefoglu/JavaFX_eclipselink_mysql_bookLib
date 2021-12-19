package com.db.eclipslink.business;

import com.db.eclipslink.core.result.DataResult;
import com.db.eclipslink.core.result.Result;
import com.db.eclipslink.models.BookEntity;

public interface IBookService {
    DataResult<BookEntity> getBook(int id);
    Result createBook(BookEntity entity);
}
