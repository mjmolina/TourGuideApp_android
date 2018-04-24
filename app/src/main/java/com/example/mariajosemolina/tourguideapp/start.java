package com.example.mariajosemolina.tourguideapp;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;

public class start extends AppCompatActivity {

    public static ArrayList<Location> loc;
    ListView lista;

    TabLayout tabLayout;
    ViewPager viewPager;

    public void setupLocation() {

        loc = new ArrayList<>();

        Location barsAndRestaurants = new Location("Sucre et sel", "Torstrasse 132, 10119, Berlin", "", "http://www.sucreetsel.de", 0, "rest_frances");
        loc.add(barsAndRestaurants);
        barsAndRestaurants = new Location("Coreana", "Albrechtstraße 7, 12165 Berlin" , "", "https://www.tripadvisor.de/Restaurant_Review-g187323-d11664559-Reviews-Coreana-Berlin.html", 0, "rest_coreana");
        loc.add(barsAndRestaurants);
        barsAndRestaurants = new Location("Hugo's", "Budapester Str. 2, 10787 Berlin", "", "http://www.hugos-restaurant.de/", 0, "");
        loc.add(barsAndRestaurants);


        Location sightseeing = new Location("Reichtag", "Platz der Republik 1, 11011 Berlin", "", "http://www.bundestag.de/besuche/architektur/reichstag/", 1, "mon_reichtag");
        loc.add(sightseeing);
        sightseeing = new Location("Branderburger Tor", "Pariser Platz, 10117 Berlin", "", "https://en.wikipedia.org/wiki/Brandenburg_Gate", 1, "mon_puerta");
        loc.add(sightseeing);
        sightseeing = new Location("Molecule Man", " Treptowers 1, 12435 Berlin", "", "https://en.wikipedia.org/wiki/Molecule_Man_(sculpture)", 1, "mon_moleculaman");
        loc.add(sightseeing);
        sightseeing = new Location("Oberbaumbrücke", " Warschauer 43, 10243 Berlin", "", "https://www.berlin.de/sehenswuerdigkeiten/3559975-3558930-oberbaumbruecke.html", 1, "mon_puente");
        loc.add(sightseeing);
        sightseeing = new Location("Rathaus Steglitz", " 10243 Berlin", "", "", 1, "mon_rathaus");
        loc.add(sightseeing);

        Location streetArt = new Location("Koy", "Klosterstraße 62, 10179 Berlin", "", "", 2, "art_koy");
        loc.add(streetArt);
        streetArt = new Location("Tree", " 13347 Berlin", "", "", 2, "art_tree");
        loc.add(streetArt);
        streetArt = new Location("Bierpinsel", "Schloßstraße 17, 12163 Berlin", "", "https://de.wikipedia.org/wiki/Bierpinsel", 2, "art_bierpiels");
        loc.add(streetArt);
        streetArt = new Location("Cat", "Soorstraße, 14050 Berlin", "", "", 2, "art_cat");
        loc.add(streetArt);

        Location parks = new Location("Teufelsberg", " 14055 Berlin", "", "https://en.wikipedia.org/wiki/Teufelsberg", 3, "park_teufelberg");
        loc.add(parks);
        parks = new Location("Grunewald", " 13347 Berlin", "", "", 3, "park1");
        loc.add(parks);
        parks = new Location("Tiergarten", "Schloßstraße 17, 12163 Berlin", "", "https://de.wikipedia.org/wiki/Bierpinsel", 3, "");
        loc.add(parks);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        setupLocation();

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPager.setAdapter(new CustomAdapter(getSupportFragmentManager(), getApplicationContext()));

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }
        });
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }

    class CustomAdapter extends FragmentPagerAdapter {
        private String fragments[] = {"Fragment = 1", "Fragment = 2", "Fragment = 3", "Fragment = 4"};

        public CustomAdapter(FragmentManager supportFragmentManager, Context applicationContext) {
            super(supportFragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            Bundle args;
            switch (position) {
                case 0:
                    Fragment f1 = new Fragment1();
                    args = new Bundle();
                    args.putInt("type", 0);
                    f1.setArguments(args);
                    return f1;
                case 1:
                    Fragment f2 = new Fragment1();
                    args = new Bundle();
                    args.putInt("type", 1);
                    f2.setArguments(args);
                    return f2;
                case 2:
                    Fragment f3 = new Fragment1();
                    args = new Bundle();
                    args.putInt("type", 2);
                    f3.setArguments(args);
                    return f3;
                case 3:
                    Fragment f4 = new Fragment1();
                    args = new Bundle();
                    args.putInt("type", 3);
                    f4.setArguments(args);
                    return f4;
                default:
                    Fragment f5 = new Fragment1();
                    args = new Bundle();
                    args.putInt("type", 3);
                    f5.setArguments(args);
                    return null;
            }
        }

        @Override
        public int getCount() {
            return fragments.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return fragments[position];

        }
    }
}