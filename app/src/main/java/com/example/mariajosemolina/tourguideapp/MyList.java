package com.example.mariajosemolina.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.ListAdapter;

import java.util.ArrayList;

public class MyList extends AppCompatActivity{
    ListView lista;

    public static ArrayList<Location> loc;

    public void setupLocation() {

        loc = new ArrayList<>();

        //Location barsAndRestaurants = new Location("Sucre et sel", "Torstrasse 132, 10119, Berlin", "", "http://www.sucreetsel.de", "", "ubahn");
        //loc.add(barsAndRestaurants);
        //barsAndRestaurants = new Location("Barcomi's", "Sophienstraße 21, 10178 Berlin" , "", "http://www.barcomis.de/barcomis-berlin", "", "ubahn");
        //loc.add(barsAndRestaurants);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.elements);

        setupLocation();

        lista = (ListView) findViewById(R.id.lista2);

        lista.setAdapter(new MyAdapter(this,loc));

    }
}