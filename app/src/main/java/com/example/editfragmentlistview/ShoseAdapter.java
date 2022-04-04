package com.example.editfragmentlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ShoseAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private ArrayList<Shose> ShosearrayList;



    public ShoseAdapter(Context context, int layout, ArrayList<Shose> shosearrayList) {
        this.context = context;
        this.layout = layout;
        ShosearrayList = shosearrayList;
    }

    @Override
    public int getCount() {
        return ShosearrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(viewGroup.getContext())
                .inflate(layout,viewGroup,false);

        ImageView imgShose = view.findViewById(R.id.imgShose);
        TextView tvDecription = view.findViewById(R.id.tvDecription);
        TextView tvPls = view.findViewById(R.id.tvPls);

        imgShose.setImageResource(ShosearrayList.get(i).getImage());
        tvDecription.setText(ShosearrayList.get(i).getDecription());
        tvPls.setText(ShosearrayList.get(i).getShowText());
        return view;
    }
}
