package com.example.hanausightseeing.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hanausightseeing.R;
import com.example.hanausightseeing.Sehenswürdigkeit;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    // Liste aller Sehenswürdigkeiten
    private ArrayList<Sehenswürdigkeit> sehenswuerdigkeitenList;
    private RecyclerViewClickListener listener;

    // Erstelle den Recycler Adapter
    public RecyclerAdapter(ArrayList<Sehenswürdigkeit> sehenswuerdigkeitenList, RecyclerViewClickListener listener) {
        this.sehenswuerdigkeitenList = sehenswuerdigkeitenList;
        this.listener = listener;
    }

    // Erstelle die einzelne View ( Recycler View im main menu)
    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView nameText;
        private ImageView imageView;

        public MyViewHolder(final View view) {
            super(view);
            nameText = view.findViewById(R.id.text_name);
            imageView = view.findViewById(R.id.imageView);

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
        int fId = sehenswuerdigkeitenList.get(position).fotos[0];
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

    public void filterdList(ArrayList<Sehenswürdigkeit> f) {
        sehenswuerdigkeitenList = f;
        notifyDataSetChanged();
    }
}