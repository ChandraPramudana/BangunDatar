package com.example.bangundatar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button buttonSegitiga;
    private Button buttonPersegi;
    private Button buttonLingkaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Temukan tombol SEGITIGA
        buttonSegitiga = findViewById(R.id.segitiga);
        // Temukan tombol LINGKARAN
        buttonLingkaran = findViewById(R.id.lingkaran);
        buttonPersegi = findViewById(R.id.persegi);

        // Set OnClickListener untuk pindah ke halaman segitiga
        buttonSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, segitigaActivity.class);
                startActivity(intent);
            }
        });

        // Set OnClickListener untuk pindah ke halaman persegi
        buttonPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, persegiActivity.class);
                startActivity(intent);
            }
        });

        // Set OnClickListener untuk pindah ke halaman lingkaran
        buttonLingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LingkaranActivity.class);
                startActivity(intent);
            }
        });
    }
}
