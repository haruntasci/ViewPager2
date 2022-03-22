package com.haruntasci.viewpager2project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager2 viewPager2;
    private List<Smurfs> smurfsList;
    private SmurfsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager2 = findViewById(R.id.viewPager2);
        smurfsList = new ArrayList<>();

        smurfsList.add(new Smurfs(R.drawable.smurf,"SMURF"));
        smurfsList.add(new Smurfs(R.drawable.gargamel,"GARGAMEL"));
        smurfsList.add(new Smurfs(R.drawable.smurfhouse,"SMURFS HOUSE"));

        adapter = new SmurfsAdapter(smurfsList);
        viewPager2.setAdapter(adapter);

    }
}