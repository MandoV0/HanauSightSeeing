package com.example.hanausightseeing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public RecyclerView recyclerView;

    public ArrayList<Sehenswürdigkeit> sehenswuerdigkeiten;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recylcer_sehenswuerdigkeiten);

        RecyclerAdapter adapter = new RecyclerAdapter(sehenswuerdigkeiten);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setItemAnimator(new DefaultItemAnimator());

        recyclerView.setAdapter(adapter);


    }
}