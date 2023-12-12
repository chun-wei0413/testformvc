package com.example.testfotmvc.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.testfotmvc.entity.Book;
import com.example.testfotmvc.handler.BookHandler;
import com.example.testfotmvc.apibody.BookBean;

import java.time.LocalDate;

@RestController
public class bookController {
    @Autowired
    private BookHandler bookHandler;
    @RequestMapping(value="/book", method= RequestMethod.POST)
    public Book saveBook(){
        // 在這裡建立 SaveBookBean 對象，模擬 request body 的內容
        BookBean.SaveBookBean saveBookBean = new BookBean.SaveBookBean();
        saveBookBean.setTitle("Example Title");
        saveBookBean.setAuthor("Example Author");
        saveBookBean.setBookConcern("Example Concern");
        saveBookBean.setPublishDate(LocalDate.of(2023, 1, 1));
        saveBookBean.setPrice(19.99f);
        saveBookBean.setCategoryId(1);

        // 調用 BookHandler 的 saveBook 方法
        return bookHandler.saveBook(saveBookBean);
    }

}
