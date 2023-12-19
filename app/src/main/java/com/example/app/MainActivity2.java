package com.example.app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.MenuItem;
import android.widget.ListView;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity2 extends AppCompatActivity {

    ListView lvProgram;
    String[] programName = {"Football", "Basketball", "Drawing", "G", "G", "G", "Football", "Basketball", "Drawing", "G", "G", "G"};
    String[] programDescription = {"Play football for 15 mins", "Play basketball for 15 mins", "Learn how to draw a cat", "G", "G", "G", "Play football for 15 mins", "Play basketball for 15 mins", "Learn how to draw a cat", "G", "G", "G"};

    int[] programImages = new int[]{R.drawable.football, R.drawable.basketball, R.drawable.drawing, R.drawable.football, R.drawable.basketball, R.drawable.drawing, R.drawable.football, R.drawable.basketball, R.drawable.drawing, R.drawable.football, R.drawable.basketball, R.drawable.drawing};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        lvProgram = findViewById(R.id.lvProgram);

        ProgramAdapter programAdapter = new ProgramAdapter(this, programName, programImages, programDescription);
        lvProgram.setAdapter(programAdapter);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                // Handle the item click event
                if (item.getItemId() == R.id.person) {
                    // Handle "Hobbys" item click
                    // No need to finish() the current activity
                    startActivity(new Intent(MainActivity2.this, MainActivity2.class));
                    return true;
            } else if (item.getItemId() == R.id.home) {
                    // Handle "Events" item click
                    startActivity(new Intent(MainActivity2.this, EventsActivity.class));
                    return true;
                } else if (item.getItemId() == R.id.settings) {
                    // Handle "Settings" item click
                    startActivity(new Intent(MainActivity2.this, SettingsActivity.class));
                    return true;
                }
                // Add more conditions for additional menu items if needed
                return false;
            }
        });

//        bottomNavigationView.setSelectedItemId(R.id.person);
    }
}
