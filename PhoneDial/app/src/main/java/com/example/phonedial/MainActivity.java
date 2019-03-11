package com.example.phonedial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtShow;
    private Button btn0,btn1,btn2,btn3,btn4;
    private Button btn5,btn6,btn7,btn8,btn9,clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtShow=findViewById(R.id.txtShow);
        btn0=findViewById(R.id.btn0);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        clear=findViewById(R.id.clear);

        btn0.setOnClickListener(multiLis);
        btn1.setOnClickListener(multiLis);
        btn2.setOnClickListener(multiLis);
        btn3.setOnClickListener(multiLis);
        btn4.setOnClickListener(multiLis);
        btn5.setOnClickListener(multiLis);
        btn6.setOnClickListener(multiLis);
        btn7.setOnClickListener(multiLis);
        btn8.setOnClickListener(multiLis);
        btn9.setOnClickListener(multiLis);
        clear.setOnClickListener(multiLis);

    }

    public Button.OnClickListener multiLis=new Button.OnClickListener(){
        @Override
        public void onClick(View v){
            String s= txtShow.getText().toString();
            Button btn=findViewById(v.getId());
            if(btn==clear){
                txtShow.setText(s.substring(0,15));
            }
            else{
                txtShow.setText(s+btn.getText());
            }
        }
    };

}
