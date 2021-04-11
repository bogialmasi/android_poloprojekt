package com.example.poloprojekt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class NewActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new2);

        TextView pirostxt = findViewById(R.id.pirostxt);
        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            pirostxt.setText(extras.getString("atadpiros") + " póló megvéve!");
        }
    }
}