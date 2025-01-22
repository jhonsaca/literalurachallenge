package com.challenge.literalura.books;

import com.challenge.literalura.author.Author;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record BookDTO(@JsonAlias("title") String title,
                      @JsonAlias("authors") Author author,
                      @JsonAlias("languages") String language,
                      @JsonAlias("download_count") int downloads) {
}
