package models;

import play.db.jpa.Model;

import javax.persistence.Entity;

@Entity
public class Content extends Model {
    public String isi;
    public String tipe;

    @Override
    public String toString() {
        return isi;
    }
}
