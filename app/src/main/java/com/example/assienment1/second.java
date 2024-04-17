package com.example.assienment1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class second extends AppCompatActivity {
    TextView label;
    ListView listView;

    EditText editText;
    public String level;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        listView = findViewById(R.id.listveiw);
        label = findViewById(R.id.label);
        editText = findViewById(R.id.editText);

        Intent intent = getIntent();

        String Level1 = intent.getStringExtra("Level1");
        String Level2 = intent.getStringExtra("Level2");
        String Level3 = intent.getStringExtra("Level3");
        data db = new data();
        if (Level1 != null) {
            level = "level1";
            loadLevel1Data();
            label.setText("Level 1");

        }
        if (Level2 != null) {
            level = "level2";
            loadLevel2Data();
            label.setText("Level 2");

        }
        if (Level3 != null) {
            level = "level3";
            loadLevel3Data();
            label.setText("Level 3");

        }

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                course clickedCourse = (course) parent.getItemAtPosition(position);
                Toast.makeText(second.this, "Clicked: " + clickedCourse.name, Toast.LENGTH_SHORT).show();
                view.setBackgroundColor(Color.parseColor("#FFCC80"));
                String course = clickedCourse.name;
                Intent intent = new Intent(second.this, third.class);
                intent.putExtra("level", level);
                intent.putExtra("course", course);
                startActivity(intent);
            }
        });


        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {


            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                editText.setBackgroundColor(Color.parseColor("#FFFFFF"));

            }

            @Override
            public void afterTextChanged(Editable s) {
                editText.setBackgroundColor(Color.parseColor("#D09BF6"));

                if (level.equals("level1")) {
                    loadLevel1Data();
                } else if (level.equals("level2")) {
                    loadLevel2Data();
                } else if (level.equals("level3")) {
                    loadLevel3Data();
                }
            }
        });
    }

    private void loadLevel1Data() {
        data db = new data();
        List<course> result = db.getLevel1();
        String searchQuery = editText.getText().toString().trim();
        List<course> filteredCourses = new ArrayList<>();
        for (course Course : result) {
            if (Course.name.toLowerCase().contains(searchQuery.toLowerCase())) {
                filteredCourses.add(Course);
            }
        }
        ArrayAdapter<course> adapter = new ArrayAdapter<>(this,
                R.layout.list_view,
                filteredCourses);
        listView.setAdapter(adapter);
    }

    private void loadLevel2Data() {
        data db = new data();
        List<course> result = db.getLevel2();
        String searchQuery = editText.getText().toString().trim();
        List<course> filteredCourses = new ArrayList<>();
        for (course Course : result) {
            if (Course.name.toLowerCase().contains(searchQuery.toLowerCase())) {
                filteredCourses.add(Course);
            }
        }
        ArrayAdapter<course> adapter = new ArrayAdapter<>(this,
                R.layout.list_view,
                filteredCourses);
        listView.setAdapter(adapter);
    }

    private void loadLevel3Data() {
        data db = new data();
        List<course> result = db.getLevel3();
        String searchQuery = editText.getText().toString().trim();
        List<course> filteredCourses = new ArrayList<>();
        for (course Course : result) {
            if (Course.name.toLowerCase().contains(searchQuery.toLowerCase())) {
                filteredCourses.add(Course);
            }
        }
        ArrayAdapter<course> adapter = new ArrayAdapter<>(this,
                R.layout.list_view,
                filteredCourses);
        listView.setAdapter(adapter);
    }
}
