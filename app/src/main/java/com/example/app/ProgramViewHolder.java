package com.example.app;

import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;

public class ProgramViewHolder {

    ImageView itemImage;
    TextView programTitle;
    TextView programDescription;
    ProgramViewHolder(View v)
    {
        itemImage = v.findViewById(R.id.imageView4);
        programTitle = v.findViewById(R.id.textView1);
        programDescription = v.findViewById(R.id.textView2);
    }
}
