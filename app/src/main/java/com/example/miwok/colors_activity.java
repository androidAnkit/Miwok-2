package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class colors_activity extends AppCompatActivity {
//
//    ArrayList<Word> colors;
//    private MediaPlayer mMediaPlayer;
//    AudioManager myAudioManager;
//
//    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
//        @Override
//        public void onCompletion(MediaPlayer mediaPlayer) {
//            // Now that the sound file has finished playing, release the media player resources.
//            releaseMediaPlayer();
//        }
//    };
//
//    private AudioManager.OnAudioFocusChangeListener mOnAudioFocusListener = new AudioManager.OnAudioFocusChangeListener() {
//        @Override
//        public void onAudioFocusChange(int focusChange) {
//            if(focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT || focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK){
//                mMediaPlayer.pause();
//                mMediaPlayer.seekTo(0);
//            }else if(focusChange == AudioManager.AUDIOFOCUS_GAIN){
//                mMediaPlayer.start();
//            }else if(focusChange == AudioManager.AUDIOFOCUS_LOSS){
//                releaseMediaPlayer();
//            }
//        }
//    };
//
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
                .replace(R.id.container,new ColorsFragment())
                .commit();

//        myAudioManager = (AudioManager)getSystemService(Context.AUDIO_SERVICE);
//
//
//        colors = new ArrayList<Word>();
//
//        colors.add(new Word("red","we???e??????i",R.drawable.color_red,R.raw.color_red));
//        colors.add(new Word("green","chokokki",R.drawable.color_green,R.raw.color_green));
//        colors.add(new Word("brown","???akaakki",R.drawable.color_brown,R.raw.color_brown));
//        colors.add(new Word("gray", "???opoppi",R.drawable.color_gray,R.raw.color_gray));
//        colors.add(new Word("black","kululli",R.drawable.color_black,R.raw.color_black));
//        colors.add(new Word("white","kelelli",R.drawable.color_white,R.raw.color_white));
//        colors.add(new Word("dusty yellow","???opiis??",R.drawable.color_dusty_yellow,R.raw.color_dusty_yellow));
//        colors.add(new Word("mustard yellow","chiwii?????",R.drawable.color_mustard_yellow,R.raw.color_mustard_yellow));
//
//        WordAdapter wordAdapter = new WordAdapter(this,colors, R.color.category_colors);
//        ListView listView = findViewById(R.id.listView);
//        listView.setAdapter(wordAdapter);
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                releaseMediaPlayer();
//                Word word = colors.get(position);
//                int result = myAudioManager.requestAudioFocus(mOnAudioFocusListener,AudioManager.STREAM_MUSIC,AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);
//                if(result == AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {
//                    mMediaPlayer = MediaPlayer.create(colors_activity.this, word.getAudioId());
//                    mMediaPlayer.start();
//                    mMediaPlayer.setOnCompletionListener(mCompletionListener);
//                }
//            }
//        });

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
//            myAudioManager.abandonAudioFocus(mOnAudioFocusListener);
//
//        }
//    }
}