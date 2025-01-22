package com.challenge.literalura.author;

import com.challenge.literalura.books.Book;
import jakarta.persistence.*;

@Entity(name = "author")
@Table(name = "authors")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String author_name;
    private Integer birth;
    private Integer death;
    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Book books;
}
