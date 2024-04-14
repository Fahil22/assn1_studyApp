package com.example.assienment1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public static final String FLAG = "FLAG";
    public int FLAG0 = -1;

    private SharedPreferences prefs;
    private boolean flag = false;
    private SharedPreferences.Editor editor;
    RadioGroup levelG;
    RadioButton level1;
    RadioButton level2;
    RadioButton level3;
    Button confirm;
    CheckBox chk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        levelG = findViewById(R.id.levelG);
        level1 = findViewById(R.id.level1);
        level2 = findViewById(R.id.level2);
        level3 = findViewById(R.id.level3);

        confirm = findViewById(R.id.confirm);
        setupViews();
        setupSharedPrefs();
        checkPrefs();

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int check = levelG.getCheckedRadioButtonId();

                if (check == -1) {
                    Toast.makeText(MainActivity.this, "Please choose your level", Toast.LENGTH_SHORT).show();
                    return;
                } else {
                    if (level1.isChecked()) {
                        if (chk.isChecked()) {
                            editor.putInt(String.valueOf(FLAG0),levelG.getCheckedRadioButtonId());
                            editor.putInt("level",1);
                            editor.putBoolean(FLAG, true);
                            editor.commit();

                        }
                        String level1s = "level1";
                        Intent intent = new Intent(MainActivity.this, second.class);
                        intent.putExtra("Level1", level1s);
                        startActivity(intent);
                    } else if (level2.isChecked()) {
                        if (chk.isChecked()) {
                            editor.putInt(String.valueOf(FLAG0),levelG.getCheckedRadioButtonId());
                            editor.putInt("level",2);
                            editor.putBoolean(FLAG, true);
                            editor.commit();

                        }
                        String level2s = "level2";
                        Intent intent = new Intent(MainActivity.this, second.class);
                        intent.putExtra("Level2", level2s);
                        startActivity(intent);
                    } else {
                        if (chk.isChecked()) {
                            editor.putInt(String.valueOf(FLAG0),levelG.getCheckedRadioButtonId());
                            editor.putInt("level",3);
                            editor.putBoolean(FLAG, true);
                            editor.commit();

                        }
                        String level3s = "level3";
                        Intent intent = new Intent(MainActivity.this, second.class);
                        intent.putExtra("Level3", level3s);
                        startActivity(intent);
                    }
                }

            }
        });

    }

    private void checkPrefs() {
        flag = prefs.getBoolean(FLAG, false);
        int level = prefs.getInt("level",0);
        if (!flag || level!= -1) {
            chk.setChecked(true);
        if(level==1){
            level1.setChecked(true);
        } else if (level==2) {
            level2.setChecked(true);

        }
        else {
            level3.setChecked(true);
        }
        }
    }
    private void setupSharedPrefs() {
        prefs= PreferenceManager.getDefaultSharedPreferences(this);
        editor = prefs.edit();
    }
    private void setupViews() {
        chk = findViewById(R.id.chk);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}