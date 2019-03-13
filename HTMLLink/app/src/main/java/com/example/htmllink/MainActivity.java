package com.example.htmllink;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView2=findViewById(R.id.tv2);
        textView2.setAutoLinkMask(Linkify.WEB_URLS);
        textView2.setText("程式中設定的URL:https://www.google.com.tw/");
    }
}
