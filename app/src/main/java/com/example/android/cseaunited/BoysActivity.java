package com.example.android.cseaunited;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class BoysActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boys);
        setTitle("Boys");



        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Aniket Deb", "8509094502", R.drawable.aniket));
        words.add(new Word("Alok Kumar Sah", "7001252846/ 7076349455", R.drawable.alokx));
        words.add(new Word("Aditya Singh", "7001546107", R.drawable.aditya));
        words.add(new Word("Alok Kumar", "8228863251/ 7982127847", R.drawable.alok2));
        words.add(new Word("Anurag Das", "6295316292", R.drawable.anurag));
        words.add(new Word("Karan Sharma", "7001353485", R.drawable.karan));
        words.add(new Word("Akshat Kumar Gupta", "8101162938", R.drawable.akshat));
        words.add(new Word("Agniva Sengupta", "9531745372", R.drawable.agniva));
        words.add(new Word("Mohammed Sahil", "7047493260", R.drawable.sahil));
        words.add(new Word("Chinmoy Biswas", "90640937784/ 7584926671", R.drawable.chinmoy));
        words.add(new Word("Deep Dhar", "7001751010", R.drawable.deep2));
        words.add(new Word("Diptarka Bhattcharya", "9614207876", R.drawable.diptarka));
        words.add(new Word("Debarko Ghosh", "9474818968/ 7001593730", R.drawable.debarko));
        words.add(new Word("Nilasish", "8145228295/ 7908086985", R.drawable.nilashish));
        words.add(new Word("Kundan Gupta","9973477705", R.drawable.kundan));
        words.add(new Word("Jamil Akhtar", "8761071760", R.drawable.jamil));
        words.add(new Word("Aabhash Jain", "9674530059", R.drawable.aabhash));
        words.add(new Word("Aritra Kumar Dattachowdhury", "8637355510", R.drawable.aritra));
        words.add(new Word("Pritam Paul", "9679874114", R.drawable.pritam));
        words.add(new Word("Harsh Kumar", "7909008107", R.drawable.harsh));
        words.add(new Word("Harshvardhan", "8789661602", R.drawable.harshvardhan));
        words.add(new Word("Ashutosh Singh Rathore", "7992370279", R.drawable.ashutosh));
        words.add(new Word("Chirag Agarwalla", "8670735440", R.drawable.chirag));
//        words.add(new Word("Paramhans Shah", "7431068960"));
        words.add(new Word("Pawan Kumar Sah", "9679427449", R.drawable.pawan_sah));
        words.add(new Word("Pawan Kumar Gupta", "6294701899", R.drawable.pawan_gupta));
        words.add(new Word("Piush Prakash", "6205678052", R.drawable.piush));

        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = (ListView)findViewById(R.id.listViewBoys);
        listView.setAdapter(adapter);
    }
}