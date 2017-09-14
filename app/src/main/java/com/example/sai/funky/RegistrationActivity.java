package com.example.sai.funky;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        final Button signin_button = (Button) findViewById(R.id.sigin);
        signin_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent siginIntent = new Intent(RegistrationActivity.this, LoginActivity.class);
                startActivity(siginIntent);

            }
        });
    }
}
