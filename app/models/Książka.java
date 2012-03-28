package models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
public class Książka extends Model{

    @Required
    public String tytuł;

    public int ilośćStron;

    public int rokWydania;

    @Required
    public String isbn;

    @Required
    @ManyToOne
    public Autor autor;

    @Required
    @ManyToOne
    public Wydawnictwo wydawnictwo;

  //  @OneToMany(mappedBy="książka", cascade=CascadeType.ALL)
   // public List egzemplarze = new ArrayList<Egzemplarz>();

     @Override
     public String toString(){
         return autor.toString() + " - " + tytuł;
     }

}
