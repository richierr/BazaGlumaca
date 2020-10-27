package com.example.bazaglumaca;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;


import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.melegy.redscreenofdeath.RedScreenOfDeath;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity  {
    private Toolbar toolbar;
    private List<String> drawerList=new ArrayList<>();
    private NavigationView drawerLayout;


    private void addDrawerLayout(){
        drawerLayout=findViewById(R.id.my_drawer);
        ListView listView=findViewById(R.id.my_listview_dr);
        drawerList.add("Actors");
        drawerList.add("Settings");
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.my_list_item,drawerList);
        listView.setAdapter(adapter);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RedScreenOfDeath.init(getApplication());
        setContentView(R.layout.activity_main);
        Toolbar toolbar=findViewById(R.id.my_toolbar);

        setSupportActionBar(toolbar);
        addDrawerLayout();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.edit_actor){
            Toast.makeText(this,"edit actor",Toast.LENGTH_SHORT).show();
        }else if(item.getItemId()==R.id.add_actor){
            Toast.makeText(this,"add actor",Toast.LENGTH_SHORT).show();
        }else if(item.getItemId()==R.id.delete_actor){
            Toast.makeText(this,"deleted actor",Toast.LENGTH_SHORT).show();
        }




        return super.onOptionsItemSelected(item);
    }
}