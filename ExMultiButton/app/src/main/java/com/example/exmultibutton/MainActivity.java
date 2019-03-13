package com.example.exmultibutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView pnum;
    private Button btn0,btn1,btn2,btn3,btn4;
    private Button btn5,btn6,btn7,btn8,btn9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pnum=findViewById(R.id.phone);
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

        btn0.setOnClickListener(myListener);
        btn1.setOnClickListener(myListener);
        btn2.setOnClickListener(myListener);
        btn3.setOnClickListener(myListener);
        btn4.setOnClickListener(myListener);
        btn5.setOnClickListener(myListener);
        btn6.setOnClickListener(myListener);
        btn7.setOnClickListener(myListener);
        btn8.setOnClickListener(myListener);
        btn9.setOnClickListener(myListener);

    }

    private Button.OnClickListener myListener=new Button.OnClickListener(){
        @Override
        public void onClick(View v){
            String s=pnum.getText().toString();
            Button btn=findViewById(v.getId());
            pnum.setText(s+btn.getText());

            /*switch (v.getId()){
                case R.id.btn0:{
                    pnum.setText(s+"0");
                    break;
                }
                case R.id.btn1:{
                    pnum.setText(s+"1");
                    break;
                }
                case R.id.btn2:{
                    pnum.setText(s+"2");
                    break;
                }
                case R.id.btn3:{
                    pnum.setText(s+"3");
                    break;
                }
                case R.id.btn4:{
                    pnum.setText(s+"4");
                    break;
                }
                case R.id.btn5:{
                    pnum.setText(s+"5");
                    break;
                }
                case R.id.btn6:{
                    pnum.setText(s+"6");
                    break;
                }
                case R.id.btn7:{
                    pnum.setText(s+"7");
                    break;
                }
                case R.id.btn8:{
                    pnum.setText(s+"8");
                    break;
                }
                case R.id.btn9:{
                    pnum.setText(s+"9");
                    break;
                }
            }*/
        }
    };


}
