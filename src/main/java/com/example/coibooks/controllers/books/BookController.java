package com.example.coibooks.controllers.books;

import com.example.coibooks.models.books.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {
    List<Book> books;
    public BookController() {
        books=new ArrayList<>();
        books.add(new Book("tytul1", "author1", "9782123456803"));
        books.add(new Book("tytul2", "author2", "9782123456804"));
        books.add(new Book("tytul3", "author3", "9782123456805"));
        books.add(new Book("title1", "author4", "9782123456806"));
    }

    @GetMapping("/books/nazwa/{nazwa}")
    List<Book> booksByNazwa (@PathVariable String nazwa){
        List<Book> selected =new ArrayList<>();
        for (Book b:books){
            if (b.getTytul().contains(nazwa)){
                selected.add(b);
            }
        }
        return selected;
    }

    @GetMapping("/books/isbn/{isbn}")
    List<Book> booksByISBN (@PathVariable String isbn){
        List<Book> selected =new ArrayList<>();
        for (Book b:books){
            if (b.getISBN().contains(isbn)){
                selected.add(b);
            }
        }
        return selected;
    }

    @GetMapping("/books")
    List<Book> allBooks (){
        return books;
    }

}
