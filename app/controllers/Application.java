package controllers;

import play.*;
import play.mvc.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import models.*;
import play.utils.HTML;

public class Application extends Controller {

    public static void index() {
        render();
    }
    public static void editor() {
        response.setContentTypeIfNotSet("text/html");
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
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        note.tgl = dateFormat.format(date);
        note.save();
        tampilkan();
    }
    public static void note(Long id){
        Note z = Note.find("id=?1", id).first();
        render(z);
    }
    public static void hapus(Note note){
        note.delete();
        tampilkan();
    }
}