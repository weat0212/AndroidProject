package com.example.sumofnum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText input;
    private TextView ans;
    private Button cal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cal=findViewById(R.id.start);
        input=findViewById(R.id.input);
        ans=findViewById(R.id.ans);

        cal.setOnClickListener(btnLis);
    }

    private Button.OnClickListener btnLis=new Button.OnClickListener(){
        @Override
        public void onClick(View v){
            String s=input.getText().toString();
            int n=Integer.parseInt(s);
            String res=String.valueOf(calculate(n));
            ans.setText(res);
        }

        public int calculate(int n){
            int count=0;
            if(n==0) return 0;
            else{
                for(int i=1;i<=n;i++)
                    count+=i;
                return count;
            }
        }
    };
}
