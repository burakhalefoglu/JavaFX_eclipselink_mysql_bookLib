package com.db.eclipslink.business;

import com.db.eclipslink.core.result.DataResult;
import com.db.eclipslink.core.result.Result;
import com.db.eclipslink.core.result.SuccessDataResult;
import com.db.eclipslink.core.result.SuccessResult;
import com.db.eclipslink.repository.IBookDal;
import com.db.eclipslink.models.BookEntity;

public class BookManager implements IBookService{

    public BookManager(IBookDal bookDal) {
        this.bookDal = bookDal;
    }

    private final IBookDal bookDal;

    @Override
    public DataResult<BookEntity> getBook(int id) {

        return new SuccessDataResult<BookEntity>(bookDal.get(id));
    }

    @Override
    public Result createBook(BookEntity entity) {
       bookDal.create(entity);
       return new SuccessResult();
    }
}
