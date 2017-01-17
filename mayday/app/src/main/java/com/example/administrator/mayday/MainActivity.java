package com.example.administrator.mayday;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Toolbar toolbar;
    private TextView cityFirst;
    private TextView citySecond;
    private ImageView changImage;
    private TextView dateView;
    private int year=0;
    private int month=0;
    private int day=0;
    private int month1;
    private int year1;
    private int dateDay1;
    private String request;
    private String yearstr;
    private String dateDaystr;
    private String monthstr;
    private TextView search;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cityFirst = (TextView) findViewById(R.id.cityfirst);
        citySecond = (TextView) findViewById(R.id.citysecond);
        dateView = (TextView) findViewById(R.id.date1);
        search = (TextView) findViewById(R.id.search);



        Calendar instance = Calendar.getInstance();
        year = instance.get(Calendar.YEAR);
        month = instance.get(Calendar.MONTH);
            month++;
        day = instance.get(Calendar.DAY_OF_MONTH);
        Log.e("date", "onCreate: "+ year +"**"+ month +"**"+ day);
         dateView.setText(month +"月"+ day +"日");

        final CharSequence from = cityFirst.getText();
        final CharSequence to = citySecond.getText();
        final String httpUrl = "http://apis.baidu.com/qunar/qunar_train_service/s2ssearch";
        final String httpArg1 = "version=1.0&from=";
        //上海
        final String httpArg3 = "&to=";
        //北京
        final String httpArg4= "&date=";

//        final String httpUrl = "http://apis.baidu.com/qunar/qunar_train_service/s2ssearch";
//        final String httpArg = "version=1.0&from=北京&to=上海&date=2017-02-01";
//




        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.mipmap.a);
        setSupportActionBar(toolbar);



        ImageView imageView_go = (ImageView) findViewById(R.id.go);
        imageView_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplication(),TimeChooseActivity.class);
            startActivity(intent);


            }
        });

        changImage = (ImageView) findViewById(R.id.changepic);
        changImage.setOnClickListener(this);
        cityFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplication(),ChooseCityActivity.class);
                startActivity(intent);
            }
        });

        citySecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplication(),ChooseCityActivity.class);
                startActivity(intent);
            }
        });

        Intent intent1 = getIntent();
        year1= intent1.getIntExtra("year", 0);
        month1 = intent1.getIntExtra("dateMonth", 0);
        month1++;
        dateDay1 = intent1.getIntExtra("dateDay", 0);
        dateView.setText(month1 +"月"+ dateDay1 +"日");

        yearstr = year1+"";
                monthstr = month1 +"";
                dateDaystr = dateDay1+"";
                if (month1 <9){
                    monthstr = "0"+month1;
                }if (dateDay1 <10){
                    dateDaystr = "0"+ (dateDay1);
                }

        Log.e("date", "onCreate: "+yearstr+"***"+monthstr+"***"+dateDaystr );

        new Thread(new Runnable() {
            @Override
            public void run() {
                request = HttpUtils.request(httpUrl, httpArg1+from+httpArg3+to+httpArg4+yearstr+"-"+monthstr+"-"+dateDaystr);
                search.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                        intent.putExtra("news",request);
                        startActivity(intent);
                    }
                });

            }
        }).start();

//                yearstr = year1+"";
//                monthstr = month1 +"";
//                dateDaystr = dateDay1+"";
//                if (month1 <9){
//                    monthstr = "0"+month1;
//                }if (dateDay1 <10){
//                    dateDaystr = "0"+ (dateDay1+1);
//                }
//                request=httpUrl+"?"+httpArg1+from+httpArg3+to+httpArg4+"2017"+"-"+"02"+"-"+"01";










    }





    @Override
    public void onClick(View view) {
        if (cityFirst.getX()<citySecond.getX()){
        ObjectAnimator animator = ObjectAnimator.ofFloat(cityFirst,"translationX",600);
            ObjectAnimator animator1 = ObjectAnimator.ofFloat(citySecond,"translationX",-600);
            AnimatorSet set = new AnimatorSet();
            set.play(animator).with(animator1);
            set.setDuration(1000);
            set.start();
        }
        else {
            ObjectAnimator animator = ObjectAnimator.ofFloat(cityFirst,"translationX",0);
            ObjectAnimator animator1 = ObjectAnimator.ofFloat(citySecond,"translationX",0);
            AnimatorSet set = new AnimatorSet();
            set.play(animator).with(animator1);
            set.setDuration(1000);
            set.start();
        }

    }



}
