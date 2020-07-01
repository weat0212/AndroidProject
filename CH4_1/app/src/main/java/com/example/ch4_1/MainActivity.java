package com.example.ch4_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox cb1,cb2,cb3;
    private TextView txtShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb1=findViewById(R.id.cb1);
        cb2=findViewById(R.id.cb2);
        cb3=findViewById(R.id.cb3);
        txtShow=findViewById(R.id.txtShow);

        cb1.setOnCheckedChangeListener(listener);
        cb2.setOnCheckedChangeListener(listener);
        cb3.setOnCheckedChangeListener(listener);
    }

    private CheckBox.OnCheckedChangeListener listener = new CheckBox.OnCheckedChangeListener(){

        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            String sel="";
            String s1="",s2="",s3="";
            int n = 0;

            if(cb1.isChecked()){
                s1=cb1.getText().toString()+" ";
                n++;
            }else
                s1="";
            if(cb2.isChecked()){
                s2=cb2.getText().toString()+" ";
                n++;
            }else
                s2="";
            if (cb3.isChecked()){
                s3=cb3.getText().toString()+" ";
                n++;
            }else
                s3="";
            sel=s1+s2+s3;
            txtShow.setText("最喜歡的程式語言有："+sel+"，共"+n+"種");
        }
    };
}
