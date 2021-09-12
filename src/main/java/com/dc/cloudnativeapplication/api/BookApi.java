package com.dc.cloudnativeapplication.api;

import com.dc.cloudnativeapplication.entities.Book;
import com.dc.cloudnativeapplication.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookApi {

    @Autowired
    BookService bookService;

    @GetMapping
    public ResponseEntity<List<Book>> getBooks() {
        return ResponseEntity.ok().body(bookService.getBooks());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> findBookById(@PathVariable Long id) {
        return ResponseEntity.ok().body(bookService.findBookById(id));
    }

    @PostMapping
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        return ResponseEntity.ok().body(bookService.createBook(book));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book book) {
        return ResponseEntity.ok().body(bookService.updateBook(id, book));
    }

    @DeleteMapping("/{id}")
    public void deleteBookById(@PathVariable Long id) {
        bookService.deleteBookById(id);
    }
}
