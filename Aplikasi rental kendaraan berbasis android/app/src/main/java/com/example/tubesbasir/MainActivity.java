package com.example.tubesbasir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    LinearLayout Content1,Content2,Content3,Content4,Content5,Content6;
    TextView txJudul1,txJudul2,txJudul3,txJudul4,txJudul5,txJudul6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txJudul1 = findViewById(R.id.txjudul1);
        txJudul2 = findViewById(R.id.txjudul2);
        txJudul3 = findViewById(R.id.txjudul3);
        txJudul4 = findViewById(R.id.txjudul4);
        txJudul5 = findViewById(R.id.txjudul5);
        txJudul6 = findViewById(R.id.txjudul6);

        Content1 = findViewById(R.id.content1);
        Content2 = findViewById(R.id.content2);
        Content3 = findViewById(R.id.content3);
        Content4 = findViewById(R.id.content4);
        Content5 = findViewById(R.id.content5);
        Content6 = findViewById(R.id.content6);



        Content1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ContentActivity.class);
                intent.putExtra("gambar", R.drawable.pajero);
                intent.putExtra("judul", txJudul1.getText());
                intent.putExtra("deskripsi", "" +
                                "Spesifikasi Mitsubishi Pajero Sport\n" +
                        "\n" +
                        "Tempat Duduk7 KursiKapasitas mesin2477 ccTenaga134 hpPower SteeringYaKantong Udara PengemudiYaAnti Lock Braking SystemYaGround Clearance218 mm stock 5");
                startActivity(intent);

            }
        });
        Content2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ContentActivity.class);
                intent.putExtra("gambar", R.drawable.brio);
                intent.putExtra("judul", txJudul2.getText());
                intent.putExtra("deskripsi", "Spesifikasi hondra brio\n" +
                        "Tempat Duduk5 KursiKapasitas mesin1199 ccTenaga89 hpPower SteeringYaKantong Udara PengemudiYaAnti Lock Braking SystemYa stock 4");
                startActivity(intent);
            }
        });
        Content3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ContentActivity.class);
                intent.putExtra("gambar", R.drawable.rush);
                intent.putExtra("judul", txJudul3.getText());
                intent.putExtra("deskripsi", "Spesifikasi Toyota Rush\n" +
                        "\n" +
                        "Tempat Duduk7 KursiKapasitas mesin1496 ccTenaga103 hpPower SteeringYaKantong Udara PengemudiYaAnti Lock Braking SystemYa stock 7");
                startActivity(intent);
            }
        });
        Content4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ContentActivity.class);
                intent.putExtra("gambar", R.drawable.beat);
                intent.putExtra("judul", txJudul4.getText());
                intent.putExtra("deskripsi", "Spesifikasi & Harga Motor Beat eSP\n" +
                        "\n" +
                        "MesinTipe Mesin4 Langkah, SOHC dengan Pendinginan Udara, eSPKapasitas108,2 ccTenaga Maksimal6,38 KW (8,68 PS)/7.500 rpmTorsi Maksimal9,01 N.m (0,92 kgf.m)/6.500 rpmTransmisiOtomatis, V-MaticSuspensi DepanTeleskopikSuspensi BelakangLengan Ayun dengan Peredam Kejut TunggalRem DepanCakram Hidrolik dengan Piston TunggalRem BelakangTromolBan Depan80/90 – 14 M/C 40P – TubelessBan Belakang90/90 – 14 M/C 46P – Tubeless stock 5");
                startActivity(intent);
            }
        });
        Content5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ContentActivity.class);
                intent.putExtra("gambar", R.drawable.sport);
                intent.putExtra("judul", txJudul5.getText());
                intent.putExtra("deskripsi", "Jenis Sport.\n" +
                        "Kapasitas 249,7 cc.\n" +
                        "Tenaga 28,5 kW (38,7PS) / 12.500 rpm.\n" +
                        "Torsi 23,3 Nm (2,4 kgf.m) / 11.000 rpm.\n" +
                        "Rangka Truss Frame.\n" +
                        "Berat 168 kg.\n" +
                        "Tangki 14.5 L.\n" +
                        "Bahan Bakar Bensin.  Stock 3");
                startActivity(intent);
            }
        });
        Content6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ContentActivity.class);
                intent.putExtra("gambar", R.drawable.pcx);
                intent.putExtra("judul", txJudul6.getText());
                intent.putExtra("deskripsi", "Mesin dan Performa\n" +
                        "Kapasitas\t149.3 cc\n" +
                        "Tenaga Maksimal\t14.48 hp\n" +
                        "Jenis Kopling\tAutomatic, Centrifugal, Dry Type\n" +
                        "Rasio Kompresi\t10.6:1\n" +
                        "Jumlah silinder\t1\n" +
                        "Diameter x langkah\t57.3 mm x 57.9 mm\n" +
                        "Jenis Mesin\t4-Steps, SOHC, PGM-FI\n" +
                        "Pipa Knalpot\tSingle Exhuast\n" +
                        "Jenis Penggerak\tBelt Drive\n" +
                        "Kecepatan maksimum\t115 kmph\n");
                startActivity(intent);
            }
        });
    }
}