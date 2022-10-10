package com.example.apptonghop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageButton signIn_btn =(ImageButton) findViewById(R.id.back_button);
        signIn_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, SignInActivity.class);
                startActivity(intent);
            }
        });

        AppCompatButton viewProfile_btn =(AppCompatButton) findViewById(R.id.viewProfile_button);
        viewProfile_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, com.example.apptonghop.ProfileActivity.class);
                startActivity(intent);
            }
        });

        AppCompatButton viewListFr_btn =(AppCompatButton) findViewById(R.id.viewListFr_btn);
        viewListFr_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, com.example.apptonghop.MainActivity.class);
                startActivity(intent);
            }
        });
    }
}