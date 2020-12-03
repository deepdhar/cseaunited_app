package com.example.android.cseaunited;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("cseaunited '23 batch");

        TextView cr = (TextView)findViewById(R.id.cr);
        cr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, CrActivity.class);
                startActivity(i);
            }
        });

        TextView boys = (TextView) findViewById(R.id.boys);
        boys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, BoysActivity.class);
                startActivity(i);
            }
        });

        TextView girls = (TextView)findViewById(R.id.girls);
        girls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, GirlsActivity.class);
                startActivity(i);
            }
        });

    }
}