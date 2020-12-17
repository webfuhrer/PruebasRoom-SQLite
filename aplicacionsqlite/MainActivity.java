package com.example.aplicacionsqlite;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {
//https://developer.android.com/training/data-storage/room?hl=es-419
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    AccesoBD a=new AccesoBD(this);
    a.start();
    }
}