package com.dc.cloudnativeapplication.services;

import com.dc.cloudnativeapplication.entities.Book;

import java.util.List;

public interface BookService {

    List<Book> getBooks();

    Book findBookById(Long id);

    Book createBook(Book book);

    Book updateBook(Long id, Book book);

    void deleteBookById(Long id);

}
