package com.example.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class login_ing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_ing);
    }
    public void jumpToMainMenu(View v){
        Intent i = new Intent(this,Main_menu.class);
        startActivity(i);
    }
}
