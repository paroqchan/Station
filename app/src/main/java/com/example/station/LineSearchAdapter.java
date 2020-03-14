package com.example.station;

import android.content.Context;
import android.content.Intent;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class LineSearchAdapter extends ArrayAdapter<LineSearch> {
    List<LineSearch> mLineSearch;
    Context mContext;
    public LineSearchAdapter(Context context,int layoutResourceId,List<LineSearch> objects){
        super(context,layoutResourceId,objects);
        mLineSearch = objects;
        mContext = context;
    }
    @Override
    public int getCount() {
        return mLineSearch.size();

    }
    @Override
    public LineSearch getItem(int position) {
        return mLineSearch.get(position);
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        final ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.line, null);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder)convertView.getTag();
        }
      //  return convertView;
        final LineSearch item =getItem(position);
        if (item != null) {
            viewHolder.layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ArrayList<String> hairetu = new ArrayList<String>();
                    if(item.name == "あ"){
                        hairetu.add("愛知環状鉄道線");
                        hairetu.add("会津線");
                        hairetu.add("あいの風とやま鉄道線");
                        hairetu.add("青い森鉄道線");
                        hairetu.add("粟生線");
                        hairetu.add("あおなみ線");
                        hairetu.add("秋田新幹線");
                        hairetu.add("秋田内陸線");
                        hairetu.add("明知線");
                        hairetu.add("赤穂線");
                        hairetu.add("浅草線");
                        hairetu.add("阿佐東線");
                        hairetu.add("浅野川線");
                        hairetu.add("アストラムライン");
                        hairetu.add("渥美線");
                        hairetu.add("吾妻線");
                        hairetu.add("左沢線");
                        hairetu.add("阿武隈急行線");
                        hairetu.add("網干線");
                        hairetu.add("西鉄　甘木線");
                        hairetu.add("甘木鉄道　甘木線");
                        hairetu.add("天橋立ケーブルカー");
                        hairetu.add("荒川線");
                        hairetu.add("嵐山本線");
                        hairetu.add("有馬線");
                    }
                    Intent intent=new Intent(mContext,LineActivity.class);
                    intent.putExtra("ekilist", hairetu);
                    mContext.startActivity(intent);
                }
            });
            viewHolder.titleTextView.setText(item.name);
        }
        return convertView;
    }

    public static class ViewHolder{
        LinearLayout layout;
        TextView titleTextView;
        public ViewHolder(View view){
            layout = (LinearLayout)view.findViewById(R.id.Layout);
            titleTextView = (TextView)view.findViewById(R.id.title_textView);
        }
    }
}
