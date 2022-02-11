package com.example.hanausightseeing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Controller c = new Controller(this);
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);
        setContentView(R.layout.sehenswuerdigkeit_design);

        Controller c = new Controller(this);
    }

    public void updateSehenswürdigkeiten(String[] sehenswürdigkeiten) {
        TextView test = findViewById(R.id.sehenswürdigkeiten_name);
        test.setText(sehenswürdigkeiten[1]);
    }
}