package com.anahuac.pdm_exercise_parcial2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnWidgets;
    Button btnAdvancedWidgets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnWidgets = findViewById(R.id.btn_elements);
        btnAdvancedWidgets = findViewById(R.id.btn_advanced_widgets);

        btnWidgets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, WidgetsActivity.class);
                startActivity(intent);
            }
        });

        btnAdvancedWidgets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AdvancedWidgetsActivity.class);
                startActivity(intent);
            }
        });
    }
}