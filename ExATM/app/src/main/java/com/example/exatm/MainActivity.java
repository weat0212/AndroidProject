package com.example.exatm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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
          String s=txtShow.getText().toString();
          Button btn=findViewById(v.getId());
          if (btn==clear){
              txtShow.setText("");
          }
          else if(btn==confirm){
              txtShow.setText("Confirm");
          }
          else{
              txtShow.setText(s+btn.getText());
          }


      }
    };
}
