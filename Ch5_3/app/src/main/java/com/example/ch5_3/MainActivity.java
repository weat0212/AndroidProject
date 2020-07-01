package com.example.ch5_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Spinner spn;
    private EditText editText;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spn = findViewById(R.id.spn);
        editText = findViewById(R.id.editTxt);
        textView = findViewById(R.id.txtShow);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.學歷, android.R.layout.simple_spinner_dropdown_item);
        spn.setAdapter(adapter);
        spn.setOnItemSelectedListener(spnListener);
    }

    private Spinner.OnItemSelectedListener spnListener = new Spinner.OnItemSelectedListener(){

        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            String txt = parent.getSelectedItem().toString();
            textView.setText(editText.getText().toString()+" 學歷為 "+txt);
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    };
}
