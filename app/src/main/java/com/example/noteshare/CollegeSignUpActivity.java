package com.example.noteshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class CollegeSignUpActivity extends AppCompatActivity {


    EditText collegeObj, universityObj, sessionObj, locationObj;
    Button collegeBtn;

    FirebaseDatabase rootNode;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_college_sign_up);

        collegeObj = findViewById(R.id.collegeID);
        universityObj = findViewById(R.id.universityID);
        sessionObj = findViewById(R.id.sessionID);
        locationObj = findViewById(R.id.locationID);
        collegeBtn = findViewById(R.id.collegeButton);

        collegeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                rootNode = FirebaseDatabase.getInstance();
                reference = rootNode.getReference("college_users");

                String college = collegeObj.getText().toString();
                String university = universityObj.getText().toString();
                String session = sessionObj.getText().toString();
                String locationC = locationObj.getText().toString();

                collegeHelper college_helper=new collegeHelper(college, university, session, locationC);
                reference.setValue(college_helper);


                Intent intent = new Intent(CollegeSignUpActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });

    }
}