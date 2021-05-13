package com.example.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

 //   private static final String LOG_TAG = WordAdapter.class.getSimpleName();
    private int mbg_color;


    public WordAdapter(Activity context, ArrayList<Word> wordArrayList, int bg_color) {
        super(context, 0, wordArrayList);
        this.mbg_color= bg_color;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //return super.getView(position, convertView, parent);

        Word current_position = getItem(position);

        View wordView = convertView;

        if(wordView == null){
            wordView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        TextView miwok_textview = wordView.findViewById(R.id.miwok_words);

        miwok_textview.setText(current_position.getMiwok_translation());

        TextView english_textview = wordView.findViewById(R.id.english_words);

        english_textview.setText(current_position.getdefault_translation());

        ImageView imageView = wordView.findViewById(R.id.imageView);
        if(current_position.hasImage()) {

            imageView.setImageResource(current_position.getimageid());
            imageView.setVisibility(View.VISIBLE);
        }
        else{
         imageView.setVisibility(View.GONE);
        }

        View text_container = wordView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),mbg_color);
        text_container.setBackgroundColor(color);

        return wordView;

    }
}
