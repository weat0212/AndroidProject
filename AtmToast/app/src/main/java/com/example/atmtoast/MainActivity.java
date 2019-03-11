package com.example.atmtoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView txtShow;
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0;
    private Button clear,confirm;

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
        confirm=findViewById(R.id.confirm);


        btn0.setOnClickListener(multiList);
        btn1.setOnClickListener(multiList);
        btn2.setOnClickListener(multiList);
        btn3.setOnClickListener(multiList);
        btn4.setOnClickListener(multiList);
        btn5.setOnClickListener(multiList);
        btn6.setOnClickListener(multiList);
        btn7.setOnClickListener(multiList);
        btn8.setOnClickListener(multiList);
        btn9.setOnClickListener(multiList);
        clear.setOnClickListener(multiList);
        confirm.setOnClickListener(multiList);
    }

    public Button.OnClickListener multiList=new Button.OnClickListener(){
        @Override
        public void onClick(View v){
            switch (v.getId()){
                case R.id.btn0:
                    displayATM("0");break;
                case R.id.btn1:
                    displayATM("1");break;
                case R.id.btn2:
                    displayATM("2");break;
                case R.id.btn3:
                    displayATM("3");break;
                case R.id.btn4:
                    displayATM("4");break;
                case R.id.btn5:
                    displayATM("5");break;
                case R.id.btn6:
                    displayATM("6");break;
                case R.id.btn7:
                    displayATM("7");break;
                case R.id.btn8:
                    displayATM("8");break;
                case R.id.btn9:
                    displayATM("9");break;
                case R.id.clear:
                    String str=txtShow.getText().toString();
                    if (str.length()>0){
                        txtShow.setText(str.substring(0,str.length()-1));
                    }
                    break;
                case R.id.confirm:
                    str = txtShow.getText().toString();
                    if (str.equals("12345")){
                        Toast t= Toast.makeText(MainActivity.this,"Correct",Toast.LENGTH_LONG);
                        t.show();
                    }
                    else{
                        Toast t= Toast.makeText(MainActivity.this,"Incorrect",Toast.LENGTH_LONG);
                        t.show();
                        txtShow.setText("");
                    }
                    break;

            }

        }
    };

    private void displayATM(String s){
        String str=txtShow.getText().toString();
        txtShow.setText(str+s);
    }
}
