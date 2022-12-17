package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }

    public static void tampilkan(){
        List daftar = Note.findAll();
        render(daftar);
    }
    public static void insert(){
        render();
    }
    public static void simpan(Note note){
        note.save();
        tampilkan();
    }
    public static void edit(Long id){
        Note z = Note.find("id=?1", id).first();
        render(z);
    }
}