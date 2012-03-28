package models;

import javax.persistence.Entity;
import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
public class Wydawnictwo extends Model {

    @Required
    public String nazwa;

    @Override
     public String toString(){
         return nazwa;
     }

}
