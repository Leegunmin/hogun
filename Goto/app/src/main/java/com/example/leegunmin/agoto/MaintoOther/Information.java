package com.example.leegunmin.agoto.MaintoOther;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.leegunmin.agoto.MaintoOther.information.term;
import com.example.leegunmin.agoto.R;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class Information extends AppCompatActivity {
    Button technique;
    Button terminology;
    String TAG = "gunmin : ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        technique = (Button)findViewById(R.id.technique);
        terminology = (Button)findViewById(R.id.term);

        terminology.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(Information.this,term.class);
                startActivity(intent);
            }
        });

        technique.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {

            }
        });
    }


        // String URL = "서버주소 서버주소 서버주소써줘어어어어";

}
