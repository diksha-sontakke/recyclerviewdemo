package com.example.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    String title[];

    int images[]= {R.drawable.chihiro015,
            R.drawable.howl014,
            R.drawable.majo002,
            R.drawable.karigurashi002,
             R.drawable.chihiro043,
            R.drawable.majo018,
            R.drawable.totoro040};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title=getResources().getStringArray(R.array.movie_title);
        recyclerView=findViewById(R.id.recycler);


        RecyclerAdapter recyclerAdapter= new RecyclerAdapter(title,images,this);

        recyclerView.setAdapter(recyclerAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }
}