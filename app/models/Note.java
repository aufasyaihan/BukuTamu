package models;

import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.util.Date;

@Entity
public class Note extends Model {
    public String title;
    public String tgl;
    public String isi;

    @Override
    public String toString() {
        return title;
    }
}
