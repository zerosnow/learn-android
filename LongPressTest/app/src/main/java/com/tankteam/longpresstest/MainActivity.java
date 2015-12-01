package com.tankteam.longpresstest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnLongPress=null;
    private TextView txtLongPress=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLongPress=(Button)findViewById(R.id.button);
        txtLongPress=(TextView)findViewById(R.id.text);
        btnLongPress.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction()==2)
                    txtLongPress.setTextSize(txtLongPress.getTextSize()*(float)1.00000000001);
                else
                    txtLongPress.setTextSize(30);
                txtLongPress.setText(String.valueOf(motionEvent.getAction()));
                return true;
            }
        });
    }
}
