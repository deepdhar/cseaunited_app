package com.example.android.cseaunited;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CrActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cr);
        setTitle("Class Representative (CR)");

        TextView deep = (TextView)findViewById(R.id.deep_dhar);
        deep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CrActivity.this, DeepActivity.class);
                startActivity(i);
            }
        });

        TextView alok = (TextView)findViewById(R.id.alok_kumar);
        alok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CrActivity.this, AlokActivity.class);
                startActivity(i);
            }
        });

        TextView shreya = (TextView)findViewById(R.id.shreya);
        shreya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CrActivity.this, ShreyaActivity.class);
                startActivity(i);
            }
        });

        TextView falguni = (TextView)findViewById(R.id.falguni_sarkar);
        falguni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CrActivity.this, FalguniActivity.class);
                startActivity(i);
            }
        });

    }
}