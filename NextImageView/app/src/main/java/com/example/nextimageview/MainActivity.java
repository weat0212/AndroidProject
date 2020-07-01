package com.example.nextimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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

    private Button next;
    private ImageView imageView;
    private TextView txtShow1,txtShow2;
    int length = imageIds.length;
    int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        next=findViewById(R.id.next);
        imageView=findViewById(R.id.imgShow);
        txtShow1=findViewById(R.id.txtShow1);
        txtShow2=findViewById(R.id.txtShow2);

        next.setOnClickListener(listener);
        imageView.setImageResource(R.drawable.img01);
        txtShow1.append(bookIds[index]);
        txtShow2.append(bookNames[index]);
    }

    Button.OnClickListener listener = new Button.OnClickListener(){
        @Override
        public void onClick(View v) {
            index=++index%length;
            imageView.setImageResource(imageIds[index]);
            String id = txtShow1.getText().toString().substring(0,3);
            String name = txtShow2.getText().toString().substring(0,3);
            txtShow1.setText(id+bookIds[index]);
            txtShow2.setText(name+bookNames[index]);
        }
    };
}
