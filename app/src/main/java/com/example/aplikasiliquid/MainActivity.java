package com.example.aplikasiliquid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {
    private TextView textView1;
    private Button button1;
    private RadioButton radioButton1, radioButton2, radioButton3, radioButton4;


    double hasil;
String hasil2;
    double member;
    int hargax = 0;
    int hargay = 0;
    int hargaz = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView1 = findViewById(R.id.textView1);
        button1 = findViewById(R.id.button1);
        radioButton1 = findViewById(R.id.radioButton1);
        radioButton2 = findViewById(R.id.radioButton2);
        radioButton3 = findViewById(R.id.radioButton3);
        radioButton4 = findViewById(R.id.radioButton4);

        radioButton1.setOnClickListener(r1 -> {
            hargax =(55000+2000);
        });

        radioButton2.setOnClickListener(r1 -> {
            hargay =(545000+2500);
        });

        radioButton3.setOnClickListener(r1 -> {
            hargaz =(249999+3000);
        });
        radioButton4.setOnClickListener(r1 ->{
            member = 0.05;
        });

        button1.setOnClickListener(btn -> {
            hasil = hargax + hargay + hargaz;
            double hasil3 = hasil * member;
            double hasil4 = hasil - hasil3;
            int hasil1 = (int) hasil4;
             hasil2 = Integer.toString(hasil1);
            tampilkanBon();
        });


    }
    private void tampilkanBon() {
        // Buat isi dari bon (detail tagihan)
        StringBuilder bon = new StringBuilder();
        if (hargax > 0){bon.append("Harga Sunday Funday: Rp.").append(hargax).append(" (admin Rp.2000)").append("\n");}
        if (hargay > 0){bon.append("Harga centaurus m200: Rp.").append(hargay).append(" (admin Rp.2500)").append("\n");}
        if (hargaz > 0){bon.append("Harga oxva slim pro: Rp.").append(hargaz).append(" (admin Rp.3000)").append("\n");}
        if (member > 0) {
            double potongan = hasil * member;
            bon.append("Potongan Member: Rp.").append(potongan).append("\n");
        }
        bon.append("Total Harga: Rp.").append(hasil2).append("\n");//

        // Tampilkan bon pada TextView1
        textView1.setText(bon.toString());
    }
}