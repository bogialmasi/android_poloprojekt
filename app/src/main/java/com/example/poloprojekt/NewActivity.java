package com.example.poloprojekt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        TextView kektxt = findViewById(R.id.kektxt);
        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            kektxt.setText(extras.getString("Köszönjük a vásárlást, megvette a KÉK Pólót!"));
        }
    }
}