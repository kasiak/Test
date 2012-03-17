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

    @ManyToOne
    public Autor autor;

    //@ManyToOne
   // public Wydawnictwo wydawnictwo;

    //@OneToMany(mappedBy="ksiazka", cascade=CascadeType.ALL)
   // public List <Książka> lista = new ArrayList<Książka>();

}
