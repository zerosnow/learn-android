package com.pinssible.lifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    private TextView m_txtNewAct=null;
    private Button m_btnNewAct=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        System.out.println("MainActivity-onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.m_txtNewAct=(TextView)findViewById(R.id.txtNewAct);
        this.m_btnNewAct=(Button)findViewById(R.id.btnNewAct);
        this.m_btnNewAct.setOnClickListener(new ButtonListener());
        this.m_btnNewAct.setText("这是MainActivity");
        this.m_txtNewAct.setText("启动SecondActivity");
    }
    @Override
    protected void onDestroy(){
        System.out.println("MainActivity-onDestroy");
        super.onDestroy();
    }
    @Override
    protected void onPause(){
        System.out.println("MainActivity-onPause");
        super.onPause();
    }
    @Override
    protected void onRestart(){
        System.out.println("MainActivity-onRestart");
        super.onRestart();
    }
    @Override
    protected void onResume(){
        System.out.println("MainActivity-onResume");
        super.onResume();
    }
    @Override
    protected void onStart(){
        System.out.println("MainActivity-onStart");
        super.onStart();
    }
    @Override
    protected void onStop(){
        System.out.println("MainActivity-onStop");
        super.onStop();
    }
    class ButtonListener implements OnClickListener {
        @Override
        public void onClick(View v){
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, SecondActivity.class);
            MainActivity.this.startActivity(intent);
        }
    }
}
