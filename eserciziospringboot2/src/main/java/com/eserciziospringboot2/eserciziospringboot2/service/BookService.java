package com.eserciziospringboot2.eserciziospringboot2.service;

import com.eserciziospringboot2.eserciziospringboot2.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BookService {

    private final ArrayList<Book> listaBook =  new ArrayList<>();

    public ArrayList<Book> getListaBook() {
        return listaBook;
    }

    public Book addBook (Book book){
        listaBook.add(book);
        return book;
    }
}
