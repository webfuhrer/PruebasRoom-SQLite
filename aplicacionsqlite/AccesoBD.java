package com.example.aplicacionsqlite;

import android.content.Context;
import android.util.Log;

import androidx.room.Room;

import java.util.List;

public class AccesoBD extends Thread {
    private Context contexto;
    public AccesoBD(Context c)
    {
        contexto=c;
    }
    @Override
    public void run() {
        BaseDatos db = Room.databaseBuilder(contexto,
                BaseDatos.class, "mi_bd2").build();
        Contacto c=new Contacto("luis","luis@mail.com");
        Contacto c1=new Contacto("ana","ana@mail.com");
        Contacto c2=new Contacto("tere","tere@mail.com");
        db.iContacto().insertarContacto(c1);
        db.iContacto().insertarContacto(c2);
        db.iContacto().insertarContacto(c);
        List<Contacto> lista=db.iContacto().recuperarContactos();
        Log.d("RECUPERO CONTACTOS:", lista.toString());
    }
}
