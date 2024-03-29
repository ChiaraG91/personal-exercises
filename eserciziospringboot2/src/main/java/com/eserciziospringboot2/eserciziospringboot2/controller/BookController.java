package com.eserciziospringboot2.eserciziospringboot2.controller;

import com.eserciziospringboot2.eserciziospringboot2.entity.Book;
import com.eserciziospringboot2.eserciziospringboot2.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/v1")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/getbook")
    public ArrayList<Book> visualizzaLibro(){
        return bookService.getListaBook();
    }

    @PostMapping("/addlibro")
    public Book addBook(@RequestBody Book book){
        bookService.addBook(book);
        return book;
    }

}
