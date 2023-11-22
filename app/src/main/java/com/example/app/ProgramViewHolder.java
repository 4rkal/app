package com.example.app;

public class ProgramViewHolder {

    ImageView itemImage;
    TextView programTitle;
    TextView programDescription;
    ProgramViewHolder(View v)
    {
        itemImage = v.findViewById(R.id.imageView);
        programTitle = v.findViewById(R.id.textView1);
        programDescription = v.findViewById(R.id.textview2);
    }
}
