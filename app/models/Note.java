package models;

import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.OneToMany;
import java.util.Date;

@Entity
public class Note extends Model {
    public String title;
    public Date tgl;
    
    @OneToOne
    public Todolist toDolist;
    
    @OneToMany
    public Content isi;

    @Override
    public String toString() {
        return title;
    }
}
