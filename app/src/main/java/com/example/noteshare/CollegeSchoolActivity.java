package com.example.noteshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CollegeSchoolActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_college_school);

        findViewById(R.id.college).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(CollegeSchoolActivity.this, CollegeSignUpActivity.class);
                startActivity(intent);

            }
        });
        findViewById(R.id.school).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CollegeSchoolActivity.this, SchoolSignUpActivity.class);
                startActivity(intent);
            }
        });
    }
}