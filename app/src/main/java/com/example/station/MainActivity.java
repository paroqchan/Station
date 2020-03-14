package com.example.station;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button search1;
    Button search2;
    Button search3;
    Button search4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        search1 = (Button) findViewById(R.id.search1);
        search2 = (Button) findViewById(R.id.search2);
        search3 = (Button) findViewById(R.id.search3);
        search4 = (Button) findViewById(R.id.search4);
    }
    public void lineSearch(View v) {
        Intent intent = new Intent(this,lineSearchActivity.class);
        startActivity(intent);
    }
}
