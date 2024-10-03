package com.example.demo.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Book;
import com.example.demo.repositories.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    // Método para crear un libro
    public void createBook(Book book) {
        bookRepository.save(book);
    }

    // Método para obtener todos los libros
    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }
}

