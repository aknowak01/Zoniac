package com.example.data;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;


public class TimeActivity extends AppCompatActivity {

    DateCreator date = new DateCreator();
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.action_bar_layout);
        refresh();
    }
    void refresh(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                TextView text1 =(TextView) findViewById(R.id.timeLocal);
                TextView text2 =(TextView) findViewById(R.id.textView2);
                TextView text3 =(TextView) findViewById(R.id.textView3);
                TextView text4 =(TextView) findViewById(R.id.textView4);
                text1.setText("Local time"+"  "+date.cityTime("local"));
                text2.setText("London Time"+"  "+date.cityTime("London"));
                text3.setText("New York Time"+"  "+date.cityTime("New York"));
                text4.setText("Tokyo Time"+"  "+date.cityTime("Tokyo"));
                refresh();

            }
        }, 200);
    }

}

