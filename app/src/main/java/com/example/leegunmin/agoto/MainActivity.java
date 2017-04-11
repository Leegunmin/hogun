package com.example.leegunmin.agoto;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.leegunmin.agoto.MaintoOther.Information;
import com.example.leegunmin.agoto.MaintoOther.Like;
import com.example.leegunmin.agoto.MaintoOther.MyUnit;
import com.example.leegunmin.agoto.MaintoOther.TheOthers;
import com.example.leegunmin.agoto.MaintoOther.Turn;
import com.example.leegunmin.agoto.MaintoOther.Weather;

public class MainActivity extends Activity {
    Button myUnit;
    Button like;
    Button information;
    Button weather;
    Button turn;
    Button theothers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myUnit = (Button)findViewById(R.id.myUnit);
        like = (Button)findViewById(R.id.like);
        information = (Button)findViewById(R.id.information);
        weather = (Button)findViewById(R.id.weather);
        turn = (Button)findViewById(R.id.turn);
        theothers = (Button)findViewById(R.id.theothers);

        myUnit.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MyUnit.class);
                startActivity(intent);
            }
        });
        like.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Like.class);
                startActivity(intent);
            }
        });
        information.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Information.class);
                startActivity(intent);
            }
        });
        weather.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Weather.class);
                startActivity(intent);
            }
        });
        turn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Turn.class);
                startActivity(intent);
            }
        });
        theothers.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,TheOthers.class);
                startActivity(intent);
            }
        });
    }

}
