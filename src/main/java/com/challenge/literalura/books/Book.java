package com.challenge.literalura.books;


import com.challenge.literalura.author.Author;
import jakarta.persistence.*;

import java.util.List;

//@Entity(name = "book")
//@Table(name = "books")
public class Book {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long book_id;
    private String title;
//    @ManyToOne
    private Author author;
    private  List<String> language;
    private int downloads;

    public Book(BookDTO bookDTO) {
        this.title = bookDTO.title();
        this.author = new Author(bookDTO.authors());
        this.language = bookDTO.language();
        this.downloads = bookDTO.downloads();
    }

    @Override
    public String toString() {
        return
                "Titulo:'" + title + '\'' +"\n"+
                ", Autor: " + author +"\n"+
                ", Idioma: " + language + "\n"+
                ", Descargas: " + downloads;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public List<String> getLanguage() {
        return language;
    }

    public void setLanguage(List<String> language) {
        this.language = language;
    }

    public int getDownloads() {
        return downloads;
    }

    public void setDownloads(int downloads) {
        this.downloads = downloads;
    }
}
