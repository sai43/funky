package com.example.sai.funky;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final Button signup_button = (Button) findViewById(R.id.signup);
        signup_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Start NewActivity.class
                Intent singupIntent = new Intent(LoginActivity.this,
                        RegistrationActivity.class);
                startActivity(singupIntent);            }
        });
    }
}
