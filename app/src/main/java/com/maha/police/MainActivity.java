package com.maha.police;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.maha.police.Adapter.MainActivityAdapter;

public class MainActivity extends AppCompatActivity {
    Intent intent;
    GridView androidGridView;

    String[] gridViewString = {
            "ऑनलाईन तक्रार नोंदणी", "आमच्या विषयी",

    };
    int[] gridViewImageId = {
            R.mipmap.ic_launcher, R.mipmap.ic_launcher,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainActivityAdapter adapterViewAndroid = new MainActivityAdapter(this, gridViewString, gridViewImageId);
        androidGridView = findViewById(R.id.gridView);
        androidGridView.setAdapter(adapterViewAndroid);
        androidGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int i, long id) {
                //   Toast.makeText(getApplicationContext(), "GridView Item: " + gridViewString[+i], Toast.LENGTH_LONG).show();
                if (gridViewString[+i] == "ऑनलाईन तक्रार नोंदणी") {
                    //   Toast.makeText(getApplicationContext(), "You Clicked ऑनलाईन तक्रार", Toast.LENGTH_LONG).show();
                    // Intent intent = new Intent(getApplicationContext(), OnlineActivity.class);
                    //startActivity(intent);
                    //overridePendingTransition(R.anim.pull_in_right, R.anim.pull_out_left);
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mhpolice.maharashtra.gov.in/Citizen/CitizenTips/CitizenTips.aspx?From=LFhlihlx/W49VSlBvdGc4w=="));
                    startActivity(intent);
                } else if (gridViewString[+i] == "आमच्या विषयी") {
                    intent = new Intent(getApplicationContext(), OnlineActivity.class);
                    startActivity(intent);
                }
            }
        });

    }
}