package ru.gavr.android.hellomoon;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * @author Alexander Gavrilenko
 */
public class AudioPlayer {
    private MediaPlayer mPlayer;

    public void stop() {
        if (mPlayer != null) {
            mPlayer.release();
            mPlayer = null;
        }
    }

    public void play(Context context) {
        mPlayer = MediaPlayer.create(context ,R.raw.one_small_step);
        mPlayer.start();
    }
}
