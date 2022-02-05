package com.example.usermanegement;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.usermanegement.database.DBHandler;

import java.util.ArrayList;

public class ViewActivity extends AppCompatActivity {
    ListView ListView;
    DBHandler dbHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        listView = findViewById(R.id.listView);
        dbHandler = new DBHandler(this);
        ArrayList<String> list=dbHandler.getUsers() ;
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,R.layout.list_item,list);
        listView.setAdapter(adapter);
    }
}
