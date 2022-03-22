package com.haruntasci.viewpager2project;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SmurfsAdapter extends RecyclerView.Adapter<SmurfsAdapter.SmurfsHolder> {


    private List<Smurfs> smurfsList;

    public SmurfsAdapter(List<Smurfs> smurfsList) {
        this.smurfsList = smurfsList;
    }

    @NonNull
    @Override
    public SmurfsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.smurfs_container,parent,false);
        return new SmurfsHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SmurfsHolder holder, int position) {

        holder.imageView.setImageResource(smurfsList.get(position).getImage());
        holder.textView.setText(smurfsList.get(position).getText());


    }

    @Override
    public int getItemCount() {
        return smurfsList.size();
    }

    public class SmurfsHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        public SmurfsHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);
        }
    }
}
