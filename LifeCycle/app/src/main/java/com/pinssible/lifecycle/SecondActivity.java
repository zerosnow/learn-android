package com.pinssible.lifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private Button m_btnSecondAct=null;
    private TextView m_txtSecondAct=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        System.out.println("SecondActivity-onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        this.m_txtSecondAct=(TextView)findViewById(R.id.txtSecondAct);
        this.m_btnSecondAct=(Button)findViewById(R.id.btnSecondAct);
        this.m_btnSecondAct.setOnClickListener(new ButtonListener());
        this.m_btnSecondAct.setText("返回MainActivity");
        this.m_txtSecondAct.setText("这是SecondActivity");
    }
    @Override
    protected void onDestroy(){
        System.out.println("SecondActivity-onDestroy");
        super.onDestroy();
    }
    @Override
    protected void onPause(){
        System.out.println("SecondActivity-onPause");
        super.onPause();
    }
    @Override
    protected void onRestart(){
        System.out.println("SecondActivity-onRestart");
        super.onRestart();
    }
    @Override
    protected void onResume(){
        System.out.println("SecondActivity-onResume");
        super.onResume();
    }
    @Override
    protected void onStart(){
        System.out.println("SecondActivity-onStart");
        super.onStart();
    }
    @Override
    protected void onStop(){
        System.out.println("SecondActivity-onStop");
        super.onStop();
    }
    class ButtonListener implements View.OnClickListener {
        @Override
        public void onClick(View v){
            Intent intent = new Intent();
            intent.setClass(SecondActivity.this, MainActivity.class);
            SecondActivity.this.startActivity(intent);
        }

    }
}
