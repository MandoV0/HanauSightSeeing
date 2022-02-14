package com.example.hanausightseeing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Sehenswürdigkeit s1 = new Sehenswürdigkeit("Goldschmiede", "L", R.drawable.goldschmiede);
        Sehenswürdigkeit s2 = new Sehenswürdigkeit("Schloss", "K", R.drawable.schloss);
        Sehenswürdigkeit s3 = new Sehenswürdigkeit("Brüder Grimm", "Bla Bla", R.drawable.grimm);

        // Liste in der alle sehenswürdigkeiten gespeichert werden
        ArrayList<Sehenswürdigkeit> sightList = new ArrayList<>();

        sightList.add(s1);
        sightList.add(s2);
        sightList.add(s3);

        recyclerView = findViewById(R.id.recycler_sightseeing);

        RecyclerAdapter adapter = new RecyclerAdapter(sightList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setItemAnimator(new DefaultItemAnimator());

        recyclerView.setAdapter(adapter);

    }
}