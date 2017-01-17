package com.example.administrator.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Administrator on 2017/1/9.
 */
public class BDHelper  extends SQLiteOpenHelper{
    public static final String DB_NAME = "urls";
    public static final int  DB_VERSION = 1;
    public BDHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE IF NOT EXISTS urls (_id integer primary key autoincrement, url)");

        Log.e("db", "onCreate: 创建表格成功");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL( "DROP TABLE IF EXISTS " + DB_NAME );
        onCreate(db);
    }


}
