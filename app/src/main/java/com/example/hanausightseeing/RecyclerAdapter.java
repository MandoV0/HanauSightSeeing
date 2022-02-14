package com.example.hanausightseeing;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private ArrayList<Sehenswürdigkeit> sehenswuerdigkeitenList;

    public RecyclerAdapter(ArrayList<Sehenswürdigkeit> sehenswuerdigkeitenList) {
        this.sehenswuerdigkeitenList = sehenswuerdigkeitenList;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView nameText;
        private ImageView imageView;

        public MyViewHolder(final View view) {
            super(view);
            nameText = view.findViewById(R.id.text_name);
            imageView = view.findViewById(R.id.imageView);
        }
    }

    @NonNull
    @Override
    public RecyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_sehenswuerdigkeit, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.MyViewHolder holder, int position) {
        String name = sehenswuerdigkeitenList.get(position).name;
        int foto = sehenswuerdigkeitenList.get(position).foto;
        holder.nameText.setText(name);
        holder.imageView.setImageResource(foto);
    }

    @Override
    public int getItemCount() {
        return sehenswuerdigkeitenList.size();
    }
}