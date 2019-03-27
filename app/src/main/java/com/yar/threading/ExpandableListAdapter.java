package com.yar.threading;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListAdapter extends AppCompatActivity {

    HashMap<String, List<String>> movies;
    List<String> moviesList;
    ExpandableListView expandableListView;
    ListAdapter listAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expandable_list_adapter);

        expandableListView = findViewById(R.id.expandableListAdapter);
        movies = Data.getData();
        moviesList = new ArrayList<>(movies.keySet());
        listAdapter = new ListAdapter(this, movies, moviesList);
        expandableListView.setAdapter(listAdapter);


    }
}
