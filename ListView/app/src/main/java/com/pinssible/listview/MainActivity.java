package com.pinssible.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Object[] Acts={
            "文本框",1,
            "按钮",2,
            "时钟",3,
            "日期时间",4
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CharSequence[] strArrItemsNames=new CharSequence[Acts.length/2];
        for(int i=0;i<strArrItemsNames.length;i++){
            strArrItemsNames[i]=(String)Acts[i*2];
        }
        //设置菜单名称
        ArrayAdapter<CharSequence>adpItemsNames=new ArrayAdapter<CharSequence>
                (this,android.R.layout.simple_list_item_1,strArrItemsNames);
        ListView listMainListViewAct = (ListView)findViewById(R.id.listMainListViewAct);
        listMainListViewAct.setAdapter(adpItemsNames);
        listMainListViewAct.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this,(Class<?>)Acts[i*2+1]);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
