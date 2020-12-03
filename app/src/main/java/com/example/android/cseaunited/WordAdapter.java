package com.example.android.cseaunited;

import android.content.Context;

import java.util.ArrayList;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Context context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View counterView, ViewGroup parent) {

        View listItemView = counterView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.listitem, parent, false);
        }

        Word currentWord = getItem(position);

        // name
        TextView nameTextView = (TextView)listItemView.findViewById(R.id.nameView);
        nameTextView.setText(currentWord.getName());

        // contact
        TextView contactTextView = (TextView)listItemView.findViewById(R.id.contactView);
        contactTextView.setText(currentWord.getNumber());

        ImageView imageView = (ImageView)listItemView.findViewById(R.id.imageView);
        if(currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getImage());
            imageView.setVisibility(View.VISIBLE);
        }
        else {
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
