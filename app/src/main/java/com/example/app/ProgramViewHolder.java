package com.example.app;

// Inside ProgramViewHolder.java

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ProgramViewHolder {

    public final ImageView itemImage;
    public final TextView programTitle;
    public final TextView programDescription;

    public ProgramViewHolder(View v) {
        itemImage = v.findViewById(R.id.imageView4);
        programTitle = v.findViewById(R.id.textView1);
        programDescription = v.findViewById(R.id.textView2);
    }

    public ImageView getItemImage() {
        return itemImage;
    }

    public TextView getProgramTitle() {
        return programTitle;
    }

    public TextView getProgramDescription() {
        return programDescription;
    }
}

