package com.vishal.listviewimagedemo;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomListAdapter extends ArrayAdapter<String>{

    private Activity context;
    private String[] names;
    private Integer[] images;

    public CustomListAdapter(Activity context, String[] names, Integer[] images) {
        super(context, R.layout.activity_main,names);
        this.context = context;
        this.names = names;
        this.images = images;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.activity_image_list,null,true);
        TextView textView = rowView.findViewById(R.id.txtView);
        ImageView imageView = rowView.findViewById(R.id.imageView);
        textView.setText(names[position]);
        imageView.setImageResource(images[position]);
        return rowView;
    }
}
