package com.example.mile2km;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private EditText editMile;
    private EditText editKm;
    private Button btnTran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editMile=findViewById(R.id.scn);
        editKm=findViewById(R.id.scn2);
        btnTran=findViewById(R.id.convert);

        btnTran.setOnClickListener(btnTranListener);
    }

    private Button.OnClickListener btnTranListener=new Button.OnClickListener(){
        @Override
        public void onClick(View v) {
            if (editMile.getText().length()>0){
                double miles=Double.parseDouble(editMile.getText().toString());
                double km=miles/0.62137;
                DecimalFormat formatVal=new DecimalFormat("##.##");
                editKm.setText(formatVal.format(km));
            }
            else if(editKm.getText().length()>0){
                double km=Double.parseDouble(editKm.getText().toString());
                double miles=km*0.62137;
                DecimalFormat formatVal=new DecimalFormat("##.##");
                editMile.setText(formatVal.format(miles));
            }
            else{
                editMile.setError("請輸入一組數字");
            }
        }
    };
}
