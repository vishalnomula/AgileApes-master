package com.example.agileapes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class QuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
    }

    public void goBackToHomeScreen(View v) {
        Intent myIntent = new Intent(getBaseContext(), HomeActivity.class);
        startActivity(myIntent);
    }

    public void launchCorrectAnswer(View v) {
        Intent myIntent = new Intent(getBaseContext(), CorrectAnswerActivity.class);
        startActivity(myIntent);
    }

    public void launchIncorrectAnswer(View v) {
        Intent myIntent = new Intent(getBaseContext(), IncorrectAnswerActivity.class);
        startActivity(myIntent);
    }
}
