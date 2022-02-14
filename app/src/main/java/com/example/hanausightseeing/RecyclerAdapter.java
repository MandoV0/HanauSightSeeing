package com.example.hanausightseeing;

import android.content.Intent;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private ArrayList<Sehenswürdigkeit> sehenswuerdigkeitenList;
    private RecyclerViewClickListener listener;

    public RecyclerAdapter(ArrayList<Sehenswürdigkeit> sehenswuerdigkeitenList, RecyclerViewClickListener listener) {
        this.sehenswuerdigkeitenList = sehenswuerdigkeitenList;
        this.listener = listener;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView nameText;
        private ImageView imageView;
        private Button button;

        public MyViewHolder(final View view) {
            super(view);
            nameText = view.findViewById(R.id.text_name);
            imageView = view.findViewById(R.id.imageView);
            button = view.findViewById(R.id.button);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            listener.onClick(view, getAdapterPosition());
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
        int fId = sehenswuerdigkeitenList.get(position).foto;
        holder.nameText.setText(name);
        holder.imageView.setImageResource(fId);
    }

    @Override
    public int getItemCount() {
        return sehenswuerdigkeitenList.size();
    }

    // Interface für die Interaktion in der Hauptseite
    public interface RecyclerViewClickListener {
        void onClick(View view, int position);
    }

    public ArrayList<Sehenswürdigkeit> getSehenswuerdigkeitenList() {
        return sehenswuerdigkeitenList;
    }
}