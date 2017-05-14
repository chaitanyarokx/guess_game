package com.example.chaitanya.guess.Activities;

import android.content.Intent;
import android.provider.BaseColumns;
import android.database.sqlite.*;
import android.os.Bundle;
import java.lang.Object;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;
import com.example.chaitanya.guess.R;

public class MainActivity extends AppCompatActivity
         {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageButton b1 = (ImageButton) findViewById(R.id.imageButton1);
        ImageButton b2 = (ImageButton) findViewById(R.id.imageButton2);
        ImageButton b3 = (ImageButton) findViewById(R.id.imageButton3);
        ImageButton b4 = (ImageButton) findViewById(R.id.imageButton4);
        ImageButton b5 = (ImageButton) findViewById(R.id.imageButton5);
        ImageButton b6 = (ImageButton) findViewById(R.id.imageButton6);
        ImageButton b7 = (ImageButton) findViewById(R.id.imageButton7);
        ImageButton b8 = (ImageButton) findViewById(R.id.imageButton8);
        ImageButton b9 = (ImageButton) findViewById(R.id.imageButton9);
        ImageButton b10 = (ImageButton) findViewById(R.id.imageButton10);
        ImageButton b11 = (ImageButton) findViewById(R.id.imageButton11);
        ImageButton b12 = (ImageButton) findViewById(R.id.imageButton12);
        ImageButton b13 = (ImageButton) findViewById(R.id.imageButton13);
        ImageButton b14 = (ImageButton) findViewById(R.id.imageButton14);

        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent eas = new Intent(getApplicationContext(), pop_b.class);
                eas.putExtra("lvl", "1");
                startActivity(eas);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                 Intent eas = new Intent(getApplicationContext(), pop_b.class);
                  eas.putExtra("lvl", "2");
                  startActivity(eas);
                }
        });
        b3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent eas = new Intent(getApplicationContext(), pop_b.class);
                eas.putExtra("lvl", "3");
                startActivity(eas);
            }
        });
        b4.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent eas = new Intent(getApplicationContext(), pop_b.class);
                eas.putExtra("lvl", "4");
                startActivity(eas);
            }
        });
        b5.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent eas = new Intent(getApplicationContext(), pop_b.class);
                eas.putExtra("lvl", "5");
                startActivity(eas);
            }
        });
        b6.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent eas = new Intent(getApplicationContext(), pop_b.class);
                eas.putExtra("lvl", "6");
                startActivity(eas);
            }
        });
        b7.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent eas = new Intent(getApplicationContext(), pop_b.class);
                eas.putExtra("lvl", "7");
                startActivity(eas);
            }
        });
        b8.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent eas = new Intent(getApplicationContext(), pop_b.class);
                eas.putExtra("lvl", "8");
                startActivity(eas);
            }
        });
        b9.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent eas = new Intent(getApplicationContext(), pop_b.class);
                eas.putExtra("lvl", "9");
                startActivity(eas);
            }
        });
        b10.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent eas = new Intent(getApplicationContext(), pop_b.class);
                eas.putExtra("lvl", "10");
                startActivity(eas);
            }
        });
        b11.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent eas = new Intent(getApplicationContext(), pop_b.class);
                eas.putExtra("lvl", "11");
                startActivity(eas);
            }
        });
        b12.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent eas = new Intent(getApplicationContext(), pop_b.class);
                eas.putExtra("lvl", "12");
                startActivity(eas);
            }
        });
        b13.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent eas = new Intent(getApplicationContext(), pop_b.class);
                eas.putExtra("lvl", "13");
                startActivity(eas);
            }
        });
        b14.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent eas = new Intent(getApplicationContext(), pop_b.class);
                eas.putExtra("lvl", "14");
                startActivity(eas);
            }
        });



    }
    

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
