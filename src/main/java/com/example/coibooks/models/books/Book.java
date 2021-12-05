package com.example.coibooks.models.books;

public class Book {
    String tytul;
    String autor;
    String ISBN;

    public Book(String name, String autor, String IBAN) {
        this.tytul = name;
        this.autor = autor;
        this.ISBN = IBAN;
    }

    public String getTytul() {
        return tytul;
    }

    public String getAutor() {
        return autor;
    }

    public String getISBN() {
        return ISBN;
    }

    @Override
    public String toString() {
        return "Books{" +
                "name='" + tytul + '\'' +
                ", autor='" + autor + '\'' +
                ", ISBN='" + ISBN + '\'' +
                '}';
    }
}
