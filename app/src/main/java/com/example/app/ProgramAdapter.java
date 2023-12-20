package com.example.app;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ProgramAdapter extends ArrayAdapter<String> {
    private Context context;
    private int[] images;
    private String[] programName;
    private String[] programDescription;

    public ProgramAdapter(Context context, String[] programName, int[] images, String[] programDescription) {
        super(context, R.layout.signle_item, R.id.textView1, programName);
        this.context = context;
        this.images = images;
        this.programName = programName;
        this.programDescription = programDescription;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View singleItem = convertView;
        ProgramViewHolder holder;

        if (singleItem == null) {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            singleItem = layoutInflater.inflate(R.layout.signle_item, parent, false);
            holder = new ProgramViewHolder(singleItem);
            singleItem.setTag(holder);
        } else {
            holder = (ProgramViewHolder) singleItem.getTag();
        }

        holder.itemImage.setImageResource(images[position]);
        holder.programTitle.setText(programName[position]);
        holder.programDescription.setText(programDescription[position]);

        singleItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(context, InfoPage.class);
                myIntent.putExtra("programName", programName[position]);
                myIntent.putExtra("programImage", images[position]);
                myIntent.putExtra("programDescription", programDescription[position]);
                context.startActivity(myIntent);
            }
        });

        return singleItem;
    }
}
