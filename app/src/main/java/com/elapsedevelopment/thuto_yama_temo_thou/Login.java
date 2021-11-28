package com.elapsedevelopment.thuto_yama_temo_thou;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    TextView btnForgot, btnSignUp;

    Button loginBtn;
    


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnForgot = findViewById(R.id.text_forgot);
        loginBtn = findViewById(R.id.loginbtn);

        btnSignUp = findViewById(R.id.text_signUp);

        String text = "Click here to Sign Up!";

        SpannableString ss = new SpannableString(text);

        ForegroundColorSpan fscBlue = new ForegroundColorSpan(getResources().getColor(R.color.primary_color));

        ss.setSpan(fscBlue, 6, 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        btnSignUp.setText(ss);

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), SignUP.class);
                startActivity(i);
            }
        });

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Dashboard.class);
                startActivity(i);
            }
        });

        btnForgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ForgotPassword.class);
                startActivity(i);
            }
        });


    }
}