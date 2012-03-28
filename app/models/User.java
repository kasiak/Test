package models;

import javax.persistence.Entity;
import play.data.validation.Email;
import play.data.validation.MinSize;
import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
public class User extends Model {

     @Required
     @MinSize(3)
     public String imię;

     @Required
     public String nazwisko;

     @Email
     public String email;

     @Required
     public String adres;

     @Override
     public String toString(){
         return imię+" " + nazwisko;
     }

}
