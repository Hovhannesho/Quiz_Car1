package com.example.quizapp1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void main_btn(View view) {
        switch (view.getId()){

            case R.id.btn_play3:
                startActivity(new Intent(MainActivity.this , playActivity.class));
                break;
            case R.id.btn_setting1:
                startActivity(new Intent(MainActivity.this , settingActivity.class));

                break;
            case R.id.btn_exit1:
                this.finishAffinity();
                break;
        }
    }
}