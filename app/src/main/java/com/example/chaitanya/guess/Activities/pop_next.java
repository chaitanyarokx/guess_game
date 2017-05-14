package com.example.chaitanya.guess.Activities;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.chaitanya.guess.DatabaseHandler;
import com.example.chaitanya.guess.R;

public class pop_next extends Activity {

    DatabaseHandler db = new DatabaseHandler(this);
    private String updateTextView(int n){

        db.setLVL(n);
        return db.getQuestion();

    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_next);
        final TextView t = (TextView)findViewById(R.id.fullscreen_content);
        final Button B = (Button)findViewById(R.id.B);
        Intent g = getIntent();
        String x = g.getStringExtra("lvl");
        final int ch=Integer.parseInt(x);

        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = updateTextView(ch);
                t.setText(s);
            }
        });
        t.setText(updateTextView(ch));
        Thread thread = new Thread(){

            public void run(){
                try{
                        while(!isInterrupted())
                        {
                            Thread.sleep(1000);
                            runOnUiThread(new Runnable()
                            {
                                public void run(){
                                    try {
                                        t.setText(" 5 ");
                                        sleep(20000);
                                        t.setText(" 4 ");
                                        sleep(50000);
                                        t.setText(" 3 ");
                                        sleep(50000);
                                        t.setText(" 2 ");
                                        sleep(5000);
                                        t.setText(" 1 ");
                                        sleep(5000);
                                        String s = updateTextView(ch);
                                        t.setText(s);
                                    }catch(InterruptedException e){}
                                }
                            });
                        }
                }catch (InterruptedException e)
                {}

            }

        };



    }
    public void onBackPressed() {

        doExit();
    }
    private void doExit() {

        AlertDialog.Builder alertDialog = new AlertDialog.Builder(
                pop_next.this);

        alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        alertDialog.setNegativeButton("No", null);

        alertDialog.setMessage("Do you want to exit this game?");
        //alertDialog.setTitle("Quit");
        alertDialog.show();
    }


}
