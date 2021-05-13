package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class family_activity extends AppCompatActivity {

//    private MediaPlayer mMediaPlayer;
//    ArrayList<Word> family;
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
//    private AudioManager.OnAudioFocusChangeListener onAudioListener = new AudioManager.OnAudioFocusChangeListener() {
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
                .replace(R.id.container,new FamilyFragment())
                .commit();
//
//        myAudioManager = (AudioManager)getSystemService(Context.AUDIO_SERVICE);
//
//
//        family = new ArrayList<Word>();
//
//        family.add(new Word("father","әpә",R.drawable.family_father,R.raw.family_father));
//        family.add(new Word("mother","әṭa",R.drawable.family_mother,R.raw.family_mother));
//        family.add(new Word("son","angsi",R.drawable.family_son,R.raw.family_son));
//        family.add(new Word("daughter", "tune",R.drawable.family_daughter,R.raw.family_daughter));
//        family.add(new Word("older brother","taachi",R.drawable.family_older_brother,R.raw.family_older_brother));
//        family.add(new Word("younger brother","chalitti",R.drawable.family_younger_brother,R.raw.family_younger_brother));
//        family.add(new Word("older sister","teṭe",R.drawable.family_older_sister,R.raw.family_older_sister));
//        family.add(new Word("younger sister","kolliti",R.drawable.family_younger_sister,R.raw.family_younger_sister));
//        family.add(new Word("grandmother","ama",R.drawable.family_grandmother,R.raw.family_grandmother));
//        family.add(new Word("grandfather","paapa",R.drawable.family_grandfather,R.raw.family_grandfather));
//
//        WordAdapter wordAdapter = new WordAdapter(this,family, R.color.category_family);
//        ListView listView = findViewById(R.id.listView);
//        listView.setAdapter(wordAdapter);
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                releaseMediaPlayer();
//                Word word = family.get(position);
//                int result = myAudioManager.requestAudioFocus(onAudioListener,AudioManager.STREAM_MUSIC,AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);
//                if(result == AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {
//                    mMediaPlayer = MediaPlayer.create(family_activity.this, word.getAudioId());
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
//            myAudioManager.abandonAudioFocus(onAudioListener);
//        }
//    }
}