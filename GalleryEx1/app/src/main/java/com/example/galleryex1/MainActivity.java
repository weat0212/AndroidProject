package com.example.galleryex1;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private int[] imageIds = {R.drawable.img01, R.drawable.img02, R.drawable.img03,
            R.drawable.img04, R.drawable.img05, R.drawable.img06,};
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //取得資源類別檔中的介面元件(Field即可)
        imageView = findViewById(R.id.imgShow);
        Gallery gallery = findViewById(R.id.gallery);

        //建立自訂的Adapter
        MyAdapter adapter = new MyAdapter(this);

        //設定Gallery資料來源
        gallery.setAdapter(adapter);

        //設定Gallery元件ItemSelected事件的Listener為galListener
        gallery.setOnItemSelectedListener(galListener);
    }

    private Gallery.OnItemSelectedListener galListener = new Gallery.OnItemSelectedListener() {

        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            imageView.setImageResource(imageIds[position]);
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {
            //DO NOTHING
        }
    };

    class MyAdapter extends BaseAdapter {
        private Context mContext;

        public MyAdapter(Context context) {
            mContext = context;
        }

        @Override
        //取得照片數目
        public int getCount() {
            return imageIds.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        //定義顯示的圖片
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView iv = new ImageView(mContext);
            iv.setImageResource(imageIds[position]);
            iv.setScaleType(ImageView.ScaleType.FIT_CENTER);
            iv.setLayoutParams(new Gallery.LayoutParams(120, 90));
            return iv;
        }
    }
}
