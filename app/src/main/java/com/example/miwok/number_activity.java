package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class number_activity extends AppCompatActivity {
//private MediaPlayer mMediaPlayer;
//ArrayList<Word> words;
//    AudioManager myAudioManger;
//
// private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
//        @Override
//        public void onCompletion(MediaPlayer mediaPlayer) {
//            // Now that the sound file has finished playing, release the media player resources.
//            releaseMediaPlayer();
//        }
//    };
//
//    private AudioManager.OnAudioFocusChangeListener onAudioFocusListener = new AudioManager.OnAudioFocusChangeListener() {
//     @Override
//     public void onAudioFocusChange(int focusChange) {
//         if(focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT || focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK){
//             mMediaPlayer.pause();
//             mMediaPlayer.seekTo(0);
//         }else if(focusChange == AudioManager.AUDIOFOCUS_GAIN){
//             mMediaPlayer.start();
//         }else if(focusChange == AudioManager.AUDIOFOCUS_LOSS){
//             releaseMediaPlayer();
//         }
//     }
// };


//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        releaseMediaPlayer();
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitycategory);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container,new NumberFragment())
                .commit();

//        myAudioManger = (AudioManager)getSystemService(Context.AUDIO_SERVICE);
//
//
//
//        words = new ArrayList<Word>();
//        words.add(new Word("one","lutti",R.drawable.number_one,R.raw.number_one));
//        words.add(new Word("two","otiiko",R.drawable.number_two,R.raw.number_two));
//        words.add(new Word("three","tolookosu",R.drawable.number_three,R.raw.number_three));
//        words.add(new Word("four","oyyisa",R.drawable.number_four,R.raw.number_four));
//        words.add(new Word("five","massokka",R.drawable.number_five,R.raw.number_five));
//        words.add(new Word("six","temmokka",R.drawable.number_six,R.raw.number_six));
//        words.add(new Word("seven","kenekaku",R.drawable.number_seven,R.raw.number_seven));
//        words.add(new Word("eight","kawinta",R.drawable.number_eight,R.raw.number_eight));
//        words.add(new Word("nine","wo’e",R.drawable.number_nine,R.raw.number_nine));
//        words.add(new Word("ten","na’aacha",R.drawable.number_ten,R.raw.number_ten));
//
//
//        WordAdapter wordAdapter = new WordAdapter(this,words,R.color.category_numbers);
//        ListView listView = findViewById(R.id.listView);
//        listView.setAdapter(wordAdapter);
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                releaseMediaPlayer();
//                Word word = words.get(position);
//                Log.v("Number Activity ",word.toString());
//               int result =  myAudioManger.requestAudioFocus(onAudioFocusListener,AudioManager.STREAM_MUSIC,AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);
//               if(result == AudioManager.AUDIOFOCUS_REQUEST_GRANTED){
//                    mMediaPlayer = MediaPlayer.create(number_activity.this, word.getAudioId());
//                    mMediaPlayer.start();
//                    mMediaPlayer.setOnCompletionListener(mCompletionListener);
//
//                }
//
//            }
//        });



 //       LinearLayout rootView = findViewById(R.id.linear_id);
//        TextView childView = new TextView(this);
//        childView.setText(words.get(0));
//        rootView.addView(childView);
//
//        TextView childView2 = new TextView(this);
//        childView2.setText(words.get(1));
//        rootView.addView(childView2);


//        int index= 0;
     //   TextView childView3 = new TextView(this);
//        while(index < words.size()){
//            TextView childView = new TextView(this);
//            childView.setText(words.get(index));
//            rootView.addView(childView);
//            index++;
//
//        }

//
//        for(index = 0 ; index < words.size(); index++){
//            TextView childView = new TextView(this);
//            childView.setText(words.get(index));
//            rootView.addView(childView);
//        }


      //  ArrayAdapter<String> listAdapter = new ArrayAdapter<String >(this, android.R.layout.activity_list_item,words);
//
//        ListView listView = findViewById(R.id.listView);
//        listView.setAdapter(listAdapter);

//        GridView gridView = findViewById(R.id.gridView);
//        gridView.setAdapter(listAdapter);


    }

//    public void releaseMediaPlayer() {
//        // If the media player is not null, then it may be currently playing a sound.
//        if (mMediaPlayer != null) {
//            // Regardless of the current state of the media player, release its resources
//            // because we no longer need it.
//            mMediaPlayer.release();
//
//            // Set the media player back to null. For our code, we've decided that
//            // setting the media player to null is an easy way to tell that the media player
//            // is not configured to play an audio file at the moment.
//            mMediaPlayer = null;
//
//            myAudioManger.abandonAudioFocus(onAudioFocusListener);
//        }
//    }
}