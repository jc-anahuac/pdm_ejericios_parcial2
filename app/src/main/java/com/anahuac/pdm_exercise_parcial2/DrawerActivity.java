package com.anahuac.pdm_exercise_parcial2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class DrawerActivity extends AppCompatActivity {

    NavigationView navigationView;
    DrawerLayout drawerLayout;
    boolean isOpen = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer);

        setTitle("Drawer Layout");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_baseline_menu_24);

        navigationView = findViewById(R.id.navigation_view);
        drawerLayout = findViewById(R.id.drawer_layout);

        drawerLayout.addDrawerListener(new DrawerLayout.DrawerListener() {
            @Override
            public void onDrawerSlide(@NonNull View drawerView, float slideOffset) {

            }

            @Override
            public void onDrawerOpened(@NonNull View drawerView) {
                isOpen = true;
                getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_baseline_close_24);
            }

            @Override
            public void onDrawerClosed(@NonNull View drawerView) {
                isOpen = false;
                getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_baseline_menu_24);
            }

            @Override
            public void onDrawerStateChanged(int newState) {

            }
        });

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menu_favorite:
                        message("Pulsaste favorito");
                        break;
                    case R.id.menu_remove:
                        message("Pulsaste eliminar");
                        break;
                    case R.id.menu_copiar:
                        message("Pulsaste copiar");
                        break;
                }
                return true;
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == android.R.id.home) {
            if(isOpen) {
                drawerLayout.close();
            } else {
                drawerLayout.open();
            }
        }
        return super.onOptionsItemSelected(item);
    }

    private void message(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}