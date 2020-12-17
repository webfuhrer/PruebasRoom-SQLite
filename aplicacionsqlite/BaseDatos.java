package com.example.aplicacionsqlite;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Contacto.class}, version = 2)
public abstract class BaseDatos extends RoomDatabase {
    public abstract IContacto iContacto();
}
