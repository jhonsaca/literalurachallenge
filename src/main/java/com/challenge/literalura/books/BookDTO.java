package com.challenge.literalura.books;

import com.challenge.literalura.author.AuthorDTO;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record BookDTO(@JsonAlias("title") String title,
                      @JsonAlias("authors") List<AuthorDTO> authors,
                      @JsonAlias("languages") List<String> language,
                      @JsonAlias("download_count") int downloads) {
}
