package com.example.ch04_ex2;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button btn1,btn2,btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);

        btn1.setOnClickListener(listener);
        btn2.setOnClickListener(listener);
        btn3.setOnClickListener(listener);
        btn4.setOnClickListener(listener);
    }

    public Button.OnClickListener listener = new Button.OnClickListener() {

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn1:
                    new AlertDialog.Builder(MainActivity.this).setTitle("顯示視窗")
                            .setMessage("你按了「按鈕一」\n按「確定」鈕關閉對話方塊")
                            .setPositiveButton("確定", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                }
                            })
                            .show();
                    break;
                case R.id.btn2:
                    new AlertDialog.Builder(MainActivity.this).setTitle("顯示視窗")
                            .setMessage("你按了「按鈕二」\n按「確定」鈕關閉對話方塊")
                            .setPositiveButton("確定", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                }
                            })
                            .show();
                    break;
                case R.id.btn3:
                    new AlertDialog.Builder(MainActivity.this).setTitle("顯示視窗")
                            .setMessage("你按了「按鈕三」\n按「確定」鈕關閉對話方塊")
                            .setPositiveButton("確定", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                }
                            })
                            .show();
                    break;
                case R.id.btn4:
                    new AlertDialog.Builder(MainActivity.this).setTitle("顯示視窗")
                            .setMessage("你按了「按鈕四」\n按「確定」鈕關閉對話方塊")
                            .setPositiveButton("確定", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                }
                            })
                            .show();
                    break;
            }
        }
    };
}
