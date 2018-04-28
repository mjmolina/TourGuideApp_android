package com.example.mariajosemolina.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;


public class LocationView extends AppCompatActivity {

    ImageView image;
    TextView name, description, web, location;

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_view);

        Bundle params = getIntent().getExtras();
        String locationName = params.getString("locationName");

        name = findViewById(R.id.name);
        final TextView address = findViewById(R.id.address);
        description = findViewById(R.id.description);
        web = findViewById(R.id.web);
        image = findViewById(R.id.image);

        // Start to look for the location that has the same "locationName"
        for (int i = 0; i < StartActivity.loc.size(); i++) {
            Location currentLocation = StartActivity.loc.get(i);
            if (currentLocation.Name.equals(locationName)) {

                // Setting the Name and Address of the Location
                name.setText(currentLocation.Name);
                address.setText(currentLocation.Address);

                //  Hide the description TextView if it is empty and if not, we show it.
                if (currentLocation.Description.isEmpty()) {
                    description.setVisibility(View.GONE);
                }
                else {
                    description.setText(currentLocation.Description);
                }

                //  Hide the URL TextView if it is empty and if not, we show it.
                if (currentLocation.Website.isEmpty()) {
                    web.setVisibility(View.GONE);
                }
                else {
                    web.setText(currentLocation.Website);
                }
                // Generating Google Maps URL to open it on the browser
                final String map = "http://maps.google.co.in/maps?q=" + currentLocation.Address;

                address.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                        startActivity(i);
                    }
                });

                image.setImageResource(currentLocation.Image);

                // If we found the location, we break from the for.
                break;
            }
        }
    }
}
