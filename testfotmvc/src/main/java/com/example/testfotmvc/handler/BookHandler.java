package com.example.testfotmvc.handler;

import com.example.testfotmvc.entity.Book;
import com.example.testfotmvc.apibody.BookBean;

public interface BookHandler {
    Book saveBook(BookBean.SaveBookBean saveBookBean);
}
