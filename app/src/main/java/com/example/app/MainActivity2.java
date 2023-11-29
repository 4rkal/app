package com.example.app;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.ListView;
import android.os.Bundle;

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

        ProgramAdapter programAdapter = new ProgramAdapter(this,programName,programImages,programDescription);
        lvProgram.setAdapter(programAdapter);
    }
}