package com.example.poloprojekt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text = findViewById(R.id.text);
        TextView pirostxt = findViewById(R.id.pirostxt);
        TextView kektxt = findViewById(R.id.kektxt);
        Button kekgomb = findViewById(R.id.kekgomb);
        Button pirosgomb = findViewById(R.id.pirosgomb);

        // PIROS
        pirosgomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, NewActivity2.class);
                i.putExtra("atadpiros", pirostxt.getText().toString());
                startActivity(i);
            }
        });

        // KÉK
        kekgomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, NewActivity.class);
                i.putExtra("atadkek", kektxt.getText().toString());
                startActivity(i);
            }
        });
    }
}