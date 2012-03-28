package controllers;

import java.util.ArrayList;
import java.util.List;
import models.Autor;
import models.Książka;
import play.mvc.Controller;


public class Books extends Controller {
     public static void show(Long id) {
       //Książka book = Książka.findById(id);
       // render(book);
       List book = Książka.findAll();
        render(book);
     }

    
    
     public static void add(String tytuł, String nazwisko) {
        Książka book = new Książka();
        Autor autor = new Autor();
        autor.nazwisko=nazwisko;
        autor.save();
        book.tytuł = tytuł;
        book.autor = autor;
        book.save();
       show(book.id);
       
     }
}
