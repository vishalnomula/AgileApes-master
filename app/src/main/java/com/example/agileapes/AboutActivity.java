package com.example.agileapes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    public void goBackToHomeScreen(View v) {
        Intent myIntent = new Intent(getBaseContext(), HomeActivity.class);
        startActivity(myIntent);
    }
}
