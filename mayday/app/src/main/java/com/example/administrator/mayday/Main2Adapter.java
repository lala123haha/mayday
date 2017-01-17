package com.example.administrator.mayday;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2017/1/9.
 */
public class Main2Adapter extends RecyclerView.Adapter <Main2Adapter.ViewHolder>{

    public static final int  HEADER =0;
    public static final int BODY = 1;

private Context context;
    private View headerView ;

//    private List<Bean.DataBean.TrainListBean> data;

    private List<String> data;

    public Main2Adapter(Context context, List<String> data) {
        this.context = context;
        this.data = data;
    }

    public View getHeaderView() {
        return headerView;
    }

    public void setHeaderView(View headerView) {
        this.headerView = headerView;
    }


    @Override
    public int getItemViewType(int position) {
        if (headerView==null){
            return BODY;
        }
        if (position==0){
            return HEADER;
        }

        return BODY;
    }

    @Override
    public Main2Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        if (headerView!=null&&viewType==HEADER){
            return  new ViewHolder(headerView);
        }

        View inflate = LayoutInflater.from(context).inflate(R.layout.recycler_item, parent, false);


        return new ViewHolder(inflate);


    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        if (getItemViewType(position)==BODY){

//        holder.textView11.setText(data.get(position).getTrainNo());
//        holder.textView12.setText(data.get(position).getStartTime());
//        holder.textView13.setText(data.get(position).getEndTime());
//        holder.textView21.setText(data.get(position).getDuration());
//        holder.textView22.setText(data.get(position).getFrom());
//        holder.textView23.setText(data.get(position).getTo());
//        holder.textView31.setText("￥"+data.get(position).getSeatInfos().get(1).getSeatPrice());
//        holder.textView32.setText(data.get(position).getSeatInfos().get(1).getSeat());
//        holder.textView33.setText(data.get(position).getSeatInfos().get(1).getRemainNum()+"张");
//

holder.textView13.setText(data.get(position-1));}
        else if(getItemViewType(position)==HEADER){
            return;
        }

    }


    @Override
    public int getItemCount() {
        if (headerView==null){
            return  data.size();
        }
        return data.size()+1;
    }



    class ViewHolder extends RecyclerView.ViewHolder{

        private TextView textView11,textView12,textView13;
        private TextView textView21,textView22,textView23;
        private TextView textView31,textView32,textView33;

        public ViewHolder(View itemView) {
            super(itemView);
            if (itemView==headerView){
                return;
            }
            textView11 = (TextView) itemView.findViewById(R.id.text11);
            textView12 = (TextView) itemView.findViewById(R.id.text12);
            textView13 = (TextView) itemView.findViewById(R.id.text13);

            textView21 = (TextView) itemView.findViewById(R.id.text21);
            textView22 = (TextView) itemView.findViewById(R.id.text22);
            textView23 = (TextView) itemView.findViewById(R.id.text23);

            textView31 = (TextView) itemView.findViewById(R.id.text31);
            textView32 = (TextView) itemView.findViewById(R.id.text32);
            textView33 = (TextView) itemView.findViewById(R.id.text33);

        }
    }
}
