package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
public class Egzemplarz extends Model {

    @Required
    boolean dostepny;

    @ManyToOne
    Książka książka;

}
