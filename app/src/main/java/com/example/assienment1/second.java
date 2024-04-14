package com.example.assienment1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.List;

public class second extends AppCompatActivity {
    TextView label;
    ListView listveiw;
public  String level;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        listveiw = findViewById(R.id.listveiw);
         label = findViewById(R.id.label);


        Intent intent = getIntent();

        String Level1 = intent.getStringExtra("Level1");
        String Level2 = intent.getStringExtra("Level2");
        String Level3 = intent.getStringExtra("Level3");
data db = new data();
        if (Level1!=null) {
             level="level1";

            List<course> result = db.getLevel1();
            course[] arr = result.toArray(new course[result.size()]);
            ArrayAdapter<course> adapter = new ArrayAdapter<>(this,
                    R.layout.list_view,
                    arr);
            listveiw.setAdapter(adapter);
            label.setText("LeveL1");

        }
        if (Level2!=null){
            List<course> result = db.getLevel2();
            course[] arr = result.toArray(new course[result.size()]);
            ArrayAdapter<course> adapter = new ArrayAdapter<>(this,
                    R.layout.list_view,
                    arr);
            listveiw.setAdapter(adapter);
            level="level2";
            label.setText("LeveL2");

        }
        if (Level3!=null){
            List<course> result = db.getLevel3();
            course[] arr = result.toArray(new course[result.size()]);
            ArrayAdapter<course> adapter = new ArrayAdapter<>(this,
                    R.layout.list_view,
                    arr);
            listveiw.setAdapter(adapter);
            level="level3";
            label.setText("LeveL3");

        }
        listveiw.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                course clickedCourse = (course) parent.getItemAtPosition(position);
                Toast.makeText(second.this, "Clicked: " + clickedCourse.name, Toast.LENGTH_SHORT).show();


                String course = clickedCourse.name;
                Intent intent = new Intent(second.this,third.class);
                intent.putExtra("level",level);
                intent.putExtra("course",course);
                startActivity(intent);


            }
        });
    }


    }


