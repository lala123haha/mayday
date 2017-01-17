package com.example.administrator.mayday;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ChooseCityActivity extends AppCompatActivity {


    private List<String > data;
    private SearchView searchView;
    private LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_city);
        searchView = (SearchView) findViewById(R.id.searchView);
        linearLayout = (LinearLayout) findViewById(R.id.linear);

        data = new ArrayList<>();


        Toolbar toolbar = (Toolbar) findViewById(R.id.item_toolbar);
        toolbar.setNavigationIcon(R.mipmap.a);
        toolbar.setTitle("选择城市");
        setSupportActionBar(toolbar);

        ListView listView = (ListView) findViewById(R.id.recyclerView);

        for (int i = 0; i < 50; i++) {
            data.add("item"+i);
        }


        listView.setAdapter(new MyAdapter(this,data));
        // 设置搜索文本监听
        searchView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linearLayout.setVisibility(View.VISIBLE);
            }
        });
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                if (!TextUtils.isEmpty(newText)){
//                     recyclerView.getAdapter();
                }else{
//                   recyclerView.c
                }
                return false;
            }
        });
    }



}



