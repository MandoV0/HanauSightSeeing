package com.example.hanausightseeing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);
        setContentView(R.layout.sehenswuerdigkeit_design);

        Controller c = new Controller(this);
    }

    public void updateSehenswuerdigkeiten(String[] sehenswuerdigkeiten) {
        TextView test = findViewById(R.id.sehenswürdigkeiten_name);
        test.setText(sehenswuerdigkeiten[1]);
    }
}