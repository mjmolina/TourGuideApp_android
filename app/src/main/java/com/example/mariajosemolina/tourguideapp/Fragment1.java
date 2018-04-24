package com.example.mariajosemolina.tourguideapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class Fragment1 extends Fragment {
    ListView lista;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parentViewGroup, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag1, parentViewGroup, false);
        lista = (ListView) view.findViewById(R.id.list);
        Bundle args = getArguments();
        int type = args.getInt("type");

        ArrayList<Location> locations = new ArrayList<>();
        for (int i = 0; i < start.loc.size();i++){
            if (start.loc.get(i).Type == type)
                locations.add(start.loc.get(i));
        }
        lista.setAdapter(new MyAdapter(this.getContext(), locations));

        return view;

    }

}
