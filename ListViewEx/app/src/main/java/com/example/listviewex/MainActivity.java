package com.example.listviewex;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private TextView txtRes;
    private String[] items={"item1","item2","item3","item4"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.lst);
        txtRes = findViewById(R.id.txtRes);

        /** ArrayAdapter<>
         * para1:物件建立在此專案中的主程式類別
         * para2:系統提供的版面配置檔
         * para3:Array
         */
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,items);

        //設定ListView資料來源
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(listViewListener);
        //設定選中顏色
        listView.setSelector(R.color.green);
    }

    private ListView.OnItemClickListener listViewListener = new ListView.OnItemClickListener(){

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            String sel = parent.getItemAtPosition(position).toString();
            txtRes.setText(sel);
        }
    };
}
