package com.example.leegunmin.agoto.MaintoOther.information;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.example.leegunmin.agoto.R;

import org.w3c.dom.Text;

public class showterm extends Activity {
    TextView termname;
    TextView termcontext;
    Button termclose;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            requestWindowFeature(Window.FEATURE_NO_TITLE);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.flags = WindowManager.LayoutParams.FLAG_DIM_BEHIND;
            layoutParams.dimAmount = 0.7f;
            getWindow().setAttributes(layoutParams);
            setContentView(R.layout.activity_showterm);
            termname = (TextView)findViewById(R.id.termname);
            termcontext = (TextView)findViewById(R.id.termcontext);
            termclose = (Button)findViewById(R.id.termclose);
            Intent intent = getIntent();
            String name = intent.getStringExtra("name");
            String context = intent.getStringExtra("context");
            termname.setText(name);
            termcontext.setText(context);
         termclose.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                finish();
            }
        });
    }




}
