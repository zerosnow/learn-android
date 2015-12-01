package com.pinssible.intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {
    private Button btn=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.button);
        btn.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.baidu.com"));
                startActivity(intent);
            }
        });
    }
}
