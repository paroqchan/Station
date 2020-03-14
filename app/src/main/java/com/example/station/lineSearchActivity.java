package com.example.station;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class lineSearchActivity extends AppCompatActivity {
    List<LineSearch> mLineSearch;
    LineSearchAdapter mLineSearchAdapter;
    ListView mListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line_search);
        mListView = (ListView) findViewById(R.id.ListView);
        mLineSearch = new ArrayList<LineSearch>();
        mLineSearch.add(new LineSearch("あ"));
        mLineSearch.add(new LineSearch("い"));
        mLineSearch.add(new LineSearch("う"));
        mLineSearch.add(new LineSearch("え"));
        mLineSearch.add(new LineSearch("お"));
        mLineSearch.add(new LineSearch("か"));
        mLineSearch.add(new LineSearch("き"));
        mLineSearch.add(new LineSearch("く"));
        mLineSearch.add(new LineSearch("け"));
        mLineSearch.add(new LineSearch("こ"));
        mLineSearch.add(new LineSearch("さ"));
        mLineSearch.add(new LineSearch("し"));
        mLineSearch.add(new LineSearch("す"));
        mLineSearch.add(new LineSearch("せ"));
        mLineSearch.add(new LineSearch("そ"));
        mLineSearch.add(new LineSearch("た"));
        mLineSearch.add(new LineSearch("ち"));
        mLineSearch.add(new LineSearch("つ"));
        mLineSearch.add(new LineSearch("て"));
        mLineSearch.add(new LineSearch("と"));
        mLineSearch.add(new LineSearch("な"));
        mLineSearch.add(new LineSearch("に"));
        mLineSearch.add(new LineSearch("ぬ"));
        mLineSearch.add(new LineSearch("ね"));
        mLineSearch.add(new LineSearch("の"));
        mLineSearch.add(new LineSearch("は"));
        mLineSearch.add(new LineSearch("ひ"));
        mLineSearch.add(new LineSearch("ふ"));
        mLineSearch.add(new LineSearch("へ"));
        mLineSearch.add(new LineSearch("ほ"));
        mLineSearch.add(new LineSearch("ま"));
        mLineSearch.add(new LineSearch("み"));
        mLineSearch.add(new LineSearch("む"));
        mLineSearch.add(new LineSearch("め"));
        mLineSearch.add(new LineSearch("も"));
        mLineSearch.add(new LineSearch("や"));
        mLineSearch.add(new LineSearch("ゆ"));
        mLineSearch.add(new LineSearch("よ"));
        mLineSearch.add(new LineSearch("ら"));
        mLineSearch.add(new LineSearch("り"));
        mLineSearch.add(new LineSearch("る"));
        mLineSearch.add(new LineSearch("れ"));
        mLineSearch.add(new LineSearch("ろ"));
        mLineSearch.add(new LineSearch("わ"));
        mListView.setAdapter(mLineSearchAdapter);
        mLineSearchAdapter = new LineSearchAdapter(this,R.layout.line,mLineSearch);
        mListView.setAdapter(mLineSearchAdapter);


    }


}
