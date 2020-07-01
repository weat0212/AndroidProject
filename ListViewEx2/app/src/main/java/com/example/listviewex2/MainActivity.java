package com.example.listviewex2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private TextView txtRes;
    private Button btn;
    String[] items={"item1","item2","item3","item4"};
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        listView = findViewById(R.id.listView);
        txtRes = findViewById(R.id.txtRes);

        //設定其來源為items陣列，並使用多選配置版面
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_multiple_choice,items);

        //設定可多選
        listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        //設定ListView資料來源
        listView.setAdapter(adapter);

        count = adapter.getCount();

        //設定button元件的click事件的listener為btnListener
        btn.setOnClickListener(btnListener);

        //設定listView元件的ItemClick事件的listener為listViewListener
        listView.setOnItemClickListener(listViewListener);
    }

    private Button.OnClickListener btnListener = new Button.OnClickListener(){

        @Override
        public void onClick(View v) {
            String selAll = "";
            for (int p = 0; p < count; p++){
                if (listView.isItemChecked(p))
                    selAll += items[p] + " ";
            }
            txtRes.setText("Selected items:" + selAll);
        }
    };

    private ListView.OnItemClickListener listViewListener = new ListView.OnItemClickListener(){

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            //顯示ListView選項內容
            if (listView.isItemChecked(position)){
                String sel = parent.getItemAtPosition(position).toString();
                setTitle("目前選取："+ sel);
            }else{
                setTitle("目前選取：");
            }
        }
    };

}