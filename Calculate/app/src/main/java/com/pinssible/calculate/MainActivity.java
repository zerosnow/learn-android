package com.pinssible.calculate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnMultiply=null;
    private EditText leftNumber=null;
    private EditText rightNumber=null;
    private TextView result=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMultiply=(Button)findViewById(R.id.btnMultiply);
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int leftNum=Integer.parseInt(leftNumber.getText().toString());
                int rightNum=Integer.parseInt(rightNumber.getText().toString());
                result.setText("result is "+leftNum*rightNum);
            }
        });
        leftNumber=(EditText)findViewById(R.id.leftNumber);
        rightNumber=(EditText)findViewById(R.id.rightNumber);
        result=(TextView)findViewById(R.id.result);

    }
}
