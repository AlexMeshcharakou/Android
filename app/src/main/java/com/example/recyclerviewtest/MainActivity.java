package com.example.recyclerviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView namesList = findViewById(R.id.rv_names);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        namesList.setLayoutManager(layoutManager);

        namesList.setHasFixedSize(true);

        NamesAdapter namesAdapter = new NamesAdapter(100);
        namesList.setAdapter(namesAdapter);

    }
}