package com.challenge.literalura.author;

import com.challenge.literalura.books.Book;
import com.challenge.literalura.books.BookDTO;

import java.util.List;

//@Entity(name = "author")
//@Table(name = "authors")
public class Author {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String author_name;
    private Integer birth;
    private Integer death;
    //@OneToMany(mappedBy = "author", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Book> books;

    public Author(List<AuthorDTO> author) {
        this.author_name = author.get(0).author_name();
        this.birth = Integer.valueOf(author.get(0).birth());
        this.death = Integer.valueOf(author.get(0).death());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public Integer getBirth() {
        return birth;
    }

    public void setBirth(Integer birth) {
        this.birth = birth;
    }

    public Integer getDeath() {
        return death;
    }

    public void setDeath(Integer death) {
        this.death = death;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        books.forEach(e -> e.setAuthor(this));
        this.books = books;
    }

    @Override
    public String toString() {
        return
                "Nombre del autor: '" + author_name + '\'' +"\n"+
                ", Nacimiento=" + birth +"\n"+
                ", Muerte=" + death ;
    }
}
