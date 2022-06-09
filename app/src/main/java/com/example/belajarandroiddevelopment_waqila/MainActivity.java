package com.example.belajarandroiddevelopment_waqila;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //lihatjumlah
    TextView jumlahBurger, jumlahPizza, jumlahTaco;

    //operator kurang jumlah
    TextView kurangBurger, kurangPizza, kurangTaco;

    //operator tambah jumlah
    TextView tambahBurger, tambahPizza, tambahTaco;

    Button tombolNext;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //Binding variable ke view
        jumlahBurger = findViewById(R.id.jumlahBurger);
        jumlahPizza = findViewById(R.id.jumlahPizza);
        jumlahTaco = findViewById(R.id.jumlahTaco);
        kurangBurger = findViewById(R.id.kurangBurger);
        kurangPizza = findViewById(R.id.kurangPiza);
        kurangTaco = findViewById(R.id.kurangTaco);
        tambahBurger = findViewById(R.id.tambahBurger);
        tambahPizza = findViewById(R.id.tambahPizza);
        tambahTaco = findViewById(R.id.tambahTaco);
        tombolNext = findViewById(R.id.tombolNext);


        //Burger Operation
        tambahBurger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sum_burger = Integer.parseInt(jumlahBurger.getText().toString()) + 1;
                jumlahBurger.setText(""+sum_burger);
            }
        });
        kurangBurger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sum_burger = Integer.parseInt(jumlahBurger.getText().toString()) - 1;
                jumlahBurger.setText(""+sum_burger);
            }
        });



        //Pizza Operation
        tambahPizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sum_pizza = Integer.parseInt(jumlahPizza.getText().toString()) + 1;
                jumlahPizza.setText(""+sum_pizza);
            }
        });
        kurangPizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sum_pizza = Integer.parseInt(jumlahPizza.getText().toString()) - 1;
                jumlahPizza.setText(""+sum_pizza);
            }
        });



        //Taco Operation
        tambahTaco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sum_taco = Integer.parseInt(jumlahTaco.getText().toString()) + 1;
                jumlahTaco.setText(""+sum_taco);
            }
        });
        kurangTaco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sum_taco = Integer.parseInt(jumlahTaco.getText().toString()) - 1;
                jumlahTaco.setText(""+sum_taco);
            }
        });


        //Tombol Next
        tombolNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int jumlahTaco_int = Integer.parseInt(jumlahTaco.getText().toString());
                int jumlahBurger_int = Integer.parseInt(jumlahBurger.getText().toString());
                int jumlahPizza_int = Integer.parseInt(jumlahPizza.getText().toString());

                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                intent.putExtra("jumlahTaco_int", jumlahTaco_int);
                intent.putExtra("jumlahBurger_int", jumlahBurger_int);
                intent.putExtra("jumlahPizza_int", jumlahPizza_int);
                startActivity(intent);
            }
        });








    }
}