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

    TabLayout tabLayout;
    ViewPager viewPager;

    public void setupLocations() {

        loc = new ArrayList<>();
        Location sightseeing = new Location("Reichtag",
                "Platz der Republik 1, 11011 Berlin",
                "The “Reichtag” is a historic edifice in Berlin, Germany, constructed to house the Imperial Diet of the German Empire. It was opened in 1894 and housed the Diet until 1933, when it was severely damaged after being set on fire. After World War II, the building fell into disuse; the parliament of the German Democratic Republic met in the Palast der Republik in East Berlin.",
                "http://www.bundestag.de/besuche/architektur/reichstag/",
                1,
                R.drawable.mon_reichtag);
        loc.add(sightseeing);
        sightseeing = new Location("Branderburger Tor",
                "Pariser Platz, 10117 Berlin",
                "The “Brandenburger Tor” is an 18th-century neoclassical monument in Berlin, built on the orders of Prussian king Frederick William II after the (temporarily) successful restoration of order during the early Batavian Revolution. One of the best-known landmarks of Germany, it was built on the site of a former city gate that marked the start of the road from Berlin to the town of Brandenburg an der Havel, which used to be capital of the Margraviate of Brandenburg.",
                "https://en.wikipedia.org/wiki/Brandenburg_Gate",
                1,
                R.drawable.mon_puerta);
        loc.add(sightseeing);
        sightseeing = new Location("Molecule Man",
                " Treptowers 1, 12435 Berlin",
                "The “Molecule Man” is a series of aluminium sculptures, designed by American artist Jonathan Borofsky, installed at various locations in the world, including Berlin, Germany. The sculptures consist of three humans leaning towards each other, the bodies of which are filled with hundreds of holes, the holes representative of \"the molecules of all human beings coming together to create our existence.",
                "https://en.wikipedia.org/wiki/Molecule_Man_(sculpture)",
                1,
                R.drawable.mon_moleculaman);
        loc.add(sightseeing);
        sightseeing = new Location("Oberbaumbrücke",
                "Warschauer 43, 10243 Berlin",
                "The “ Oberbaumbrücke” is a double-deck bridge crossing Berlin's River Spree, considered one of the city's landmarks. It links Friedrichshain and Kreuzberg, former boroughs that were divided by the Berlin Wall, and has become an important symbol of Berlin’s unity.",
                "https://www.berlin.de/sehenswuerdigkeiten/3559975-3558930-oberbaumbruecke.html",
                1,
                R.drawable.mon_puente);
        loc.add(sightseeing);
        sightseeing = new Location("Rathaus Steglitz",
                "Albrechtstraße 1, 12165 Berlin",
                "The Rathaus Steglitz is located in the Berlin district of Steglitz on the corner of Schloss- / Grunewaldstraße and was built in 1898 as the town hall of the rural community of Steglitz.",
                "https://de.wikipedia.org/wiki/Rathaus_Steglitz",
                1,
                R.drawable.mon_rathaus);
        loc.add(sightseeing);

        Location barsAndRestaurants = new Location("Hugo's",
                "Budapester Str. 2, 10787 Berlin",
                "Whether TV tower, the Sony Center on Potsdamer Platz or the Victory Column - the Hugos offers a fantastic view, making it the highest gourmet restaurant in Berlin! Because culinary shines it, with 1 Michelin star and 17 points in Gault Millau.",
                "http://www.hugos-restaurant.de/",
                0,
                R.drawable.rest_hugo);
        loc.add(barsAndRestaurants);
        barsAndRestaurants = new Location("Sucre et sel",
                "Torstrasse 132, 10119, Berlin",
                "In the family atmosphere of a typical bistro, visitors can enjoy Parisian charm, delicious French specialties with a Mediterranean influence and good wine. In the small guest room there are only a few, closely placed tables; The room is dominated by the bar opposite the entrance.",
                "http://www.sucreetsel.de",
                0,
                R.drawable.rest_frances);
        loc.add(barsAndRestaurants);
        barsAndRestaurants = new Location("Coreana",
                "Albrechtstraße 7, 12165 Berlin" ,
                "The coreana is a korean BBQ in Steglitz, Berlin. This restaurant is very chic styled, the staff is very friendly and attentive. The Korean dishes are all excellent.",
                "https://www.tripadvisor.de/Restaurant_Review-g187323-d11664559-Reviews-Coreana-Berlin.html",
                0,
                R.drawable.rest_coreana);
        loc.add(barsAndRestaurants);

        Location parks = new Location("Teufelsberg",
                "Teufelsseechaussee 10, 14193 Berlin",
                "Teufelsberg is a man-made hill in Berlin, Germany, in the Grunewald locality of former West Berlin. It rises about 80 metres above the surrounding Teltow plateau and 120.1 metres above the sea level, in the north of Berlin's Grunewald Forest. It was named after the Teufelssee in its southerly vicinity. The hill is made of rubble, and covers an under-construction Nazi military-technical college. During the Cold War, there was a U.S. listening station on the hill, Field Station Berlin.",
                "https://www.visitberlin.de/es/teufelsberg",
                3,
                R.drawable.park_teufelberg);
        loc.add(parks);
        parks = new Location("Grunewald",
                "Havelchaussee 61, 14193 Berlin",
                "Grunewald is a German forest located in the western side of Berlin on the east side of the Havel, mainly in the Grunewald locality. At 3,000 hectares it is the largest green area in the city of Berlin.", "https://www.visitberlin.de/en/grunewald",
                3,
                R.drawable.park_grunewald);
        loc.add(parks);
        parks = new Location("Schlosspark",
                "Spandauer Damm 10, 14059 Berlin",
                "The palace Schloss Charlottenburg offers a superb stage, on to which the beautiful baroque garden unfolds. This spot is perfect in any weather for relaxing, playing games and just looking at the view.",
                "https://www.berlin.de/sehenswuerdigkeiten/3560428-3558930-schlosspark-charlottenburg.html",
                3,
                R.drawable.park_schloss);
        loc.add(parks);

        Location streetArt = new Location("Koy",
                "Klosterstraße 62, 10179 Berlin",
                "The majestic and surprising work of Japanese street artist, TWOONE. The artist uses art as his voice to express his feelings. TWOONE’s ‘Beast Scape’ mural features towering deer heads - a whimsical, dramatic and colourful work of art.",
                "",
                2,
                R.drawable.art_koy);
        loc.add(streetArt);
        streetArt = new Location("Bierpinsel",
                "Schloßstraße 17, 12163 Berlin",
                "The Bierpinsel is a building in the Steglitz neighborhood of Berlin. It has a height of 46 meters with a shape resembling that of an observation tower. The building has three floors usually equipped with restaurants and a night club. The history of its business usage is long and filled with bankruptcies and short periods of closure. ",
                "https://de.wikipedia.org/wiki/Bierpinsel",
                2,
                R.drawable.art_bierpiels);
        loc.add(streetArt);
        streetArt = new Location("Cat",
                "Soorstraße, 14050 Berlin",
                " Unknown artist.",
                "",
                2,
                R.drawable.art_cat);
        loc.add(streetArt);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        setupLocations();

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
        private String fragments[] = {"Monuments", "Restaurants", "Street Art", "Parks"};

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
                    args.putInt("type", 1);
                    f1.setArguments(args);
                    return f1;
                case 1:
                    Fragment f2 = new Fragment1();
                    args = new Bundle();
                    args.putInt("type", 0);
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
