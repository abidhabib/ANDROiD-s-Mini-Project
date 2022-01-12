package com.example.recex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ReceveData extends AppCompatActivity {
ImageView imageView;
TextView tv1,tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receve_data);
        imageView=findViewById(R.id.imagev);
        tv1=findViewById(R.id.smallhead);
        tv2=findViewById(R.id.head);
        imageView.setImageResource(getIntent().getIntExtra("imagename",0));
        tv1.setText(getIntent().getStringExtra("text2"));
        tv2.setText(getIntent().getStringExtra("text1"));
    }
}