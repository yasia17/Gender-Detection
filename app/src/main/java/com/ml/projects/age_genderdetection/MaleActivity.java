package com.ml.projects.age_genderdetection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;



public class MaleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_male);



    }

    public void onBackButtonClick(View view) {
        // Handle the button click here
        // For example, you can return to the MainActivity
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}