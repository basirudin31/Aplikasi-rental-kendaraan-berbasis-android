package com.example.tubesbasir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class SewaActivity extends AppCompatActivity {

    Button btnSewa1,btnSewa2,btnSewa3,btnSewa4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sewa);

        btnSewa1 = findViewById(R.id.btn_sewa1);
        btnSewa2 = findViewById(R.id.btn_sewa2);
        btnSewa3 = findViewById(R.id.btn_sewa3);
        btnSewa4 = findViewById(R.id.btn_sewa4);

        btnSewa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CheckOutActivity.class);
                    intent.putExtra("harga", "Rp. 100.000");
                startActivity(intent);
            }
        });
        btnSewa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CheckOutActivity.class);
                    intent.putExtra("harga", "Rp. 1.000.000");
                startActivity(intent);
            }
        });
        btnSewa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CheckOutActivity.class);
                    intent.putExtra("harga", "Rp. 10.000.000");
                startActivity(intent);
            }
        });
        btnSewa4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CheckOutActivity.class);
                    intent.putExtra("harga", "Rp. 100.000.000");
                startActivity(intent);
            }
        });


//        btnSewa1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), CheckOutActivity.class);
////                    intent.putExtra("harga", "Rp. 100.000");
//                startActivity(intent);
//            }
//        });
//        Btn2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), CheckOutActivity.class);
//                intent.putExtra("harga", "Rp. 1.000.000");
//                startActivity(intent);
//            }
//        });
//        Btn3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), CheckOutActivity.class);
//                intent.putExtra("harga", "Rp. 10.000.000");
//                startActivity(intent);
//            }
//        });
//        Btn4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), CheckOutActivity.class);
//                intent.putExtra("harga", "Rp. 100.000.000");
//                startActivity(intent);
//            }
//        });



    }
}