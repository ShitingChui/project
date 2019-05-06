package com.example.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class profile_edit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_edit);
    }

    public void jumpToProfileFirst(View v){
        Intent i = new Intent(this,profile.class);
        startActivity(i);
    }

    public void jumpToProfileSecond(View v){
        Intent i = new Intent(this,profile.class);
        startActivity(i);
    }

}
