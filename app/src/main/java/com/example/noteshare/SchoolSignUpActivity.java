package com.example.noteshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class SchoolSignUpActivity extends AppCompatActivity {

    EditText schoolObj, boardObj, gradeObj, locationObj;
    Button schoolBtn;

    FirebaseDatabase rootNode;
    DatabaseReference reference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_sign_up);



        schoolObj = findViewById(R.id.schoolId);
        boardObj = findViewById(R.id.boardId);
        gradeObj = findViewById(R.id.gradeId);
        locationObj = findViewById(R.id.locationId);
        schoolBtn = findViewById(R.id.schoolButton);

        schoolBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                rootNode = FirebaseDatabase.getInstance();
                reference = rootNode.getReference("users");

                Intent intent = new Intent(SchoolSignUpActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });

    }
}