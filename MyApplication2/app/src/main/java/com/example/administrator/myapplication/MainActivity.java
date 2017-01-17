package com.example.administrator.myapplication;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private WebView webView;
    private BDHelper bdHelper = new BDHelper(this);
    private String url;
    private SQLiteDatabase db;
    private ArrayList<String> data;
    private SwipeRefreshLayout swipeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = (WebView) findViewById(R.id.webView);
        data = new ArrayList<>();
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        webView.setWebViewClient(new MyWebViewClient());
        swipeLayout = (SwipeRefreshLayout) findViewById(R.id.swipe_container);
        swipeLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {

            @Override
            public void onRefresh() {
                //重新刷新页面
                webView.loadUrl(webView.getUrl());
            }
        });
        swipeLayout.setColorSchemeColors(Color.BLUE,Color.YELLOW,Color.LTGRAY,Color.RED);


        //www.google.cn/chrome
        //www.uc123.com
        webView.setWebChromeClient(new MyChromeClient());
        url = "http://www.uc123.com";
        webView.loadUrl(url);


    }

    public void click(View view) {

        switch (view.getId()) {
            case R.id.button:
                db = bdHelper.getWritableDatabase();
                db.execSQL("insert into urls(url) values(?)",new String[]{webView.getUrl()});

                Log.e("db", "click: 添加数据库成功"+webView.getUrl() );
            break;
            case R.id.button2:
                Cursor cursor = null;
                    cursor= db.query(true, "urls", new String[]{"url"}, null, null, null, null, null, null, null);
                while (cursor.moveToNext()) {
                    String url =  cursor.getString(cursor.getColumnIndex("url"));
                            data.add(url);
                    for (int i = 0; i < data.size(); i++)  //外循环是循环的次数
                    {
                        for (int j = data.size() - 1 ; j > i; j--)  //内循环是 外循环一次比较的次数
                        {

                            if (data.get(i).equals(data.get(j)))
                            {
                                data.remove(j);
                            }

                        }
                    }
                    }

                Intent intent = new Intent(this,DBListActivity.class);
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("urlls",data);
                intent.putExtras(bundle);
                startActivity(intent);
            break;
        }

    }

    class  MyChromeClient extends WebChromeClient {
        @Override
        public void onProgressChanged(WebView view, int newProgress) {
                if (newProgress == 100) {
                    //隐藏进度条
                    swipeLayout.setRefreshing(false);
                } else {
                    if (!swipeLayout.isRefreshing())
                        swipeLayout.setRefreshing(true);
                }
                super.onProgressChanged(view, newProgress);

        }}


    class MyWebViewClient extends WebViewClient {

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return super.shouldOverrideUrlLoading(view, url);
        }


        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
        }
    }

}
