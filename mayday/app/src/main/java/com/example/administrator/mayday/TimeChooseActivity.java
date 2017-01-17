package com.example.administrator.mayday;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.DatePicker;

public class TimeChooseActivity extends AppCompatActivity {

    private DatePicker datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_choose);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_time);
        toolbar.setNavigationIcon(R.mipmap.a);
        toolbar.setTitle("选择时间");
        setSupportActionBar(toolbar);
        datePicker = (DatePicker) findViewById(R.id.date);

    }

    public void clickButton(View view) {
        Intent intent = new Intent(getApplication(),MainActivity.class);
        intent.putExtra("year",datePicker.getYear());
        intent.putExtra("dateMonth",datePicker.getMonth());
        intent.putExtra("dateDay",datePicker.getDayOfMonth());
        startActivity(intent);
    }
}
