package com.example.administrator.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class DBListActivity extends AppCompatActivity {

    private MyAdapter adapter;
    private ArrayList<String> urlls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dblist);
        ListView listView = (ListView) findViewById(R.id.listView);

        urlls = (ArrayList<String>) getIntent().getStringArrayListExtra("urlls");
        adapter = new MyAdapter(this, urlls);
        listView.setAdapter(adapter);


    }
}
