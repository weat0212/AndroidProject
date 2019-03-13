package com.example.exbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //global Var
    private Button btnDo;
    private TextView txtshow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Contract interface component
        btnDo=findViewById(R.id.button1);
        txtshow=findViewById(R.id.textView1);
        //button listen to the CLICK and trigger btnDoListener
        btnDo.setOnClickListener(btnDoListener);
    }

    private Button.OnClickListener btnDoListener = new Button.OnClickListener(){
        @Override
        public void onClick(View v){
            txtshow.setText("You got me!");
        }
    };
}
