package com.solidgeargroup.dialogflow.examenunidadiihuichi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.solidgeargroup.dialogflow.examenunidadiihuichi.fragmentos.MapFragment;
import com.solidgeargroup.dialogflow.examenunidadiihuichi.fragmentos.fragment_aboutUs;
import com.solidgeargroup.dialogflow.examenunidadiihuichi.fragmentos.fragment_home;
import com.solidgeargroup.dialogflow.examenunidadiihuichi.fragmentos.fragment_mihistorial;

public class FrontEnd extends AppCompatActivity {


    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_end);

        bottomNavigationView = findViewById(R.id.menu_navegacion);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new fragment_home()).commit();
        }
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch (item.getItemId()) {
                        case R.id.home:
                            selectedFragment = new fragment_home();
                            break;
                        case R.id.record:
                            selectedFragment = new fragment_mihistorial();
                            break;
                        case R.id.about:
                            selectedFragment = new fragment_aboutUs();
                            break;
                        case R.id.ubicacion:
                            selectedFragment = new MapFragment();
                            break;
                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            selectedFragment).commit();

                    return true;
                }
            };
}
