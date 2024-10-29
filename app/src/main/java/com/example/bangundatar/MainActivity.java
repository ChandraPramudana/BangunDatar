package com.example.bangundatar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button buttonSegitiga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Temukan tombol SEGITIGA
        buttonSegitiga = findViewById(R.id.segitiga);

        // Set OnClickListener untuk pindah ke halaman segitiga
        buttonSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, segitigaActivity.class);
                startActivity(intent);
            }
        });
    }
}
