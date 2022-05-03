package com.example.hanausightseeing.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hanausightseeing.R;
import com.example.hanausightseeing.Sehenswürdigkeit;

public class ViewSehenwürdigkeit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sehenswuerdigkeit_design);

        // Die vorherige Aktivität
        Intent intent = getIntent();

        // Sehenswürdigkeit die uns übergeben wird
        Sehenswürdigkeit s = (Sehenswürdigkeit) intent.getSerializableExtra("Sehenswürdigkeit");

        // Setze alle daten
        TextView textName = findViewById(R.id.sehenswürdigkeiten_name);
        textName.setText(s.name);

        TextView textBeschreibung = findViewById(R.id.sehenswürdigkeiten_beschreibung);
        textBeschreibung.setText(s.beschreibung);

        ImageView imageView = findViewById(R.id.sehenswürdigkeiten_foto);
        imageView.setImageResource(s.fotos[0]);

        TextView mapLinkTextView = findViewById(R.id.sehenswürdigkeiten_mapLinkTextView);

        if(s.mapLink != "")
        {
            mapLinkTextView.setText(s.mapLink);
            mapLinkTextView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        else
        {

            mapLinkTextView.setText("");
        }


    }
}