package com.example.testfotmvc.handler.handlerImpl;


import com.example.testfotmvc.apibody.BookBean;
import com.example.testfotmvc.entity.Book;
import com.example.testfotmvc.handler.BookHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.testfotmvc.dao.BookDao;

import java.sql.Date;

@Service
public class BookHandlerImpl implements BookHandler {

    @Autowired
    private BookDao bookDao;

    @Override
    public Book saveBook(BookBean.SaveBookBean saveBookBean){
        Book book = new Book();
        book.setTitle(saveBookBean.getTitle());
        book.setAuthor(saveBookBean.getAuthor());
        book.setBookConcern(saveBookBean.getBookConcern());
        book.setPublishDate(Date.valueOf(saveBookBean.getPublishDate()));
        book.setPrice(saveBookBean.getPrice());
        book.setCategoryId(saveBookBean.getCategoryId());

        // 調用BookDao的saveBook方法，將新的Book對象保存到數據庫
        return bookDao.saveBook(book);
    }
}
