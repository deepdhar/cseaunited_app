package com.example.android.cseaunited;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class GirlsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_girls);
        setTitle("Girls");


        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Divyangana Ganguly", "7029319896", R.drawable.divya));
        words.add(new Word("Nivedita Prasad", "6202824378", R.drawable.nivi));
        words.add(new Word("Anouska Ghosh", "8927312971", R.drawable.anoushka));
        words.add(new Word("Abhilasha Gupta", "7384999670", R.drawable.abhilasha));
        words.add(new Word("Amisha Singh", "9547859572", R.drawable.amisha));
        words.add(new Word("Falguni Sarkar", "8839379964", R.drawable.falguni));


        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = (ListView)findViewById(R.id.listViewGirls);
        listView.setAdapter(adapter);
    }
}