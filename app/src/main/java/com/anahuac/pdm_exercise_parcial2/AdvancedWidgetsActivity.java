package com.anahuac.pdm_exercise_parcial2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class AdvancedWidgetsActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_widgets);

        bottomNavigationView = findViewById(R.id.bottom_navigation);

        //poner titulo por medio de codigo
        setTitle("Mi titulo");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_baseline_menu_24);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menu_favorite:
                        message("Pulsaste favorito");
                        return true;
                    case R.id.menu_copiar:
                        message("Pulsaste copiar");
                        return true;
                    case R.id.menu_remove:
                        message("Pulsaste eliminar");
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_favorite:
                message("Pulsaste favorito");
                break;
            case R.id.menu_copiar:
                message("Pulsaste copiar");
                break;
            case R.id.menu_remove:
                message("Pulsaste eliminar");
                break;
            case android.R.id.home:
                message("Pulsaste home");
                finish();
                break;
            default:
                message("Pulsaste otra opción");
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void message(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

}