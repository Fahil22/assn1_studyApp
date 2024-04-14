package com.example.assienment1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class third extends AppCompatActivity {
    ListView tf;
    TextView lba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        tf = findViewById(R.id.tf);
        lba = findViewById(R.id.lb);

        Intent intent = getIntent();
        String level = intent.getStringExtra("level");
        String course = intent.getStringExtra("course");

        data db = new data();
        List<course> lb;
        if ("level1".equals(level)) {
            lb = db.getLevel1();
        } else if ("level2".equals(level)) {
            lb = db.getLevel2();
        } else {
            lb = db.getLevel3();
        }

        lba.setText(course);
        for (int i = 0; i < lb.size(); i++) {
            if (lb.get(i).name.equals(course)) {
                tf.setAdapter(new ArrayAdapter<>(this, R.layout.list2_view, lb.get(i).subject));
                break;
            }
        }
    }
}
