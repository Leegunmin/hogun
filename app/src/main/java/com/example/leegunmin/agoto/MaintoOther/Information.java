package com.example.leegunmin.agoto.MaintoOther;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.leegunmin.agoto.R;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Information extends AppCompatActivity {
    Button technique;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        technique = (Button)findViewById(R.id.technique);

        technique.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                SendByHttp("hi");
            }
        });
    }
    private String SendByHttp(String msg) {
        if(msg == null)
            msg = "";


        // String URL = "서버주소 서버주소 서버주소써줘어어어어";
        String URL = 	"http://data.mafra.go.kr:7080/openapi/sample/xml/Grid_20151001000000000232_1/1/5";
        DefaultHttpClient client = new DefaultHttpClient();
        try {
            /* 체크할 id와 pwd값 서버로 전송 */
            HttpPost post = new HttpPost(URL+"?msg="+msg);


            /* 지연시간 최대 3초 */
            HttpParams params = client.getParams();
            HttpConnectionParams.setConnectionTimeout(params, 3000);
            HttpConnectionParams.setSoTimeout(params, 3000);

            /* 데이터 보낸 뒤 서버에서 데이터를 받아오는 과정 */
            HttpResponse response = client.execute(post);
            BufferedReader bufreader = new BufferedReader(
                    new InputStreamReader(response.getEntity().getContent(),
                            "utf-8"));

            String line = null;
            String result = "";

            while ((line = bufreader.readLine()) != null) {
                result += line;
            }

            return result;
        } catch (Exception e) {
            e.printStackTrace();
            client.getConnectionManager().shutdown();    // 연결 지연 종료
            return "";
        }

    }

}
