package com.example.miwok;

import android.media.MediaPlayer;

public class Word {
   private String Mmiwok_translation;
   private String Mdefault_translation;
   private int AudioId;
    private int imageId = NO_IMAGE_PROVIDED;
    MediaPlayer mMediaPlayer;

    private static final int NO_IMAGE_PROVIDED = -1;


    public Word(String default_translation,String miwok_translation, int AudioId){
        this.Mmiwok_translation = miwok_translation;
        this.Mdefault_translation = default_translation;
        this.AudioId=AudioId;

    }

    public Word(String default_translation,String miwok_translation,int imageId, int AudioId){
        this.Mmiwok_translation = miwok_translation;
        this.Mdefault_translation = default_translation;
        this.imageId = imageId;
        this.AudioId=AudioId;
    }

    public String getMiwok_translation() {
        return Mmiwok_translation;
    }

    public String getdefault_translation() {
        return Mdefault_translation;
    }

    public int getimageid(){
        return imageId;
    }

    public boolean hasImage(){
        return imageId !=NO_IMAGE_PROVIDED ;
    }

    public int getAudioId(){ return AudioId ; }

    @Override
    public String toString() {
        return "Word{" +
                "Mmiwok_translation='" + Mmiwok_translation + '\'' +
                ", Mdefault_translation='" + Mdefault_translation + '\'' +
                ", AudioId=" + AudioId +
                ", imageId=" + imageId +
                '}';
    }

}
