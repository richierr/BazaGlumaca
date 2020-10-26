package com.example.bazaglumaca;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.app.AppCompatActivity;




import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity  {
    private Toolbar toolbar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar=findViewById(R.id.my_toolbar);

        setSupportActionBar(toolbar);

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