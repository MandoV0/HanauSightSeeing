package com.example.hanausightseeing.controllers;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hanausightseeing.Sehenswürdigkeit;
import com.example.hanausightseeing.models.Model;
import com.example.hanausightseeing.views.MainActivity;
import com.example.hanausightseeing.views.ViewSehenwürdigkeit;

public class Controller extends AppCompatActivity {

    public Model model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        model = new Model();

        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);

    }
}