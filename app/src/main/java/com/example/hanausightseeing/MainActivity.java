package com.example.hanausightseeing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerAdapter.RecyclerViewClickListener listener;
    public RecyclerView recyclerView;
    private RecyclerAdapter recyclerAdapter;

    public ArrayList<Sehenswürdigkeit> sightList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Setze die View
        setContentView(R.layout.activity_main);

        // Erstelle die Sehenswürigkeiten
        Sehenswürdigkeit s1 = new Sehenswürdigkeit("Goldschmiede", "Die Goldschmiede wurde 1990 gebaut", R.drawable.goldschmiede);
        Sehenswürdigkeit s2 = new Sehenswürdigkeit("Schloss", "Das Schloss der Märchen", R.drawable.schloss);
        Sehenswürdigkeit s3 = new Sehenswürdigkeit("Brüder Grimm", "Bla Bla", R.drawable.grimm);

        // Füge die Sehenswüridgkeiten in die Liste ein
        sightList.add(s1);
        sightList.add(s2);
        sightList.add(s3);

        // Erstelle den Recycler für die Hauptseite
        recyclerView = findViewById(R.id.recycler_sightseeing);
        setOnClickListener();
        recyclerAdapter = new RecyclerAdapter(sightList, listener);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setItemAnimator(new DefaultItemAnimator());

        recyclerView.setAdapter(recyclerAdapter);
    }

    void setOnClickListener() {
        listener = new RecyclerAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View view, int position) {
                // Lade neue Aktivität bzw VIEW
                String beschreibung = recyclerAdapter.getSehenswuerdigkeitenList().get(position).beschreibung;
                String name = recyclerAdapter.getSehenswuerdigkeitenList().get(position).name;

                Intent intent = new Intent(getApplicationContext(), ViewHauptseiteActivity.class);

                intent.putExtra("BESCHREIBUNG", beschreibung);
                intent.putExtra("NAME", name);

                startActivity(intent);
            }
        };
    }
}