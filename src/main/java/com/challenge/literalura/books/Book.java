package com.challenge.literalura.books;


import com.challenge.literalura.author.AuthorDTO;
import jakarta.persistence.*;

@Entity(name = "book")
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long book_id;

    private String title;
    @ManyToOne
    private AuthorDTO author;
    private  String language;
    private int downloads;
}
