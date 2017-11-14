package com.example.alejandrotorresruiz.recycler_view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> names;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter myAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        names = devolverNombres();

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        myAdapter = new myAdapter(names,
                R.layout.myrecyclerview,MainActivity.this);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(myAdapter);
    }

    private List<String> devolverNombres(){
        return new ArrayList<String>(){{
            add("Prueba");
            add("Prueba");
            add("Prueba");
            add("Prueba");
            add("Prueba");
            add("Prueba");
            add("Prueba");
            add("Prueba");
            add("Prueba");
            add("Prueba");
            add("Prueba");
            add("Prueba");
            add("Prueba");
            add("Prueba");
            add("Prueba");
            add("Prueba");
        }};
    }
}


