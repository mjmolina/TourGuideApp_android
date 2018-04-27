package com.example.mariajosemolina.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

import java.util.ArrayList;


public class MyAdapter extends BaseAdapter {
    private static LayoutInflater inflater = null;

    Context context;
    ArrayList<Location> loc;
    ImageView image;
    TextView title;
    TextView subtitle;
    View vista;

    public MyAdapter(Context myContext, ArrayList<Location> myLoc) {
        this.context = myContext;
        this.loc = myLoc;

        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (view == null) {
            vista = inflater.inflate(R.layout.viewitem, null);
        }
        else {
            vista = (View) view;
        }

        image = (ImageView) vista.findViewById(R.id.photo);
        title = (TextView) vista.findViewById(R.id.title);

        image.setImageResource(loc.get(i).Image);
        title.setText(loc.get(i).Name);

        vista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, LocationView.class);
                intent.putExtra("locationName", loc.get(i).Name);
                context.startActivity(intent);

            }
        });

        return vista;
    }

    @Override
    public int getCount() {
        return loc.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
}
