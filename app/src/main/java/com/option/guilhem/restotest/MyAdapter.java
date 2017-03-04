package com.option.guilhem.restotest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Guilhem on 04/03/2017.
 */

public class MyAdapter extends ArrayAdapter<Restaurant> {

    public MyAdapter(Context context, List<Restaurant> restos) {
        super(context, 0, restos);
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.item_row, parent, false);
        }

        ViewHolder viewHolder = (ViewHolder) view.getTag();
        if(viewHolder == null) {
            viewHolder = new ViewHolder();
            viewHolder.name = (TextView) view.findViewById(R.id.name);
            viewHolder.desc = (TextView) view.findViewById(R.id.desc);
            viewHolder.time = (TextView) view.findViewById(R.id.time);
            viewHolder.price = (TextView) view.findViewById(R.id.price);
            viewHolder.distance = (TextView) view.findViewById(R.id.distance);
            viewHolder.image = (ImageView) view.findViewById(R.id.picture);
            view.setTag(viewHolder);
        }

        Restaurant resto = getItem(position);
        viewHolder.name.setText(resto.name);
        viewHolder.desc.setText(resto.cuisines.get(0).label);
        viewHolder.time.setText("15min"); //placeholder
        viewHolder.distance.setText("555m");//placeholder
        viewHolder.price.setText("€€");//placeholder
        Picasso.with(getContext()).load(resto.mainPicture.url).into(viewHolder.image);

        return view;
    }

    private class ViewHolder {
        public TextView name;
        public TextView desc;
        public TextView time;
        public TextView price;
        public TextView distance;
        public ImageView image;
    }

}
