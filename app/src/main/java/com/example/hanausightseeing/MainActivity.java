package com.example.hanausightseeing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerAdapter.RecyclerViewClickListener listener;
    public RecyclerView recyclerView;
    private RecyclerAdapter recyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Setze die View
        setContentView(R.layout.activity_main);

        // ! --- Sollte im Controller passieren --- !
        // Erstelle das Model ( Die Logik )
        Model model = new Model();

        recyclerView = findViewById(R.id.recycler_sightseeing);
        setOnClickListener();

        // Erstelle Recycler Adapter
        recyclerAdapter = new RecyclerAdapter(model.getSehenswürdigkeiten(), listener);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(recyclerAdapter);
    }

    void setOnClickListener() {
        listener = (view, position) -> {
            // Informationen der Sehenswürdigkeit auf die geclickt wurde bekommen
            String beschreibung = recyclerAdapter.getSehenswuerdigkeitenList().get(position).beschreibung;
            String name = recyclerAdapter.getSehenswuerdigkeitenList().get(position).name;
            int[] fotos = recyclerAdapter.getSehenswuerdigkeitenList().get(position).fotos;

            // Lade neue Aktivität bzw VIEW
            Intent intent = new Intent(getApplicationContext(), ViewHauptseiteActivity.class);

            // Informationen der neuen Aktivität geben
            intent.putExtra("BESCHREIBUNG", beschreibung);
            intent.putExtra("NAME", name);
            intent.putExtra("FOTOS", fotos);

            // Aktivität starten
            startActivity(intent);
        };
    }
}