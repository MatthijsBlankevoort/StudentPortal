package com.example.matthijsblankevoort.studentportal;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton addButton;
    private ListView portalList;

    public static ArrayList<Portal> portals;
    public static ArrayAdapter<Portal> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addButton = findViewById(R.id.floatingActionButton);
        portals = new ArrayList<>();

        adapter = new ArrayAdapter<Portal>(this,
                android.R.layout.simple_list_item_1,
                portals);

        portalList = findViewById(R.id.portalsList);

        portalList.setAdapter(adapter);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CreatePortalActivity.class);
                startActivityForResult(intent, 1);
            }
        });
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK && requestCode == 1) {
            if (data != null) {
                String title = data.getStringExtra("title");
                String url = data.getStringExtra("url");
                Portal portal = new Portal(title, url);
                adapter.add(portal);
            }
        }
    }

}
