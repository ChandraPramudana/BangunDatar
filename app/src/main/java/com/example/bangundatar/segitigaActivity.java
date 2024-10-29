package com.example.bangundatar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class segitigaActivity extends AppCompatActivity {

    private EditText inputBase, inputHeight;
    private TextView textViewResult;
    private Button buttonCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segitiga);

        // Inisialisasi komponen
        inputBase = findViewById(R.id.inputBase);
        inputHeight = findViewById(R.id.inputHeight);
        textViewResult = findViewById(R.id.textViewResult);
        buttonCalculate = findViewById(R.id.buttonCalculate);

        // Set OnClickListener untuk tombol Hitung Luas
        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ambil nilai alas dan tinggi dari EditText
                String baseText = inputBase.getText().toString();
                String heightText = inputHeight.getText().toString();

                // Cek apakah input tidak kosong
                if (!baseText.isEmpty() && !heightText.isEmpty()) {
                    try {
                        double base = Double.parseDouble(baseText);
                        double height = Double.parseDouble(heightText);

                        // Hitung luas segitiga
                        double area = 0.5 * base * height;

                        // Tampilkan hasil
                        textViewResult.setText("Hasil: " + area);
                    } catch (NumberFormatException e) {
                        textViewResult.setText("Masukkan nilai yang valid");
                    }
                } else {
                    textViewResult.setText("Masukkan alas dan tinggi");
                }
            }
        });
    }
}
