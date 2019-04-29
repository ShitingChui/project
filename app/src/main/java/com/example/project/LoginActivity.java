package com.example.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void jumpToScreenThree(View v){
        Intent i = new Intent(this,login_ing.class);
        startActivity(i);
    }

    public void jumpToLoginSet(View v){
        Intent i = new Intent(this,login_set.class);
        startActivity(i);
    }

}
