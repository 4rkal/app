package com.example.app;

// Inside InfoPage.java

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class InfoPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);

        Intent intent = getIntent();
        String programName = intent.getStringExtra("programName");
        int programImage = intent.getIntExtra("programImage", 0);
        String programDescription = intent.getStringExtra("programDescription");

        ImageView imageView = findViewById(R.id.detailedImageView);
        TextView titleTextView = findViewById(R.id.detailedTitleTextView);
        TextView descriptionTextView = findViewById(R.id.detailedDescriptionTextView);
        TextView linkTextView = findViewById(R.id.detailedLinkTextView);

        imageView.setImageResource(programImage);
        titleTextView.setText(programName);
        descriptionTextView.setText(programDescription);

        linkTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://example.com")));
            }
        });
    }
}
