package com.example.coibooks.dataBase.books;

import com.example.coibooks.models.books.Book;

import java.util.ArrayList;
import java.util.List;

public class Books {
    List<Book> books;

    public Books() {
        books=new ArrayList<>();
        books.add(new Book("tytul1", "author1", "9782123456803"));
        books.add(new Book("tytul2", "author2", "9782123456804"));
        books.add(new Book("tytul3", "author3", "9782123456905"));
        books.add(new Book("title1", "author4", "9782123456906"));
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Book> getBooksByNazwa(String nazwa){
        List<Book> selected =new ArrayList<>();
        for (Book b:books){
            if (b.getTytul().contains(nazwa)){
                selected.add(b);
            }
        }
        return selected;
    }
    public List<Book> getBooksByISBN(String isbn){
        List<Book> selected =new ArrayList<>();
        for (Book b:books){
            if (b.getISBN().contains(isbn)){
                selected.add(b);
            }
        }
        return selected;
    }
}
