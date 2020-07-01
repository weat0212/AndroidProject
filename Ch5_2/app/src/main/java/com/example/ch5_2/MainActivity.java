package com.example.ch5_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private RadioGroup radioGroup;
    private RadioButton rb1,rb2,rb3,rb4;
    private EditText editText;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioG);
        editText = findViewById(R.id.editTxt);
        textView = findViewById(R.id.txtShow);
        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        rb3 = findViewById(R.id.rb3);
        rb4 = findViewById(R.id.rb4);

        radioGroup.setOnCheckedChangeListener(radioGroupListener);
    }

    private RadioGroup.OnCheckedChangeListener radioGroupListener = new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            String bloodType = "";
            String name = editText.getText().toString();

            if (checkedId == R.id.rb1){
                bloodType=rb1.getText().toString();
            }
            if (checkedId == R.id.rb2){
                bloodType=rb2.getText().toString();
            }
            if (checkedId == R.id.rb3){
                bloodType=rb3.getText().toString();
            }
            if (checkedId == R.id.rb4){
                bloodType=rb4.getText().toString();
            }
            textView.setText(name+" 您的血型為 "+bloodType+" 型");
        }
    };


}
