package com.example.bivin.simplecontextmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btncontxt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btncontxt = findViewById(R.id.btncontext);
        registerForContextMenu(btncontxt);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.contextmenu,menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.item1){
            Toast.makeText(getApplicationContext(),"Context item1",Toast.LENGTH_LONG).show();

        }
        if(id==R.id.item2){
            Toast.makeText(getApplicationContext(),"Context item2",Toast.LENGTH_LONG).show();

        }
        if(id==R.id.item3){
            Toast.makeText(getApplicationContext(),"Context item3",Toast.LENGTH_LONG).show();

        }
        return super.onContextItemSelected(item);
    }
}
