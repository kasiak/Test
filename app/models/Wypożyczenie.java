package models;

import java.util.Date;
import javax.persistence.Entity;
import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
public class Wypożyczenie extends Model {

    @Required
    Date dataWypożyczenia;

    Date dataZwrotu;

    Float kara;

    //@Required
    //Czytelnik czytelnik;

    @Required
    Egzemplarz egzemplarz;


}
