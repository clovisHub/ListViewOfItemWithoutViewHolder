package com.example.user.listviewwithoutviewholder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private  ListView myListView;
    private ArrayList<String> myList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myList = new ArrayList();
        long answer = 0;
        long start = 389343;
        for(int i = 0; i<5000; i++){

            answer= start * (i+1);
            myList.add(""+answer);
            start = start +350;
        }

        myListView = (ListView) findViewById(R.id.myNoVhlist);

        ListAdapter adapterView = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_expandable_list_item_1,myList);

        myListView.setAdapter(adapterView);
    }
}
