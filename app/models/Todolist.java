package models;

import play.db.jpa.Model;

import javax.persistence.Entity;

@Entity
public class Todolist extends Model {
    public String toDolist;

    @Override
    public String toString() {
        return toDolist;
    }
}
