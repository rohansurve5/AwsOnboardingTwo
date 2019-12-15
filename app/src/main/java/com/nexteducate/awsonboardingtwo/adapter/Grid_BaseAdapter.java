package com.nexteducate.awsonboardingtwo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.nexteducate.awsonboardingtwo.R;

public class Grid_BaseAdapter extends BaseAdapter {

    Context context;
    int [] images;
    String [] data;
    LayoutInflater layoutInflater;

    public Grid_BaseAdapter(Context context, int[] images, String[] data) {
        this.context = context;
        this.images = images;
        this.data = data;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View raw = layoutInflater.inflate(R.layout.item_intrest,null);

        ImageView imageView = raw.findViewById(R.id.image_grid);
        TextView textView = raw.findViewById(R.id.tv_grid);

        imageView.setImageResource(images[i]);
        textView.setText(data[i]);

        return raw;
    }
}
