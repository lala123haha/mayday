package com.example.administrator.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2017/1/9.
 */
public class MyAdapter extends BaseAdapter {
    private Context context;
    private List <String> data;

    public MyAdapter(Context context, List<String> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data!=null?data.size():0;
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder = null;
        if (view==null) {

            view = LayoutInflater.from(context).inflate(R.layout.item, viewGroup, false);

            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        }  else {
            viewHolder = (ViewHolder) view.getTag();
        }

        viewHolder.textView.setText(data.get(i));
        return view;
    }

    class ViewHolder{
        private TextView textView;
        public ViewHolder(View view) {
            textView = (TextView) view.findViewById(R.id.textlala);
        }
    }
}
