package com.example.mygame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import com.example.mygame.adapter.ButtonAdapter;
import com.example.mygame.model.ButtonModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private GridView gridView;
    private ButtonAdapter buttonAdapter;
    private ArrayList<ButtonModel> buttonList;
    private ArrayList<Integer> randomNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();

        buttonAdapter = new ButtonAdapter(MainActivity.this, R.layout.grid_item, buttonList);
        gridView.setAdapter(buttonAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, buttonList.get(i).getBtnText(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void addControls() {

        gridView = findViewById(R.id.my_grid_view);

        randomNumber = RandomNumber.generate(100);
        buttonList = new ArrayList<>();

        for (Integer i : randomNumber) {
            buttonList.add(new ButtonModel(i.toString()));
        }
    }
}