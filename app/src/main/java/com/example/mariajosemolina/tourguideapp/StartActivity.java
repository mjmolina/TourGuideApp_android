package com.example.mariajosemolina.tourguideapp;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class StartActivity extends AppCompatActivity {

    public static ArrayList<Location> loc;

    TabLayout tabLayout;
    ViewPager viewPager;

    public void setupLocations() {

        loc = new ArrayList<>();
        Location sightseeing = new Location(getString(R.string.reichtag_name),
                getString(R.string.reichtag_address),
                getString(R.string.reichtag_description),
                getString(R.string.reichtag_url),
                1,
                R.drawable.mon_reichtag);
        loc.add(sightseeing);
        sightseeing = new Location(getString(R.string.brandenburgertor_name),
                getString(R.string.brandenburgertor_address),
                getString(R.string.brandenburgertor_description),
                getString(R.string.brandenburgertor_url),
                1,
                R.drawable.mon_puerta);
        loc.add(sightseeing);
        sightseeing = new Location(getString(R.string.moleculeman_name),
                getString(R.string.moleculeman_address),
                getString(R.string.moleculeman_description),
                getString(R.string.moleculeman_url),
                1,
                R.drawable.mon_moleculaman);
        loc.add(sightseeing);
        sightseeing = new Location(getString(R.string.oberbaumbruecke_name),
                getString(R.string.oberbaumbruecke_address),
                getString(R.string.oberbaumbruecke_description),
                getString(R.string.oberbaumbruecke_url),
                1,
                R.drawable.mon_puente);
        loc.add(sightseeing);
        sightseeing = new Location(getString(R.string.rathaussteglitz_name),
                getString(R.string.rathaussteglitz_address),
                getString(R.string.rathaussteglitz_description),
                getString(R.string.rathaussteglitz_url),
                1,
                R.drawable.mon_rathaus);
        loc.add(sightseeing);

        Location barsAndRestaurants = new Location(getString(R.string.hugos_name),
                getString(R.string.hugos_address),
                getString(R.string.hugos_description),
                getString(R.string.hugos_url),
                0,
                R.drawable.rest_hugo);
        loc.add(barsAndRestaurants);
        barsAndRestaurants = new Location(getString(R.string.sucreetsel_name),
                getString(R.string.sucreetsel_address),
                getString(R.string.sucreetsel_description),
                getString(R.string.sucreetsel_url),
                0,
                R.drawable.rest_frances);
        loc.add(barsAndRestaurants);
        barsAndRestaurants = new Location(getString(R.string.coreana_name),
                getString(R.string.coreana_address),
                getString(R.string.coreana_description),
                getString(R.string.coreana_url),
                0,
                R.drawable.rest_coreana);
        loc.add(barsAndRestaurants);

        Location parks = new Location(getString(R.string.teufelsberg_name),
                getString(R.string.teufelsberg_address),
                getString(R.string.teufelsberg_description),
                getString(R.string.teufelsberg_url),
                3,
                R.drawable.park_teufelberg);
        loc.add(parks);
        parks = new Location(getString(R.string.grunewald_name),
                getString(R.string.grunewald_address),
                getString(R.string.grunewald_description),
                getString(R.string.grunewald_url),
                3,
                R.drawable.park_grunewald);
        loc.add(parks);
        parks = new Location(getString(R.string.schlosspark_name),
                getString(R.string.schlosspark_address),
                getString(R.string.schlosspark_description),
                getString(R.string.schlosspark_url),
                3,
                R.drawable.park_schloss);
        loc.add(parks);

        Location streetArt = new Location(getString(R.string.koy_name),
                getString(R.string.koy_address),
                getString(R.string.koy_description),
                getString(R.string.koy_url),
                2,
                R.drawable.art_koy);
        loc.add(streetArt);
        streetArt = new Location(getString(R.string.bierpinsel_name),
                getString(R.string.bierpinsel_address),
                getString(R.string.bierpinsel_description),
                getString(R.string.bierpinsel_url),
                2,
                R.drawable.art_bierpiels);
        loc.add(streetArt);
        streetArt = new Location(getString(R.string.cat_name),
                getString(R.string.cat_address),
                getString(R.string.cat_description),
                getString(R.string.cat_url),
                2,
                R.drawable.art_cat);
        loc.add(streetArt);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        setupLocations();

        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(new CustomAdapter(getSupportFragmentManager(), getApplicationContext()));

        TabLayout tabLayout = findViewById(R.id.tabLayout);
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
        private String fragments[] = {"Monuments", "Restaurants", "Street Art", "Parks"};

        public CustomAdapter(FragmentManager supportFragmentManager, Context applicationContext) {
            super(supportFragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            Bundle args;
            switch (position) {
                case 0:
                    Fragment f1 = new BaseFragment();
                    args = new Bundle();
                    args.putInt("type", 1);
                    f1.setArguments(args);
                    return f1;
                case 1:
                    Fragment f2 = new BaseFragment();
                    args = new Bundle();
                    args.putInt("type", 0);
                    f2.setArguments(args);
                    return f2;
                case 2:
                    Fragment f3 = new BaseFragment();
                    args = new Bundle();
                    args.putInt("type", 2);
                    f3.setArguments(args);
                    return f3;
                case 3:
                    Fragment f4 = new BaseFragment();
                    args = new Bundle();
                    args.putInt("type", 3);
                    f4.setArguments(args);
                    return f4;
                default:
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
