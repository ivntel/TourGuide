package com.example.ivnte.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by ivnte on 2016-09-30.
 */
public class SiteDetailsActivity extends AppCompatActivity {

    public static String name;
    public static String address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.site_details_activity);

        TextView siteName = (TextView)findViewById(R.id.site_details_name);
        TextView siteAddress = (TextView)findViewById(R.id.site_details_address);

        Intent intent = getIntent();
        name = intent.getExtras().getString("siteName");
        address = intent.getExtras().getString("siteAddress");

        siteName.setText(name);
        siteAddress.setText(address);

    }
}
