package com.example.gridviewex;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private int[] imageIds = {
            R.drawable.img01,R.drawable.img02,R.drawable.img03,
            R.drawable.img04,R.drawable.img05,R.drawable.img06
    };
    private ImageView imgShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgShow = findViewById(R.id.imgShow);
        GridView gridView = findViewById(R.id.GridView);

        //建立自訂的Adapter
        MyAdapter adapter = new MyAdapter(this);

        //設定GridView的資料來源
        gridView.setAdapter(adapter);

        //建立GridView的ItemClick事件
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                imgShow.setImageResource(imageIds[position]);
            }
        });
    }

    class MyAdapter extends BaseAdapter {
        private Context mContext;

        public MyAdapter(Context context) {
            mContext=context;
        }

        @Override
        public int getCount() {
            return imageIds.length;
        }

        @Override
        public Object getItem(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        //定義GridView顯示圖片
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView iv = new ImageView(mContext);
            //設定ImageView圖像來源
            iv.setImageResource(imageIds[position]);
            //置中顯示
            iv.setScaleType(ImageView.ScaleType.FIT_CENTER);
            //寬*高
            iv.setLayoutParams(new GridView.LayoutParams(80,60));
            return iv;
        }
    }
}
