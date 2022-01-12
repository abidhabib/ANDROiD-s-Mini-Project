package com.example.recex;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class myadapter extends RecyclerView.Adapter<myviewholder> {
    Context context;

    public myadapter(ArrayList<Model> data, Context context) {
        this.data = data;
        this.context=context;
    }
    ArrayList<Model> data;
    @NonNull
    @Override
////////////////////////////////////////////////////////////////////////////////////////////////
//    onCreateViewHolder will be inflate data to model_activity_layout  //
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.model,parent,false);
return new myviewholder(view);
    }
////////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {

//        in this i create a Object of Model Class name temp for geting position index wised
final  Model temp=data.get(position);

holder.textView.setText(data.get(position).getHeader());
holder.textView2.setText(data.get(position).getSub());
holder.imageView.setImageResource(data.get(position).imgname);



///////////////////////////////////////////////////////////////////////////////////////////////////
// This is OnClickListener For Starting New Activity base on context(position)
//                if click on img then redirect to next activity and activity will fetch
//                image , and 2 text , then pass through to other activity by using intent.putextra
holder.imageView.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(context ,ReceveData.class);
        intent.putExtra("imagename",temp.getImgname());
        intent.putExtra("text1",temp.getHeader());
        intent.putExtra("text2",temp.getSub());
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);


    }
});
///////////////////////////////////////////////////////////////////////////////////////////////////
    }

    @Override
    public int getItemCount() {
        return  data.size();
    }
}
