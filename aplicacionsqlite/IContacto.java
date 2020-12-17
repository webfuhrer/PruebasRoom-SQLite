package com.example.aplicacionsqlite;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface IContacto {
    @Query("SELECT * FROM contacto")
    List<Contacto> recuperarContactos();
    @Insert
    void insertarContacto(Contacto c);
}
