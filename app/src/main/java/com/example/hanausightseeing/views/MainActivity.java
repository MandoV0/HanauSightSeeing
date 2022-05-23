package com.example.hanausightseeing.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import com.example.hanausightseeing.models.Model;
import com.example.hanausightseeing.R;
import com.example.hanausightseeing.adapters.RecyclerAdapter;
import com.example.hanausightseeing.Sehenswürdigkeit;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerAdapter.RecyclerViewClickListener listener;
    public RecyclerView recyclerView;
    private RecyclerAdapter recyclerAdapter;

    private Model model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Setze die View
        setContentView(R.layout.activity_main);

        // ! --- Sollte im Controller passieren --- !
        // Erstelle das Model ( Die Logik )
        model = new Model();

        // Für die Suche
        EditText editText = findViewById(R.id.main_edittext);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                filter(editable.toString());
            }
        });

        recyclerView = findViewById(R.id.recycler_sightseeing);
        setOnClickListener();

        // Erstelle Recycler Adapter
        recyclerAdapter = new RecyclerAdapter(model.getSehenswürdigkeiten(), listener);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(recyclerAdapter);
    }

    /**
     * Erstellt einen Knopf auf der Sehenswürdigkeit der schaut ob auf diese Sehenswürdigkeit gecklickt wurde
     */
    void setOnClickListener() {
        listener = (view, position) -> {
            loadSehenswuerdigkeit(recyclerAdapter.getSehenswuerdigkeitenList().get(position));
        };
    }

    /**
     * Öffnet die Sehenwürdigkeit auf die gecklickt wurde
     * @param sehenswürdigkeit Die Sehenswürdigkeit auf die gecklickt wurde
     */
    void loadSehenswuerdigkeit(Sehenswürdigkeit sehenswürdigkeit) {
        // Lade neue Aktivität bzw VIEW
        Intent intent = new Intent(getApplicationContext(), ViewSehenwürdigkeit.class);

        // Informationen der neuen Aktivität geben
        intent.putExtra("Sehenswürdigkeit", sehenswürdigkeit);

        // Aktivität starten
        startActivity(intent);
    }

    /**
     * Sucht die Sehenswürdigkeit und gibt der recycler view eine gefilterte liste
     * @param text Die Sehenswürdigkeit nach der gesucht wird
     */
    private void filter(String text) {
        ArrayList<Sehenswürdigkeit> filterdList = new ArrayList<>();

        for (Sehenswürdigkeit s : model.getSehenswürdigkeiten()) {
            if(s.name.toLowerCase().contains(text.toLowerCase())) {
                filterdList.add(s);
            }
        }

        recyclerAdapter.filterdList(filterdList);
    }
}