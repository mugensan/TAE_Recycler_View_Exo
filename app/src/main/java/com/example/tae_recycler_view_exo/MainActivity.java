package com.example.tae_recycler_view_exo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Person> infoList;
    private RecyclerView rv_person_card_list;
    private PersonAdapter personAdapter;

    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv_person_card_list = findViewById(R.id.rv_person_card_list);

//        generatePersons();

    }


    public ArrayList<Person> generatePersons() {
        infoList = new ArrayList<>();

        for (int i = 0; i <= 60; i++) {
            Person person = new Person("K" + i, "R" + i, i, i);
            infoList.add(person);
        }
        Log.i(TAG,"This is the " + infoList.get(3).getFirstName() + " person");
        return infoList;
    }
}



