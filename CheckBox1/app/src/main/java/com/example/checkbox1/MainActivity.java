package com.example.checkbox1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtRes;
    private CheckBox cb1,cb2,cb3,cb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtRes=findViewById(R.id.txtRes);
        cb1=findViewById(R.id.cb1);
        cb2=findViewById(R.id.cb2);
        cb3=findViewById(R.id.cb3);
        cb4=findViewById(R.id.cb4);

        cb1.setOnCheckedChangeListener(listener);
        cb2.setOnCheckedChangeListener(listener);
        cb3.setOnCheckedChangeListener(listener);
        cb4.setOnCheckedChangeListener(listener);
    }

    private CheckBox.OnCheckedChangeListener listener=new CheckBox.OnCheckedChangeListener(){

        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            int n=0;
            String sel="";
            String s1="",s2="",s3="",s4="";
            if (cb1.isChecked()){
                n++;
                s1=cb1.getText().toString()+" ";
            }
            else s1="";

            if (cb2.isChecked()){
                n++;
                s2=cb2.getText().toString()+" ";
            }
            else s2="";

            if (cb3.isChecked()){
                n++;
                s3=cb3.getText().toString()+" ";
            }
            else s3="";

            if (cb4.isChecked()){
                n++;
                s4=cb4.getText().toString()+" ";
            }
            else s4="";

            sel=s1+s2+s3+s4;
            txtRes.setText("會的程式語言有："+sel+"，共"+n+"項");
        }
    };
}
