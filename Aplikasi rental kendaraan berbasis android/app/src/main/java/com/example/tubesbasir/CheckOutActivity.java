package com.example.tubesbasir;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class CheckOutActivity extends AppCompatActivity {

    TextView txCekout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_out);

        txCekout = findViewById(R.id.txcheckout);
        txCekout.setText(getIntent().getStringExtra("harga"));
    }
}