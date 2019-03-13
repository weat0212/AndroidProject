package com.example.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private RadioButton rb1,rb2,rb3;
    private RadioGroup rgp;
    private TextView msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rb1=findViewById(R.id.rb1);
        rb2=findViewById(R.id.rb2);
        rb3=findViewById(R.id.rb3);
        msg=findViewById(R.id.msg);
        rgp=findViewById(R.id.rgp);

        rgp.setOnCheckedChangeListener(listener);
    }

    private RadioGroup.OnCheckedChangeListener listener=new RadioGroup.OnCheckedChangeListener(){

        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            //選項的引索值
            int p=group.indexOfChild(findViewById(checkedId));
            //清單共有多少項
            int count=group.getChildCount();

            if (checkedId == R.id.rb1)
                msg.setText(count+"個選項中，第"+(p+1)+"項");
            else if (checkedId == R.id.rb2)
                msg.setText(count+"個選項中，第"+(p+1)+"項");
            else if (checkedId == R.id.rb3)
                msg.setText(count+"個選項中，第"+(p+1)+"項");
        }
    };
}
