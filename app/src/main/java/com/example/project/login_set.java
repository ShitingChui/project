package com.example.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class login_set extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_set);
    }
    public void jumpToLoginIng(View v){
        Intent i = new Intent(this,login_ing.class);
        startActivity(i);
    }
    public void jumpToLogin(View v){
        Intent i = new Intent(this,LoginActivity.class);
        startActivity(i);
    }
}
