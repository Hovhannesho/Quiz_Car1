package com.example.quizapp1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResulteActivity extends AppCompatActivity {

    TextView textView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resulte);
        textView = findViewById(R.id.textView);
        int score = getIntent().getIntExtra("Resulte",0);
        textView.setText("Score : " + score);

        findViewById(R.id.btn_restart).setOnClickListener(
                restart->{
                    Intent intent  = new Intent(ResulteActivity.this , MainActivity.class);
                    startActivity(intent);
                    finish();
                }
        );
    }
}