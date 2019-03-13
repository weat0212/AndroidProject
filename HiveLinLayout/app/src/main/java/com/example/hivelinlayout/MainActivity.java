package com.example.hivelinlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private CheckBox cb1,cb2,cb3;
    private TextView msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb1=findViewById(R.id.cb1);
        cb2=findViewById(R.id.cb2);
        cb3=findViewById(R.id.cb3);
        msg=findViewById(R.id.msg);

        cb1.setOnCheckedChangeListener(listener);
        cb2.setOnCheckedChangeListener(listener);
        cb3.setOnCheckedChangeListener(listener);
    }

    private CheckBox.OnCheckedChangeListener listener=new CheckBox.OnCheckedChangeListener(){

        String s1,s2,s3;
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if(cb1.isChecked()){
                s1=cb1.getText().toString();
            }
            else s1="";

            if(cb2.isChecked()){
                s2=cb2.getText().toString();
            }
            else s2="";

            if(cb3.isChecked()){
                s3=cb3.getText().toString();
            }
            else s3="";

            msg.setText(s1+s2+s3);
        }
    };
}
