package com.example.demo.controllers;

import java.util.List; // Importa la clase correcta

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Book;
import com.example.demo.services.BookService;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping  // GET to /books
    public List<Book> getAllBooks() {
        return bookService.findAllBooks();
    }

    @PostMapping  // POST to /books
    public void createBook(@RequestBody Book book) {
        bookService.createBook(book);
    }
}

 // @PutMapping("/books")  // PUT
    // public void updateBook(@RequestBody Book book) {
    //     Optional<Book> bookToFind = bookRepository.findById(book.getId());

    //     if (bookToFind != null) {
    //         bookRepository.save(book);
    //     }
    // }

    // @DeleteMapping("/books")  // DELETE
    // public void deleteBook(@RequestParam(value="id") Long id) {
    //     bookRepository.deleteById(id);
    // }