package com.example.spinner1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtRes;
    private Spinner spn;
    String[] items = new String[]{
            "item1","item2","item3","others"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtRes=findViewById(R.id.txtShow);
        spn=findViewById(R.id.spn);

        //建立ArrayAdapter
        ArrayAdapter<String> adapterItems= new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, items);
        adapterItems.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //設定spinner資料來源
        spn.setAdapter(adapterItems);

        //設定spn元件ItemSelected事件的listener
        spn.setOnItemSelectedListener(spnListener);

    }

    //定義onItemSelected方法
    private Spinner.OnItemSelectedListener spnListener = new Spinner.OnItemSelectedListener(){

        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            String sel = parent.getSelectedItem().toString();
            txtRes.setText(sel);
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {
            //Nothing happened
        }
    };
}
