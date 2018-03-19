package com.example.groupviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView citiesListView;
    private Button addButton;
    private ArrayList<String> cities;
    private ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        citiesListView = findViewById(R.id.am_cities_lv);
        addButton = findViewById(R.id.am_add_btn);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cities.add("Kabul");
                arrayAdapter.notifyDataSetChanged();
            }
        });

        initDate();
         arrayAdapter = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_list_item_1,
                cities);
        citiesListView.setAdapter(arrayAdapter);
        citiesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                //cities.get(position);

            }
        });
    }

    private void initDate() {
        cities = new ArrayList<String>();
        cities.add("Astana");
        cities.add("Toronto");
        cities.add("Moscow");
        cities.add("Belgorod");

    }
}
