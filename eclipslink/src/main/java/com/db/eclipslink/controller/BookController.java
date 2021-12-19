package com.db.eclipslink.controller;

import com.db.eclipslink.business.IBookService;
import com.db.eclipslink.core.result.DataResult;
import com.db.eclipslink.core.result.Result;
import com.db.eclipslink.core.result.SuccessDataResult;
import com.db.eclipslink.core.result.SuccessResult;
import com.db.eclipslink.models.BookEntity;

public class BookController {

    private IBookService bookService;

    public BookController(IBookService bookService) {
        this.bookService = bookService;
    }


    public Result createBook(BookEntity entity) {
        bookService.createBook(entity);
        return new SuccessResult();
    }

    public DataResult<BookEntity> getBook(int id){
        return new SuccessDataResult<BookEntity>(bookService.getBook(id).getData(),"");
    }
}
