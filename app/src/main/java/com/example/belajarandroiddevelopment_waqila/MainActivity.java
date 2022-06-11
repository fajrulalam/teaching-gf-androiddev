package com.example.belajarandroiddevelopment_waqila;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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

    Button helloButton;

    Bundle bundle;


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
        helloButton = findViewById(R.id.helloButton);


        //Menerima Bundle
        Intent intent = getIntent();
        bundle = intent.getBundleExtra("bundle");
        if (bundle != null) {
            int jumlahBurger_int = bundle.getInt("jumlahBurger_int");
            int jumlahPizza_int = bundle.getInt("jumlahPizza_int");
            int jumlahTaco_int = bundle.getInt("jumlahTaco_int");
            int jumlahCoffee_int = bundle.getInt("jumlahCoffee_int");

            Log.i("jumlahCoffee", jumlahCoffee_int+"");

            jumlahBurger.setText("" + jumlahBurger_int);
            jumlahPizza.setText("" + jumlahPizza_int);
            jumlahTaco.setText("" + jumlahTaco_int);
        }






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



                bundle.putInt("jumlahTaco_int", jumlahTaco_int);
                bundle.putInt("jumlahBurger_int", jumlahBurger_int);
                bundle.putInt("jumlahPizza_int", jumlahPizza_int);


                intent.putExtra("bundle", bundle);


                startActivity(intent);
            }
        });








    }
}