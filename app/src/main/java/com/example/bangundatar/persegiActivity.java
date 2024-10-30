package com.example.bangundatar;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class persegiActivity extends AppCompatActivity {


    private EditText sideInput;
    private TextView resultText;
    private Button buttonCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.persegi);

        sideInput = findViewById(R.id.sideInput);
        resultText = findViewById(R.id.resultText);
        buttonCalculate = findViewById(R.id.buttonCalculate);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateAreaAndPerimeter();
            }
        });
    }

    private void calculateAreaAndPerimeter() {
        String sideValue = sideInput.getText().toString();
        if (!sideValue.isEmpty()) {
            double side = Double.parseDouble(sideValue);
            double area = side * side; // Luas
            double perimeter = 4 * side; // Keliling
            resultText.setText("Luas Persegi: " + area + " cm²\nKeliling Persegi: " + perimeter + " cm");
        } else {
            resultText.setText("Masukkan panjang sisi!");
        };
    }
}