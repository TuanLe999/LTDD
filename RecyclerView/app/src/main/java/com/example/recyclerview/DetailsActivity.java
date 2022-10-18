package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    TextView studentName= findViewById(R.id.studentname);;
    TextView birthYear = findViewById(R.id.birthyear);;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        if (bundle != null) {
            String name = bundle.getString("Name", "");
            int birthYear = bundle.getInt("birthYear", 0);
            this.studentName.setText(name);
            this.birthYear.setText(birthYear);
        }


    }
}