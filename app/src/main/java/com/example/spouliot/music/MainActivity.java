package com.example.spouliot.music;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* un fragment pour la partie sommaire */
        AlbumSummary albumSummary = new AlbumSummary();
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().add(R.id.fl_main, albumSummary).commit();

        /* un fragment pour la partie détails */
        //AlbumDetails albumDetails = new AlbumDetails();
        //fragmentManager.beginTransaction().add(R.id.fl_details, albumDetails).commit();
    }
}
