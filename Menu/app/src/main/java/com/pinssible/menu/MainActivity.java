package com.pinssible.menu;

import android.app.AlertDialog;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final int GROUP1=1;
    private static final int GROUP2=2;
    private static final int ITEM1=1;
    private static final int ITEM2=2;
    private static final int ITEM3=3;
    private static final int ITEM4=4;
    private static final int ITEM5=5;
    private static final int ITEM6=6;
    private static final int ITEM7=7;
    private static final int ITEM8=8;
    private Button m_btnContextAct=null;
    private TextView m_txtContextAct=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        m_btnContextAct = (Button)findViewById(R.id.btnContextAct);
        m_txtContextAct = (TextView)findViewById(R.id.txtContentAct);
        registerForContextMenu(m_btnContextAct);
    }

    @Override
    public  void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu,v,menuInfo);
        menu.setHeaderTitle("上下文菜单");
        menu.add(0, ITEM1, 0, "苹果");
        menu.add(1, ITEM2, 1, "梨子");
        menu.add(2,ITEM3,2,"香蕉");
    }
    @Override
    public boolean onContextItemSelected(MenuItem item){
        switch(item.getItemId()){
            case ITEM1:
                m_txtContextAct.setText("选中：苹果");
                return true;
            case ITEM2:
                m_txtContextAct.setText("选择：梨子");
                return true;
            case ITEM3:
                m_txtContextAct.setText("选中：香蕉");
                return true;
        }
        return false;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        super.onCreateOptionsMenu(menu);
//        menu.add(GROUP1, ITEM1, Menu.NONE, "春").setShortcut('1', 'a');
//        menu.add(GROUP1, ITEM2, Menu.NONE, "夏").setShortcut('2', 'b');
//        menu.add(GROUP1, ITEM3, Menu.NONE, "秋").setShortcut('3', 'c');
//        menu.add(GROUP1, ITEM4, Menu.NONE, "冬").setShortcut('4', 'd');
//        menu.add(GROUP1, ITEM5, Menu.NONE, "东").setShortcut('5', 'e');
//        menu.add(GROUP1, ITEM6, Menu.NONE, "南").setShortcut('6', 'f');
        SubMenu subMenu1 = menu.addSubMenu(GROUP2, ITEM7, Menu.NONE, "西");
        SubMenu subMenu2 = menu.addSubMenu(GROUP2, ITEM8, Menu.NONE, "北");
        subMenu1.add(GROUP1, ITEM1, Menu.NONE, "春").setShortcut('1', 'a');
        subMenu1.add(GROUP1, ITEM2, Menu.NONE, "夏").setShortcut('2', 'b');
        subMenu1.add(GROUP1, ITEM3, Menu.NONE, "秋").setShortcut('3', 'c');
        subMenu2.add(GROUP1, ITEM4, Menu.NONE, "冬").setShortcut('4', 'd');
        subMenu2.add(GROUP1, ITEM5, Menu.NONE, "东").setShortcut('5', 'e');
        subMenu2.add(GROUP1, ITEM6, Menu.NONE, "南").setShortcut('6', 'f');

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        String strTitle = item.getTitle().toString();
        showAlertDialog(strTitle);
        return super.onOptionsItemSelected(item);
    }

    private void showAlertDialog(String strMessage) {
        new AlertDialog.Builder(this)
        .setTitle("您的选择：").setMessage(strMessage).setPositiveButton("关闭",null).show();
    }
}
