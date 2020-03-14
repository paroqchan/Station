package com.example.station;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class LineActivity extends AppCompatActivity {
    private ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line);
        ListView listView = findViewById(R.id.listView);
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1);
        Intent intent = getIntent();
        ArrayList hairetu = intent.getStringArrayListExtra("ekilist");

        for (int i =0; i < hairetu.size(); i++) {
            adapter.add(hairetu.get(i));
        }
        listView.setAdapter(adapter);
    }
}
