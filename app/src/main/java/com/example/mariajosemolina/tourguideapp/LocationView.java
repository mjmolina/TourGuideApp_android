package com.example.mariajosemolina.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;


public class LocationView extends AppCompatActivity {

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

        TextView text = (TextView) findViewById(R.id.text);
        final TextView address = (TextView) findViewById(R.id.address);

        for (int i = 0; i < start.loc.size();i++) {
            Location temporaryLocation = start.loc.get(i);
            if (temporaryLocation.Name.equals(locationName)) {
                System.out.println("We found the elements of the object");
                // We can access of manipulate this information by using
                // the values:
                // temporaryLocation.Name
                // temporaryLocation.Address
                // temporaryLocation.Description
                // temporaryLocation.Website
                // temporaryLocation.Image
                // temporaryLocation.Type
                String url = "https://maureira.xyz";
                text.setText("Check out the website of the pololo: "+url);
                final String map = "http://maps.google.co.in/maps?q=" + temporaryLocation.Address;
                address.setText("Click me!  "+temporaryLocation.Address);

                address.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {


                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                        startActivity(i);
                    }
                });

            }
        }


    }
}
