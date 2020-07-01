package com.example.circulargallery;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int imageIds[]={
            R.drawable.img01,R.drawable.img02,R.drawable.img03,
            R.drawable.img04,R.drawable.img05,R.drawable.img06
    };
    private String bookNames[]={
            "Visual C# 2010", "Visual Basic 2010", "ASP.NET 4.0", "Visual Basic 2008",
            "Visual C# 2008", "Visual C++ 2008"
    };
    private String bookIds[]={
            "AEL011200","AEL011201","AEL011202","AEL011203","AEL011204","AEL011205"
    };

    private Gallery gallery;
    private ImageView iv;
    private TextView txt1,txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gallery=findViewById(R.id.gallery);
        iv=findViewById(R.id.img);
        txt1=findViewById(R.id.txt1);
        txt2=findViewById(R.id.txt2);

        myAdapter adapter = new myAdapter(this);
        gallery.setAdapter(adapter);
        gallery.setOnItemSelectedListener(galListener);
    }

    protected class myAdapter extends BaseAdapter{
        private Context mContext;
        public myAdapter(Context context) {
            this.mContext=context;
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

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageView = new ImageView(mContext);
            imageView.setImageResource(imageIds[position]);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setLayoutParams(new Gallery.LayoutParams(90,120));
            return imageView;
        }
    }

    private Gallery.OnItemSelectedListener galListener = new Gallery.OnItemSelectedListener(){

        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            iv.setImageResource(imageIds[position]);
            txt1.setText(txt1.getText().toString().substring(0,3)+bookIds[position]);
            txt2.setText(txt2.getText().toString().substring(0,3)+bookNames[position]);
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {
            //DO NOTHING
        }
    };
}
