package com.example.recyclerviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> ourNames = new ArrayList<>();
        ourNames.add("Vasya");
        ourNames.add("Lesha");
        ourNames.add("Julia");

        RecyclerView recyclerView = findViewById(R.id.rv_names);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setHasFixedSize(true);

        NamesAdapter namesAdapter = new NamesAdapter(ourNames);
        recyclerView.setAdapter(namesAdapter);
    }
}
