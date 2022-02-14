package com.example.hanausightseeing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ViewHauptseiteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sehenswuerdigkeit_design);

        Intent intent = getIntent();

        TextView textName = findViewById(R.id.sehenswürdigkeiten_name);
        String name = intent.getStringExtra("NAME");
        textName.setText(name);

        TextView textBeschreibung = findViewById(R.id.sehenswürdigkeiten_beschreibung);
        String beschreibung = intent.getStringExtra("BESCHREIBUNG");
        textBeschreibung.setText(beschreibung);
    }
}