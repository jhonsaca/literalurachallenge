package com.challenge.literalura;

import com.challenge.literalura.books.Book;
import com.challenge.literalura.books.BookDTO;
import com.challenge.literalura.books.BookRepository;
import com.challenge.literalura.service.GutendexAPI;
import com.challenge.literalura.servicios.DataConverter;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    private Scanner scanner = new Scanner(System.in);
    private GutendexAPI gutendexAPI = new GutendexAPI();
    private String base_url="https://gutendex.com/books?search=";
    private DataConverter converter = new DataConverter();
    private List<BookDTO> books = new ArrayList<>();
    private BookRepository repository;
    private List<Book> booksList;
    private Optional<Book> librosBuscados;

    public void menu() {
        var option = 1;
        while (option !=0){
            var menu = """
                    1. Buscar libros
                    2. Ver libros buscados
                    3. Ver autores
                    4. Buscar autores por año
                    5. Buscar libros por idioma
                    
                    0. Salir
                    """;
            System.out.println(menu);
            option = scanner.nextInt();
            switch (option){
                case 1:
                    buscarLibros();
                    break;
            }
        }

    }

    private void buscarLibros(){
//        BookDTO bookDTO = getData();


        var json = gutendexAPI.obtenerDatos("https://gutendex.com/books/1342");
        var data = converter.getData(json, BookDTO.class);
        Book book = new Book(data);
        System.out.println(book.toString());
        System.out.println("------------");
        System.out.println(json);
        System.out.println("------------");
        System.out.println(data);
        System.out.println("------------");
    }

//    private String  getData(){
//        System.out.println("Ingrese el nombre del libro a buscar: ");
//        var name = scanner.next();
//        name = scanner.nextLine();
//        var json = gutendexAPI.obtenerDatos(base_url+name.replace(" ", "%20"));
//        //var data =converter.getData(json, BookDTO.class);
//        return json;
//    }

}
