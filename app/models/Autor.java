package models;

import javax.persistence.Entity;
import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
public class Autor extends Model{

    @Required
    public String imię;
    @Required
    public String nazwisko;

    @Override
     public String toString(){
         return nazwisko+" " + imię;
     }
}
