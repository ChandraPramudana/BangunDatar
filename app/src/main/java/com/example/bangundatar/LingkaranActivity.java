package com.example.bangundatar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LingkaranActivity extends AppCompatActivity {

    private EditText inputRadius;
    private Button buttonCalculate;
    private TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lingkaran);

        // Inisialisasi view
        inputRadius = findViewById(R.id.inputRadius);
        buttonCalculate = findViewById(R.id.buttonCalculate);
        resultText = findViewById(R.id.resultText);

        // Setel listener untuk tombol hitung
        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuas();
            }
        });
    }

    private void hitungLuas() {
        // Ambil input jari-jari
        String radiusInput = inputRadius.getText().toString().trim();

        // Periksa jika input kosong
        if (radiusInput.isEmpty()) {
            Toast.makeText(this, "Masukkan jari-jari terlebih dahulu", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            // Parsing jari-jari ke tipe double
            double radius = Double.parseDouble(radiusInput);

            // Hitung luas (A = πr²)
            double area = Math.PI * radius * radius;

            // Tampilkan hasil
            resultText.setText("Hasil: " + area);

        } catch (NumberFormatException e) {
            // Tampilkan pesan kesalahan jika input tidak valid
            Toast.makeText(this, "Input tidak valid. Masukkan angka saja.", Toast.LENGTH_SHORT).show();
        }
    }
}
