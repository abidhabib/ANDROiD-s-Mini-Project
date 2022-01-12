package com.example.recex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);

setContentView(R.layout.activity_main);

        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);
//        There ArrayList whith object name list is created Whith Type of model(GenericListType)
        ArrayList<Model> list=new ArrayList<>();

        list.add(new Model("Reddit","Reddit is an American social news aggregation, web content rating, and discussion website.",R.drawable.reddit));
        list.add(new Model("LinkedIn ","LinkedIn is an American business- and employment-oriented online service that operates via websites and mobile apps.",R.drawable.linkedin));
        list.add(new Model("Facebook","Meta Platforms, Inc., also known as Meta and formerly known as Facebook, Inc.",R.drawable.facebook));

        list.add(new Model("SnapChat","Snapchat is an American multimedia instant messaging app and service developed by Snap Inc",R.drawable.snapchat));
        list.add(new Model("GitHub","GitHub, Inc. is a provider of Internet hosting for software development and version control using Git. ",R.drawable.github));
        list.add(new Model("Facebook","Meta Platforms, Inc., also known as Meta and formerly known as Facebook, Inc.",R.drawable.facebook));
        list.add(new Model("Reddit","Reddit is an American social news aggregation, web content rating, and discussion website.",R.drawable.reddit));
        list.add(new Model("LinkedIn ","LinkedIn is an American business- and employment-oriented online service that operates via websites and mobile apps.",R.drawable.linkedin));
        list.add(new Model("Facebook","Meta Platforms, Inc., also known as Meta and formerly known as Facebook, Inc.",R.drawable.facebook));
        list.add(new Model("GitHub","GitHub, Inc. is a provider of Internet hosting for software development and version control using Git. ",R.drawable.github));
        list.add(new Model("SnapChat","Snapchat is an American multimedia instant messaging app and service developed by Snap Inc",R.drawable.snapchat));




////////////////////////////////////////////////////////////////////////////////////////
// The getApplicationContext() is Fucnction For Used To SetOnClickListener on Position
//        in myadapter class Context should be initilized Likewise
//        public class myadapter extends RecyclerView.Adapter<myviewholder> {
//            android.content.Context context;
//            public myadapter(ArrayList<Model> data, android.content.Context context) {
//                this.data = data;
//                this.context=context;
//            }
// //////////////////////////////////////////////////////////////////////////////////
        myadapter adapter=new myadapter(list,getApplicationContext());
        recyclerView.setAdapter(adapter);


//        Here You Can Chose Your Layout Manager in Which Layoy you want to View Your Data
////        LinearLayout or RelativeLayout etc
        LinearLayoutManager linearLayoutManager=new GridLayoutManager(this,1    );
        recyclerView.setLayoutManager(linearLayoutManager);

  }
}