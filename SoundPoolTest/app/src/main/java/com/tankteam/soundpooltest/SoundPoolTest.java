package com.tankteam.soundpooltest;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import java.io.IOException;

public class SoundPoolTest extends AppCompatActivity {
    TextView txtSound=null;
    SoundPool soundPool;
    int explosionId = -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtSound = (TextView)findViewById(R.id.textView);
        soundPool = new SoundPool(20, AudioManager.STREAM_MUSIC, 0);
        txtSound.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    if (explosionId != -1) {
                        soundPool.play(explosionId, 1, 1, 0, 0, 1);
                    }
                }
                return true;
            }
        });
        setVolumeControlStream(AudioManager.STREAM_MUSIC);

        try {
            AssetManager assetManager = getAssets();
            AssetFileDescriptor descriptor = assetManager.openFd("explosion.mp3");
            explosionId = soundPool.load(descriptor, 1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
