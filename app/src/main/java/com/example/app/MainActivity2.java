package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    ListView lvProgram;
    String[] programName = {"Football"};
    String[] programDescription = {"Play football for 15 mins"};

    int[] programImages = new int[]{(R.drawable.football)};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        lvProgram = findViewById(R.id.lvProgram);

        ProgramAdapter programAdapter = new ProgramAdapter(this,programName,programImages,programDescription);
        lvProgram.setAdapter(programAdapter);
    }
}