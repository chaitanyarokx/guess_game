package com.example.chaitanya.guess.Activities;
import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.chaitanya.guess.R;

/**
 * Created by chaitanya on 06/04/17.
 */


public class pop_b extends Activity {
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Intent g = getIntent();
        String x = g.getStringExtra("lvl");
        if(x.equalsIgnoreCase("1")) {
            setContentView(R.layout.popwinb1);
            Button but1 =(Button) findViewById(R.id.button1);
            but1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent eas = new Intent(pop_b.this, pop_next.class);
                    eas.putExtra("lvl", "1");
                    startActivity(eas);
                }
            });
        }
        if(x.equalsIgnoreCase("2")) {
            setContentView(R.layout.popwinb2);
            TextView t = (TextView)findViewById(R.id.textView);
            //t.setText();
            Button but2 =(Button) findViewById(R.id.button2);
            but2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent eas = new Intent(pop_b.this, pop_next.class);
                    eas.putExtra("lvl", "2");
                    startActivity(eas);
                }
            });
        }
        if(x.equalsIgnoreCase("3")) {
            setContentView(R.layout.popwinb3);
            Button but3 =(Button) findViewById(R.id.button3);
            but3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent eas = new Intent(pop_b.this, pop_next.class);
                    eas.putExtra("lvl", "3");
                    startActivity(eas);
                }
            });
        }
        if(x.equalsIgnoreCase("4")) {
            setContentView(R.layout.popwinb4);
            Button but4 =(Button) findViewById(R.id.button4);
            but4.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent eas = new Intent(pop_b.this, pop_next.class);
                    eas.putExtra("lvl", "4");
                    startActivity(eas);
                }
            });
        }
        if(x.equalsIgnoreCase("5")) {
            setContentView(R.layout.popwinb5);
            Button but5 =(Button) findViewById(R.id.button5);
            but5.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent eas = new Intent(pop_b.this, pop_next.class);
                    eas.putExtra("lvl", "5");
                    startActivity(eas);
                }
            });
        }
        if(x.equalsIgnoreCase("6")) {
            setContentView(R.layout.popwinb6);
            Button but6 =(Button) findViewById(R.id.button6);
            but6.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent eas = new Intent(pop_b.this, pop_next.class);
                    eas.putExtra("lvl", "6");
                    startActivity(eas);
                }
            });
        }
        if(x.equalsIgnoreCase("7")) {
            setContentView(R.layout.popwinb7);
            Button but7 =(Button) findViewById(R.id.button7);
            but7.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent eas = new Intent(pop_b.this, pop_next.class);
                    eas.putExtra("lvl", "7");
                    startActivity(eas);
                }
            });
        }
        if(x.equalsIgnoreCase("8")) {
            setContentView(R.layout.popwinb8);
            Button but8 =(Button) findViewById(R.id.button8);
            but8.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent eas = new Intent(pop_b.this, pop_next.class);
                    eas.putExtra("lvl", "8");
                    startActivity(eas);
                }
            });
        }
        if(x.equalsIgnoreCase("9")) {
            setContentView(R.layout.popwinb9);
            Button but9 =(Button) findViewById(R.id.button9);
            but9.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent eas = new Intent(pop_b.this, pop_next.class);
                    eas.putExtra("lvl", "9");
                    startActivity(eas);
                }
            });
        }
        if(x.equalsIgnoreCase("10")) {
            setContentView(R.layout.popwinb10);
            Button but10 =(Button) findViewById(R.id.button10);
            but10.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent eas = new Intent(pop_b.this, pop_next.class);
                    eas.putExtra("lvl", "10");
                    startActivity(eas);
                }
            });
        }
        if(x.equalsIgnoreCase("11")) {
            setContentView(R.layout.popwinb11);
            Button but11 =(Button) findViewById(R.id.button11);
            but11.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent eas = new Intent(pop_b.this, pop_next.class);
                    eas.putExtra("lvl", "11");
                    startActivity(eas);
                }
            });
        }
        if(x.equalsIgnoreCase("12")) {
            setContentView(R.layout.popwinb12);
            Button but12 =(Button) findViewById(R.id.button12);
            but12.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent eas = new Intent(pop_b.this, pop_next.class);
                    eas.putExtra("lvl", "12");
                    startActivity(eas);
                }
            });

        }
        if(x.equalsIgnoreCase("13")) {
            setContentView(R.layout.popwinb13);
            Button but13 =(Button) findViewById(R.id.button13);
            but13.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent eas = new Intent(pop_b.this, pop_next.class);
                    eas.putExtra("lvl", "13");
                    startActivity(eas);
                }
            });
        }
        if(x.equalsIgnoreCase("14")) {
            setContentView(R.layout.popwinb14);
            Button but14 =(Button) findViewById(R.id.button14);
            but14.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent eas = new Intent(pop_b.this, pop_next.class);
                    eas.putExtra("lvl", "14");
                    startActivity(eas);
                }
            });
        }
        DisplayMetrics dm =new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width=(dm.widthPixels);
        int height=dm.heightPixels;
        getWindow().setLayout( (int) (width *.8) ,(int) (height * .6));
    }

}