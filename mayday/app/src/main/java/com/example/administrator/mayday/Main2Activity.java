package com.example.administrator.mayday;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {


    private Main2Adapter adapter;
    private String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.main2toolbar);
        toolbar.setNavigationIcon(R.mipmap.a);
        setSupportActionBar(toolbar);




        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.main2_list);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);


//
//        Intent intent = getIntent();
//        String news = intent.getStringExtra("news");
//        Log.e("news", "onCreate: " + news);
//        JSONObject json = null;
//        try {
//            json = new JSONObject(news);
//            data = json.getString("data");
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//
//        Gson gson = new Gson();
//        Bean bean = gson.fromJson(news, Bean.class);
//        List<Bean.DataBean.TrainListBean> trainList = bean.getData().getTrainList();
//        List<Bean.DataBean.TrainListBean> data1 = new ArrayList<>();
//        data1.addAll(trainList);


        List<String> datas = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            datas.add("item:"+i);
        }
        adapter = new Main2Adapter(this, datas);
        recyclerView.setAdapter(adapter);

        setHeaderView(recyclerView);


    }

    private void setHeaderView(RecyclerView view){
        View header = LayoutInflater.from(this).inflate(R.layout.header, view, false);
        adapter.setHeaderView(header);
    }



}
