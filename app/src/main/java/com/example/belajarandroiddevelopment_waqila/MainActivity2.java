package com.example.belajarandroiddevelopment_waqila;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    Button backButton;

    TextView jumlahCoffee;
    TextView tambahCoffee;
    TextView kurangCoffee;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        Bundle bundle_2 = intent.getBundleExtra("bundle");
        int jumlahBurger_int = bundle_2.getInt("jumlahBurger_int");
        int jumlahTaco_int = bundle_2.getInt("jumlahTaco_int");
        int jumlahPizza_int = bundle_2.getInt("jumlahPizza_int");
        int jumlahCoffee_int = bundle_2.getInt("jumlahCoffee_int");






        Log.i("JUMLAH BURGERR",  String.valueOf(jumlahBurger_int));
        Log.i("JUMLAH Pizza",  "" + jumlahPizza_int);
        Log.i("JUMLAH Taco",  "" + jumlahTaco_int);


        //Binding button
        backButton = findViewById(R.id.backButton);
        jumlahCoffee = findViewById(R.id.jumlahCoffee);
        kurangCoffee = findViewById(R.id.kurangCoffee);
        tambahCoffee = findViewById(R.id.tambahCoffee);

        jumlahCoffee.setText(jumlahCoffee_int+"");




        //operator coffee
        tambahCoffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int jumlahcoffee_int = Integer.parseInt(jumlahCoffee.getText().toString()) + 1;
                jumlahCoffee.setText(""+ jumlahcoffee_int);
            }
        });
        kurangCoffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int jumlahcoffee_int = Integer.parseInt(jumlahCoffee.getText().toString()) - 1;
                jumlahCoffee.setText(""+ jumlahcoffee_int);
            }
        });

        //logic back button
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
//                intent.putExtra("jumlahBurger_int", jumlahBurger_int);
//                intent.putExtra("jumlahPizza_int", jumlahPizza_int);
//                intent.putExtra("jumlahTaco_int", jumlahTaco_int);
                int jumlahCoffee_int = Integer.parseInt(jumlahCoffee.getText().toString());
                bundle_2.putInt("jumlahCoffee_int", jumlahCoffee_int);
                intent.putExtra("bundle", bundle_2);
                startActivity(intent);
            }
        });





    }
}