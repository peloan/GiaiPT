package com.example.loan.menucontex;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity
{
    Button mContextMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContextMenu=(Button) findViewById(R.id.buttonContextMenu);
        //Dang kí context menu cho button
        registerForContextMenu(mContextMenu);


    }
    //nạp context menu vừa tạo cho ứng dụng
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo)
    {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.mymenu, menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // load file menu  ỏ đây.
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return true;
    }
    //Xử lý sự kiện khi click vào từng item
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.mDelete:
                Toast.makeText(getApplicationContext(),"Delete clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mEdit:
                Toast.makeText(getApplicationContext(),"Edit clicked", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onContextItemSelected(item);
    }
}
