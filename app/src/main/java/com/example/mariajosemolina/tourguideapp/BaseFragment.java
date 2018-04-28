package com.example.mariajosemolina.tourguideapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class BaseFragment extends Fragment {
    ListView itemList;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parentViewGroup, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.base_fragment, parentViewGroup, false);
        itemList = view.findViewById(R.id.list);
        Bundle args = getArguments();
        int type = args.getInt("type");

        ArrayList<Location> locations = new ArrayList<>();
        for (int i = 0; i < StartActivity.loc.size(); i++){
            if (StartActivity.loc.get(i).Type == type)
                locations.add(StartActivity.loc.get(i));
        }
        itemList.setAdapter(new ItemsAdapter(this.getContext(), locations));

        return view;

    }

}
