package com.example.belajarandroiddevelopment_waqila;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        int jumlahBurger_int = intent.getIntExtra("jumlahBurger_int", -1);
        int jumlahPizza_int = intent.getIntExtra("jumlahPizza_int", -1);
        int jumlahTaco_int = intent.getIntExtra("jumlahTaco_int", -1);

        Log.i("JUMLAH BURGERR",  String.valueOf(jumlahBurger_int));
        Log.i("JUMLAH Pizza",  "" + jumlahPizza_int);
        Log.i("JUMLAH Taco",  "" + jumlahTaco_int);

    }
}