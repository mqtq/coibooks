package com.example.coibooks.controllers.books;

import com.example.coibooks.dataBase.books.Books;
import com.example.coibooks.models.books.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {
    Books books;

    @GetMapping("/books/nazwa/{nazwa}")
    List<Book> booksByNazwa (@PathVariable String nazwa){
        return books.getBooksByNazwa(nazwa);
    }

    @GetMapping("/books/isbn/{isbn}")
    List<Book> booksByISBN (@PathVariable String isbn){
        return books.getBooksByISBN(isbn);
    }

    @GetMapping("/books")
    List<Book> allBooks (){
        return books.getBooks();
    }

}
