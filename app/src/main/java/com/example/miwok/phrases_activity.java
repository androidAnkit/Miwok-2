package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class phrases_activity extends AppCompatActivity {
//
//    private MediaPlayer mMediaPlayer;
//    ArrayList<Word> phrases;
//    AudioManager myAudioManager;
//
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
//
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
                .replace(R.id.container,new PhrasesFragment())
                .commit();
//
//        myAudioManager = (AudioManager)getSystemService(Context.AUDIO_SERVICE);
//        phrases= new ArrayList<Word>();
//
//        phrases.add(new Word("Where are you going?","minto wuksus",R.raw.phrase_where_are_you_going));
//        phrases.add(new Word("What is your name?","tinn?? oyaase'n??",R.raw.phrase_what_is_your_name));
//        phrases.add(new Word("My name is...","oyaaset...",R.raw.phrase_my_name_is));
//        phrases.add(new Word("How are you feeling?","mich??ks??s?",R.raw.phrase_how_are_you_feeling));
//        phrases.add(new Word("I???m feeling good","kuchi achit",R.raw.phrase_im_feeling_good));
//        phrases.add(new Word("Are you coming?","????n??s'aa?",R.raw.phrase_are_you_coming));
//        phrases.add(new Word("Yes, I???m coming","h??????? ????n??m",R.raw.phrase_yes_im_coming));
//        phrases.add(new Word("I???m coming","????n??m",R.raw.phrase_im_coming));
//        phrases.add(new Word("Let???s go","yoowutis",R.raw.phrase_lets_go));
//        phrases.add(new Word("Come here","??nni'nem",R.raw.phrase_come_here));
//
//        WordAdapter wordAdapter = new WordAdapter(this,phrases, R.color.category_phrases);
//        ListView listView = findViewById(R.id.listView);
//        listView.setAdapter(wordAdapter);
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                releaseMediaPlayer();
//                Word word = phrases.get(position);
//
//                int result = myAudioManager.requestAudioFocus(mOnAudioFocusListener,AudioManager.STREAM_MUSIC,AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);
//
//                if(result == AudioManager.AUDIOFOCUS_REQUEST_GRANTED){
//                    mMediaPlayer=MediaPlayer.create(phrases_activity.this,word.getAudioId());
//                    mMediaPlayer.start();
//                    mMediaPlayer.setOnCompletionListener(mCompletionListener);
//                }
//
//
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