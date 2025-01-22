package com.challenge.literalura.author;

import com.challenge.literalura.books.Book;
import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.List;

public record AuthorDTO(@JsonAlias("name")
                        String author_name,
                        @JsonAlias("birth_year")
                        String birth,
                        @JsonAlias("death_year")
                        String death) {
}
