package models;

import javax.persistence.Entity;
import play.data.validation.Password;
import play.data.validation.Required;
import play.data.validation.Email;
import play.db.jpa.Model;

@Entity
public class Czytelnik extends Model {
    @Required
    String imię;

    @Required
    String nazwisko;

    @Password
    @Required
    String haslo;

    @Email
    String email;

    @Required
    String adres;
}
