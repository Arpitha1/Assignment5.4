package com.example.abhi.context_menu1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView context = (TextView) findViewById(R.id.tv);
        registerForContextMenu(context);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        menu.setHeaderTitle("Context Menu");
        getMenuInflater().inflate(R.menu.context_menu,menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.con1:
                Toast.makeText(this,"You selected content 1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.con2:
                Toast.makeText(this,"You selected content 2",Toast.LENGTH_SHORT).show();
                break;
            case R.id.con3:
                Toast.makeText(this,"You selected content 3",Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onContextItemSelected(item);
    }
}
