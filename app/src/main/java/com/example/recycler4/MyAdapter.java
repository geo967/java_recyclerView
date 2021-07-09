package com.example.recycler4;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {
    List<String> list;

    MyAdapter(List<String> l){list=l;}
    @NonNull
    @Override
    public MyAdapter.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_design,parent,false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyHolder holder, int position) {
        holder.text.setText(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }



    public static class MyHolder extends RecyclerView.ViewHolder{
        TextView text;

        public MyHolder(@NonNull View itemView) {
            super(itemView);

            text=itemView.findViewById(R.id.text1);
        }

    }
}
