package com.example.administrator.myapplication;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/*
*
* SoundPool播放短的声音  可以通知支持多个声音同时发声
* 1、将声音添加到声音池中
* 2、具体的播放
*
* */
public class MainActivity extends AppCompatActivity {

    private SoundPool soundPool;
    private int load1;
    private int load2;
    private int load3;
    private int load4;
    private int load5;
    private int load6;
    private int load7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
   /*
   *
   * 1、支持同时发声的最大数
   * 2、声音源类型
   * 3、音质
   * */
        soundPool = new SoundPool(7, AudioManager.STREAM_MUSIC,0);


        /*
        *
        * 1、上下文对象
        * 2、资源id
        * 3、优先级
        * */
        load1 = soundPool.load(this, R.raw.one, 1);
        load2 = soundPool.load(this, R.raw.two, 1);
        load3 = soundPool.load(this, R.raw.three, 1);
        load4 = soundPool.load(this, R.raw.four, 1);
        load5 = soundPool.load(this, R.raw.five, 1);
        load6 = soundPool.load(this, R.raw.six, 1);
        load7 = soundPool.load(this, R.raw.seven, 1);

    }


    public void btnClick(View view) {
        switch (view.getId()) {
            case R.id.btn_1:
                soundPool.play(load1,1,1,1,0,1);
            break;
            case R.id.btn_2:
                soundPool.play(load2,1,1,1,0,1);
            break;
            case R.id.btn_3:
                soundPool.play(load3,1,1,1,0,1);
            break;
            case R.id.btn_4:
                soundPool.play(load4,1,1,1,0,1);
            break;
            case R.id.btn_5:
                soundPool.play(load5,1,1,1,0,1);
            break;
            case R.id.btn_6:
                soundPool.play(load6,1,1,1,0,1);
            break;
            case R.id.btn_7:
                soundPool.play(load7,1,1,1,0,1);
            break;
        }

    }
}
