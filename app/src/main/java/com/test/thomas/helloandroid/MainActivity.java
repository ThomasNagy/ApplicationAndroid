package com.test.thomas.helloandroid;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button1(View view){
       if(view.getId() == R.id.button1) {
            Intent NewAct = new Intent(this, Second.class);
            startActivity(NewAct);
        }
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

        switch(id){
            case R.id.menu_load:
                Toast.makeText(getApplicationContext(), " Game loaded succesusfly", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_save:
                //SharedPreferences saveGame = getSharedPreferences("mysavedGamefile", MODE_PRIVATE);
                //SharedPreferences.Editor editor = saveGame.edit();
                //editor.putInt("saved", player1).putInt("saved",player2);
                Toast.makeText(getApplicationContext(), " Game saved succesusfly", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_new:
                Toast.makeText(getApplicationContext(), " Game loaded succesusfly", Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
