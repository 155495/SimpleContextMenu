# SimpleContextMenu
# :heart: *MainActivity.java*
```java
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
```
# :heart: *main_activity.xml*
```xml
<?xml version="1.0" encoding="utf-8"?>
<android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">


    <Button
        android:id="@+id/btncontext"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="198dp"
        android:text="Context Buttton"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />
</android.support.constraint.ConstraintLayout>
```
# :heart: *contexmenu.xml*
```xml
<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:android="http://schemas.android.com/apk/res/android">

    <item
        android:title="Item1"
        android:id="@+id/item1"/>
    <item
        android:title="Item2"
        android:id="@+id/item2"/>
    <item
        android:title="Item3"
        android:id="@+id/item3"/>
</menu>
```
