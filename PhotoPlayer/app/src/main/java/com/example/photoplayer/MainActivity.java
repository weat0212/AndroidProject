package com.example.photoplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int[] imgID = {
            R.drawable.android_01,R.drawable.android_02,R.drawable.android_03,R.drawable.android_04
    };
    private Button pre , next;
    private ImageView img;
    int index = 0;      //圖片的索引
    int count = imgID.length;       // 共有幾張照片

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //取得資源類別Ｒ中的介面元件
        pre = findViewById(R.id.pre);
        next = findViewById(R.id.next);
        img = findViewById(R.id.img);

        //設定button元件click事件的listener
        pre.setOnClickListener(preListener);
        next.setOnClickListener(nextListener);
    }

    private Button.OnClickListener preListener = new Button.OnClickListener(){

        @Override
        public void onClick(View v) {
            index--;
            if (index<0) index=count-1;
            img.setImageResource(imgID[index]);
            setTitle("第"+(index+1)+'/'+count+"張");
        }
    };

    private Button.OnClickListener nextListener = new Button.OnClickListener(){

        @Override
        public void onClick(View v) {
            index++;
            if (count==index) index=0;
            img.setImageResource(imgID[index]);
            setTitle("第"+(index+1)+'/'+count+"張");
        }
    };

}
