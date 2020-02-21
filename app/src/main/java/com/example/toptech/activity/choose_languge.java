package com.example.toptech.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.toptech.R;

public class choose_languge extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_languge);

        final ListView lv = findViewById(R.id.languages);

       final String [] lc = new String[] {"C","Android","Python","Java","PHP",".Net","C#","AI","Data Science"};

       ArrayAdapter<String> arrayAdapters = new ArrayAdapter<>(choose_languge.this,android.R.layout.simple_list_item_1,lc);
       lv.setAdapter(arrayAdapters);

       lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               String lg = String.valueOf(parent.getItemAtPosition(position));

                   Intent it = new Intent(choose_languge.this,com.example.toptech.viewActivity.view1.class);


                   startActivity(it);

           }
       });

    }
}
