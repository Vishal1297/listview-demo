package com.vishal.listviewimagedemo;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    Context context;
    ArrayList arrayList;

    public static Integer [] images = {
            R.drawable.pin2,R.drawable.pin2,R.drawable.pin2,
            R.drawable.pin2,R.drawable.pin2,R.drawable.pin2,
            R.drawable.pin2,R.drawable.pin2,R.drawable.pin2
    };

    public static String [] names = {
            "Object","Class","Polymorphism","Inheritance",
            "JDBC","Abstract","Constructor","Android","Swing"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //      Initialize Values
        CustomListAdapter customListAdapter = new CustomListAdapter(this,names,images);
        listView = findViewById(R.id.listView);
        listView.setAdapter(customListAdapter);

    }
}
