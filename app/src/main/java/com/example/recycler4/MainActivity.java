package com.example.recycler4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recycler;
    List<String> list=new ArrayList<>();
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler=findViewById(R.id.my_recycler);

        list.add("java1");
        list.add("java2");
        list.add("java3");
        list.add("java4");
        list.add("java5");
        list.add("java6");
        list.add("java7");
        list.add("java8");
        list.add("java9");
        list.add("java10");
        list.add("java11");
        list.add("java12");
        list.add("java13");
        list.add("java14");
        list.add("java15");
        list.add("java16");
        list.add("java17");

        recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler.setHasFixedSize(false);

        recycler.setAdapter(new MyAdapter(list));

        new ItemTouchHelper(new ItemTouchHelper.SimpleCallback(0,ItemTouchHelper.RIGHT) {
            @Override
            public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
                return false;
            }

            @Override
            public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {
                list.remove(viewHolder.getAbsoluteAdapterPosition());

            }
        }).attachToRecyclerView(recycler);

    }
}