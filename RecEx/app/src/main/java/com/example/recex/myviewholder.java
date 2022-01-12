package com.example.recex;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myviewholder extends RecyclerView.ViewHolder {


    ImageView imageView;
    TextView textView,textView2;
    public myviewholder(@NonNull View itemView) {
        super(itemView);
        imageView=itemView.findViewById(R.id.adimg);
        textView=itemView.findViewById(R.id.mailtxt);
        textView2=itemView.findViewById(R.id.subtxt);
    }
}
